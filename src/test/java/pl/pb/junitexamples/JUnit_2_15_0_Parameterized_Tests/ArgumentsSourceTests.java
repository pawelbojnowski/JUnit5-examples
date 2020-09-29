package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;


@DisplayName("2.15. Parameterized Tests - @CsvFileSource")
class ArgumentsSourceTests {

  @ParameterizedTest
  @ArgumentsSource(MyArgumentsProvider.class)
  void testWithArgumentsSource(String argument) {
    assertNotNull(argument);
  }

}
