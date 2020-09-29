package pl.pb.junitexamples.JUnit_2_20_1_The_TempDirectory_Extension;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

@DisplayName("2.20.1. The TempDirectory Extension - Shared TempDirectory")
class SharedTempDirectoryDemo {

  @TempDir
  static Path sharedTempDir;

  @Test
  void writeItemsToFile() throws IOException {
    Path file = sharedTempDir.resolve("test.txt");

    FileWriter fileWriter = new FileWriter(String.valueOf(file));
    fileWriter.write("a");
    fileWriter.write("b");
    fileWriter.write("c");
    fileWriter.close();

    assertEquals(singletonList("abc"), Files.readAllLines(file));
  }

  @Test
  void anotherTestThatUsesTheSameTempDir() throws IOException {
    Path file = sharedTempDir.resolve("test2.txt");

    FileWriter fileWriter = new FileWriter(String.valueOf(file));
    fileWriter.write("a");
    fileWriter.write("b");
    fileWriter.write("c");
    fileWriter.close();

    assertEquals(singletonList("abc"), Files.readAllLines(file));
  }

}
