package KoszykSklepuInternetowego;

public abstract class Book implements IProduct {

    protected int price;
    protected String name;
    protected String title;
    protected String author;

    public Book (int price, String name, String title, String author) {
        this.price = price;
        this.name = name;
        this.title = title;
        this.author = author;

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setProductName(String name) {
        this.name = name;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

}
