package clotheperson;

public class ClothePerson {

  public static void main(String[] args) {
    Clothes lightClothes = new Underpants(new Sock(new Sock(new BasicClothes())));
    
    lightClothes.getClothesDescription();
    System.out.println("Cost: " + lightClothes.getCost());
    System.out.println("Warmth: " + lightClothes.getWarmth());
  }
  
}
