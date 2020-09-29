package pl.pb.junitexamples.JUnit_2_14_0_Repeated_Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

@DisplayName("2.14.0. Repeated Tests - Repeated Tests")
class Tests {

  @RepeatedTest(10)
  public void test() {
    assertEquals(2, 1 + 1);
  }


  @RepeatedTest(value = 3, name = "Custom description of repetition: repetition {currentRepetition} of {totalRepetitions}")
  public void test2() {
    assertEquals(2, 1 + 1);
  }


  @RepeatedTest(value = 3, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER)
  public void test3() {
    assertEquals(2, 1 + 1);
  }

  @RepeatedTest(value = 3, name = RepeatedTest.CURRENT_REPETITION_PLACEHOLDER)
  public void test4() {
    assertEquals(2, 1 + 1);
  }

  @RepeatedTest(value = 3, name = RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER)
  public void test5() {
    assertEquals(2, 1 + 1);
  }

  @RepeatedTest(value = 3, name = RepeatedTest.SHORT_DISPLAY_NAME)
  public void test6() {
    assertEquals(2, 1 + 1);
  }

  @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
  public void test7() {
    assertEquals(2, 1 + 1);
  }

  @RepeatedTest(value = 3)
  public void test7(RepetitionInfo repetitionInfo) {
    assertTrue(repetitionInfo.getTotalRepetitions() <= 3);
    assertEquals(3, repetitionInfo.getTotalRepetitions());
  }

}
