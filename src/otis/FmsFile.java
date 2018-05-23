package otis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;

public class FmsFile {
	private ArrayList<String> files = new ArrayList<String>();
	
	private String getHeader() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "Grupo;";
		header = header + "Tipo de Caja;";
		header = header + "Fecha Gregoriana de Necesidad;";
		header = header + "Fecha Otis de necesidad;";
		header = header + "Cantidad Necesaria;";
		header = header + "Semana Otis Expedición Prevista;";
		header = header + "Uso Interno;";
		header = header + "Código Proveedor;";
		header = header + "Contrato;";
		header = header + "Código de Subsistema;";
		header = header + "Total Bultos Subsistema;";
		header = header + "Secuencia del Bulto en Subsistema;";
		header = header + "Peso Total del Bulto;";
		header = header + "Uso Interno;";
		header = header + "Código del C.D Externo;";
		header = header + "Nombre del C.D Externo;";
		header = header + "Tipo de Vía;";
		header = header + "Nombre de la Vía;";
		header = header + "Nº de Vía 1;";
		header = header + "Nº de Vía 2;";
		header = header + "Código Postal;";
		header = header + "Población;";
		header = header + "Provincia;";
		header = header + "N/A;";
		header = header + "Indicador Tipo Registro";
		
		return header;
		
	}
	
	public void processFiles() {		
		for (int i = 0; i < this.files.size(); i++) {
			String content = "";
			String line = "";
			File file = null;
			FileReader fr = null;
			BufferedReader br = null;
			
			FileWriter fw = null;
			PrintWriter pw = null;
			
			try {
				file = new File(this.files.get(i));
				fw = new FileWriter(file.getPath() + ".csv");
				
				System.out.println("Processing file " + file.getName());
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				pw = new PrintWriter(fw);
				pw.println(this.getHeader());
				
				while ( (line = br.readLine()) != null ) {
					try {
						content = line.substring(0, 1) + ";";
						content = content + line.substring(1, 5) + ";";
						content = content + line.substring(5, 8) + ";";
						content = content + line.substring(8, 13) + ";";
						content = content + line.substring(13, 17) + ";";
						content = content + line.substring(17, 24) + ";";
						content = content + line.substring(24, 27) + ";";
						content = content + line.substring(27, 28) + ";";
						content = content + line.substring(28, 34) + ";";
						content = content + line.substring(34, 42) + ";";
						content = content + line.substring(42, 48) + ";";
						content = content + line.substring(48, 50) + ";";
						content = content + line.substring(50, 52) + ";";
						content = content + line.substring(53, 56) + ";";
						content = content + line.substring(56, 57) + ";";
						content = content + line.substring(57, 59) + ";";
						content = content + line.substring(59, 84) + ";";
						content = content + line.substring(84, 86) + ";";
						content = content + line.substring(86, 136) + ";";
						content = content + line.substring(136, 141) + ";";
						content = content + line.substring(141, 146) + ";";
						content = content + line.substring(146, 151) + ";";
						content = content + line.substring(151, 171) + ";";
						content = content + line.substring(171, 191) + ";";
						content = content + line.substring(191, 199) + ";";
						content = content + line.substring(199, 200);
					} catch (Exception e) {
						e.printStackTrace();
					}
					pw.println(content);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fr != null) {
						fr.close();
					}
					if (fw != null) {
						fw.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public FmsFile(String[] args) {
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			// Check if it's text/plain type file
			try {
				if (Files.probeContentType(f.toPath()).equals("text/plain")) {
					this.files.add(args[i]);
				} else {
					throw new Exception(f.getName() + " is not a text/plain file.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
