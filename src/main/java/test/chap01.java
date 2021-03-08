package test;

import java.util.Scanner;

// 배열 b 요소  a에 복사하기?
public class chap01 {

  static void copy(int[] a , int[]b) {
    int num = a.length <= b.length ? a.length : b.length;
    for (int i = 0; i < num; i++) 
      a[i] = b[i];
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("a요솟수");
    int na = scanner.nextInt();

    int[] a = new int[na];

    for (int i = 0; i < na; i++) {
      System.out.print("a[" + i + "] : ");
      a[i] = scanner.nextInt();
    }
    System.out.println("b요솟수");
    int nb = scanner.nextInt();

    int [] b = new int[nb];

    for (int i = 0; i < nb; i++) {
      System.out.println("b[" + i + " ] :");
      b[i] = scanner.nextInt();
    }
    copy(a,b);
    System.out.println("복사");
    for (int i = 0; i< na; i++) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
  }
}
