/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of
alphabetic characters, and each integer will be in the inclusive range from to

.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly
characters.
The second column contains the integer, expressed in exactly digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.*/

package org.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex005 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int n = 3;
    
    ArrayList<String> myString = new ArrayList<>();
    ArrayList<Integer> myInt = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      
      myString.add(scanner.nextLine()); /*ready to read more than a word if needed.*/
      myInt.add(scanner.nextInt());
      
      scanner.nextLine(); /*necessary to clear the \n left by nextInt().*/
    }
    
    scanner.close();
    
    System.out.println("================================");
    
    for (int i = 0; i < myString.size(); i++) {
      System.out.printf("%-15s%03d%n", myString.get(i), myInt.get(i));
    }
    
    System.out.println("================================");
  }
}

/*Hacker Rank has my simpler version submitted.*/
