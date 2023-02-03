public class Doctor extends SalariedEmployee{
    private String specialty ;
    private double officeFee;

    public Doctor() {

        this("No name", new Date(),0.0,"No specialty", 0.0);


    }



    public Doctor(String name, Date hireDate, double salary, String specialty, double officeFee){
        super(name, hireDate, salary);
        setSpecialty(specialty);
        setOfficeFee(officeFee);

    }

    public Doctor(Doctor otherEmployee){
        super(otherEmployee);
        setSpecialty(otherEmployee.specialty);
        setOfficeFee(otherEmployee.officeFee);
    }

    public String getSpecialty() {return specialty;}

    public void setSpecialty(String specialty){

        if( specialty == null){
            System.out.println("Error...please enter a valid specialty");
            System.exit(0);
        }else{
            this.specialty = specialty;
        }
    }


    public double getOfficeFee(){return officeFee;}

    public void setOfficeFee(double officeFee) {
        if (officeFee < 0) {
            System.out.println("Error... office fee cannot be negative.");
            System.exit(0);
        } else {
            this.officeFee = officeFee;
        }

    }

    public void setDoctor(Doctor doctor){

        if(doctor == null){


            System.out.println("Error... please enter a valid doctor.");
            System.exit(0);
        }else{

            //this.setDoctor(doctor);
            this.setDoctor(doctor);

        }
    }



    public String toString(){

        return super.toString() + "\nThe speciality is " + getSpecialty()
                + " and visit fee is $" + getOfficeFee() + ".";}

    public boolean equals(Doctor otherEmployee){
    //Note:: Changed "doctor" to "otherEmployee

        return (super.equals(otherEmployee) && getSpecialty().equals(otherEmployee.getSpecialty()) &&
                getOfficeFee() == otherEmployee.getOfficeFee());
    }
}
