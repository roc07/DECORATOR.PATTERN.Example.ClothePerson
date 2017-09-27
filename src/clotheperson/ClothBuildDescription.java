package clotheperson;

public class ClothBuildDescription extends ClothingDecorator{

  public ClothBuildDescription(Clothes clothes) {
    super(clothes);
  }

  @Override
  public void getClothesDescription() {
    basicClothes.getClothesDescription();
  }

  @Override
  public double getCost() {
    return basicClothes.getCost();
  }

  @Override
  public double getWarmth() {
    return basicClothes.getWarmth();
  }

}
