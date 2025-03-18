package Javaday2program;
import java.util.*;
public class Wrapper {
	public static void main(String[] args) {
		Integer myInt=Integer.valueOf(100);
		Double myDouble=Double.valueOf(12.34);
		Character myChar=Character.valueOf('A');
		Boolean myBool=Boolean.valueOf(true);
		//Autoboxing
		Integer intObj=50;
		//unboxing
		int intValue=intObj;
		System.out.println(intValue);
	}

}
