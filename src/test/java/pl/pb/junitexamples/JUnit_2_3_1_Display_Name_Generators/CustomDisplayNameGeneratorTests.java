package pl.pb.junitexamples.JUnit_2_3_1_Display_Name_Generators;


import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayNameGeneration(CustomDisplayNameGenerator.class)
class CustomDisplayNameGeneratorTests {

  @Test
  void nameOfTest() {
  }

  @Nested
  @DisplayNameGeneration(CustomDisplayNameGenerator.class)
  class NestedClass {

    @Test
    void nameOfNestedTest() {
    }

  }

}
