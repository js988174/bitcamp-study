package com.eomcs.mybatis.vo;

public class AttachFile {
  int filedNo;
  String filePath;
  int boardNo;

  public AttachFile() {

  }

  public AttachFile(int boardNo, String filePath) {
    this.boardNo = boardNo;
    this.filePath = filePath;
  }

  public int getFiledNo() {
    return filedNo;
  }
  public void setFiledNo(int filedNo) {
    this.filedNo = filedNo;
  }
  public String getFilePath() {
    return filePath;
  }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }


}
