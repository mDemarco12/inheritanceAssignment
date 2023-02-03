public class Main extends Employee {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Bob", new Date(12, 31, 1969),
                34000.0, "Pediatrist", 10.5);
        System.out.println(d1);

        Doctor d2 = new Doctor("Susan", new Date(12, 31, 1969),
                450000.0, "Surgeon", 150.5);
        System.out.println(d2);

        Doctor d3 = new Doctor("Lilly", new Date(12, 31, 1969),
                290000.0, "Kidney", 95.5);
        System.out.println(d3);



        //Create & assign patients
        Patient p1 = new Patient("Fred",d1);
        Patient p2 = new Patient("Sally", d2);
        Patient p3 = new Patient("John",d3);


        //Header
        System.out.println();
        System.out.println("*Patient's Information*");

        System.out.println("The name is: " + p1.getName() + ", Primary doctor is : " +d1.getName());
        System.out.println("The name is: " + p2.getName() + ", Primary doctor is : " + d2.getName());
        System.out.println("The name is: " + p3.getName()+  ", Primary doctor is : " + d3.getName());

        System.out.println("\n*Billing's Information*");

        Billing b1 = new Billing("Fred",d1,21.0);
        Billing b2 = new Billing("Sally",d2,150.5);
        Billing b3 = new Billing ("Lilly" ,d3,170.0);

        System.out.println("Patient: " + p1.getName() + "\nDoctor: "
                + d1.getName() + "\nAmount Due: $" + b1.getAmountDue());
        System.out.println("Patient: " + p2.getName() + "\nDoctor: "
                + d2.getName() + "\nAmount Due: $" + b2.getAmountDue());
        System.out.println("Patient: " + p3.getName() + "\nDoctor: "
                + d3.getName() + "\nAmount Due: $" + b3.getAmountDue());



        System.out.println("\nThe total income from billing records is: "+ (b1.totalAmount() + b2.totalAmount() +b3.totalAmount()));




        //Billing b2 = new Billing("Susan",);



    }
}