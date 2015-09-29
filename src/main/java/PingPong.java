import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {

  }

  public static ArrayList<String> pingPong(Integer yourNumber) {
    ArrayList<String> numbers  = new ArrayList<String>();

    for (Integer index = 1; index <= yourNumber; index++) {

      String stringIndex = Integer.toString(index);

      if ( index % 15 == 0 ) {
        numbers.add("ping-pong");
      } else if ( index % 5 == 0 ) {
        numbers.add("pong");
      } else if ( index % 3 == 0 ) {
        numbers.add("ping");
      } else {
        numbers.add(stringIndex);
      }
    }

    return numbers;
  }
}
