// 상대편으로부터 연결 요청 받기 - 서버(server)
package com.eomcs.net.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

  public static void main(String[] args) throws Exception {

    System.out.println("서버 실행!");

    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결됨");

    PrintStream out = new PrintStream(
        new BufferedOutputStream(socket.getOutputStream()));
    DataInputStream in = new DataInputStream(
        new BufferedInputStream(socket.getInputStream()));

    System.out.println("데이터 수신 중");

    long filesize = in.readLong();
    String filename = in.readUTF();

    File file = new File("temp/ok_" +filename);
    BufferedOutputStream fileOut = new BufferedOutputStream(
        new FileOutputStream(file));

    for (long i = 0; i < filesize; i++) {
      fileOut.write(in.read());
    }

    System.out.println("데이터 수신 완료");
    out.println("ok");
    out.flush();

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    fileOut.close();
  }

}


