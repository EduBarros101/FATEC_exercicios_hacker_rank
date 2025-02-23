package org.aula;
import java.util.Scanner;

public class Ex004 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int myInt = scanner.nextInt();
    double myDouble = scanner.nextDouble(); /* On passing the double on the prompt, it uses the decimal separator of
    the system. It's "," on my system. */
    
    scanner.nextLine(); /* necessary line to consume the line break before. */
    
    String myString = scanner.nextLine();
    
    scanner.close();
    
    System.out.println("String: " + myString);
    System.out.println("Double: " + myDouble);
    System.out.println("Int: " + myInt);
  }
  
}
