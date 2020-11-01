public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog("doggy", 5, "golden retriever");
        System.out.println(d1);
        d1.makeNoise();
        Dog d2 = new Dog();
        System.out.println(d2);

        
    }
}