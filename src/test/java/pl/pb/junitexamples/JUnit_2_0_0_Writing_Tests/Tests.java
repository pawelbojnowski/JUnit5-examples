package pl.pb.junitexamples.JUnit_2_0_0_Writing_Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2.0.0. Writing Tests")
class Tests {

  @Test
  public void firstTest() {
    assertEquals(2, 1 + 1);
  }

}
