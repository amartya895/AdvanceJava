package UNIT1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
    int num;

    PrimeNumber(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        ArrayList<PrimeNumber> primeSeries = new ArrayList<>();

        boolean[] sieve = new boolean[100];
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i < Math.sqrt(100); i++) {
            if (sieve[i] == true) {
                for (int j = (i * i); j < 100; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        System.out.println("List of all prime numbers up to 100 are: ");
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] == true) {
                primeSeries.add(new PrimeNumber(i));
            }
        }

        Iterator<PrimeNumber> it = primeSeries.iterator();
        while (it.hasNext()) {
            PrimeNumber prime = it.next();
            System.out.println(prime.toString());
        }
    }
}
