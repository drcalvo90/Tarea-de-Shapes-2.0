package uh.ac.cr;

import java.util.Scanner;

import uh.ac.cr.pattern.pattern;

public class main {

    public static void main(String[] args) {
	// write your code here
pattern pattern = new pattern();

//Asking the customer the length  based  on the number of stars, desired to be used.
Scanner scanner = new Scanner(System.in);
System.out.println("Please select the number of stars you wish to use in you´re pattern");
int numofstars = scanner.nextInt();
pattern.printdiamond(numofstars);
while (pattern.getChosenShape(! = 6) {

    pattern. chooseShape();

    if pattern. getChosenShape() == 1 {
                pattern.askvaluestouser();
                result = pattern.printdiamond();
                System.out.println("The Shape you selected, will appear next" + result + "\n");

            }else if (pattern.getchosenshape() == 2) {
        pattern.askvaluestouser();
        result = pattern.printheart();
                System.out.println(" The Shape you selected, will appear next" + result + "\n");

            }else if (pattern.getchosenshape() == 3){
                    pattern.askvaluestouser();
                    result = pattern.printsquare();
                    System.out.println(" The Shape you selected, will appear next" + result + "\n");

            }else if (pattern.getchosenshape() == 4) {
                pattern.askvaluestouser();
                result = pattern.printrectangle();
                System.out.println(" The Shape you selected, will appear next" + result + "\n");

            }else if (pattern.getchosenshape() == 5) {
                pattern.askvaluestouser();
                result = pattern.printcircle();
                System.out.println(" The Shape you selected, will appear next" + result + "\n");


}
} System.out.println("\n"+"\n"+ " the program will be closed, thanks");