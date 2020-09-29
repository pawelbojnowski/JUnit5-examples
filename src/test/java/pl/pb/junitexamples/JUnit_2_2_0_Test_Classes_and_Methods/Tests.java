package pl.pb.junitexamples.JUnit_2_2_0_Test_Classes_and_Methods;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2.7.2. Java Runtime Environment Conditions")

public class Tests {

  @BeforeAll
  static void initAll() {
    System.out.println("@BeforeAll run method before all test in current class");
  }

  @AfterAll
  static void tearDownAll() {
    System.out.println("@AfterAll run method after all test in current class");
  }

  @BeforeEach
  void init() {
    System.out.println("@BeforeAll run method before single test case in current class");
  }

  @Test
  void succeedingTest() {
    System.out.println("Run test 'succeedingTest()'");
  }

  @Test
  void succeedingTest2() {
    System.out.println("Run test 'succeedingTest2()'");
  }

  @Test
  void failingTest() {
    System.out.println("Run test 'failingTest()'");
    fail("a failing test");
  }

  @Test
  @Disabled("Test 'skippedTest()' will be not executed - will be skipped (The same behavior like @Ignore in JUnit4)")
  void skippedTest() {
    System.out.println(
        "Test will be not executed - will be skipped (The same behavior like @Ignore in JUnit4)");
  }

  @AfterEach
  void tearDown() {
    System.out.println("@AfterEach run method after single test case in current class");
  }

}
