import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateNextDateOkTest {

  @ParameterizedTest
  @CsvSource({
    "2020, 5, 3, 2020, 5, 4",
    "2020, 4, 30, 2020, 5, 1",
    "2020, 12, 31, 2021, 1, 1",
    "2020, 2, 29, 2020, 3, 1",
    "2021, 2, 28, 2021, 3, 1"
    // Add more test cases as needed
  })
  void nextDate(int year, int month, int day, int expYear, int expMonth, int expDay) {
    Date inputDate = new Date(year, month, day);
    Date expectedDate = new Date(expYear, expMonth, expDay);
    assertEquals(expectedDate, inputDate.nextDate());
  }
}