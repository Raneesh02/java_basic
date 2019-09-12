package baiscjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthScrollBarUI;

interface B{
	public void show2();
}

public class TestInnerClass  {

	public static void main(String[] args) {		
		TestInnerClass t=new TestInnerClass();
		List<String> A=new ArrayList<>();
		A.add("afweoij");
		A.add("Vaibhav");
		A.add("faweih");
		A.stream().filter(i -> i.startsWith("V")).forEach(j -> System.out.println(j));
	
		
	}
	
}
