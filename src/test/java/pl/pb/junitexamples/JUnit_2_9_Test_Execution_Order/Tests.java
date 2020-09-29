package pl.pb.junitexamples.JUnit_2_9_Test_Execution_Order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
    Ths test required to set
    Environment Variable:
    MY_ENV_VAR=1
 */
@DisplayName("2.9. Test Execution Order")

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Tests {

  @Test
  @Order(2)
  void Test2() {
    System.out.println("run Test2");
  }

  @Test
  @Order(1)
  void Test1() {
    System.out.println("run Test1");
  }

}
