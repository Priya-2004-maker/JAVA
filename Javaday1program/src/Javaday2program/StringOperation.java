package Javaday2program;
import java.util.*;
public class StringOperation {
  public static void main(String[] args) {
	//  String name="ram";
	  // string using new-keyword
	  String names=new String("Ram");
	  System.out.println(names);
	  // get the name from user
	  Scanner s1=new Scanner(System.in);
	  System.out.print("Enter a name:");
	  String name=s1.nextLine();
	  System.out.println(name);
	  // string length
	  String str="java programming";
	  System.out.println(str.length());
	  //substring
	  String s="java programming";
	  System.out.println(s.substring(3));// starting index
	  System.out.println(s.substring(0,4));// start index, end index
	  //indexOfstring
	  String a="java programming";
	  System.out.println(a.indexOf("program"));
	  System.out.println(a.indexOf("x"));
	  //ToUpperCase and ToLowerCase
	  String b="java programming";
	  System.out.println(b.toUpperCase());
	  System.out.println(b.toLowerCase());
	  //replace  character
	  String c="java programming";
	  System.out.println(c.replace('j','J'));
	  System.out.println(c.replace('p','P'));
	  //  check equal string or not
	  String str1="java ";
	  String str2="JAVA";
	  System.out.println(str1==str2);
	  System.out.println(str1.equals(str2));
	  System.out.println(str1.equalsIgnoreCase(str2));
	  // charAt(int index)
	  String str3="java ";
	  System.out.println(str3.charAt(3));
	  //split
	  String str4=("java ,python,springboot,c++,c");
	  String []language=str4.split(",");
	  for(String s2:language) {
		  System.out.println(s2);
	  }
	  // concatenate
	  String d="java ";
	  String f="programming";
	  System.out.println("concat String:"+d.concat(f));
	  //trim
	  String str5="   java   ";
	  System.out.println(str5);
	  System.out.println(str5.length());
	  String str6=str5.trim();
	  System.out.println(str6);
	  System.out.println(str6.length());
	  //compare to
	  String d1="java";
	  String f1="java";
	  System.out.println(d1.compareTo(f1));
	  //contains(string sequence)
	  String s7="java programming";
	  System.out.println(s7.contains("java"));
	  System.out.println(s7.contains("python"));
	  // string intern
	  String a1=new String("JavaDeveloper");
	  String b1="JavaDeveloper";
	  String c1=a1.intern();
	  System.out.println(a1==b1);
	  System.out.println(b1==c1);
	  //string builder
	  StringBuilder sb=new StringBuilder("Hello");
	  //append
	  sb.append("world");
	  System.out.println("After append:"+sb);
	  //insert
	  sb.insert(5, ",");
	  System.out.println("After insert:"+sb);
	  //replace
	  sb.replace(6,11,"Java");
	  System.out.println("After replace:"+sb);
	  //reverse
	  sb.reverse();
	  System.out.println("After reverse:"+sb);
	  //string buffer
      StringBuffer sb1=new StringBuffer("Hello");
    //append
	  sb1.append("world");
	  System.out.println("After append:"+sb1);
	  //insert
	  sb1.insert(5, ",");
	  System.out.println("After insert:"+sb1);
	  //replace
	  sb1.replace(6,11,"Java");
	  System.out.println("After replace:"+sb1);
	  //reverse
	  sb1.reverse();
	  System.out.println("After reverse:"+sb1);
}
}