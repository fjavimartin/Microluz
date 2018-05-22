package microluz;

import otis.FmsFile;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!!");
		FmsFile ff = new FmsFile(args);
		ff.processFiles();
	}

}
