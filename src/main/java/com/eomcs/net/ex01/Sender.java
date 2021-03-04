// 상대편에 연결을 요청하기 - 클라이언트(client)
package com.eomcs.net.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {

  public static void main(String[] args) throws Exception {
    File file = new File("temp/jls11.pdf");

    BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(file));

    System.out.println("서버에 연결중");
    Socket socket = new Socket("localhost",8888);
    System.out.println("연결 완료");

    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()));

    System.out.println("서버에 데이터 송신 중");

    long startTime = System.currentTimeMillis();

    out.writeLong(file.length());
    out.writeUTF(file.getName());

    int b;
    while ((b = fileIn.read()) != -1) {
      out.write(b);
    }
    out.flush();

    long endTime = System.currentTimeMillis();

    System.out.printf("서버에 데이터 송신 완료(%d밀리초)\n",endTime - startTime);

    String response = in.nextLine();
    System.out.println(response);

    in.close();
    out.close();
    socket.close();
    fileIn.close();
  }

}


