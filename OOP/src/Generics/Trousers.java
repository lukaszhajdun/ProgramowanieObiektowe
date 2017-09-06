package Generics;

public class Trousers extends Clothes implements ICanBeFolded {
    @Override
    public String getDescription() {
        return "Białe spodnie";
    }

    @Override
    public String getName() {
        return "Spodnie";
    }

    @Override
    public String getSize() {
        return "M";
    }
}
