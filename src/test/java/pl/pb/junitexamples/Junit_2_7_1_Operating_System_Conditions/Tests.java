package pl.pb.junitexamples.Junit_2_7_1_Operating_System_Conditions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("2.7.1. Operating System Conditions")

public class Tests {

  @Test
  @EnabledOnOs(OS.MAC)
  void enabledOnMacOs() {
    System.out.println("Test will be run only on MAC OS");
  }

  @Test
  @EnabledOnOs(OS.LINUX)
  void enabledOnLinux() {
    System.out.println("Test will be run only on LINUX");
  }

  @Test
  @EnabledOnOs({OS.MAC, OS.LINUX})
  void enabledOnLinuxAndMac() {
    System.out.println("Test will be run only on MAC OS and LINUX");
  }

  @Test
  @DisabledOnOs(OS.MAC)
  void disabledOnMacOs() {
    System.out.println("Test will be NOT run only on MAC OS");
  }

  @Test
  @DisabledOnOs(OS.LINUX)
  void disabledOnLinux() {
    System.out.println("Test will be NOT run only on LINUX");
  }

  @Test
  @DisabledOnOs({OS.MAC, OS.LINUX})
  void disableOnLinuxAndMac() {
    System.out.println("Test will be NOT run only on MAC OS and LINUX");
  }

}
