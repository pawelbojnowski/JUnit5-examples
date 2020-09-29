package pl.pb.junitexamples.JUnit_2_11_Nested_Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@DisplayName("2.11. Nested Tests - Class Tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Tests {

  @BeforeAll
  void beforeAll() {
    System.out.println("Class Tests.beforeAll()");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Class Tests.beforeEach()");
  }


  @Test
  void test1() {
    System.out.println("Class Tests.test1()");
  }

  @Test
  void test2() {
    System.out.println("Class Tests.test2()");
  }


  @AfterEach
  void afterEach() {
    System.out.println("Class Tests.afterEach()");
  }

  @AfterAll
  void afterAll() {
    System.out.println("Class Tests.afterAll()");
  }

  @Nested
  @DisplayName("Class NestedClass")
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  class NestedClass {

    @BeforeAll
    void beforeAll() {
      System.out.println("  Class NestedClass.beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
      System.out.println("  Class NestedClass.beforeEach()");
    }


    @Test
    void test1() {
      System.out.println("  Class NestedClass.test1()");
    }

    @Test
    void test2() {
      System.out.println("  Class NestedClass.test2()");
    }


    @AfterEach
    void afterEach() {
      System.out.println("  Class NestedClass.afterEach()");
    }

    @AfterAll
    void afterAll() {
      System.out.println("  Class NestedClass.afterAll()");
    }

    @Nested
    @DisplayName("Class NestedClass2")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class NestedClass2 {

      @BeforeAll
      void beforeAll() {
        System.out.println("      Class NestedClass2.beforeAll()");
      }

      @BeforeEach
      void beforeEach() {
        System.out.println("      Class NestedClass2.beforeEach()");
      }


      @Test
      void test1() {
        System.out.println("      Class NestedClass2.test1()");
      }

      @Test
      void test2() {
        System.out.println("      Class NestedClass2.test2()");
      }


      @AfterEach
      void afterEach() {
        System.out.println("      Class NestedClass2.afterEach()");
      }

      @AfterAll
      void afterAll() {
        System.out.println("      Class NestedClass2.afterAll()");
      }

    }

  }

}
