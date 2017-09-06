package Generics;

public class Suitcase <T extends Clothes & ICanBeFolded> {
    private T _thing;

    public T getThing(){
        return _thing;
    }

    public void setThing (T thing){
        _thing = thing;
    }

    public String getThingName(){
       return _thing.getName();
    }
    public String getThisDescription(){
        return _thing.getDescription();
    }
    public String getThisSize(){
        return _thing.getSize();
    }

}
