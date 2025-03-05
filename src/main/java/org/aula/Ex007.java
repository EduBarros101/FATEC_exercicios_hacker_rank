package org.aula;

import java.util.Scanner;

// Java Loops II

public class Ex007 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = a;

            for (int j = 0; j < n; j++){
                result += (int) (Math.pow(2, j)*b);

                System.out.print(result + " ");
            }

            System.out.println();

        }
    }
}
