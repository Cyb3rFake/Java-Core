package More_on_Classes.Practice;

import java.io.PrintStream;
import java.util.Scanner;

public class CalculatingNetRevenueWithTaxes_42_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalIncome  = read.nextInt();
        int taxPercent  = read.nextInt();

        Income income = new Income();
        income.taxPercent = taxPercent;
        income.totalIncome = totalIncome;

        income.CalculateNetRevenue();
        System.out.println("Net revenue: "+ income.getNetRevenue());
    }
}

class Income{
    public int totalIncome;
    public int taxPercent;
    private int netRevenue; //

    public void CalculateNetRevenue(){
        netRevenue = totalIncome - totalIncome * taxPercent /100;
    }

    public int getNetRevenue() {
        return netRevenue;
    }
}
