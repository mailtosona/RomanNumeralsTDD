package main.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanConversionTest {

    RomanConversion romanConversion;

    @Before
    public void setUp(){
        romanConversion = new RomanConversion();
    }

    @Test
    public void testRomanConversion(){
        Assert.assertEquals(154, romanConversion.convert("CLIV"));
        Assert.assertEquals(101, romanConversion.convert("CI"));
        Assert.assertEquals(43, romanConversion.convert("XLIII"));
    }
}