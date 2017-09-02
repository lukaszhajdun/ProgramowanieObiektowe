package Date;

import org.junit.Assert;
import org.junit.Test;


public class DateTest {

    Date dateDefault = new Date(12,11,2000);
    @Test
    public void dateDefaultDayTest(){
        Assert.assertEquals(12, dateDefault.getDay());
    }
    @Test
    public void dateDefaultMonthTest(){
        Assert.assertEquals(11, dateDefault.getMonth());
    }
    @Test
    public void dateDefaultYearTest(){
        Assert.assertEquals(2000, dateDefault.getYear());
    }

    Date dateWrong = new Date(99,99,99);
    @Test
    public void dateWrongDayReturnZeroTest(){
        Assert.assertEquals(0, dateWrong.getDay());
    }
    @Test
    public void dateWrongMonthReturnZeroTest(){
        Assert.assertEquals(0, dateWrong.getMonth());
    }
    @Test
    public void dateWrongYearReturnZeroTest(){
        Assert.assertEquals(0, dateWrong.getDay());
    }

    @Test
    public void dateSetAllDateTest() {
        Date date = new Date(01, 01, 1900);
        date.setDay(2);
        date.setMonth(9);
        date.setYear(2017);
        Assert.assertEquals(02, date.getDay());
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(2017, date.getYear());
    }

    @Test
    public void dateSetAllDateWrongTest() {
        Date date = new Date(1, 12, 1999);
        date.setDate(99,99,99);
        Assert.assertEquals(0, date.getDay());
        Assert.assertEquals(0, date.getMonth());
        Assert.assertEquals(0, date.getYear());
    }

    @Test
    public void dateDefaultToStringOneTest() {
        Date date = new Date(1, 1, 1900);
        Assert.assertEquals("01/01/1900", date.toString());
    }

    @Test
    public void dateDefaultToStringTwoTest() {
        Date date = new Date(11, 12, 1985);
        Assert.assertEquals("11/12/1985", date.toString());
    }

    @Test
    public void dateDefaultToStringThreeTest() {
        Date date = new Date(11, 44, 99);
        Assert.assertEquals("11/00/00", date.toString());
    }





}