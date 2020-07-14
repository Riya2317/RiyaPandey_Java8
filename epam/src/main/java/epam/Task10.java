package epam;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {
	public static void main(String s[])
	{
		Scanner sc= new Scanner(System.in);
		List<Integer> list = Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
		List<String> list1 = Arrays.asList("aaa","bbbb","abc","abcd","aaf","dssdvs");
		List<String> list2 = Arrays.asList("aaa","bbbb","abc","abcd","aaf","dssdvs");
		
		System.out.println(getAverage(list));
		System.out.println(getStrings(list1));
		System.out.println(getPallindromeStrings(list2));
		sc.close();
	}
	
	static double getAverage(List<Integer> list)
	{
		IntSummaryStatistics summaryStats = list.stream().mapToInt((a) -> a).summaryStatistics();
		return summaryStats.getAverage();
	}
	
	static List<String> getStrings(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	
	static List<String> getPallindromeStrings(List<String> list)
	{
		return list.stream().filter(s -> s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
	}
}
