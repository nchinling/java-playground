import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class GFG2 {
    public static void main(String[] args) throws Exception 
    { 
        // CompletableFuture<String> helloFuture 
        //     = CompletableFuture.supplyAsync(() -> "Hello"); 

        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            return "Hello";
        });

        CompletableFuture<String> worldFuture 
            = CompletableFuture.supplyAsync(() -> "World"); 
  
        CompletableFuture<String> combinedFuture 
            = helloFuture.thenCombine( 
               worldFuture, (m1, m2) -> m1 + " " + m2); 
  
        System.out.println(combinedFuture.get()); 
    } 
}
