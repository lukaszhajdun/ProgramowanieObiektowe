package Generics;

public class Dress extends Clothes {
    @Override
    public String getDescription() {
        return "Czerwona sukienka";
    }

    @Override
    public String getName() {
        return "Sukienka";
    }

    @Override
    public String getSize() {
        return "S";
    }
}
