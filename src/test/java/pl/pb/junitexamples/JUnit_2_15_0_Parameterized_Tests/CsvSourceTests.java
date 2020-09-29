package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@DisplayName("2.15. Parameterized Tests - @MethodSource")
class CsvSourceTests {

  @ParameterizedTest
  @CsvSource({
      "apple,         1",
      "banana,        2",
      "'lemon, lime', 0xF1"
  })
  void testWithCsvSource(String fruit, int rank) {
    assertNotNull(fruit);
    assertNotEquals(0, rank);
  }

  @ParameterizedTest
  @CsvSource(delimiter = ';', value = {"apple;         1",
      "banana;        2",
      "'lemon; lime'; 0xF1"})
  void testWithCsvSource2(String fruit, int rank) {
    assertNotNull(fruit);
    assertNotEquals(0, rank);
  }

}
