import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_endOfMonth() {
    Date endOfMonth = new Date(2020, 4, 30);
    assertEquals(new Date(2020, 5, 1), endOfMonth.nextDate());
  }

  @Test
  void nextDate_endOfYear() {
    Date endOfYear = new Date(2020, 12, 31);
    assertEquals(new Date(2021, 1, 1), endOfYear.nextDate());
  }

  @Test
  void nextDate_leapYear() {
    Date leapYear = new Date(2020, 2, 29);
    assertEquals(new Date(2020, 3, 1), leapYear.nextDate());
  }

  @Test
  void nextDate_nonLeapYear() {
    Date nonLeapYear = new Date(2021, 2, 28);
    assertEquals(new Date(2021, 3, 1), nonLeapYear.nextDate());
  }

}