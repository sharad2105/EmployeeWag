public class CompanyWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;

    public CompanyWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
    }
}
