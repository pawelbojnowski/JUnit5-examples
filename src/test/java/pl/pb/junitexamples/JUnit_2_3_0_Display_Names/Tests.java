package pl.pb.junitexamples.JUnit_2_3_0_Display_Names;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("2.3.0. Display Names - Name for class")
class Tests {

  @Test
  @DisplayName("Custom test name containing spaces")
  void testWithDisplayNameContainingSpaces() {
  }

  @Test
  @DisplayName("╯°□°）╯")
  void testWithDisplayNameContainingSpecialCharacters() {
  }

  @Test
  @DisplayName("Test with emoji😱 🔥")
  void testWithDisplayNameContainingEmoji() {
  }

}
