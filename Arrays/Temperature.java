public class Temperature {
    public static void main(String[] args){

        //nag declare ng 1D array na may 5 elements
        double[] temperatures = new double[5];

        //nag assign ng values sa specific index ng array
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        //ipiprint ang buong 1D array gamit ang for loop
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day" + (i + 1) + ": " + temperatures[i]);
        }

        //papalitan ang value ng temperature na located sa index 2 which is 31.8 to 32.0
        temperatures[2] = 32.0;

        //ipiprint ang updated value ng temperature na located sa index 2
        System.out.println("Updated temperatures in third day: " + temperatures[2]);
        
    }
}