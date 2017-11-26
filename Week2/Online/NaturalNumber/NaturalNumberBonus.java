package Week2.Online.NaturalNumber;

import java.util.Scanner;

/**
 * Created by abdullah on 10/18/17.
 */
public class NaturalNumberBonus {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        int count = 0, maxCount = 0, maxCountHolderNumber = 0;
        int n = numberScanner.nextInt();
        int m = numberScanner.nextInt();

        if (n <= m) {
            for (int i = n; i <= m; i++) {
                count = 0;
                int j = i;
                System.out.println("");
                System.out.println("Original Value: " + i);

                //detecting steps needed to convert to 1
                while (true) {
                    if (j == 1)
                        break;
                    if (j % 2 == 0)
                        j = j / 2;
                    else if (j % 2 == 1)
                        j = 3 * j + 1;

                    count++;
                    System.out.println("Original Value changed to: " + j + ", after iteration number: " + count);
                }

                //compare count and finding maxCount
                if (maxCount < count) {
                    maxCount = count;
                    maxCountHolderNumber = i;
                }
            }

            System.out.println("");
            System.out.println("The maximum cycle length over all numbers between & including " + n + " and " + m +
                    " is " + maxCount + ", and for Number " + maxCountHolderNumber);
        }

        else if (n > m) {
            for (int i = m; i <= n; i++) {
                count = 0;
                int j = i;
                System.out.println("");
                System.out.println("Original Value: " + i);

                //detecting steps needed to convert to 1
                while (true) {
                    if (j == 1)
                        break;
                    if (j % 2 == 0)
                        j = j / 2;
                    else if (j % 2 == 1)
                        j = 3 * j + 1;

                    count++;
                    System.out.println("Original Value changed to: " + j + ", after iteration number: " + count);
                }

                //compare count and finding maxCount
                if (maxCount < count) {
                    maxCount = count;
                    maxCountHolderNumber = i;
                }
            }

            System.out.println("");
            System.out.println("The maximum cycle length over all numbers between & including " + m + " and " + n +
                    " is " + maxCount + ", and for Number " + maxCountHolderNumber);
        }
    }
}
