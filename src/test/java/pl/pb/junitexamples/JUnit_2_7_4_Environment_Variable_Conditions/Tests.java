package pl.pb.junitexamples.JUnit_2_7_4_Environment_Variable_Conditions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/*
    Ths test required to set
    Environment Variable:
    MY_ENV_VAR=1
 */
@DisplayName("2.7.4. Environment Variable Conditions")

public class Tests {

  @Test
  @EnabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "1")
  void onlyIfValueIs1() {
    System.getProperties().entrySet()
        .forEach(o -> System.out.println(o.getKey() + " = " + o.getValue()));
  }

  @Test
  @EnabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "2")
  void onlyIfValueIs2() {
  }

  @Test
  @DisabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "1")
  void disableIfValueIs1() {
  }

  @Test
  @DisabledIfEnvironmentVariable(named = "MY_ENV_VAR", matches = "2")
  void disableIfValueIs2() {
  }

}
