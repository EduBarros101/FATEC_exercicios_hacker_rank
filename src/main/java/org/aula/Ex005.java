package org.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex005 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<String> myString = new ArrayList<>();
    ArrayList<Integer> myInt = new ArrayList<>();
    
    for (int i = 0; i < 3; i++){
      myString.add(scanner.next());
      myInt.add(scanner.nextInt());
    }
    
    scanner.close();
    
    System.out.println("================================");
    
    for (int i = 0; i < myString.size(); i++){
      System.out.printf("%-15s%03d%n", myString.get(i), myInt.get(i));
    }
    
    System.out.println("================================");
    
  }
}

