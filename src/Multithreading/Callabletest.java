package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callabletest implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "your java stop!";
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es=Executors.newSingleThreadExecutor();
	Future<String> f=es.submit(new Callabletest());
	System.out.println(f.get());
	es.shutdown();
}
}
