import java.util.*;
import java.io.*;

public class Main14{
	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		FileWriter f=new FileWriter("b.txt");
		
		f.write(sc.nextLine());
		f.close();
	}
}