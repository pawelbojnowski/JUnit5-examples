package pl.pb.junitexamples.JUnit_2_15_5_Argument_Aggregation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("2.15.5. Argument Aggregation")
class Tests {

  @ParameterizedTest
  @CsvSource({
      "Jane, Doe, F, 1990-05-20",
      "John, Doe, M, 1990-10-22"
  })
  void testWithArgumentsAccessor(ArgumentsAccessor arguments) {
    Person person = new Person(arguments.getString(0),
        arguments.getString(1),
        arguments.get(2, String.class),
        arguments.get(3, LocalDate.class));

    if (person.getFirstName().equals("Jane")) {
      assertEquals("F", person.getGender());
    } else {
      assertEquals("M", person.getGender());
    }
    assertEquals("Doe", person.getLastName());
    assertEquals(1990, person.getBirthday().getYear());
  }

  @ParameterizedTest
  @CsvSource({
      "Jane, Doe, F, 1990-05-20",
      "John, Doe, M, 1990-10-22"
  })
  void testWithArgumentsAggregator(@AggregateWith(PersonAggregator.class) Person person) {

    if (person.getFirstName().equals("Jane")) {
      assertEquals("F", person.getGender());
    } else {
      assertEquals("M", person.getGender());
    }
    assertEquals("Doe", person.getLastName());
    assertEquals(1990, person.getBirthday().getYear());
  }

  @ParameterizedTest
  @CsvSource({
      "Jane, Doe, F, 1990-05-20",
      "John, Doe, M, 1990-10-22"
  })
  void testWithCustomAggregatorAnnotation(@CsvToPerson Person person) {
    if (person.getFirstName().equals("Jane")) {
      assertEquals("F", person.getGender());
    } else {
      assertEquals("M", person.getGender());
    }
    assertEquals("Doe", person.getLastName());
    assertEquals(1990, person.getBirthday().getYear());
  }

}
