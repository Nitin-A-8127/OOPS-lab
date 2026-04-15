import java.util.*;
import java.io.*;

public class Main13{
	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(new File("a.txt"));
		
		int sum=0;
		int count=0;
		
		while(sc.hasNextInt()){
			sum=sum+sc.nextInt();
			count++;
		}
		System.out.println("Sum"  + sum);
		System.out.println("Count" + count);
	}
}