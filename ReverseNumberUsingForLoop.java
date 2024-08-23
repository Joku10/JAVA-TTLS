/* TUTORIAL 1 (MODULE 2)
 * Name: Lijo Jolly
 * Roll Number: 57
 * Class: CSE - C
 * Q3
 */


package icarus_TUTs;

class ReverseNumberUsingForLoop 
{
	  public static void main(String[] args) 
	  {
	    
	    int num = 1234567, reversed = 0;

	    for(;num != 0; num /= 10) 
	    {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
}


