/* TUTORIAL 1 (MODULE 2)
 * Name: Lijo Jolly
 * Roll Number: 57
 * Class: CSE - C
 * Q4
 */

package icarus_TUTs;

public class LeapYearUsingIFELSE {

	  public static void main(String[] args) 
	  {
	    
	    int year = 1998;

	    
	    if (year % 400 == 0) 
	    {
	      System.out.println(year + " is a leap year.");
	    } 
	    
	    
	    else if (year % 100 == 0) 
	    {
	      System.out.println(year + " is not a leap year.");
	    } 
	    
	    
	    else if (year % 4 == 0) 
	    {
	      System.out.println(year + " is a leap year.");
	    } 
	    
	    
	    else 
	    {
	      System.out.println(year + " is not a leap year.");
	    }
	  }
	}

