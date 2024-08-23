/* TUTORIAL 1 (MODULE 2)
 * Name: Lijo Jolly
 * Roll Number: 57
 * Class: CSE - C
 * Q2
 */



package icarus_TUTs;

public class FibonacciSeriesWithWhileLoop
{
	   public static void main(String args[]) 
	   {
	      int a, b, c, i = 1, n;
	      n = 10;
	      a = b = 1; System.out.print(a+" "+b);

	      while(i<n) 
	      {
	         c = a + b; System.out.print(" ");
	         System.out.print(c);
	         a = b;
	         b = c;
	         i++;
	      }
	   }
	}


