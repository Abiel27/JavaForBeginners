package Days.Day_4;

public class salaryCalc {
    public double hoursalary;
    public double stateTaxRate;
    public double federalTaxrRate;
    public double weeklyHour;

    public salaryCalc(double hoursalary, double stateTaxRate, double federalTaxrRate, double weeklyHour) {
        this.hoursalary = hoursalary;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxrRate = federalTaxrRate;
        this.weeklyHour = weeklyHour;
    }
    public double salary(){
        return salary()-stateTaxRate - federalTaxrRate;
    }

}
