package FruitBox;

public class Apple extends Fruit implements IFruit{
    @Override
    public String getFruitName() {
        return "Apple";
    }

    @Override
    public String getFruitDescription() {
        return "Delicious red apple";
    }
}
