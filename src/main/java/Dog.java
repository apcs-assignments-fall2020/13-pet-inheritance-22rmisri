public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

       // Constructors

    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }

    public Dog() {
        super("Max", 1);
        this.breed = "labrador";
    }
    

    // makeNoise() 
    public void makeNoise() {
        System.out.println("Ruff");
    }


    // toString method
    public String toString() {
        String str = "Name:" + this.getName() + " Age:" + this.getAge() + " Breed:" + this.breed;
        return str;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }
    // Setter
    public void setBreed() {
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
    
}