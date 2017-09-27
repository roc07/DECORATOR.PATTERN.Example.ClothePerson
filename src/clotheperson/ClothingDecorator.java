package clotheperson;

public abstract class ClothingDecorator implements Clothes{
  protected Clothes basicClothes;
  
  public ClothingDecorator(Clothes clothes){
    this.basicClothes = clothes;
  }
  
  @Override
  public abstract void getClothesDescription();
  @Override
  public abstract double getCost();
  @Override
  public abstract double getWarmth();
  
}
