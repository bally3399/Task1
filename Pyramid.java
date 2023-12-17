import java.util.Scanner;

public class Pyramid{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter total weight of each stone: ");
	Double stone = input.nextDouble();

	System.out.print("Enter average weight of each stone: ");
	double weightOfEachStone = input.nextDouble();

	System.out.print("Enter the number of stone: ");
	double numberOfStone = input.nextDouble();
	
	System.out.print("Enter number of days: ");
	int totalNumberOfDays = input.nextInt();

	double totalNumberOfStone = stone / weightOfEachStone;

	double totalWeightOfEachStone = weightOfEachStone * numberOfStone;
	
	int numberOfYear = totalNumberOfDays / 365;

	System.out.printf("%f%n%f%n%d%n", totalNumberOfStone, totalWeightOfEachStone, numberOfYear);
	

	}






}