package testInstallation;
import org.testng.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    //@test
	public static void main(String[] args)
	{
		long i= Stream.of("1,2,3,4,5,3,2").filter(s->s.matches("3")).count();
		System.out.println(i);
		String[] names= {"Abhi","Sam","Raju","Teja"};
		List<String> name= Arrays.asList(names);
		boolean result=name.stream().anyMatch(s->s.contains("Abhi"));
		System.out.println(result);
		}

}
