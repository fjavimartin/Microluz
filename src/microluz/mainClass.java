package microluz;

import java.io.File;
import java.nio.file.Files;

import otis.FmsFile;

public class mainClass {

	public static void main(String[] args) {
		System.out.println("Processing Otis FMS files......");
		
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			// Check if it's text/plain type file
			try {
				if (Files.probeContentType(f.toPath()).equals("text/plain")) {
					FmsFile ff = new FmsFile();
					ff.processFile(args[i]);
				} else {
					throw new Exception(f.getName() + " is not a text/plain file.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Otis FMS files processed.");
	}

}
