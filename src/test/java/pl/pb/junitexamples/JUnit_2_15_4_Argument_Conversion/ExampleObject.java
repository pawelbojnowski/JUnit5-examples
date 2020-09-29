package pl.pb.junitexamples.JUnit_2_15_4_Argument_Conversion;

public class ExampleObject {

  private String title;
  private String value;

  public ExampleObject(String title) {
    this.title = title;
  }

  public ExampleObject(String title, String value) {
    this.title = title;
    this.value = value;
  }

  public String getTitle() {
    return title;
  }

  public String getValue() {
    return value;
  }

}
