package Generics;

public class Socks extends Clothes {
    @Override
    public String getDescription() {
        return "Białe skarpetki";
    }

    @Override
    public String getName() {
        return "Skarpetki";
    }

    @Override
    public String getSize() {
        return "42";
    }
}
