import java.util.concurrent.CompletableFuture;

public class Concat {
    public static void main(String[] args) throws Exception {
        // Create a CompletableFuture that asynchronously supplies a string
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Chin Ling");

        // Concatenate a regular string with the result of the CompletableFuture
        String hello = "Hello ";
        String greeting = hello + future.get(); // Blocking call to get the result of CompletableFuture

        // Print the concatenated string
        System.out.println(greeting); // Output: Hello World
    }
}
