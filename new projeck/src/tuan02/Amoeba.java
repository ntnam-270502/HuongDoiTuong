package tuan02;

public class Amoeba extends HinhHoc{
    String sound = "Amoeba.aif";
    Boolean click = true;
    int x;
    int y;
    Amoeba(int xx , int yy,Boolean c){
        x=xx;
        y=yy;
        click = c;
    }
    Amoeba(){
        
    }
    protected String Xoay(){
            System.out.println("Xoay hình Amoeba theo tọa độ x = " + x + " và y = " + y );
            return sound;
    }
    protected String PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : " + sound);
            return sound;
    }
    private void click(){
        if(click == true){
            Xoay();
            PhatRaAmThanh();
        }
        else System.out.println("Bạn chưa click !!!");
        
    }
    public void getClick(){
        click();       
    }    
}
