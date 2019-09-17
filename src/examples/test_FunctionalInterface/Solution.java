package examples.test_FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Solution {
	public static void main(String[] args) {
		/*
		//Определение ссылки на функциональный интерфейс
		Converter<String, Integer> converter;

		//Создание лямбда-выражения:
		converter = from -> Integer.valueOf(from);

		//Использование лямбда-выражения в виде вызова метода интерфейса:
		Integer converted = converter.convert("123456");
		System.out.println(converted);
		*/
		new Thread(
				() -> {
					while (true) {
						System.out.println("Hello World!");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
		).start();


		FunctionalInterface1 functionalInterface1 = () -> System.out.println("FunctionalInterface1");
		functionalInterface1.doSomething();

		BinaryOperator<Integer> binaryOperator = Integer::sum;
		System.out.println(binaryOperator.apply(1, 2));

		Predicate<String> predicate1 = s -> s.equals("abc");
		Predicate<String> predicate2 = s -> s.equals("abc");
		System.out.println(predicate1.and(predicate2).test("abc"));
	}
}
