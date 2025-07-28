package trainingPart2Qs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {

		String file = "D:\\sampleFile.txt";

		try {
			FileWriter writter = new FileWriter(file);

			writter.write("Hi this is sample text.\n");
			writter.write("I Love java program!.\n");
			writter.close();
			System.out.println("File written successfully!");
		} catch (IOException e) {

			System.out.println("Error while writting to a fille! " + e.getMessage());
		}

		// Reading from a file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			System.out.println("File Content :");
			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}
			reader.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error while reading file ! " + e.getMessage());
		}

	}
}
