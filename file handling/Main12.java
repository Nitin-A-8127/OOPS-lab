import java.io.*;

class Main12{
	public static void main(String[] args) throws Exception{
		FileWriter f=new FileWriter("a.txt");
		
		f.write("1\n");
		f.write("2\n");
		f.close();
	}
}