package pl.pb.junitexamples.JUnit_2_15_6_Customizing_Display_Names;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("2.15.6. Customizing Display Names")
class Tests {

  @DisplayName("Display name of container")
  @ParameterizedTest(name = " index = {index}; arg 0 = {0}; arg 1 = {1}")
  @CsvSource({"apple, 1", "banana, 2", "'lemon, lime', 3"})
  void testWithCustomDisplayNames(String fruit, int rank) {
  }

  @DisplayName("Display name of container 2")
  @ParameterizedTest(name = " index = {index}; arguments = {arguments}")
  @CsvSource({"apple, 1", "banana, 2", "'lemon, lime', 3"})
  void testWithCustomDisplayNamesArguments(String fruit, int rank) {
  }

}
