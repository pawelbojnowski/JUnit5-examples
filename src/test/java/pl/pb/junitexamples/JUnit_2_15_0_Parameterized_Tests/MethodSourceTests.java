package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


@DisplayName("2.15. Parameterized Tests - @MethodSource")
class MethodSourceTests {

  static Stream<String> stringProvider() {
    return Stream.of("apple", "banana");
  }

  static Stream<String> testWithDefaultLocalMethodSource() {
    return Stream.of("apple", "banana");
  }

  static IntStream range() {
    return IntStream.range(0, 20).skip(10);
  }

  @DisplayName("MethodSource - defined name of source")
  @ParameterizedTest
  @MethodSource("stringProvider")
  void testWithExplicitLocalMethodSource(String argument) {
    assertNotNull(argument);
  }

  @DisplayName("MethodSource - test name is a name of source")
  @ParameterizedTest
  @MethodSource
  void testWithDefaultLocalMethodSource(String argument) {
    assertNotNull(argument);
  }

  @DisplayName("MethodSource and primitive types")
  @ParameterizedTest
  @MethodSource("range")
  void testWithRangeMethodSource(int argument) {
    assertNotEquals(9, argument);
  }

}
