import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class GFG {
     public static void main(String[] args) throws Exception 
    { 
        CompletableFuture<String> greetingFuture 
            = CompletableFuture.supplyAsync(() -> { 
                  // some async computation 
                  int y = 2 + 2;
                  return "Hello from CompletableFuture " + y; 
              }); 

        try {
            System.out.println(greetingFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    } 
}
