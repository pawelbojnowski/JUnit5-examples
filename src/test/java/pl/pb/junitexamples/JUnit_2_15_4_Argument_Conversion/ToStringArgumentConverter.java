package pl.pb.junitexamples.JUnit_2_15_4_Argument_Conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class ToStringArgumentConverter extends SimpleArgumentConverter {

  @Override
  protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
    assertEquals(String.class, targetType, "Can only convert to String");
    if (source instanceof Enum<?>) {
      return ((Enum<?>) source).name();
    }
    return String.valueOf(source);
  }

}
