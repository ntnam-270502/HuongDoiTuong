package tuan02;
import java.util.Scanner;
public class main {
public static void main(String[] args){
    HinhTamGiac hinhTamGiac = new HinhTamGiac("music con buom xuan.aif");
    hinhTamGiac.phatnhac();
    hinhTamGiac.xoay();
    HinhTron hinhTron = new HinhTron("music xuan nay con khong ve.aif");
    hinhTron.phatnhac();
    hinhTron.xoay();
    HinhVuong hinhVuong = new HinhVuong("music roi nang cai ly.aif");
    hinhVuong.phatnhac();
    hinhVuong.xoay();
}    
}