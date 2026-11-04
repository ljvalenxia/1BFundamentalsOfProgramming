import java.util.Scanner;

public class Looping2{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
      for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
          System.out.println(i);
        }

        if (i == 20 || i == 40 || i == 60 || i == 80 ) {
          System.out.println();
        }
    }
}
}