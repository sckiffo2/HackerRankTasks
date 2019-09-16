package examples.test_FunctionalInterface;
@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);
}

// Важно, в функциональном интерфейсе должен быть всего ОДИН метод без реализации (default методы при этом не запрещены)
