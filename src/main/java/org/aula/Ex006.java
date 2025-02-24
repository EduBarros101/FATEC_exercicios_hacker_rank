/*Task
Given an integer, N, print its first multiples. Each multiple (where ) should be printed on a new line in the form: N x i = result.
 
Input Format

A single integer, N.

Constraints

2 <= N <= 20
Output Format

Print 10 lines of output; each line (where ) contains the of in the form:
N x i = result.*/

package org.aula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex006 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(bufferedReader.readLine().trim());
    
    for (int i = 1; i <=10; i++) {
      System.out.println(N + " x " + i + " = " + (N*i));
    }
    
    bufferedReader.close();
  }
}
