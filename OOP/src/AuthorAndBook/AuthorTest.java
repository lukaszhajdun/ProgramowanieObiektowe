package AuthorAndBook;

import org.junit.Assert;
import org.junit.Test;


public class AuthorTest {

    Author kowalski = new Author
            ("Kowalski","kowalski@wp.pl",'m');
    @Test
    public void getNameTest(){
        Assert.assertEquals("Kowalski", kowalski.getName());
    }

    @Test
    public void getEmailTest() {
        Assert.assertEquals("kowalski@wp.pl", kowalski.getEmail());
    }

    @Test
    public void setEmailTest() throws Exception {
        kowalski.setEmail("jan.kowalski@gmail.com");
        Assert.assertEquals("jan.kowalski@gmail.com", kowalski.getEmail());
    }

    @Test
    public void getGenderTest() throws Exception {
        Assert.assertEquals(new Character('m'), kowalski.getGender());
    }

    @Test
    public void AuthorToString() {

        Assert.assertEquals("Author[name=Kowalski,email=kowalski@wp.pl,gender=m]", kowalski.toString());
    }

}