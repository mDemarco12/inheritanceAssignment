public class Person {

    private String name;
    private Person person;

    public Person(){
        name = "John Doe";

    }

    public Person(String name) {


        if( name == null ){

            System.out.println("Error... please enter a valid name.");
            System.exit(0);
        }else{

            setName(name);
        }
    }

    public Person( Person person){
        this.person = new Person(person);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if( name == null){
            System.out.println("Error...");
            System.exit(0);
        }else{
            this.name = name;

        }
    }

    public String  toString(){

        return "The name is " + getName();
    }

    public boolean equals(Person person){

        return (getName()).equals(person.getName());

    }
}
