package org.fbp;

public class Calculator {

  public static Number sum(Number a, Number b) {
    return a.doubleValue() + b.doubleValue();
  }

  public static Number subtract(Number a, Number b) {
    return a.doubleValue() - b.doubleValue();
  }

  public static Number multiply(Number a, Number b) {
    return a.doubleValue() * b.doubleValue();
  }

  public static Number divide(Number a, Number b) {
    if (b.doubleValue() == 0) {
      throw new ArithmeticException("Divisão por zero não é permitida.");
    }
    return a.doubleValue() / b.doubleValue();
  }

  public static Number toTheN(Number a, Number b) {
    return Math.pow(a.doubleValue(), b.doubleValue());
  }

}
