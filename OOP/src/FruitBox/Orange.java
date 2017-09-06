package FruitBox;

public class Orange extends Fruit implements IFruit {
    @Override
    public String getFruitName() {
        return "Orange";
    }

    @Override
    public String getFruitDescription() {
        return "Delicious juicy orange";
    }
}
