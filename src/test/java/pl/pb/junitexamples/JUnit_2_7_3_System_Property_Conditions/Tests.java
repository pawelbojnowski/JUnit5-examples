package pl.pb.junitexamples.JUnit_2_7_3_System_Property_Conditions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

@DisplayName("2.7.3. System Property Conditions")

public class Tests {

  @Test
  @EnabledIfSystemProperty(named = "java.runtime.name", matches = ".*Environment")
  void onlyIfRuntimeIfContainsEnvironment() {
  }

  @Test
  @EnabledIfSystemProperty(named = "os.name", matches = "NOT_EXISTING_SO")
  void onlyIfOsNameIsNOT_EXISTING_SO() {
  }

  @Test
  @DisabledIfSystemProperty(named = "java.runtime.name", matches = ".*Environment")
  void disableIfContainsEnvironment() {
  }

  @Test
  @DisabledIfSystemProperty(named = "os.name", matches = "NOT_EXISTING_SO")
  void disableIfOsNameIsNOT_EXISTING_SO() {
  }

}
