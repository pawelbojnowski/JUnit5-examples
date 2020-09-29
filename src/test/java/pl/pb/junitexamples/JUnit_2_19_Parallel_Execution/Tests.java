package pl.pb.junitexamples.JUnit_2_19_Parallel_Execution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;
import static org.junit.jupiter.api.parallel.Resources.SYSTEM_PROPERTIES;

import java.util.Properties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ResourceLock;

@DisplayName("2.19. Parallel Execution")
@Execution(CONCURRENT)
class Tests {

  private Properties backup;

  @BeforeEach
  void backup() {
    backup = new Properties();
    backup.putAll(System.getProperties());
  }

  @AfterEach
  void restore() {
    System.setProperties(backup);
  }

  @Test
  @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ)
  void customPropertyIsNotSetByDefault() {
    assertNull(System.getProperty("my.prop"));
  }

  @Test
  @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
  void canSetCustomPropertyToApple() {
    System.setProperty("my.prop", "apple");
    assertEquals("apple", System.getProperty("my.prop"));
  }

  @Test
  @ResourceLock(value = SYSTEM_PROPERTIES, mode = READ_WRITE)
  void canSetCustomPropertyToBanana() {
    System.setProperty("my.prop", "banana");
    assertEquals("banana", System.getProperty("my.prop"));
  }

}
