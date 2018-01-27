package com.intergalactic.converter;

import com.intergalactic.domain.RomanLetter;

public class RomanToDecimalConverter {

  public long toDecimal(final String roman){
    Long decimal = RomanLetter.valueOf(String.valueOf(roman.charAt(0))).getDecimalValue();

    for(int i=1;i<roman.length();i+=2){
      RomanLetter currentLetter =  RomanLetter.valueOf(String.valueOf(roman.charAt(i)));
      RomanLetter nextLetter =  i+1 == roman.length() ? null: RomanLetter.valueOf(String.valueOf(roman.charAt(i+1)));
      if(nextLetter == null){
        decimal += currentLetter.getDecimalValue();
        break;
      }
      boolean isLower = currentLetter.isLowerOf(nextLetter);
      if(isLower){
        System.out.println(currentLetter +" "+nextLetter+" "+decimal+" "+" - "+ currentLetter.getDecimalValue());
        decimal += ( nextLetter.getDecimalValue() - currentLetter.getDecimalValue());
      }
      else{
        System.out.println(currentLetter +" "+nextLetter+" "+decimal+" "+" + "+ currentLetter.getDecimalValue());
        decimal += (currentLetter.getDecimalValue() + nextLetter.getDecimalValue());
      }
    }
    return decimal;
  }
}
