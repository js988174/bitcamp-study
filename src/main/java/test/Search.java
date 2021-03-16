package test;

import java.util.Scanner;

// 12월 31일이면 0일 12월 30일이면 1일
public class Search {

  static int seqSearch(int[] a, int n, int key) {
    int i = 0;

    while (true) {
      if (i == n)
        return -1;      // 검색 실패!(-1을 반환)
      if (a[i] == key)
        return i;       // 검색 성공!(인덱스를 반환)
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요솟수: " );
    int num = scanner.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.println("x[" + i + "]:");
      x[i] = scanner.nextInt();
    }
    System.out.print("검색할 값：");     // 키 값을 입력
    int ky = scanner.nextInt();

    int idx = seqSearch(x, num, ky);    // 배열x에서 키 값이 ky인 요소를 검색

    if (idx == -1)
      System.out.println("그 값의 요소가 없습니다.");
    else
      System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
  }
}
