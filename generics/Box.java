public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        
        // Integer Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent((123));
        System.out.println("Integer content: " + integerBox.getContent());

        // String box
        Box<String> stringBox = new Box<>();
        stringBox.setContent(("Hello Generics"));
        System.out.println("String content: " + stringBox.getContent());


    }
    
}

