public class CoffeeShopAnalyzer{ //nadeclare ng class na may pangalan na CoffeeShopAnalyzer
    public static void main(String[] args){ //nagdeclare ng main method kung saan magsisisimula ang program
         
        //nagdeclare 1D arrays na may pangalan na weeklySales na may initialized value 
        int[] weeklySales = {120, 145, 130, 155, 180, 195};
        
        //nagdeclare ulit ng arrays named daysOfWeek
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("---Daily Sales---"); //ididisplay ang output na daily sales

        //dito nagloloop ang weeklySales array at ididisplay ang sales para sa bawat araw
        for(int i = 0; i < weeklySales.length; i++){
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        int totalSales = 0; //nagdeclare ng integer vvariable named totalSales na walang laman or 0

        //dito inaadd ang total sales sa daily sales
        for (int dailySale : weeklySales){
            totalSales += dailySale; // totalsales = totalsales + dailysale
        }

        double averageSales = (double) totalSales / weeklySales.length; //nagdeclare ng double variable na averageSales at kinukuha ang total sales at hinahati sa length ng weeklySales array

        System.out.println("\n---Weekly Summary---"); // display ang weekly summary
        System.out.println("Total Sales: " +totalSales+ "cups"); //ididisplay ang total sales
        System.out.println("Average Daily Sales: "+averageSales+"cups");// ididisplay and average daily sales

        
        int maxSales = weeklySales[0]; //nagdeclare ng integer variable na maxSales at ininitialize sa unang value ng weeklySales array
        int minSales = weeklySales[0]; //nagdeclare ng integer variable na minSales at ininitialize sa unang value ng weeklySales array
        String bestDay = daysOfWeek[0]; //nagdeclare ng string variable na bestDay at ininitialize sa unang value ng daysOfWeek array
        String worstDay = daysOfWeek[0]; //nagdeclare ng string variable na worstDay at ininitialize sa unang value ng daysOfWeek array

        //dito nagloloop ang weeklySales array para mahanap ang pinakamataas at pinakamababang sales at ang corresponding na araw
        for (int i = 1; i < weeklySales.length ; i++){ 
            if (weeklySales[i] > maxSales){ //para mahanap ang pinakamataas na sales at kung anong araw iyon nangyari
                maxSales = weeklySales[i] ; //update ang maxSales sa bagong pinakamataas na sales
                bestDay = daysOfWeek[i]; //update ang bestDay sa araw na iyon
            }
            if (weeklySales[i] < minSales){//para mahanap ang pinakamababang sales at kung anong araw yon nangyari
                minSales = weeklySales[i]; //update ang minSales sa bagong pinakamababang sales
                worstDay = daysOfWeek[i]; //update ang worstDay sa araw na iyon
            }
        }
        System.out.println("\n---Bests and Worts---"); //ididisplay ang best and worst sales

        System.out.println("Best day was " +bestDay+ " with " +maxSales+ " cups."); //ididisplay ang best day at ang corresponding na sales
        System.out.println("Slowest day was " +worstDay+ " with " +minSales+ " cups."); //ididisplay ang worst day at ang corresponding na sales
        
    }
}