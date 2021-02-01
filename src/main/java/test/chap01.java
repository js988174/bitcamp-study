package test;
// 3개의 정수 값을 입력하고 최대값을 구하기
import java.util.Scanner;
public class chap01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("a의 값");
    int a = scanner.nextInt();
    System.out.println("b의 값");
    int b = scanner.nextInt();
    System.out.println("c의 값");
    int c = scanner.nextInt();

    int max = a;
    if (b > max)   max = b;


    if (c > max)    max = c;

    System.out.println("최대값은 " +max +" 입니다 .");
  }
}
