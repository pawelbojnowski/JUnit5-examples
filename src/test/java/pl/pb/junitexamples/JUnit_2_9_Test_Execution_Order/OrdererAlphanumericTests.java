package pl.pb.junitexamples.JUnit_2_9_Test_Execution_Order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@DisplayName("2.9. Test Execution Order")

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class OrdererAlphanumericTests {

  @Test
  void TestB() {
    System.out.println("run TestB");
  }

  @Test
  void TestA() {
    System.out.println("run TestA");
  }

}
