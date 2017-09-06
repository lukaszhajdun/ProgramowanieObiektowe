package FruitBox;

public class Lemon extends Fruit implements IFruit {
    @Override
    public String getFruitName() {
        return "Lemon";
    }

    @Override
    public String getFruitDescription() {
        return "This fruit isn't sweet!!!";
    }
}
