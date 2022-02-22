package Bank;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner nhapScanner = new Scanner(System.in);
        int luaChon;
        do{
        System.out.println("**********BANKING****************");
        System.out.println("1.Rút Tiền - Gửi Tiền- Kiểm Tra Số Dư");
        System.out.println("2.Khác Hàng");
        System.out.println("3.Nhân Viên");
        System.out.println("anyNumber.Kết thúc!!");
        System.out.println("************************************************");
        System.out.print("Chọn chức năng: ");
        luaChon = nhapScanner.nextInt();
        switch (luaChon) {
            case 1:{
                Account account = new Account(2008110232, 11000000);
                int luaChon1;
                do{
            System.out.println("**********BANKING****************");
            System.out.println("1.Rút tiền");
            System.out.println("2.Gửi tiền");
            System.out.println("3.Kiểm tra số dư");
            System.out.println("anyNumber.Kết thúc");
            System.out.println("************************************************");
            System.out.print("Chọn chức năng: ");
            luaChon1 = nhapScanner.nextInt();
            switch (luaChon1) {
                case 1:{
                    System.out.print("Nhập số tiền muốn rút:");
                    int tienRut = nhapScanner.nextInt();
                    account.Naptien(tienRut);
                    account.show_data();
                    break;
                }
                case 2 :{
                    System.out.print("Nhập số tiền muốn gửi:");
                    int tienGui = nhapScanner.nextInt();
                    account.Ruttien(tienGui);
                    account.show_data();
                    break;
                }
                case 3 :{
                    account.show_data();
                }
               
            }
                }
                while(luaChon1 <=3 && luaChon1 > 0);
                break;
            }
            case 2 :{
                Customer account1 = new Customer();
                int luaChon2;
                do{ 
                System.out.println("**********BANKING****************");
                System.out.println("1.Nhập tên khách hàng");
                System.out.println("2.Nhập địa chỉ khách hàng");
                System.out.println("3.In thông tin khách hàng");
                System.out.println("anyNumber.Kết thúc");
                System.out.println("************************************************");
                System.out.print("Chọn chức năng: ");
                luaChon2 = nhapScanner.nextInt();
                switch (luaChon2) {
                    case 1:{
                        account1.getName();
                        break;
                        }
                    case 2 :{
                        account1.getAddress();
                        break;
                        }
                    case 3 :{
                        account1.printInformation();
                        break;
                        }
                    }
                }while(luaChon2 <=3 && luaChon2 > 0);
                break;
            }
            case 3 :{
                Emloyee account2 = new Emloyee();
                int luaChon3;
                do{ 
                System.out.println("**********BANKING****************");
                System.out.println("1.Nhập tên nhân viên");
                System.out.println("2.Nhập lương nhân viên");
                System.out.println("3.In thông tin nhân viên");
                System.out.println("anyNumber.Kết thúc");
                System.out.println("************************************************");
                System.out.print("Chọn chức năng: ");
                luaChon3 = nhapScanner.nextInt();
                switch (luaChon3) {
                    case 1:{
                        account2.getName();
                        break;
                        }
                    case 2 :{
                        account2.getluong();
                        break;
                        }
                    case 3 :{
                        account2.printInfomationEmployee();
                        break;
                        }
                    }
                }while(luaChon3 <=3 && luaChon3 > 0);
            }
            default:
                break;
        }
    }while (luaChon <=3 && luaChon >0);
    }
    

    
}
