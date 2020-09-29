package pl.pb.junitexamples.JUnit_2_10_0_Test_Instance_Lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("2.10.0. Test Instance Lifecycle - PER_CLASS")

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceLifecyclePER_CLASS {

  @BeforeAll
  void beforeAll() {
    System.out.println("Run beforeAll(): Class instance: " + System.identityHashCode(this));
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Run beforeEach(): Class instance: " + System.identityHashCode(this));
  }

  @Test
  void test1() {
    System.out.println("Run test1(): Class instance: " + System.identityHashCode(this));
  }

  @Test
  void test2() {
    System.out.println("Test test2: Class instance: " + System.identityHashCode(this));
  }

  @AfterEach
  void afterEach() {
    System.out.println("Run afterEach(): Class instance: " + System.identityHashCode(this));
  }

  @AfterAll
  void afterAll() {
    System.out.println("Run afterAll(): Class instance: " + System.identityHashCode(this));
  }

}
