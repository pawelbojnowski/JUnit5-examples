package pl.pb.junitexamples.JUnit_2_12_0_Dependency_Injection_for_Constructors_and_Methods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@DisplayName("2.12.0. Dependency Injection for Constructors and Methods -TestInfo Demo")
class TestInfoDemo {


  TestInfoDemo(org.junit.jupiter.api.TestInfo testInfo) {
    assertEquals("TestInfo Demo", testInfo.getDisplayName());
  }

  @BeforeEach
  void init(org.junit.jupiter.api.TestInfo testInfo) {
    String displayName = testInfo.getDisplayName();
    assertTrue(displayName.equals("TEST 1") || displayName.equals("test2()"));
  }

  @Test
  @DisplayName("TEST 1")
  @Tag("my-tag")
  void test1(org.junit.jupiter.api.TestInfo testInfo) {
    assertEquals("TEST 1", testInfo.getDisplayName());
    assertTrue(testInfo.getTags().contains("my-tag"));
  }

  @Test
  void test2() {
  }

}
