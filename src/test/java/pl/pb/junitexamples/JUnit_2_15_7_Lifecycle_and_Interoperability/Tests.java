package pl.pb.junitexamples.JUnit_2_15_7_Lifecycle_and_Interoperability;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("2.15.7. Lifecycle and Interoperability")
class Tests {

  @BeforeEach
  void beforeEach() {
    System.out.println("beforeEach()");
  }

  @ParameterizedTest
  @ValueSource(strings = {"apple", "raspberry"})
  void testWithRegularParameterResolver(String argument) {
    System.out.println("testWithRegularParameterResolver(" + argument + ")");
  }

  @AfterEach
  void afterEach() {
    System.out.println("afterEach()");
  }

}
