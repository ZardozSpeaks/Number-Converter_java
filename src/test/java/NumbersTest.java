import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersTest {

  @Test
  public void numbersToWords_returnsTheWrittenFormOfAnInteger() {
  Numbers numbers = new Numbers();
  String written = "sixteen";
  assertEquals(written, numbers.numberConverter(16));
  }
}
