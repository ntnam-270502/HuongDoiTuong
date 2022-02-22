package Bank;
import java.util.Scanner;
public class Customer {
    String TenKhachHang ;
    String DiaChiKhachHang;
    int soLuongKhachHang;
    Customer(){
       
    }
    void getName(){
        
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhập tên của khách hàng: ");
            TenKhachHang = nhap.nextLine();
        
    }
    void getAddress(){       
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhập địa chỉ của khách hàng: ");
            DiaChiKhachHang = nhap.nextLine();
    }
    void printInformation(){      
            System.out.println("Tên khách hàng: " + TenKhachHang);
            System.out.println("Địa chỉ khách hàng: " + DiaChiKhachHang);
    }
    
    
    
}
