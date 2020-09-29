package pl.pb.junitexamples.JUnit_2_1_1_Meta_Annotations_and_Composed_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Tag("custom_tag_annotation")
@Test
public @interface CustomTagAnnotation {

}
