package clotheperson;

public class BasicClothes implements Clothes{
  private final double startingCost = 0.0;
  private final double startingWarmth = 0.0;

  @Override
  public void getClothesDescription() {
    System.out.println("Current clothing: ");
  }

  @Override
  public double getCost() {
    return startingCost;
  }
  
  @Override
  public double getWarmth() {
    return startingWarmth;
  }

}
