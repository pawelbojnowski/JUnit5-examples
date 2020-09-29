package pl.pb.junitexamples.JUnit_2_13_Test_Interfaces_and_Default_Methods.test_interface_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestInterfaceDemo implements TestLifecycleLogger, TimeExecutionLogger,
    TestInterfaceDynamicTestsDemo {

  @Test
  void isEqualValue() {
    assertEquals(1, "a".length(), "is always equal");
  }

}
