package pl.pb.junitexamples.JUnit_2_15_4_Argument_Conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class ToStringArgumentConverterWithContext implements ArgumentConverter {

  @Override
  public Object convert(Object source, ParameterContext context)
      throws ArgumentConversionException {
    assertEquals(String.class, context.getParameter().getParameterizedType(),
        "Can only convert to String");
    if (source instanceof Enum<?>) {
      return ((Enum<?>) source).name();
    }
    return String.valueOf(source);
  }

}
