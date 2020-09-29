package pl.pb.junitexamples.JUnit_2_12_0_Dependency_Injection_for_Constructors_and_Methods;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;


@DisplayName("2.12.0. Dependency Injection for Constructors and Methods - TestInfo Demo")
class TestReporterDemo {

  @Test
  void reportSingleValue(TestReporter testReporter) {
    System.out.println("reportSingleValue()");
    testReporter.publishEntry("a status message");
  }

  @Test
  void reportKeyValuePair(TestReporter testReporter) {
    System.out.println("reportKeyValuePair()");
    testReporter.publishEntry("a key", "a value");
  }

  @Test
  void reportMultipleKeyValuePairs(TestReporter testReporter) {
    System.out.println("reportMultipleKeyValuePairs()");
    Map<String, String> values = new HashMap<>();
    values.put("user name", "dk38");
    values.put("award year", "1974");

    testReporter.publishEntry(values);
  }

}
