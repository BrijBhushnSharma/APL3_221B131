/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Recipe for Whisky");
		Beverage b = new Whisky();
		b.templateMethod(30);
        System.out.println("Recipe for Beer");
		b = new Beer();
		b.templateMethod(40);
		System.out.println("Recipe for Rum");
		b = new Rum();
		b.templateMethod(20);
	}
}