/*Input Format

There are three lines of input:

    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.

Output Format

There are three lines of output:

    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.
*/

package org.aula;

import java.util.Scanner;

public class Ex004 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int myInt = scanner.nextInt();
    double myDouble = scanner.nextDouble(); /* On passing the double on the prompt, it uses the decimal separator of
    the system. It's "," on my system. */
    
    scanner.nextLine(); /* necessary line to consume the line break before it. */
    
    String myString = scanner.nextLine();
    
    scanner.close();
    
    System.out.println("String: " + myString);
    System.out.println("Double: " + myDouble);
    System.out.println("Int: " + myInt);
  }
}
