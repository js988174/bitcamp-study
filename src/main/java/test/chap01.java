package test;
// 오른쪽 같이 두 변수 a b 에 정수를 입력하고 b -a를 출력하는 프로그램 작성
import java.util.Scanner;
public class chap01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("a의 값");
    int a = scanner.nextInt();

    int b =0;



    while (true) {
      System.out.println("b의 값을 입력하세요");
      b = scanner.nextInt();
      if (b > a) 
        break;
      System.out.println("잘못입력하셨습니다.");
    }

    System.out.println("b-a =" + (b-a) );


    scanner.close();
  }
}