import java.util.Arrays; //nag declare ng array class para magamit ang deepToString method

public class CinemaSeating{
    public static void main(String[] args){

        //nag declare ng 2D array na may 2 rows at 3 columns 
        String[] row1 = {"Alice", "Bob", "Charlie"};
        String[] row2 = {"David", "Emma", "Frank"};

        //nag initialize ng 2d arrays na may pangalan na seats at nag assign ng values
        String[][] seats = {{"Alice", "Bob", "Charlie"},
                            {"David", "Emma", "Frank"}};

        //ipiprint ang value na located sa raw 1 column 2 which is si Frank
        System.out.println("Seat at row 1, column 2: " + seats[1][2]);

        //papalitan ang value ng seat na located sa row 0 column 1 which is si Bob to "Vacant"
        seats[0][1] = "Vacant";

        //ipiprint ang buong 2D array gamit ang deepToString method
        System.out.print(Arrays.deepToString(seats));
            
    }
}