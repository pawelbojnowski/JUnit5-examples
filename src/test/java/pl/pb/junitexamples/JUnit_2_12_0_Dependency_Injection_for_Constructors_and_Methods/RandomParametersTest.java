package pl.pb.junitexamples.JUnit_2_12_0_Dependency_Injection_for_Constructors_and_Methods;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@DisplayName("2.12.0. Dependency Injection for Constructors and Methods - Random Parameters Test")
@ExtendWith(RandomParametersExtension.class)
public class RandomParametersTest {

  @Test
  void injectsInteger(@RandomParametersExtension.Random int i,
      @RandomParametersExtension.Random int j) {
    System.out.println(format("param i: %d, param j:%d", i, j));
    assertNotEquals(i, j);
  }

  @Test
  void injectsDouble(@RandomParametersExtension.Random double d) {
    System.out.println("param d: " + d);
    assertEquals(0.0, d, 1.0);
  }

}
