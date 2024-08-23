/* TUTORIAL 1 (MODULE 2)
 * Name: Lijo Jolly
 * Roll Number: 57
 * Class: CSE - C
 * Q5
 */

package icarus_TUTs;

import java.util.Scanner;

public class PrimeNumberUsingLoops 
{
    public static void main(String[] args) 
    {
        int i, j,count;

        System.out.println("Prime numbers between 1 to 100 :");
        for (i = 2; i <= 100; i++) 
        {
            count = 0;
            for (j = i; j >= 1; j--) 
            {
                if (i % j == 0)
                    count = count + 1;
            }
            
            if (count == 2)
                System.out.print("" + i + " ");
        }
    }
}


