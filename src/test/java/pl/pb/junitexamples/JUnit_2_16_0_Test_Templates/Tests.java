package pl.pb.junitexamples.JUnit_2_16_0_Test_Templates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("2.16. Test Templates")
class Tests {

  @ParameterizedTest
  @ValueSource(strings = {"apple", "raspberry"})
  void testWithRegularParameterResolver(String argument) {
    throw new NullPointerException();
  }

}
