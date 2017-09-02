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
    public void getAutorTest() throws Exception {
        Assert.assertEquals("Rowling", harryPotter.getAutor().getName());
    }

    @Test
    public void getPriceTest() throws Exception {
        Assert.assertEquals(new Double(49.90), new Double(harryPotter.getPrice()));
    }


    @Test
    public void setPriceTest() throws Exception {
        harryPotter.setPrice(40.80);
        Assert.assertEquals(new Double(40.80), new Double(harryPotter.getPrice()));
    }

    @Test
    public void getQtyTest() throws Exception {
        Assert.assertEquals(30,harryPotter.getQty());
    }

    @Test
    public void setQtyTest() throws Exception {
        harryPotter.setQty(20);
        Assert.assertEquals(20,harryPotter.getQty());
    }

    @Test
    public void bookToStringTest() throws Exception {
        Assert.assertEquals("Book[name=Harry Potter i coś tam,author=Rowling,price=49,900000,qty=30]", harryPotter.toString());
    }

}