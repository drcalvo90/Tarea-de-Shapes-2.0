package uh.ac.cr.pattern;

public class pattern {

    public void printdiamond( int numofstars) {

        System.out.println();

        int rowsToPrint = numofstars / 2 + 3;

        for (int x = 1; x <= rowsToPrint; x++){
            for (int y = 1; y = rowsToPrint - x; y++){
        System.out.print(" ");
}
            for (int symbol =1; symbol <= 2 * x -1; ++symbol){
                System.out.print("*");
            }
            System.out.println("");
        }
        -- rowsToPrint;
        int x;
        for(x =1; x <= rowsToPrint; ++x ){
            int symbol;
            for (symbol =1; symbol <= x ; ++symbol){
                System.out.print(" ");
            }
        for (symbol = 1; symbol <= (rowsToPrint -x ) * 2 + 1; ++symbol){
                System.out.print ("*");
           }
        System.out.println();
        }
}