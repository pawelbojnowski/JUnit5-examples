package pl.pb.junitexamples.JUnit_2_3_1_Display_Name_Generators;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


@DisplayName("2.3.1. Display Name Generators - Name for 'TestsReplaceUnderscores' class")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TestsReplaceUnderscores {

  @Test
  void name_of_test() {
  }

  @Test
  void nameOfTest() {
  }

}
