package Lab4;
import java.util.ArrayList;
import java.util.List;
public class ListSanPham {
public static void main(String [] args){
    List<NangCapSanPham> list = new ArrayList();
        NangCapSanPham sp1 = new NangCapSanPham("Sách giáo khoa", 20000);
        NangCapSanPham sp2 = new NangCapSanPham("Bút chì màu", 10000, 5000);
        NangCapSanPham sp3 = new NangCapSanPham("Bàn chải", 10000, 8000);

        list.add(sp1);
        list.add(sp2);
        list.add(sp3);

        for (NangCapSanPham nangCapSanPhamTest : list) {
            nangCapSanPhamTest.xuat();
        }
    }    
}
