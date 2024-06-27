import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateNextDateExceptionTest {

  @ParameterizedTest
  @CsvSource({
    "2020, 13, 1",
    "2020, 0, 5",
    "2020, 2, 30",
    "2021, 2, 29",
    "2020, -1, 10"
    // Add more invalid test cases as needed
  })
  void nextDate_ShouldThrowException(int year, int month, int day) {
    assertThrows(IllegalArgumentException.class, () -> {
      new Date(year, month, day).nextDate();
    });
  }
}