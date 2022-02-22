package Shape;

public class Hinhvuong extends Hinhhoc{
    protected String sound = "Hinhvuong.hif";
    protected Boolean click ;
    Hinhvuong(Boolean c){
        click = c;
    }
    protected String makeNoise(){
        System.out.println("phat ra am thanh: "+ sound);
        return sound;
    }
    protected void dientich(){
        System.out.println("S = cd * cr");
    }
    private void click(){
        if(click == true){
            Xoay();
            makeNoise();
            dientich();
        }
        else System.out.println("Bạn chưa click !!!");
        
    }
    public void getClick(){
        click();       
    }
    
}
