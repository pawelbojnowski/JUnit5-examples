package pl.pb.junitexamples.JUnit_2_15_4_Argument_Conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

@DisplayName("2.15.4. Argument Conversion")
class Tests {

  @ParameterizedTest
  @ValueSource(strings = "SECONDS")
  void testWithImplicitArgumentConversion(ChronoUnit argument) {
    assertNotNull(argument.name());
  }


  @ParameterizedTest
  @ValueSource(strings = {"42 Cats", "42 Dog"})
  void testWithImplicitFallbackArgumentConversion2(ExampleObject book) {
    assertTrue(StringUtils.isNotBlank(book.getTitle()));
  }

  @ParameterizedTest
  @EnumSource(ChronoUnit.class)
  void testWithExplicitArgumentConversion(
      @ConvertWith(ToStringArgumentConverter.class) String argument) {
    assertNotNull(ChronoUnit.valueOf(argument));
  }

  @ParameterizedTest
  @EnumSource(ChronoUnit.class)
  void testWithExplicitArgumentConversionWithContext(
      @ConvertWith(ToStringArgumentConverterWithContext.class) String argument) {
    assertNotNull(ChronoUnit.valueOf(argument));
  }

  @ParameterizedTest
  @ValueSource(strings = {"01.01.2017", "31.12.2017"})
  void testWithExplicitJavaTimeConverter(
      @JavaTimeConversionPattern("dd.MM.yyyy") LocalDate argument) {
    assertEquals(2017, argument.getYear());
  }

}
