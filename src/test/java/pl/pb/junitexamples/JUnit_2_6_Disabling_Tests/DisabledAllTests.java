package pl.pb.junitexamples.JUnit_2_6_Disabling_Tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2.6. Disabling Tests - Disabled (@Ignored) all tests case in current class")
@Disabled("2.6. Disabling Tests - Disabled (@Ignored) all tests case in current class")
public class DisabledAllTests {

  @Test
  void testWillBeSkipped() {
  }

  @Test
  void testWillBeExecuted() {
  }

}
