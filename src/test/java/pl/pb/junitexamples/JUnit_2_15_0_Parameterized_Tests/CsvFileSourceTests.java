package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


@DisplayName("2.15. Parameterized Tests - @CsvFileSource")
class CsvFileSourceTests {

  @ParameterizedTest
  @CsvFileSource(resources = "/JUnit_2_15_0_Parameterized_Tests.csv", numLinesToSkip = 1)
  void testWithCsvFileSourceFromClasspath(String country, int reference) {
    assertNotNull(country);
    assertNotEquals(0, reference);
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/JUnit_2_15_0_Parameterized_Tests_Semicolon.csv", numLinesToSkip = 1, delimiter = ';')
  void testWithCsvFileSourceFromClasspathWitSemicolon(String country, int reference) {
    assertNotNull(country);
    assertNotEquals(0, reference);
  }

}
