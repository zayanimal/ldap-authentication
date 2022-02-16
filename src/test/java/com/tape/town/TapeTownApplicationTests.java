package com.tape.town;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class TapeTownApplicationTests {

	@Test
	void contextLoads() {
		PhoneNumber phoneNumber = new PhoneNumber(999, 555, 4444);
		PhoneNumber phoneNumber2 = new PhoneNumber(999, 555, 4444);

		System.out.println(phoneNumber.hashCode());
		System.out.println(phoneNumber2.hashCode());
	}

	@Test
	public void test() throws CloneNotSupportedException {
		Map<PhoneNumber, String> map = new HashMap<>();

		map.put(new PhoneNumber(111, 22, 444), "Jenny");

		PhoneNumber pn = new PhoneNumber(111, 22, 444);
		PhoneNumber pn2 = new PhoneNumber(111, 22, 444);
	}

	@Test
	public void test2() throws CloneNotSupportedException {
		HashTable hashTable = new HashTable();

		Entry[] arr = { buildEntry(1), buildEntry(2), buildEntry(3) };
		hashTable.setBuckets(arr);

		HashTable cloned = hashTable.clone();


		System.out.println(hashTable);
		System.out.println(cloned);
	}


	private Entry buildEntry(Integer num) {
		return new Entry(num + 1, "Hello",
			new Entry(num + 2, "Privet",
				new Entry(num + 3, "Zdorova", null)));
	}
}
