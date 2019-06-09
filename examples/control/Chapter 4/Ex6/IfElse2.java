//: control/IfElse2.java
import static net.mindview.util.Print.*;

public class IfElse2 {
  static int test(int testval, int begin, int end) {
    if(testval > end)
      return +1;
    else if(testval < begin)
      return -1;
    else
      return 0; // Match
  }
  public static void main(String[] args) {
    print(test(10, 5, 8));
    print(test(5, 10, 15));
    print(test(5, 5, 10));
  }
} /* Output:
1
-1
0
*///:~
