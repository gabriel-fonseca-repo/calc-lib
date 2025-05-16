package org.fbp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  @Test
  @DisplayName("Test addition of two numbers")
  public void testSum() {
    assertEquals(5.0, Calculator.sum(2, 3).doubleValue(),
      "2 + 3 should equal 5");

    assertEquals(5.5, Calculator.sum(2.5, 3.0).doubleValue(),
      "2.5 + 3.0 should equal 5.5");

    assertEquals(-1.0, Calculator.sum(2, -3).doubleValue(),
      "2 + (-3) should equal -1");
  }

  @Test
  @DisplayName("Test subtraction of two numbers")
  public void testsubtract() {
    assertEquals(2.0, Calculator.subtract(5, 3).doubleValue(),
      "5 - 3 should equal 2");

    assertEquals(1.5, Calculator.subtract(4.5, 3.0).doubleValue(),
      "4.5 - 3.0 should equal 1.5");

    assertEquals(8.0, Calculator.subtract(5, -3).doubleValue(),
      "5 - (-3) should equal 8");
  }

  @Test
  @DisplayName("Test multiplication of two numbers")
  public void testmultiply() {
    assertEquals(15.0, Calculator.multiply(5, 3).doubleValue(),
      "5 * 3 should equal 15");

    assertEquals(13.5, Calculator.multiply(4.5, 3.0).doubleValue(),
      "4.5 * 3.0 should equal 13.5");

    assertEquals(-15.0, Calculator.multiply(5, -3).doubleValue(),
      "5 * (-3) should equal -15");

    assertEquals(0.0, Calculator.multiply(5, 0).doubleValue(),
      "5 * 0 should equal 0");
  }

  @Test
  @DisplayName("Test division of two numbers")
  public void testdivide() {
    assertEquals(2.0, Calculator.divide(6, 3).doubleValue(),
      "6 / 3 should equal 2");

    assertEquals(1.5, Calculator.divide(4.5, 3.0).doubleValue(),
      "4.5 / 3.0 should equal 1.5");

    assertEquals(-2.0, Calculator.divide(6, -3).doubleValue(),
      "6 / (-3) should equal -2");
  }

  @Test
  @DisplayName("Test division by zero throws exception")
  public void testdividePorZero() {
    assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0), "Division by zero should throw ArithmeticException");
  }

  @Test
  @DisplayName("Test power operation")
  public void testtoTheN() {
    assertEquals(8.0, Calculator.toTheN(2, 3).doubleValue(),
      "2^3 should equal 8");

    assertEquals(27.0, Calculator.toTheN(3.0, 3.0).doubleValue(),
      "3.0^3.0 should equal 27.0");

    assertEquals(0.25, Calculator.toTheN(2, -2).doubleValue(),
      "2^(-2) should equal 0.25");

    assertEquals(0.0, Calculator.toTheN(0, 5).doubleValue(),
      "0^5 should equal 0");

    assertEquals(1.0, Calculator.toTheN(5, 0).doubleValue(),
      "5^0 should equal 1");
  }
}