//: control/IfElse.java
import static net.mindview.util.Print.*;

public class IfElse {
  static int result = 0;
  static void test(int testval, int begin, int end) {
    if(testval > end)
      result = +1;
    else if(testval < begin)
      result = -1;
    else
      result = 0; // Match
  }
  public static void main(String[] args) {
    test(10, 5, 9);
    print(result);
    test(5, 10, 20);
    print(result);
    test(5, 5, 8);
    print(result);
  }
} /* Output:
1
-1
0
*///:~
