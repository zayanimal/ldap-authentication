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
	public void test() {
		Map<PhoneNumber, String> map = new HashMap<>();

		map.put(new PhoneNumber(111, 22, 444), "Jenny");

		PhoneNumber pn = new PhoneNumber(111, 22, 444);
		PhoneNumber pn2 = new PhoneNumber(111, 22, 444);

		System.out.println(map.get(pn));

		System.out.println(pn.hashCode());
		System.out.println(pn2.hashCode());
	}
}
