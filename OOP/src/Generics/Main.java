package Generics;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Trousers trousers = new Trousers();
        Suitcase<Trousers> suitcase = new Suitcase<>();
        suitcase.setThing(trousers);

        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThisSize());

    }

}
