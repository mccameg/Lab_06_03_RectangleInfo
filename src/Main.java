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

			System.out.print("Please enter the width of the rectangle: "); // prompt to tell the user what to enter
			if (in.hasNextDouble()) //if the input is a valid number, the code in the if block will execute
			{
				width = in.nextDouble(); // if the input is valid, it will be stored in length
				in.nextLine(); // clears the buffer

				area = length * width; // calculates area by multiplying length * width
				perimeter = length + length + width + width; // calculates perimeter by adding up all sides
				diagonalLength = Math.sqrt(width * width + length * length); // calculates the diagonal length using Pythagorean theorem

				System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter); // outputs the area and the perimeter
				System.out.println("The length of the diagonal is " + diagonalLength); // outputs the diagonal length
			}
			else // if the input is invalid (not a number), the code in the else block runs. If the first input is invalid, the user does not get a chance to enter the second input
			{
				trash = in.nextLine(); // invalid response is stored in trash
				System.out.println("Must enter a valid number for width: " + trash); // output tells the user that their input was invalid
			}
		}
		else // if the input is invalid (not a number), the code in the else block runs
		{
			trash = in.nextLine(); // invalid response is stored in trash
			System.out.println("Must enter a valid number for length: " + trash); // output tells the user that their input was invalid
		}


    }
}
