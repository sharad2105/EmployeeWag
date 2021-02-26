public class EmployeeWag {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompany=0;
    private CompanyWage[] companyEmpWageArray;

    public EmployeeWag(){
        companyEmpWageArray = new CompanyWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        companyEmpWageArray[numOfCompany]=new CompanyWage(company, empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage()
    {
        for(int i=0;i<numOfCompany;i++)
        {
            int totalEmpWage=this.computeEmpWage(companyEmpWageArray[i]);
            System.out.println("Total Emp Wage for Company " + companyEmpWageArray[i].company + " is: " +totalEmpWage );
        }
    }
    private int computeEmpWage(CompanyWage companyEmpWage){
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random() * 10) %3;


            int empHrs = 0;
            switch (empCheck){
                case IS_PART_TIME:
                    empHrs=4;
                    break;
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmpHrs +=empHrs;
            System.out.println("Days: " + totalWorkingDays + "Emp Hrs: " +empHrs);

        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;

    }

    public static void main(String[] args)
    {
        EmployeeWag emp=new EmployeeWag();
        emp.addCompanyEmpWage("DMart",20,2,10);
        emp.addCompanyEmpWage("Reliance",30,2,20);
        emp.computeEmpWage();
    }

}
