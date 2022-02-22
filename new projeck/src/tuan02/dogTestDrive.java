package tuan02;

public class dogTestDrive {
public static void main(String[] args){
    dog Dog = new dog();
    Dog.setSize(4);
    Dog.setBreed("cỏ");
    Dog.setName("minu");
    System.out.println("name: " + Dog.getName()+ "size: " + Dog.getsize() + "Breed: " +Dog.getBreed());
}
}
