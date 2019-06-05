//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
import static net.mindview.util.Print.*;
/**
 * Tree Class Definition Consist of 
 * on stack integer height 
 * Tree() method without argument
 * Tree(int) method with integer argument
 * info() method without argument
 * info(String) method with String Argument
 */
class Tree {
  /**
   * height of Tree
   */
  int height;
  /**
   * Initializing the Tree height to zero or planting
   */
  Tree() {
    print("Planting a seedling");
    height = 0;
  }
  /**
   * initializing Tree height to parameter height 
   * @param initialHeight is the height of Tree
   */
  Tree(int initialHeight) {
    height = initialHeight;
    print("Creating new Tree that is " +
      height + " feet tall");
  }	
  /**
   * Print The Tree height 
   */
  void info() {
    print("Tree is " + height + " feet tall");
  }
  /**
   * Print The Tree height with strating String
   * @param s : Starting String in formated output string
   */
  void info(String s) {
    print(s + ": Tree is " + height + " feet tall");
  }
}
/**
 * Overloading Class Compose the use of Tree Class in main Method
 * This is executable class with main method
 * 
 */
public class Overloading {
  /**
   * this method plant five tree with 1-5 size in loop and show the overloaded info method
   * @param args Arrays of String which sent from Command line
   */
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Overloaded constructor:
    new Tree();
  }	
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
