package in.winny.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesTest {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		int oldValue = atomicInteger.getAndIncrement();
		System.out.println("oldValue " + oldValue);

	}

}
