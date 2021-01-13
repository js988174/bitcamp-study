package com.eomcs.lang.ex08;
import java.util.Scanner;

public class test01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("이름: ");
    String name = scanner.nextLine();

    System.out.println("점수: ");
    int score = scanner.nextInt();

    System.out.println("이름: " +name);
    System.out.println("점수: " +score);



    scanner.close();
  }

}
