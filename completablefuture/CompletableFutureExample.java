import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
            .thenApply(result -> result + " World")
            .thenApply(String::toUpperCase)
            .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + "!!!"));

        future.thenAccept(System.out::println);
    }
}
