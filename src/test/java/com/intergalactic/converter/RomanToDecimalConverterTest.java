package com.intergalactic.converter;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RomanToDecimalConverterTest {

  @Test
  public void testValidRomanNumber(){
    RomanToDecimalConverter romanToDecimalConverter = new RomanToDecimalConverter();
    Assert.assertEquals(2006,romanToDecimalConverter.toDecimal("MMVI") );
  }

  @Test
  public void testSmallerValuePrecedingLargerValueInRomanNumber(){
    RomanToDecimalConverter romanToDecimalConverter = new RomanToDecimalConverter();
    Assert.assertEquals(1944,romanToDecimalConverter.toDecimal("MCMXLIV"));
  }
}
