package org.aula;

import java.util.Scanner;

// Java Loops II

public class Ex007 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de casos de teste: ");
    int q = scanner.nextInt();
    
    for (int i = 0; i < q; i++) {
      
      System.out.print("Digite o valor de a: ");
      int a = scanner.nextInt();
      System.out.print("Digite o valor de b: ");
      int b = scanner.nextInt();
      System.out.print("Digite o valor de n: ");
      int n = scanner.nextInt();
      
      int result = a;
      
      for (int j = 0; j < n; j++) {
        result += (int) (Math.pow(2, j) * b);
        
        System.out.print(result + " ");
      }
      
      System.out.println();
    }
  }
}
