package test.ex02;

public class App {
  public static void main(String[] args) {


    System.out.println(MyClass.a);

    //인스턴스 변수 사용하기
    MyClass v1 = new MyClass();
    System.out.println(v1.b);

    // 이렇게 사용 x
    System.out.println(v1.a);
  }
}