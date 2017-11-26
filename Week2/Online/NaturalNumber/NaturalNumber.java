package Week2.Online.NaturalNumber;

import java.util.Scanner;
/**
 * Created by abdullah on 10/17/17.
 */

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        int count = 0;
        int n = numberScanner.nextInt();

        while (true){

            if (n == 1)
                break;

            if (n % 2 == 0)
                n = n / 2;

            else if (n % 2 == 1)
                n = 3 * n + 1;

            count ++;
            System.out.println("Value of N changed to " + n + " after iteration number " + count);
        }

        System.out.println("");
        System.out.println(count + " steps needed to reach break.");
    }
}
