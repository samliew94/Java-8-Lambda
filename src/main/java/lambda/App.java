package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class App {

	public App() {
		
		Function<String, String> f1 = x -> x; // takes in a string and outputs it as it is
		Function<String, String> f2 = x -> x.toUpperCase(); // input is converted to UC
		Function<String, String> f3 = f1.andThen(f2); // takes in a string and convert to UC
		Consumer<String> f4 = System.out::println; // same as x->System.out.println(x)
		f4.accept(f3.apply("code")); // output is CODE
		
		String [] array = new String[]{"a","b","c","d","e"};
//		List<String> list = Arrays.asList(new String[array.length-1]);
		Function<String[], List<String>> f5 = Arrays::asList;
		List<String> kappa = f5.apply(array);
		Consumer<List<String>> f6 = x-> x.forEach(System.out::println);
		f6.accept(kappa);// outputs a,b,c,d,e all in separate new lines
		
	}
	
}
