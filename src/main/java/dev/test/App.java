package dev.test;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getFizBuzz(i).getMessage());
		}
	}

	public static FizzBuzz getFizBuzz(int i) {
		for (FizzBuzz fizzBuzz : generateDefaultMiddlewares()) {
			if (i % fizzBuzz.getClause() == 0) {
				return fizzBuzz;
			}
		}
		return new FizzBuzz(-1, String.valueOf(i));
	}

	public static List<FizzBuzz> generateDefaultMiddlewares() {
		List<FizzBuzz> fizzBuzzes = new ArrayList<>();

		fizzBuzzes.add(new FizzBuzz(15, "Fizz Buzz"));
		fizzBuzzes.add(new FizzBuzz(3, "Fizz"));
		fizzBuzzes.add(new FizzBuzz(5, "Buzz"));

		return fizzBuzzes;
	}
}
