package in.winny.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("key1", 1);
		map.putIfAbsent("key2", 2);
		map.computeIfPresent("key1", (k, v) -> v + 1);
		System.out.println(map.get("key1")); // Outputs: 2

	}
}
