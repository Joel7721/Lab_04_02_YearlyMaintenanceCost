public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        double springCost = 100.0;
        double summerCost = 75.55;
        double fallCost = 105.43;
        double winterCost = 99.99;
        double totalYearlyMaintenanceCost;

        totalYearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The spring cost is: " + springCost);
        System.out.println("The summer cost is: " + summerCost);
        System.out.println("The winter cost is: " + winterCost);
        System.out.println("The fall cost is: " + fallCost);
        System.out.println("The total yearly maintenance cost is: " + totalYearlyMaintenanceCost);
    }
}
