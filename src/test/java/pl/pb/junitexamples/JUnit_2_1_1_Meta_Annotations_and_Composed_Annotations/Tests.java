package pl.pb.junitexamples.JUnit_2_1_1_Meta_Annotations_and_Composed_Annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("2.1.1. Meta Annotations and Composed Annotations")

public class Tests {

  @Test
  @Tag("ExampleTagTest")
  public void tagTest() {
    System.out.println("Test with @Tag");
  }

  @CustomTagAnnotation
  public void customTagAnnotationTest() {
    System.out.println("Test with @CustomTagAnnotation");
  }

  @CustomTagAnnotation
  public void anotherCustomTagAnnotationTest() {
    System.out.println("Test with @CustomTagAnnotation");
  }

}
