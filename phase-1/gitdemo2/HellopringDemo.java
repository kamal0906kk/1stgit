package gitdemo2;
import java.io.*;
public class HellopringDemo {static int biggestOfThree(int x, int y, int z)
{
	 
    return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
}

// Main driver function
public static void main(String[] args)
{

    // Declaring variables for 3 numbers
    int a, b, c;
    System.out.println("after some chage");

    // Variable holding the largest number
    int largest;
    a = 5;
    b = 10;
    c = 3;
    // Calling the above function in main
    largest = biggestOfThree(a, b, c);

    // Printing the largest number
    System.out.println(largest
                       + " is the largest number.");
}
}


