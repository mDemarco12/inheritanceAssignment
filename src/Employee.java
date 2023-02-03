public class Employee extends Person {

    private Date hireDate;

    public Employee() {

        this("No name", new Date());
    }

    public Employee(String name, Date hireDate){

        if(name == null && hireDate == null){
            System.out.println("An Error Has Occurred...");
            System.exit(0);
        }else{

            setName(name);
            setHireDate(hireDate);

        }


    }

    public Employee(Employee otherEmployee){

        if( otherEmployee == null){
            System.out.println("Error occured when creating an employee :(");
            System.exit(0);
        }else {
            this.setName(otherEmployee.getName());
            this.hireDate = new Date(otherEmployee.hireDate);

        }
    }
    public void setHireDate(Date hireDate){
        if(hireDate == null){
            System.out.println("Error...");
            System.exit(0);
        }else{

            this.hireDate = hireDate;
        }
    }


    public Date getHireDate() {return hireDate;}

    public String toString(){return "The doctor " + getName() + " was hired on " + getHireDate();}

    public boolean equals(Employee otherEmployees){

        return (getName()).equals(otherEmployees.getName())&& getHireDate().equals(otherEmployees.getHireDate());
    }

}
