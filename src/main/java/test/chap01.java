package test;

// 배열 b 요소  a에 복사하기?
public class chap01 {





  public static void main(String[] args) {
    static int [][] mdays = {
        {31, 28 ,31 , 30 ,31 ,30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };
    static int isLeap(int year) {
      return (year %4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }
  }
}

