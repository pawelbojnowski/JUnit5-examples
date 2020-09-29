package pl.pb.junitexamples.JUnit_2_10_0_Test_Instance_Lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("2.10.0. Test Instance Lifecycle - PER_METHOD")

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TestInstanceLifecyclePER_METHOD {

  /**
   * @BeforeAll method 'public void pl.pb.junitexamples.JUnit_2_10_0_Test_Instance_Lifecycle.TestInstanceLifecyclePER_METHOD.beforeAll()'
   * must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
   */
  @BeforeAll
  static public void beforeAll() {
    System.out.println("Run beforeAll()");
  }

  /**
   * @AfterAll method 'public void pl.pb.junitexamples.JUnit_2_10_0_Test_Instance_Lifecycle.TestInstanceLifecyclePER_METHOD.afterAll()'
   * must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
   */
  @AfterAll
  static public void afterAll() {
    System.out.println("Run afterAll()");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Run beforeEach(): Class instance: " + System.identityHashCode(this));
  }

  @Test
  public void test1() {
    System.out.println("Run test1(): Class instance: " + System.identityHashCode(this));
  }

  @Test
  public void test2() {
    System.out.println("Run test2(): Class instance: " + System.identityHashCode(this));
  }

  @AfterEach
  public void afterEach() {
    System.out.println("Run afterEach(): Class instance: " + System.identityHashCode(this));
  }

}
