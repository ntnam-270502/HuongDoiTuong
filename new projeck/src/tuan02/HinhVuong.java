package tuan02;

public class HinhVuong {
    String fileAmThanh;
    public HinhVuong(String fileAmThanh){
    this.fileAmThanh = fileAmThanh;
    }
    void xoay(){
        System.out.println("Xoay 360 độ, theo chiều kim đồng hồ");
    }
    void phatnhac(){
        System.out.println("chơi file nhạc" + fileAmThanh);
    }       
}
