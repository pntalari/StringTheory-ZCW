package rocks.zipcode.stringsgalore;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTheoryTest {
    StringTheory st = null;

    @org.junit.Before
    public void setUp() throws Exception {
        this.st = new StringTheory();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCharTest1() {
        String OriginalStr = "Java Exercises!";
        String expectedStr = "The character at position 0 is J";
        String actualStr = st.getCharAt(OriginalStr, 0);
        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void getCharTest2() {
        String OriginalStr = "Java Exercises!";
        String expectedStr = "The character at position 10 is i";
        String actualStr = st.getCharAt(OriginalStr, 10);
        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void getUnicodeTest1() {
        String OriginalStr = ": w3resource.com";
        Integer expectedChar = 32;
        Integer actualChar = st.getUnicode(OriginalStr, 1);
        Assert.assertEquals(expectedChar, actualChar);
    }

    @Test
    public void getUnicodeTest2() {
        String OriginalStr = ": w3resource.com";
        Integer expectedChar = 114;
        Integer actualChar = st.getUnicode(OriginalStr, 9);
        Assert.assertEquals(expectedChar, actualChar);
    }

    @Test
    public void getUnicodeCntTest() {
        String OriginalStr = ": w3resource.com";
        Integer expectedCnt = 16;
        Integer actualCnt = st.getUnicodeCnt(OriginalStr);
        Assert.assertEquals(expectedCnt, actualCnt);
    }

    @Test
    public void lexicoStrCompareTest() {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        String expectedStr = "This is Exercise 1" + " is less than " + "This is Exercise 2";
        String actualStr = st.lexicoStrCompare(str1,str2);
        Assert.assertEquals(expectedStr,actualStr);
    }

    @Test
    public void lexicoStrCompareIgnoreCaseTest() {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        String expectedStr = "This is exercise 1" + " is equal to " + "This is Exercise 1";
        String actualStr = st.lexicoStrCompareIgnoreCase(str1,str2);
        Assert.assertEquals(expectedStr,actualStr);
    }

    @Test
    public void StringConcatTest() {
        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";
        String expectedStr = "PHP Exercises and Python Exercises";
        String actualStr = st.StringConcat(str1,str2);
        Assert.assertEquals(expectedStr,actualStr);
    }

    @Test
    public void StringContainsTest() {
        String str1 = "PHP Exercises and Python Exercises";
        String contains = "and";
        Assert.assertTrue(st.StringContains(str1,contains));
    }

    @Test
    public void StringCompareTest() {
        String str1 = "example.com";
        String str2 = "example.com";
        String str3 = "Example.com";
        String str4 = "example.com";
        Assert.assertTrue(st.StringCompare(str1,str2));
        Assert.assertFalse(st.StringCompare(str3,str4));
    }


}