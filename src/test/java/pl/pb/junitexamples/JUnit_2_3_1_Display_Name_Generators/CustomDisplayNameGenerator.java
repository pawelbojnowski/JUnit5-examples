package pl.pb.junitexamples.JUnit_2_3_1_Display_Name_Generators;

import java.lang.reflect.Method;
import org.junit.jupiter.api.DisplayNameGenerator;

public class CustomDisplayNameGenerator extends DisplayNameGenerator.Standard {

  public String generateDisplayNameForClass(Class<?> testClass) {
    return "2.3.1. Display Name Generators - Changed named for class:    " + testClass
        .getSimpleName();
  }

  public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
    return "2.3.1. Display Name Generators - Changed named for nested class:    " + nestedClass
        .getSimpleName();
  }

  public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
    return "2.3.1. Display Name Generators - Changed named for method:    " + testMethod.getName();
  }

}
