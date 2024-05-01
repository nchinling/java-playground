import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadSquareCalculator {

    private ExecutorService executor 
      = Executors.newFixedThreadPool(3);
    
    public Future<Integer> calculate(Integer input) {        
        return executor.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MultiThreadSquareCalculator squareCalculator = new MultiThreadSquareCalculator();

        Future<Integer> future1 = squareCalculator.calculate(10);
        Future<Integer> future2 = squareCalculator.calculate(100);
        Future<Integer> future3 = squareCalculator.calculate(20);

        while (!(future1.isDone() && future2.isDone())) {
            System.out.println(
            String.format(
                "future1 is %s and future2 is %s and future3 is %s", 
                future1.isDone() ? "done" : "not done", 
                future2.isDone() ? "done" : "not done",
                future3.isDone() ? "done" : "not done"
            )
            );
            Thread.sleep(200);
        }

        Integer result1 = future1.get();
        Integer result2 = future2.get();
        Integer result3 = future3.get();

        System.out.println(result1 + " and " + result2 + " and " + result3);

        }
    
}
