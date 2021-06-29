package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatFizzAndBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatFizzAndBuzzTest {

  private int[] int1Params = {1, 1, 1, 1, 1, 1, 50, 15, 30, 1000, 99, 14};

  private int[] int2Params = {6, 8, 11, 16, 4, 2, 56, 17, 36, 1006, 102, 20};

  private String[][] arrayExpected = {
      {"1", "2", "Fizz", "4", "Buzz"},
      {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
      {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
      {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
      {"1", "2", "Fizz"},
      {"1"},
      {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},
      {"FizzBuzz", "16"},
      {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},
      {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},
      {"Fizz", "Buzz", "101"},
      {"14", "FizzBuzz", "16", "17", "Fizz", "19"}
  };

  // running the CodingBatFizzAndBuzz.java class gives the correct outcome, however without the
  // String symbols " ". Running the JUnit5 test gives a correct result although the params are ran
  // against the method in the class on line 31 while the expected outcome has the String symbols
  // " ". How is this possible?
  @Test
  void fizzTest() {
    for (int i = 0; i < int1Params.length; i++) {
      String actual = Arrays.toString(fizzBuzz(int1Params[i], int2Params[i]));
      Assertions.assertEquals(actual, Arrays.toString(arrayExpected[i]));
    }
  }

}