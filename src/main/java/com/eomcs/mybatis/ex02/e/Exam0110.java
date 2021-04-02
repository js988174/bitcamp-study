// SqlSession 사용법 - 결과가 한 개일 때 => selectOne()
package com.eomcs.mybatis.ex02.e;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex02/e/mybatis-config.xml")).openSession();

    // selectOne()
    // - select 결과가 0 또는 1개 일 때 호출할 수 있다.
    // - 여러 개의 결과가 나오는 select 문에 대해 호출하면 예외가 발생한다.
    // - 리턴 값은 한 개의 결과 레코드 값을 담은 객체이다.
    // 
    List<Map<String,Object>> list = sqlSession.selectList("BoardMapper.selectBoard");

    // 컬러몀과 자바 객체의 프로퍼티명이 일치한다면 다음과 같이 정상적으로 데이터를 꺼내올 수 있다.
    for (Map<String,Object> map : list) {
      System.out.printf("%d,%s,%s,%s,%d\n",
          map.get("board_id"),
          map.get("title"),
          map.get("content"),
          map.get("create_date"),
          map.get("view_count"));
    }

    sqlSession.close();
  }

}


