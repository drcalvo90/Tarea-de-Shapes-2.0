package uh.ac.cr.pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern {
    int printdiamond
    int printheart
    int printsquare
    int printrectangle
    int printcircle
            public int figurechosen= 0;  }

public void setFigurechosen() {
    System.out.println("Select a number for the (*) Shape Pattern you wish to do: ");
    v System.out.println("1-Diamond" + "\n\" + "2 - Heart" + "\n\" + "3 - Square" + "\n\ + "4-rectangle" + "\n\" + "
    int circle;
    5 - circle " + "\n\" + " 6 - Exit " + "\n\);
    figurechosen = scanner.nextint();
}


    public void printdiamond(int numofstars) {

        System.out.println();

        int rowsToPrint = numofstars / 2 + 3;

        for (int x = 1; x <= rowsToPrint; x++) {
            for (int y = 1; y == rowsToPrint - x; y++) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= 2 * x - 1; ++symbol) {
                System.out.print("*");
            }
            System.out.println("");
        }
        --rowsToPrint;
        int x;
        for (x = 1; x <= rowsToPrint; ++x) {
            int symbol;
            for (symbol = 1; symbol <= x; ++symbol) {
                System.out.print(" ");
            }
            for (symbol = 1; symbol <= (rowsToPrint - x) * 2 + 1; ++symbol) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public void printheart() {

    System.out.println();

    int size = 4;
    for (int w = 0; w <= size; w++ ){
        for ( int z = 0 ; z <= 4*size; z++){

            double dist1 =  Math.sqrt( Math.pow( w- size, 2) + Math.pow(z - size,2 ));
            double dist2 = Math.sqrt( Math.pow (w-size, 2) + Math.pow(z-3*size, 2));
            if (dist1 < size + 0.5 || dist2 <size + 0.5) {
                System.out.print ("*");
        }
            else { System.out.print (" ");
            }
    }
        System.out.println("");
}
    int w;
    for  (w = 1; w < 2 * size; ++w {
        int z;
        for (z =0; z < w; ++z){
            System.out.print(" ")
        }
    for (z = 0; w < 4 * size + 1 - 2 * w; ++z) {
        System.out.print("*");
    }
    System.out.println("");
}

public void printcircle() {

// implementation to print circle pattern

    public class pattern {

        // function to print circle pattern
        static void printPattern(int radius) {

            // dist represents distance to the center
            double dist;

            // for horizontal movement
            for (int i = 0; i <= 2 * radius; i++) {

                // for vertical movement
                for (int j = 0; j <= 2 * radius; j++) {
                    dist = Math.sqrt((i - radius) * (i - radius) +
                            (j - radius) * (j - radius));

                    // dist should be in the range (radius - 0.5)
                    // and (radius + 0.5) to print stars(*)
                    if (dist > radius - 0.5 && dist < radius + 0.5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                System.out.print("\n");
            }
        }

        public static void main(String[] args)
        {
            int radius = 6;
            printPattern(radius);
        }
    }
    }

    public void printsquare() {

        class public pattern {

            // To print square with primary and secondary diagonal
            static void printsquare(int k) {
                int a, b;

                // Outer loop for rows
                for (a = 1; a <= k; a++) {
                    // Inner loop for columns
                    for (b = 1; b <= k; b++) {
                        // Condition check using OR operator where
                        // 1. Printing star as per first 4 checks
                        // on the circumference of rectangle
                        // 2. Fifth check is for diagonals
                        if (a == 1 || a == k || b == 1 || b == k
                                || a == b || b == (k - a + 1))

                            // Print the star pattern
                            System.out.print("*");
                        else

                            // Print the white spaces
                            System.out.print(" ");
                    }

                    System.out.println();
                }
            }
        }
    }
} public void printrectangle() {
    public class pattern {
        private static Scanner scanner;
        public static void main(String[] args)
        {
            int rows;
            int columns;
            int i;
            int j;
            scanner = new Scanner(System.in);

            System.out.print(" Please Enter Number of Rows : ");
            rows = scanner.nextInt();

            System.out.print(" Please Enter Number of Columns : ");
            columns = scanner.nextInt();

            for(i = 1; i <= rows; i++)
            {
                for(j = 1; j <= columns; j++)
                {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }