// Mybatis 설정 파일 - 목록 출력
package com.eomcs.mybatis.ex02.c;

import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    // 패키지에 소속된 전체 클래스에 대해 별명을 자동으로 부여할 수 있다.
    // => 단 별명은 클래스 이름이다.
    //
    // <typeAliases>
    //   <package name="com.eomcs.mybatis.ex01.e"/>
    // </typeAliases>
    //
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex02/c/mybatis-config.xml")).openSession();


    List<Board> boards = sqlSession.selectList("BoardMapper.selectBoard");

    // 컬럼과 객체의 프로퍼티명이 일치하면 정상 출력
    for (Board b : boards) {
      System.out.printf("%d,%s,%s,%s,%d\n",
          b.getNo(),
          b.getTitle(),
          b.getContent(),
          b.getRegisteredDate(),
          b.getViewCount());
    }

    sqlSession.close();
  }

}


