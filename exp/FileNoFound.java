package exp;

import java.io.File;
import java.io.FileReader;

public class FileNoFound {
	public static void main(String[] args) {
		try {
			File f= new File("C:\\Users\\laksh\\OneDrive\\Documents\\lakshmi.txt");
			FileReader fr=new FileReader(f);
			int temp=0;
			while((temp=fr.read())!=-1){
				System.out.print((char)temp);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

