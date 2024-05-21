public class OuterWithStaticNested {

    private static String message = "Static nested message";

    public static class StaticNestedClass {
        public void display() {
            System.out.println("Message accessed from static nested class: " + message);
        }
    }

    public static void main(String[] args) {

        // Create an instance of the static nested class directly
        OuterWithStaticNested.StaticNestedClass nestedInstance = new OuterWithStaticNested.StaticNestedClass();
        nestedInstance.display();
        
    }

    
}
