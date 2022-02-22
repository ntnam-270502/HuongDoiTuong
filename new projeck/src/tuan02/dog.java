package tuan02;

public class dog {
private int size;
String breed;
String name;

public void setSize(int size){
   if(size > 0){
       this.size = size;
   }else{
       System.out.println("kích thước không hợp lệ !");
   }
}
public int getsize(){
    return this.size;
}
public void setBreed(String breed){
    this.breed = breed;
}
public String getBreed(){
    return this.breed;
}
public void setName(String name){
    this.name = name;
}
public String getName(){
    return this.name;
}


}
