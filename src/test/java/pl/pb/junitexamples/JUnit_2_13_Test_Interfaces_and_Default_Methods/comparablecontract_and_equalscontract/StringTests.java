package pl.pb.junitexamples.JUnit_2_13_Test_Interfaces_and_Default_Methods.comparablecontract_and_equalscontract;

import org.junit.jupiter.api.DisplayName;

@DisplayName("2.13. Test Interfaces and Default Methods ComparableContract and EqualsContract")
class StringTests implements ComparableContract<String>, EqualsContract<String> {

  @Override
  public String createValue() {
    return "banana";
  }

  @Override
  public String createSmallerValue() {
    return "apple"; // 'a' < 'b' in "banana"
  }

  @Override
  public String createNotEqualValue() {
    return "cherry";
  }

}
