import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
    void equals_differentObject() {
    Date date1 = new Date(2021, 2, 28);
    Object obj = new Object();
    assertFalse(date1.equals(obj));
  }

  @Test
    void equals_identicalDates() {
    Date date1 = new Date(2021, 2, 28);
    Date date2 = new Date(2021, 2, 28);
    assertTrue(date1.equals(date2));
  }

  @Test
    void equals_differentDates() {
      Date date1 = new Date(2021, 2, 28);
      Date date2 = new Date(2021, 2, 25);
      assertFalse(date1.equals(date2));
    }

    @Test
    void equals_differentDates2() {
      Date date1 = new Date(2021, 2, 28);
      Date date2 = new Date(2021, 3, 28);
      assertFalse(date1.equals(date2));
    }

    @Test
    void equals_differentDates3() {
      Date date1 = new Date(2021, 3, 28);
      Date date2 = new Date(2020, 3, 28);
      assertFalse(date1.equals(date2));
    }

  @Test
    void toString_returnsCorrectFormat() {
    Date date = new Date(2024, 5, 12); // May 12, 2024
    String expectedString = "2024/May/12";
    assertEquals(expectedString, date.toString());
  }

  @Test
    void setDay_moreThan31Days() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2021, 2, 32)
    );
  }

  @Test
    void setDay_30DayMonthWith31Days() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2021, 6, 31)
    );
  }

  @Test
    void setDay_30DayFebruaryLeapYear() {
    assertThrows(IllegalArgumentException.class,
      () -> new Date(2024, 2, 30)
    );
  }

  @Test
    void setMonth_InvalidMonth() {
      assertThrows(IllegalArgumentException.class,
        () -> new Date(2024, -1, 12)
      );
  }

  @Test
    void isEndOfMonth_NonLeapYear() {
      Date today = new Date(2023, 2, 28);
      Date expectedTomorrow = new Date(2023, 3, 1);
      assertEquals(expectedTomorrow, today.nextDate());
    }

    @Test 
     void isEndOfMonth_LeapYear() {
      Date today = new Date(2000, 2, 29);
      Date expectedTomorrow = new Date(2000, 3, 1);
      assertEquals(expectedTomorrow, today.nextDate());
     }

}