// insert 문 실행 - Board 객체에 값을 담아 파라미터로 넘기기
package com.eomcs.mybatis.ex04.f;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.AttachFile;

public class Exam0110 {

  public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("게시글 번호");
    int boardNo = Integer.parseInt(keyboard.nextLine());

    ArrayList<AttachFile> files = new ArrayList<>(); 
    while (true) {
      System.out.println("첨부파일?(빈 문자열: 입력 종료)");
      String input = keyboard.nextLine();
      if (input.length() == 0) {
        break;
      }
      files.add(new AttachFile(boardNo, input));
    }
    keyboard.close();

    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex04/f/mybatis-config.xml")).openSession(true);

    // 게시글의 첨부파일을 저장하기
    // -List에 보관된 개수만큼 반복해서 insert 실행

    int count = 0;
    for (AttachFile file : files) {
      count += sqlSession.insert("BoardMapper.insert1", file);
    }
    System.out.printf("%d 개의 데이터를 입력 했음!\n",count);

    sqlSession.close();

  }

}


