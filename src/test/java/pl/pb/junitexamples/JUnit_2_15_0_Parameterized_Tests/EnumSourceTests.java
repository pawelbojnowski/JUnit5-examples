package pl.pb.junitexamples.JUnit_2_15_0_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;
import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL;
import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ANY;

import java.time.temporal.ChronoUnit;
import java.util.EnumSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


@DisplayName("2.15. Parameterized Tests - @EnumSource")
class EnumSourceTests {

  @ParameterizedTest
  @EnumSource(TestEnum.class)
  void testWithEnumSource(TestEnum unit) {
    System.out.println("Enum value: " + unit);
  }

  @ParameterizedTest
  @EnumSource(value = ChronoUnit.class, mode = EXCLUDE, names = {"ERAS", "FOREVER"})
  void testWithEnumSourceExclude(ChronoUnit unit) {
    assertFalse(EnumSet.of(ChronoUnit.ERAS, ChronoUnit.FOREVER).contains(unit));
  }

  @ParameterizedTest
  @EnumSource(value = ChronoUnit.class, mode = MATCH_ALL, names = {"^HALF.*$", "^.*DAYS$"})
  void testWithEnumSourceRegex(ChronoUnit unit) {
    assertTrue(unit.name().endsWith("DAYS"));
  }

  @ParameterizedTest
  @EnumSource(value = ChronoUnit.class, mode = MATCH_ANY, names = {"HALF^.*$", "^.*DAYS$"})
  void testWithEnumSourceRegex2(ChronoUnit unit) {
    assertTrue(unit.name().endsWith("DAYS"));
  }

}
