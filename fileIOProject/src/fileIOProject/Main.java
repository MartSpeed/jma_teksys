package fileIOProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// Absolute Path
		// Relative Path

		// Byte stream perform in and out of 8 bits
		// FileInputStream in = null;
		// FileOutputStream out = null;
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("input.txt");

			out = new FileWriter("output.txt");

			int num;

			while ((num = in.read()) != -1) {
				out.write(num);
			}
		} finally {
			if (in != null) {
				in.close();
				System.out.println("in close!");
			}
			if (out != null) {
				out.close();
				System.out.println("out close!");
			}
		}
		// standard stream
		// characters stream
		// reading/writing to file

	}

}
