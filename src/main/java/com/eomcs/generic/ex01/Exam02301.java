// 클래스에 제네릭(generic) 적용하기 : 적용 후
package com.eomcs.generic.ex01;

import java.util.Date;
import com.eomcs.generic.ex02.Member;

// 2) 제네릭을 적용한 클래스
// - 클래스 전체에서 사용할 "타입 파라미터(타입 이름을 저장하는 변수)"를 선언하기
//      class 클래스명<타입파라미터명, 타입파라미터명, ...> {...}
// - 클래스가 다루는 어떤 타입이 있다고 가정하자. 그 타입을 T라고 부르겠다.
public class Exam02301{

  static class Box<T> {
    T value;  // T라는 타입의 인스턴스 주소를 저장할 필드

    public T get() { // T라는 타입의 객체를 리턴
      return this.value;
    }

    public void set(T value) { // T라는 타입의 객체를 받을 파라미터
      this.value = value;
    }
  }



  public static void main(String[] args) {

    
    // 변수 선언에서 이미 어떤 타입을 다룰지 지정했기 때문에
    // new 를 실행할 때는 굳이 또 타입을 지정할 필요가 없다. 생략해도 된다.
    Box<String> b = new Box<>();

    // 레퍼런스를 선언한 후에 인스턴스를 할당해도 된다.
    Box<Integer> b3;
    b3 = new Box<>(); // OK!
    //    b3 = new Box<Integer>(); // OK!


  
  }
}