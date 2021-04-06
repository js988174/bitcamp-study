package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    // 각 게시판 데이터를 저장할 메모리 준비
    BoardHandler boardList1 = new BoardHandler();


    // 각 회원 목록 데이터를 저장할 메모리 준비
    MemberHandler memberList = new MemberHandler();

    // 각 프로젝트 목록 데이터를 저장할 메모리 준비
    ProjectHandler projectList = new ProjectHandler(memberList);

    // 각 작업 목록 데이터를 저장할 메모리 준비
    TaskHandler taskList = new TaskHandler(memberList);


    loop:
      while (true) {
        String command = com.eomcs.util.Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add":
            memberList.add();
            break;
          case "/member/list":
            memberList.list();
            break;
          case "/project/add":
            projectList.add();
            break;
          case "/project/list":
            projectList.list();
            break;
          case "/project/detail":
            projectList.detail();
            break;
          case "/project/update":
            projectList.update();
            break;
          case "/project/delite":
            projectList.delite();
            break;
          case "/task/add":
            taskList.add();
            break;
          case "/task/list":
            taskList.list();
            break;
          case "/board/add":
            boardList1.add();
            break;
          case "/board/list":
            boardList1.list();
            break;
          case "/board/detail":
            boardList1.detail();
            break;
          case "/board/update":
            boardList1.update();
            break;
          case "/board/delite":
            boardList1.delite();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }
}
