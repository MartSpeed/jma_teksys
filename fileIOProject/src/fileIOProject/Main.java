package fileIOProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Absolute Path
		// Relative Path

		// Byte stream perform in and out of 8 bits
		// FileInputStream in = null;
		// FileOutputStream out = null;
//		FileReader in = null;
//		FileWriter out = null;
//		try {
//			in = new FileReader("input.txt");
//
//			out = new FileWriter("output.txt");
//
//			int num;
//
//			while ((num = in.read()) != -1) {
//				out.write(num);
//			}
//		} finally {
//			if (in != null) {
//				in.close();
//				System.out.println("in close!");
//			}
//			if (out != null) {
//				out.close();
//				System.out.println("out close!");
//			}
//		}

//		InputStreamReader streamIn = null;
//		
//		try {
//			streamIn= new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit");
//			
//			char Q;
//			do {
//				Q = (char) streamIn.read();
//				System.out.println(Q);
//				
//			}while(Q != 'Q');			
//		}finally {
//			if(streamIn != null) {
//				streamIn.close();
//			}
//		}

		// standard stream
		// characters stream
		// reading/writing to file

		// the name/path of the file you want to manipulate/create
		String path = "new_file.csv";
		
		try {
			
			File file = new File(path);
			
			// scanner that reads the input file
			// going to read or write on that file
			Scanner input = new Scanner(file);
			
			// we store our information in the data
			// alternatively, we can store the data in an arrayList
			// you can store you array of strings inside of an array list
			ArrayList<Course> data = new ArrayList<>();

			// if it has our next file, we write to it
			while (input.hasNextLine()) {
				
				//data += input.nextLine();
				
				// split the strings using commas
				String[] line = input.nextLine().split(",");
				
				// split each line with a comma
				//data.add(line.split(","));
				data.add(new Course(line[0],line[1],line[2]));
			}
			
			// for-each loop, to loop through the elements of the given array
			for(Course c : data) {
				System.out.format("%-45s | %-15s | %-25s\n",
						c.getCode(), c.getName(), c.getInstructor());
			}

			//String inputLine = input.nextLine();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("No file here");
			
			e.printStackTrace();
		}

		// System.out.println(file.isDirectory());

		// return an array of files
		// File[] FileWithPath = file.listFiles();

	}

}
