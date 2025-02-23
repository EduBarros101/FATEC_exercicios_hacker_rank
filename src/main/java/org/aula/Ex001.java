package org.aula;

import java.util.Scanner;

public class Ex001 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insert the first integer: ");
    int a = scanner.nextInt();
    System.out.print("Insert the second integer: ");
    int b = scanner.nextInt();
    System.out.print("Insert the third integer: ");
    int c = scanner.nextInt();

    scanner.close();

    System.out.print("First integer: ");
    System.out.println(a);
    System.out.print("Second integer: ");
    System.out.println(b);
    System.out.print("Third integer: ");
    System.out.println(c);
  }
}