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

        // Kinukuha ang average sales sa pamamagitan ng total na hinati sa 7 araw
        double averageSales = (double) totalSales / weeklySales.length;

        // Nagpapakita ng heading para sa weekly summary
        System.out.println("\n--- Weekly Summary ---");

        // Ipinapakita ang total sales sa buong linggo
        System.out.println("Total Sales: " + totalSales + " cups");

        // Ipinapakita ang average sales bawat araw
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Ginagawang unang sales number ang panimulang pinakamataas na sales
        int maxSales = weeklySales[0];

        // Ginagawang unang sales number ang panimulang pinakamababang sales
        int minSales = weeklySales[0];

        // Ginagawang unang araw ang panimulang best day
        String bestDay = daysOfWeek[0];

        // Ginagawang unang araw ang panimulang worst day
        String worstDay = daysOfWeek[0];

        // Nagsisimula sa index 1 dahil na-check na natin ang index 0
        for (int i = 1; i < weeklySales.length; i++) {

            // Sinusuri kung mas mataas ang sales sa kasalukuyang maximum
            if (weeklySales[i] > maxSales) {

                // Ina-update ang pinakamataas na sales kapag may mas mataas na nakita
                maxSales = weeklySales[i];

                // Ina-update ang pangalan ng araw na may pinakamataas na sales
                bestDay = daysOfWeek[i];
            }

            // Sinusuri kung mas mababa ang sales sa kasalukuyang minimum
            if (weeklySales[i] < minSales) {

                // Ina-update ang pinakamababang sales kapag may mas mababa na nakita
                minSales = weeklySales[i];

                // Ina-update ang pangalan ng araw na may pinakamababang sales
                worstDay = daysOfWeek[i];
            }
        }

        // Nagpapakita ng heading para sa pinakamataas at pinakamababang sales
        System.out.println("\n--- Bests and Worsts ---");

        // Ipinapakita kung anong araw ang may pinakamataas na sales
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");

        // Ipinapakita kung anong araw ang may pinakamababang sales
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}
