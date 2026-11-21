import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}

output-
Microsoft Windows [Version 10.0.26200.9711]
(c) Microsoft Corporation. All rights reserved.

C:\PSPJ\week-02>javac Factorial.java

C:\PSPJ\week-02>java Factorial
7
5040