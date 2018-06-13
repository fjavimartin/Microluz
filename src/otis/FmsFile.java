package otis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FmsFile {
	private ArrayList<String> files = new ArrayList<String>();
	
	private String getHeaderL() {
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
	
	private String getHeaderD() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "Grupo;";
		header = header + "Fecha Gregoriana de Necesidad;";
		header = header + "Fecha Otis de necesidad;";
		header = header + "Cantidad Necesaria;";
		header = header + "Semana Otis Expedición Prevista;";
		header = header + "Uso Interno;";
		header = header + "Código Proveedor;";
		header = header + "Contrato;";
		header = header + "Código de Material;";
		header = header + "Código de caja/subcaja;";
		header = header + "Descripción del material;";
		header = header + "Acumulado cables;";
		header = header + "Medida por trozo;";
		header = header + "Cantidad necesaria;";
		header = header + "Comentario;";
		header = header + "Uso Interno;";
		header = header + "Uso Interno;";
		header = header + "Autorización de fábrica;";
		header = header + "Indicador de material;";
		header = header + "Código proveedor a quién suministrar;";
		header = header + "Código de programa;";
		header = header + "Unidad;";
		header = header + "Precio unitario;";
		header = header + "Peso unitario;";
		header = header + "N/A;";
		header = header + "Indicador Tipo Registro";
		
		return header;
	}
	
	private String processLineL(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 6) + ";";
		lineProcessed += line.substring(6, 9) + ";";
		lineProcessed += line.substring(9, 14) + ";";
		lineProcessed += line.substring(14, 18) + ";";
		lineProcessed += line.substring(18, 25) + ";";
		lineProcessed += line.substring(25, 28) + ";";
		lineProcessed += line.substring(28, 29) + ";";
		lineProcessed += line.substring(29, 35) + ";";
		lineProcessed += line.substring(35, 43) + ";";
		lineProcessed += line.substring(43, 49) + ";";
		lineProcessed += line.substring(49, 51) + ";";
		lineProcessed += line.substring(51, 53) + ";";
		lineProcessed += line.substring(53, 57) + ";";
		lineProcessed += line.substring(57, 58) + ";";
		lineProcessed += line.substring(58, 60) + ";";
		lineProcessed += line.substring(60, 85) + ";";
		lineProcessed += line.substring(85, 87) + ";";
		lineProcessed += line.substring(87, 137) + ";";
		lineProcessed += line.substring(137, 142) + ";";
		lineProcessed += line.substring(142, 147) + ";";
		lineProcessed += line.substring(147, 152) + ";";
		lineProcessed += line.substring(152, 172) + ";";
		lineProcessed += line.substring(172, 192) + ";";
		lineProcessed += line.substring(192, 200) + ";";
		lineProcessed += line.substring(200, 201) + ";";
		
		return lineProcessed;
	}
	
	private String processLineD(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 5) + ";";
		lineProcessed += line.substring(5, 13) + ";";
		lineProcessed += line.substring(13, 17) + ";";
		lineProcessed += line.substring(17, 24) + ";";
		lineProcessed += line.substring(24, 27) + ";";
		lineProcessed += line.substring(27, 28) + ";";
		lineProcessed += line.substring(28, 34) + ";";
		lineProcessed += line.substring(34, 42) + ";";
		lineProcessed += line.substring(42, 58) + ";";
		lineProcessed += line.substring(58, 62) + ";";
		lineProcessed += line.substring(62, 97) + ";";
		lineProcessed += line.substring(97, 103) + ";";
		lineProcessed += line.substring(103, 108) + ";";
		lineProcessed += line.substring(108, 115) + ";";
		lineProcessed += line.substring(115, 145) + ";";
		lineProcessed += line.substring(145, 151) + ";";
		lineProcessed += line.substring(151, 152) + ";";
		lineProcessed += line.substring(152, 156) + ";";
		lineProcessed += line.substring(156, 157) + ";";
		lineProcessed += line.substring(157, 163) + ";";
		lineProcessed += line.substring(163, 173) + ";";
		lineProcessed += line.substring(173, 181) + ";";
		lineProcessed += line.substring(181, 192) + ";";
		lineProcessed += line.substring(192, 198) + ";";
		lineProcessed += line.substring(198, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
	}
	
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
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		String str_date = date_format.format(date);
		String line = "";
		String processedline = "";
		
		for (int i = 0; i < this.files.size(); i++) {
			File file = null;
			FileReader fr = null;
			BufferedReader br = null;
			
			FileWriter fwL = null;
			PrintWriter pwL = null;
			
			try {
				file = new File(this.files.get(i));
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				System.out.println("Processing file " + file.getName());
				
				fwL = new FileWriter(file.getPath() + str_date + "_L.csv");
				pwL = new PrintWriter(fwL);
				pwL.println(this.getHeaderL());
				
				while ( (line = br.readLine()) != null ) {
					if ( line.substring(199, 200).equals("L") ) {
						processedline = this.processLineL(line);
						System.out.println(processedline);
					} else if ( line.substring(199, 200).equals("D") ) {
						processedline = this.processLineD(line);
						System.out.println(processedline);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	/*
	public void processFiles() {
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		String str_date = date_format.format(date);
		
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
				fw = new FileWriter(file.getPath() + str_date + ".csv");
				
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
	*/
	
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
