package pl.pb.junitexamples.JUnit_2_13_Test_Interfaces_and_Default_Methods.test_interface_demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("timed")
@ExtendWith(TimingExtension.class)
public interface TimeExecutionLogger {

}
