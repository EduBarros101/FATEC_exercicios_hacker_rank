/*Task
In this challenge, you must read

integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are
lines of input, and each line contains a single integer.*/

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