public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        //Daily Average
        double monday = 100;
        double tuesday = 121;
        double wednesday = 117;

        double dailyAverage = (monday + tuesday + wednesday) / 3;

        //Monthly Average
        double monthlyAverage = dailyAverage * 30;

        //Monthly Profit
        double monthlyProfit = monthlyAverage * .18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
