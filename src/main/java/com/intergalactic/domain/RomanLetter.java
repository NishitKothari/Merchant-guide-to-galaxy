package com.intergalactic.domain;

public enum RomanLetter {

  I(1),
  V(5),
  X(10),
  L(50),
  C(100),
  D(500),
  M(1000);

  final long decimalValue;

  RomanLetter(final long decimalValue) {
    this.decimalValue = decimalValue;
  }

  public long getDecimalValue() {
    return decimalValue;
  }

  public boolean isLowerOf(final RomanLetter nextOne){
    return this.decimalValue < nextOne.decimalValue;
  }
}
