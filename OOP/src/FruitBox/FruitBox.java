package FruitBox;

public class FruitBox <T extends IFruit> {
    private T _fruit;

    public T getFruit() {
        return _fruit;
    }

    public void setFruit(T fruit){
        _fruit = fruit;
    }

//    public String getFruitName(){
//        return _fruit.getFruitName();
//    }

}

