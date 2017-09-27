package clotheperson;

public class Underpants extends ClothingDecorator{

  public Underpants(Clothes clothes){
    super(clothes);
  }
  
  @Override
  public void getClothesDescription() {
    basicClothes.getClothesDescription();
    System.out.println("adding Underpants");
  }

  @Override
  public double getCost() {
    return basicClothes.getCost() + 0.10;
  }

  @Override
  public double getWarmth() {
    return basicClothes.getWarmth();
  }

  
}
