package PrimeNumbersFromRange;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersFromRange {
    void main() {
        System.out.println("---Welcome to prime number finder---");
        System.out.println();

        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a starting number");
            int startNo = input.nextInt();
            System.out.println("Please enter an ending number");
            int endNo = input.nextInt();

            startNo = Math.max(startNo, 2);
            endNo = Math.max(endNo, 2);

            ArrayList<Integer> primeNumbers = new ArrayList<>();

            for (int i = startNo; i < endNo; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j ++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    primeNumbers.add(i);
                }
            }
            System.out.println(primeNumbers);
        }
    }
}
