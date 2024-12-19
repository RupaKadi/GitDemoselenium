package testInstallation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HelloWorld {

	public static void main(String[] args) {
		int i=5;
		for(int a=0;a<5;a++)
		{
			System.out.println("The value of i is:"+i);
		}
		String[] str={"Abhi", "Rambh", "New"};
		List<String> stringlist= Arrays.asList(str);
		long num= stringlist.stream().filter(s->s.endsWith("w")).count();
		System.out.println(num);
		stringlist.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		boolean bool= stringlist.stream().anyMatch(s->s.contains("a"));
		System.out.println(bool);
		String s1= "test";
		String s2= "test";
		
        stringlist.stream().sorted().filter(s->s.indexOf("bh")!=-1).forEach(s->System.out.println(s));
        
	}

}
