package pl.pb.junitexamples.JUnit_2_18_Timeouts.JUnit_2_17_1_Dynamic_Test_Examples;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


@DisplayName("2.18. Timeouts")
class Tests {

  @BeforeEach
  @Timeout(2)
  void setUp() {
    System.out.println("setUp()");
  }

  @Test
  @Timeout(value = 2, unit = TimeUnit.SECONDS)
  void failsIfExecutionTimeExceeds2000Milliseconds() throws InterruptedException {
    System.out.println("failsIfExecutionTimeExceeds2000Milliseconds()");

    Thread.sleep(4000);

    System.out.println("failsIfExecutionTimeExceeds2000Milliseconds() - finished before 2 second");
  }

  @Test
  @Timeout(value = 2, unit = TimeUnit.SECONDS)
  void successIfExecutionTimeExceeds2000Milliseconds() throws InterruptedException {
    System.out.println("successIfExecutionTimeExceeds2000Milliseconds()");

    Thread.sleep(1000);

    System.out.println("successIfExecutionTimeExceeds2000Milliseconds()- finished before 2 second");
  }

}
