package test;

// 12월 31일이면 0일 12월 30일이면 1일
public class chap01 {

  static final int VMAX = 21;



  static class PhyscData {
    String name;
    int height;
    double vision;

    PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }
  }
  static double aveHeight(PhyscData[] dat) {
    double sum = 0;
    for (int i = 0; i < dat.length; i++)
      sum += dat[i].height;
    return sum / dat.length;
  }
  static void distVision(PhyscData[] dat,
      int[] dist) {
    int i = 0;
    dist[i] = 0;
    for (i=0; i < dat.length; i++) 
      if (dat[i].vision >= 0.0 && dat[i].vision <= vmax / 10.0)
  }

  public static void main(String[] args) {
  }

}

