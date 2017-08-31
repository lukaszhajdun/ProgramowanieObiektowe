package HomeWork;

import org.junit.Assert;
import org.junit.Test;

public class BookAndAuthorTest {
    @Test
    public void authorDefaultGetNameGetEmailGetGender(){
        Author tolkien = new Author
                ("Tolkien", "email", 'm');
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals("email", tolkien.getEmail());
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }

    @Test
    public void authorDefaultSetEmail(){
        Author tolkien = new Author
                ("Tolkien", "email", 'm');
        tolkien.setEmail("noweEmail@email.com");
        Assert.assertEquals("noweEmail@email.com",
                tolkien.getEmail());
    }
}
