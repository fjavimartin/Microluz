package otis;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

public class FmsFile {
	private ArrayList<String> files = new ArrayList<String>();
	
	public void processFiles() {
		for (int i = 0; i < this.files.size(); i++) {
			String file = this.files.get(i);
			System.out.println(file);
		}
	}
	
	public FmsFile(String[] args) {
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			// Check if it's text/plain type file
			try {
				if (!Files.probeContentType(f.toPath()).equals("text/plain")) {
					throw new Exception(f.getName() + " is not a text/plain file.");
				} else {
					this.files.add(args[i]);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
