package test;
// 오른쪽 같이 두 변수 a b 에 정수를 입력하고 b -a를 출력하는 프로그램 작성
import java.util.Scanner;
public class chap01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int sum = 0;


    if (n > 0) {
      for (int i = 1; i < n; i++) {
        sum += i;
      }
    }else if ( n < 0) {
      System.out.println("잘못 입력");
    }else {
      System.out.println("0");
    }
    System.out.println(sum);



    scanner.close();
  }
}