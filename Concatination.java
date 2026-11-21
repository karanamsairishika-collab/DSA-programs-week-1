import java.util.Scanner;

public class Concatination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];

        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
_-
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

Output- 
Microsoft Windows [Version 10.0.26200.9711]
(c) Microsoft Corporation. All rights reserved.

C:\PSPJ\week-02>javac Concationation.java

C:\PSPJ\week-02>java Concationation
10 20 30 40 50
60 70 80
10 20 30 40 50 60 70 80
