public class CoffeeShopAnalyzer {
    public static void main(String[] args) {


        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195}; /* Dito nilagay natin sa array ang mga sales
         ng bawat araw, mula monday hanggang friday na nakalagay sa array */

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; /* Dito naman
        nilagay natin ulit sa array ang mga pangalan ng bawat araw */

        System.out.println("--- Daily Sales ---"); /* Ito naman ang magprint ng heading natin na daily sales */

        for (int i = 0; i < weeklySales.length; i++) { /*Dito gumamit tayo ng for loop para ulit ulitin ang code
        hanggang sa maipakita lahat ng sales ng bawat araw */

            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]); // Ipapakita nito ang bilang ng nabenta
        }

        int totalSales = 0; // Ang total sales ay mag-sisimula sa zero


        for (int dailySale : weeklySales) { // Sa line na to kinukuha ang bawat sales sa array

            totalSales = totalSales + dailySale; /* Sa line naman na ito ay idinadagdag ang sales ng lahat ng araw
            para ma-total lahat */
        }

        double averageSales = (double) totalSales / weeklySales.length; /* Kinukuha ang average sales gamit ang total
        ng lahat na araw at hinati ito sa pitong araw */

        System.out.println("\n--- Weekly Summary ---"); /* Ito naman ang magprint ng heading natin para sa
         weekly summary */

        System.out.println("Total Sales: " + totalSales + " cups"); /* Ito naman ang magprint ng total sales natin
         sa buong linggo*/

        System.out.println("Average Daily Sales: " + averageSales + " cups"); /* Ipapakita naman nito ang average
         sales ng bawat araw */
        
        int maxSales = weeklySales[0]; // Dito ginawang unang sales number ang pinaka unang mataas na sales
        
        int minSales = weeklySales[0]; // Dito  ginawa rin unang sales number ang unang pinakamababang sales
        
        String bestDay = daysOfWeek[0]; // Ginagawang unang araw ang panimulang best day

        
        String worstDay = daysOfWeek[0];// Ginagawang unang araw ang panimulang worst day
        
        for (int i = 1; i < weeklySales.length; i++) { // Nagsisimula sa index 1 dahil na-check na natin ang index 0

            
            if (weeklySales[i] > maxSales) { // Sa linyang ito sinusuri kung mas mataas ang sales sa kasalukuyang maximum

               
                maxSales = weeklySales[i];  // Ina-update ang pinakamataas na sales kapag may mas mataas na nakita

                
                bestDay = daysOfWeek[i]; // Ina-update ang pangalan ng araw na may pinakamataas na sales
            }
            
            if (weeklySales[i] < minSales) { // Sinusuri kung mas mababa ang sales sa kasalukuyang minimum

                
                minSales = weeklySales[i]; // Ina-update ang pinakamababang sales kapag may mas mababa na nakita
                
                worstDay = daysOfWeek[i]; // Ina-update ang pangalan ng araw na may pinakamababang sales
            }
        }


        System.out.println("\n--- Bests and Worsts ---"); /* Ito naman ang magprint ng heading natin na Bests and Worsts */

        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups."); /* Dito ipapakita kung anong
         araw ang may pinakamataas na sales*/

        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups."); /* Dito ipapakita kung
         anong araw ang may pinakamababang sales*/
    }
}
