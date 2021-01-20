package test;

import java.util.Scanner;

public class App5 {
  
  static class Member {
    String name;
    int age; 
    boolean working;    
  }
public static void main(String[] args) {
 // 회원정보를 저장할 새로운 메모리 구조를 설계한다.
  // => 사용자(개발자) 정의 데이터 타입
  // 메모리 설계도 
 
  // 설계도에 따라 준비한 변수 및 레퍼런스
 Member[] arr = new Member[3]; 
 

 
  arr[0] = new Member();
  arr[1] = new Member();
  arr[2] = new Member();
  
  arr[0].name = "유관순";
  arr[0].age = 10;
  arr[0].working = false;
  
  arr[1].name = "임꺽정";
  arr[1].age = 20;
  arr[1].working = true;
        
  arr[2].name = "안중근"; 
  arr[2].age = 30;
  arr[2].working = false;
  
 printMember(arr[0]);
 printMember(arr[1]);
 printMember(arr[2]);
}

static void printMember(Member m) {
  System.out.printf("이름: %s\n", m.name);
  System.out.printf("나이: %d\n", m.age);
  System.out.printf("재직여부: %b\n", m.working);
  System.out.println("--------------------------------");
}
}
