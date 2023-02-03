

public class Patient extends Person  {

    private String name;

    private Doctor doctor;





    public Patient(String name, Doctor doctor){
        setDoctor(doctor);
        setName(name);



    }


    public Doctor getDoctor(){return doctor;}


    public void setDoctor(Doctor doctor){

        if(doctor == null){


            System.out.println("Error... please enter a valid doctor.");
            System.exit(0);
        }else{

            this.doctor = new Doctor(doctor);

        }
    }


    public String toString(){

        return "The name is: " + getName()  + ", Primary doctor is: " + getDoctor() ;
    }

    public boolean equals(Patient otherPatient){

        return (super.toString() + getDoctor()).equals(otherPatient.getDoctor());
    }

}
