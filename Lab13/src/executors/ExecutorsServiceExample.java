package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        /* Runnable vs Callable
         Runnable returneaza void
         Callable returneaza un tip (generic)
         */

        Runnable runnableTask = () -> {
            try {
                Thread.sleep(300);
                System.out.println("Runnable running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executorService.execute(runnableTask);

        Callable<String> callableTask = () -> {
            Thread.sleep(300);
            System.out.println("Callable running");
            return "Callable task completed execution";
        };

        Future<String> future = executorService.submit(callableTask);
        future.cancel(true); //daca facem cancel -> future.get() va arunca exceptie CancellationException
        System.out.println("Callable ran with result: " + future.get());

        List<Callable<String>> callables = new ArrayList<>();
        callables.add(callableTask);
        callables.add(callableTask);
        callables.add(callableTask);
        callables.add(callableTask);
        callables.add(callableTask);

        List<Future<String>> futures = executorService.invokeAll(callables);

        for (Future<String> f1 : futures) {
            System.out.println("invoke all result " + f1.get());
        }

        String s = executorService.invokeAny(callables);

        System.out.println("Result of invokeAny " + s);


        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // se foloseste la fel

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(callableTask, 1000, TimeUnit.MILLISECONDS);
        System.out.println("scheduled future " + scheduledFuture.get());

        executorService.shutdown(); // cand terminam treaba cu el trebuie sa ii dam shutdown

    }
}
