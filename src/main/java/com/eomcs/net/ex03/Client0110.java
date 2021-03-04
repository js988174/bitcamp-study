// 서버와 입출력 테스트 - byte stream
package com.eomcs.net.ex03;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0110 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    try ( Socket socket = new Socket("localhost",8888);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      System.out.println("서버와 연결 ");

      System.out.println("데이터 보내기 전에");
      keyScan.nextLine();

      out.println("ABC가각간");
      out.flush();


      System.out.println("서버에 데이터를 보냈음!");

      String str = in.readLine();
      System.out.println(str);



    } catch (Exception e) {
      e.printStackTrace();
    } 
    keyScan.close();

  }
}


