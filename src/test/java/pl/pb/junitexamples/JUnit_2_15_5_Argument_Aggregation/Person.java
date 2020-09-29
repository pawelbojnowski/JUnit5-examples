package pl.pb.junitexamples.JUnit_2_15_5_Argument_Aggregation;

import java.time.LocalDate;

public class Person {

  private String firstName;
  private String lastName;
  private String gender;
  private LocalDate birthday;

  public Person(String firstName, String lastName, String gender, LocalDate birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthday = birthday;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getGender() {
    return gender;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

}
