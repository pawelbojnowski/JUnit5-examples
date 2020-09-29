package pl.pb.junitexamples.JUnit_2_7_2_Java_Runtime_Environment_Conditions;

import static org.junit.jupiter.api.condition.JRE.JAVA_10;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;

@DisplayName("2.7.2. Java Runtime Environment Conditions")

public class Tests {

  @Test

  @EnabledOnJre(JAVA_8)
  void onlyOnJava8() {
    System.out.println("run only On Java8");
  }

  @Test
  @EnabledOnJre({JAVA_9, JAVA_10})
  void onJava9Or10() {
    System.out.println("run only On Java9 or Java9");
  }

  @Test
  @EnabledForJreRange(min = JAVA_9, max = JAVA_11)
  void fromJava9to11() {
    System.out.println("run from Java9 to 11");
  }

  @Test
  @EnabledForJreRange(min = JAVA_9)
  void fromJava9toCurrentJavaFeatureNumber() {
    System.out.println("run from Java9 to Current Java Feature Number");
  }

  @Test
  @EnabledForJreRange(max = JAVA_11)
  void fromJava8To11() {
    System.out.println("run from Java8 To 11");
  }

  @Test
  @DisabledOnJre(JAVA_9)
  void notOnJava9() {
    System.out.println("disable - not run On Java9");
  }

  @Test
  @DisabledForJreRange(min = JAVA_9, max = JAVA_11)
  void notFromJava9to11() {
    System.out.println("disable - not run from Java9 to Java11");
  }

  @Test
  @DisabledForJreRange(min = JAVA_9)
  void notFromJava9toCurrentJavaFeatureNumber() {
    System.out.println("disable - not run From Java9 to Current Java Feature Number");
  }

  @Test
  @DisabledForJreRange(max = JAVA_11)
  void notFromJava8to11() {
    System.out.println("disable - not From Java8 to Java11");
  }

}
