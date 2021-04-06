// 예외 처리 연습 II - 예외 처리 안했을 때
package com.eomcs.exception.ex97;

public class Test02_1 {

  public static void main(String[] args) throws RuntimeException{


    System.out.println(100 / 0);

    System.out.println("오류");

    // RuntimeException 에 대해서는 컴파일러가 예외처리를 요구하지 않는다.
    // 다만 예외가 발생하면 호출자에게 전달한다.
    // 여기서 예외가 발생하면 main()의 호출자인 JVM에게 전달한다.

    System.out.println("종료!");
  }

}
