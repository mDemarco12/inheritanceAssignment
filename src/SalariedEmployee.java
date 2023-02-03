public class SalariedEmployee extends Employee {

    private double salary;

    //Default
    public SalariedEmployee(){
        this("No name", new Date(), 0.0);

    }
    public SalariedEmployee(String name, Date hireDate, double salary){
        super(name, hireDate);
        setSalary(salary);


        }



    public SalariedEmployee(SalariedEmployee otherEmployee){
        super(otherEmployee);
        setSalary(otherEmployee.salary);


    }

    public double getSalary(){return salary;
    }

    public void setSalary(double salary){
    if(salary < 0) {
        System.out.println("Error.. please enter a non-negative salary.");
        System.exit(0);
    }else {
    this.salary = salary;
    }
    }

    public String toString(){

        return super.toString() +  " at Salary " + getSalary() + ".";
    }

    public boolean equals(SalariedEmployee otherEmployee){

        return super.equals(otherEmployee)
                && getSalary() == otherEmployee.getSalary();

    }


}
