package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("2.15. Parameterized Tests")
class Tests {

  @ParameterizedTest
  @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
  void test1(String candidate) {
    System.out.println("candidate: " + candidate);
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 4, 8, 16})
  void test2(int candidate) {
    System.out.println("candidate: " + candidate);
  }

  @ParameterizedTest
  @NullSource
  @EmptySource
  @ValueSource(strings = {" ", "   ", "\t", "\n"})
  void nullEmptyAndBlankStrings(String text) {
    assertTrue(text == null || text.trim().isEmpty());
  }

}
