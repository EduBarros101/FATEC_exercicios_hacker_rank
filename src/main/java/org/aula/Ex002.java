/*Task
Given an integer,

, perform the following conditional actions:

    If

is odd, print Weird
If
is even and in the inclusive range of to
, print Not Weird
If
is even and in the inclusive range of to
, print Weird
If
is even and greater than

    , print Not Weird

Complete the stub code provided in your editor to print whether or not

is weird.

Input Format

A single line containing a positive integer,

.

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.*/

package org.aula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex002 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(bufferedReader.readLine().trim());
    boolean even = N % 2 == 0;
    
    bufferedReader.close();
    
    if (!even) {
      System.out.println("Weird");
    } else if (N >= 2 && N <= 5) {
      System.out.println("Not Weird");
    } else if (N >=6 && N <= 20) {
      System.out.println("Weird");
    } else {
      System.out.println("Not Weird");
    }
  }
}
