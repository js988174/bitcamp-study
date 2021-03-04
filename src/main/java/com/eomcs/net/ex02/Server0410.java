// 대기열에서 기다리고 있는 클라이언트와 연결하기
package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0410 {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버 소켓 생성 완료!");
    System.out.println("클라이언트 연결을 기다리는 중...");

    while (true) {
      System.out.printf("> ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("q"))
        break;


      Socket socket = ss.accept();
      System.out.println("대기 중인 클라이언트 연결");
    }

    ss.close();
    System.out.println("서버 종료");

    keyboard.close();
  }
}


