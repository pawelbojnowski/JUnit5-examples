package pl.pb.junitexamples.JUnit_2_8_1_Syntax_Rules_for_Tags;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*
    Ths test required to set
    Environment Variable:
    MY_ENV_VAR=1
 */
@DisplayName("2.8.1. Syntax Rules for Tags")

/**
 stacktrace for tag "dev, ": WARNING: Configuration error: invalid tag syntax in @Tag("dev, ")
 declaration on [class pl.pb.junitexamples.JUnit_2_8_1_Syntax_Rules_for_Tags.Tests]. Tag will be ignored.
 */
@Tag("dev, ")
@Tag("prod ")
public class Tests {

  @Test
  /**
   stacktrace for tag "dev, ": WARNING: Configuration error: invalid tag syntax in @Tag("dev, ")
   declaration on [void pl.pb.junitexamples.JUnit_2_8_1_Syntax_Rules_for_Tags.Tests.testingTagForDev()]. Tag will be ignored.
   */
  @Tag("dev, ")
  void testingTagForDev() {
  }

  @Test
  @Tag("prod")
  void testingTagForProd() {
  }

}
