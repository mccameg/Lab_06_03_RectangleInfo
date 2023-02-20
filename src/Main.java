import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    	double length = 0;
		double width = 0;
		double area = 0;
		double perimeter = 0;
		double diagonalLength = 0;
		String trash = "";

		Scanner in = new Scanner(System.in); // Creating the scanner and telling it to read from console

		System.out.print("Please enter the length of the rectangle: "); // prompt to tell the user what to enter
		if (in.hasNextDouble()) //if the input is a valid number, the code in the if block will execute
		{
			length = in.nextDouble(); // if the input is valid, it will be stored in length
			in.nextLine(); // clears the buffer
		}
		else // if the input is invalid (not a number), the code in the else block runs
		{
			trash = in.nextLine(); // invalid response is stored in trash
			System.out.println("Must enter a valid number for length: " + trash); // output tells the user that their input was invalid
		}

		System.out.print("Please enter the width of the rectangle: "); // prompt to tell the user what to enter
		if (in.hasNextDouble()) //if the input is a valid number, the code in the if block will execute
		{
			width = in.nextDouble(); // if the input is valid, it will be stored in length
			in.nextLine(); // clears the buffer
		}
		else // if the input is invalid (not a number), the code in the else block runs
		{
			trash = in.nextLine(); // invalid response is stored in trash
			System.out.println("Must enter a valid number for width: " + trash); // output tells the user that their input was invalid
		}




    }
}
