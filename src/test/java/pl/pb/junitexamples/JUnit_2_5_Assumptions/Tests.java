package pl.pb.junitexamples.JUnit_2_5_Assumptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2.5. Assumptions")

public class Tests {

  //imagine, that this variable contains name of environment
  private final String ENV = "TEST";

  @Test
  public void testAborted() {
    assumeTrue("PROD".equals(ENV));
  }

  @Test
  public void testExecuted() {
    assumeTrue("TEST".equals(ENV), () -> "Aborting test: not on developer workstation");
  }

  @Test
  public void testRunAssertiondDependOnContition() {
    assumingThat("PROD".equals(ENV),
        () -> {
          System.out.println("perform assertions only on the PROD server");
        });

    assumingThat("TEST".equals(ENV),
        () -> {
          System.out.println("perform assertions only on the TEST server");
        });

    System.out.println("perform   assertions in all environments");
    assertEquals("TEST", ENV);
  }

}
