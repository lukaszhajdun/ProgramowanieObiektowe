package AuthorAndBook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Author rowling = new Author("Rowling","email",'f');
    Book harryPotter = new Book("Harry Potter i coś tam",rowling, 49.9, 30);

    @Test
    public void getNameTest(){
        Assert.assertEquals("Harry Potter i coś tam",harryPotter.getName());
    }

    @Test
    public void getAutorTest(){
        Assert.assertEquals("Rowling", harryPotter.getAutor().getName());
    }

    @Test
    public void getPriceTest(){
        Assert.assertEquals(49.90, harryPotter.getPrice(), 0.1);
    }


    @Test
    public void setPriceTest(){
        harryPotter.setPrice(40.80);
        Assert.assertEquals(40.80, harryPotter.getPrice(), 0.1);
    }

    @Test
    public void getQtyTest(){
        Assert.assertEquals(30,harryPotter.getQty());
    }

    @Test
    public void setQtyTest(){
        harryPotter.setQty(20);
        Assert.assertEquals(20,harryPotter.getQty());
    }

    @Test
    public void bookToStringTest(){
        Assert.assertEquals("Book[name=Harry Potter i coś tam,author=Rowling,price=49,900000,qty=30]", harryPotter.toString());
    }

}