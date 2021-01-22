package a;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for(int i = 1; i <= number; i++) {
      String stars = new String();
      for(int j = 1; j <= number ; j++) {
        stars += " ";
      }
      for (int k = 1; k <= i; k++) {
        stars += "*";
      }
      System.out.println(stars);
    }

    scanner.close();
  }
}