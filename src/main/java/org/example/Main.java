package org.example;
/*
Tribonacci serisi, her bir sayının üç önceki sayının toplamına eşit olduğu bir sayı dizisidir. Yani, serinin herhangi bir elemanı
T(n) = T(n-1) + T(n-2) + T(n-3) formülüyle hesaplanır.
*/

public class Main {
    public static void main(String[] args) {
        int n = 10; // İlk 10 Tribonacci sayısını gösterelim

        System.out.println("Tribonacci serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }

    // Tribonacci sayısını hesaplayan metod
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0, b = 1, c = 1, d;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}