package pl.pb.junitexamples.JUnit_2_6_Disabling_Tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2.6. Disabling Tests - only methods")
public class Tests {

  @Disabled("Disabled (@Ignored) test case")
  @Test
  void testWillBeSkipped() {
  }

  @Test
  void testWillBeExecuted() {
  }

}
