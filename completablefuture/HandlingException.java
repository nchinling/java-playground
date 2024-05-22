import java.util.concurrent.CompletableFuture;

public class HandlingException {
    public static void main(String[] args) throws Exception 
    { 
        CompletableFuture<Integer> resultFuture 
          // java.lang.ArithmeticException: / by zero 
            = CompletableFuture.supplyAsync(() -> 10 / 0)   
                      .exceptionally(ex -> 0); 
        
          // 0 - returned by exceptionally block 
        System.out.println(resultFuture.get()); 
    } 
}
