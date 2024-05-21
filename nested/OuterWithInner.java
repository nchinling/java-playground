public class OuterWithInner {
    
    private String message = "Message from enclosing class";

    public class InnerClass {
        public void display() {
            System.out.println("Message from inner class: " + message);
        }
    }

    public static void main(String[] args) {
        
        OuterWithInner outerWithInner = new OuterWithInner();
        OuterWithInner.InnerClass innerInstance = outerWithInner.new InnerClass();
        innerInstance.display();
    }
}
