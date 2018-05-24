package microluz;

import otis.FmsFile;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Processing Otis FMS files......");
		FmsFile ff = new FmsFile(args);
		ff.processFiles();
		System.out.println("Otis FMS files processed.");
	}

}
