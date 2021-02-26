public class EmployeeWag {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static int NUM_OF_WORKING_DAY = 20;
    public static int EMP_RATE_PER_HOUR = 20;
    public static int maxHrsInMonth=10;
    private final String company;

    public EmployeeWag(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        this.company=company;
        this.EMP_RATE_PER_HOUR=empRatePerHour;
        this.NUM_OF_WORKING_DAY=numOfWorkingDays;
        this.maxHrsInMonth=maxHoursPerMonth;
    }
    private int computeWage(){
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < NUM_OF_WORKING_DAY)
        {
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random() * 10) %3;


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
        return totalEmpHrs * IS_FULL_TIME;

    }

    public static void main(String[] args)
    {
        EmployeeWag emp=new EmployeeWag("DMart",20,2,10);
        EmployeeWag emp1=new EmployeeWag("Reliance",30,3,10);
        System.out.println("Total Emp Wage For Company " +emp.company + " is: " + emp.computeWage());
        System.out.println("Total Emp Wage For Company " +emp1.company + " is: " + emp1.computeWage());
    }

}
