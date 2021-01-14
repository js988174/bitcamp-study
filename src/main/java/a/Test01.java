package a;
//1명의 성적 데이터 입력 받아 처리하기
import java.util.Scanner;
public class Test01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("가위 ,바위,보? ");
   String user = scanner.nextLine();
   System.out.printf("사용자: %s\n" ,user);
   
   int random = (int)(Math.random()*3);
   String computer;
   if(random == 0) {
     computer = "가위";
   }else if(random == 1) {
     computer = "바위";
     
   }else {
     computer = "보";
   }
    System.out.printf("컴퓨터: %s\n",computer);
    
    if(user.equals("가위")) {
      if (computer.equals("보")) {
      System.out.println("=> 당신이 이겼습니다");
      return;
    }
    }else if (user.equals("바위")){
      if (computer.equals("가위")) {
        System.out.println("=> 당신이 이겼습니다.");
        return;
      }else {
        if(user.equals("보")) {
        System.out.println("=> 당신이 이겼습니다.");
        return;
    
        
        }
      }
      
    
    } 
    System.out.println("=> 당신은 비기거나 졌습니다.");
    scanner.close();
  }

}
