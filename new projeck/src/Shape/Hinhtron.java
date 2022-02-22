package Shape;

public class Hinhtron extends Hinhhoc{
    protected String sound = "Hinhtron.hif";
    protected Boolean click ;
    Hinhtron(Boolean c){
        click = c;
    }
    protected String makeNoise(){
        System.out.println("phat ra am thanh: "+ sound);
        return sound;
    }
    protected void dientich(){
        System.out.println("S = pi * r^2");
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
