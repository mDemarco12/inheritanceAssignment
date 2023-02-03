public class Billing extends Patient{


    private Patient name;
    private Doctor doctor;
    private double amountDue;

    public Billing(){
        this("No name" ,new Doctor());
    }
    public Billing(String person, Doctor doctor){

        super(person, doctor);

    }

    public Billing(String person, Doctor doctor, double amountDue){

        super(person, doctor);
        setAmountDue(amountDue);
    }

public double getAmountDue(){
        return amountDue;
}
    public void setAmountDue(double amountDue){

        if(amountDue < 0 ){
            System.out.println("Error...");
            System.exit(0);
        }else{
            this.amountDue = amountDue;


        }
    }

    public double totalAmount() {

        return getAmountDue();

    }



public String toString(){
        return "Patient: " + getName() + "\nDoctor: " + getDoctor() + "\nAmount Due: $" + getAmountDue();
}

public boolean equals(Billing billing){
        return( super.equals(billing) && amountDue == billing.amountDue );
}





}
