package pl.pb.junitexamples.JUnit_2_13_Test_Interfaces_and_Default_Methods.test_interface_demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInstance;
import pl.pb.junitexamples.utils.Utils;

@DisplayName("2.13. Test Interfaces and Default Methods test interface demo")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
interface TestInterfaceDynamicTestsDemo {

  @TestFactory
  default Stream<DynamicTest> dynamicTestsForPalindromes() {
    return Stream.of("racecar", "radar", "mom", "dad")
        .map(text -> dynamicTest(text, () -> assertTrue(Utils.isPalindrome(text))));
  }

}
