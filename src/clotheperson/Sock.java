package clotheperson;

public class Sock extends ClothingDecorator{


  public Sock(Clothes clothes){
    super(clothes);
  }
  
  @Override
  public void getClothesDescription() {
    basicClothes.getClothesDescription();
    System.out.println("adding a Sock");
  }

  @Override
  public double getCost() {
    return basicClothes.getCost() + 0.15;
  }

  public double getWarmth(){
    return basicClothes.getWarmth() + 10;
  }
}