import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {
  @Test
  public void pingPong_countsFromOneToAGivenNumber_allNumbersListed() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> numbers = new ArrayList<String>();
    numbers.add("1");
    numbers.add("2");
    assertEquals(numbers, testPingPong.pingPong(2));
  }

  @Test
  public void pingPong_replacesNumbersDivisibleByThreeWithPing_ping() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> numbers = testPingPong.pingPong(3);
    assertEquals("ping", numbers.get(numbers.size()-1));
  }

  @Test
  public void pingPong_replacesNumbersDivisibleByFiveWithPong_pong() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> numbers = testPingPong.pingPong(5);
    assertEquals("pong", numbers.get(numbers.size()-1));
  }

  @Test
  public void pingPong_replacesNumbersDivisibleByFifteenWithPingPong_pingPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<String> numbers = testPingPong.pingPong(15);
    assertEquals("ping-pong", numbers.get(numbers.size()-1));
  }
}
