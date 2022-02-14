/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
assignment3
*/

public class Faculty extends Employee{

    private double weeklySalary; // a faculty member's weekly salary amount
    private double weeklyStipend; // a faculty member’s weekly stipend amount
    private double weeklyPay; // a faculty member’s total weekly pay amount


    Faculty(){
        setFullName("new faculty");
        setWeeklyPay(0);
        setWeeklySalary(0);
        setWeeklyStipend(0);
        setWeeklyStipend(0);
    }
    Faculty(String name){
        setFullName(name);
    }

    Faculty(String name, double wSalary, double wStipend){
        setFullName(name);
        weeklySalary = wSalary;
        weeklyStipend = wStipend;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklyStipend() {
        return weeklyStipend;
    }

    public void setWeeklyStipend(double weeklyStipend) {
        this.weeklyStipend = weeklyStipend;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public void calculateWeeklyPay(){
        weeklyPay = weeklySalary + weeklyStipend;
    }

    @Override
    public String toString() {
        return ("Name: " + getFullName()+
                ", Salary: " + weeklySalary +
                ", Stipend: " + weeklyStipend +
                ", Weekly Pay: " + weeklyPay);
        /*
         return "Name:" + getFullName()+
                ", Salary: " + getWeeklySalary() +
                ", Stipend: " + getWeeklyStipend() +
                ", Weekly Pay: " + getWeeklyPay() ;
         */
    }
}
