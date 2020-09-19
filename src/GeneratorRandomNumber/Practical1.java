package GeneratorRandomNumber;

import java.util.Random;
import java.util.Scanner;

public class Practical1 
{



public static void main(String[] args)
{ 
//	 int i,a=0,small=500;
// Random ran=new Random();
// for(i=0;i<100;i++)//enter the range here
// {
//
// a=ran.nextInt(100);//gives you any number from 0-99
// System.out.println(a);
//
// if(a<small)//if given number is < than previous, make this number small
// small=a;
// }
//
// System.out.println("small is :"+small);
	
	int rand=0; int smallest=100;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number 500 :");
	int N = input.nextInt();
    Random numb = new Random();
    rand = numb.nextInt(1000);
    for(int i=0;i<N;i++) {
    	rand = numb.nextInt(1000);
    	System.out.println(rand);
    	if(rand<smallest) {
    		smallest=rand;
    	}
    	
    }
    System.out.println("The smallest number is : " +smallest);
    
 }  
}
