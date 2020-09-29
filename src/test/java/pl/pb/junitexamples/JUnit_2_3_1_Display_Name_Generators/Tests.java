package pl.pb.junitexamples.JUnit_2_3_1_Display_Name_Generators;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("2.3.1. Display Name Generators - Name for 'Tests' class")
class Tests {

  @DisplayName("A negative value for year is not supported by the leap year computation.")
  @ParameterizedTest(name = "For example, year {0} is not supported.")
  @ValueSource(ints = {-1, -4})
  void nameOfTest(int value) {
    System.out.println("Value: " + value);
  }

}
