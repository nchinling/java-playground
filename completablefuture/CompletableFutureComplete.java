import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureComplete {
      public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();

        // Start a thread to simulate an asynchronous operation
        new Thread(() -> {
            try {
                // Simulate a long-running operation
                Thread.sleep(6000);
                // Complete the future with a result after 6 seconds
                future.complete("Result from asynchronous operation");
            } catch (InterruptedException e) {
                // Handle interruption if needed
                future.completeExceptionally(e);
            }
        }).start();

        try {
            // Try to get the result from the future with a timeout of 5 seconds. Try changing to 7 seconds. 
            String result = future.get(5, TimeUnit.SECONDS);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // If no result is obtained within 5 seconds, manually complete the future
            System.out.println("No result obtained within 5 seconds. Manually completing the future.");
            future.complete("Default result");
        }

        // Wait for the completion of the future and print the final result
        System.out.println("Final result: " + future.join());
    }
}
