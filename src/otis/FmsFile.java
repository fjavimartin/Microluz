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
	
	private String getHeaderF() {
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
		header = header + "Material;";
		header = header + "Nombre del material;";
		header = header + "Cantidad;";
		header = header + "Precio;";
		header = header + "Suministrador;";
		header = header + "N/A;";
		header = header + "Indicador Tipo de registro;";
		
		return header;
	}
	
	private String getHeaderE() {
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
		header = header + "Secuencia del parámetro;";
		header = header + "Nombre del parámetro;";
		header = header + "Valor del parámetro;";
		header = header + "N/A;";
		header = header + "Comentario;";
		header = header + "N/A;";
		header = header + "Indicador Tipo de registro;";
		
		return header;
	}
	
	private String getHeaderR() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "Grupo;";
		header = header + "Fecha Gregoriana de Necesidad;";
		header = header + "Fecha Otis de necesidad;";
		header = header + "Cantidad necesaria;";
		header = header + "Semana Otis Expedición Prevista;";
		header = header + "Uso Interno;";
		header = header + "Código Proveedor;";
		header = header + "Contrato;";
		header = header + "Nombre de cliente;";
		header = header + "Tipo de vía;";
		header = header + "Nombre de la vía;";
		header = header + "Número de la vía;";
		header = header + "Población;";
		header = header + "Provincia;";
		header = header + "N/A;";
		header = header + "Código postal;";
		header = header + "País;";
		header = header + "N/A;";
		header = header + "Centro de distribución;";
		header = header + "N/A;";
		header = header + "Indicador Tipo de registro;";
		
		return header;
	}
	
	private String getHeaderT() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "Grupo;";
		header = header + "Tipo de caja;";
		header = header + "Fecha Gregoriana de Necesidad;";
		header = header + "Fecha Otis de necesidad;";
		header = header + "Cantidad necesaria;";
		header = header + "Semana Otis Expedición Prevista;";
		header = header + "Uso Interno;";
		header = header + "Código Proveedor;";
		header = header + "Contrato;";
		header = header + "Código de subsistema;";
		header = header + "Total bultos subsistema;";
		header = header + "Secuencia del bulto en subsistema;";
		header = header + "Peso total del bulto;";
		header = header + "Uso interno;";
		header = header + "Descripción del bulto en español;";
		header = header + "Descripción del bulto en inglés;";
		header = header + "Nombre de la asociada;";
		header = header + "Semana otis expedición de la fábrica consolidadora;";
		header = header + "N/A;";
		header = header + "Uso interno;";
		header = header + "Autorización de fábrica;";
		header = header + "Indicador del material específico;";
		header = header + "Código de proveedor al que suministrar material;";
		header = header + "Código de programa;";
		header = header + "Unidad;";
		header = header + "Precio unitario;";
		header = header + "Peso unitario;";
		header = header + "N/A;";
		header = header + "Indicador Tipo de registro;";
		
		return header;
	}
	
	private String processLineT(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 5) + ";";
		lineProcessed += line.substring(5, 8) + ";";
		lineProcessed += line.substring(8, 13) + ";";
		lineProcessed += line.substring(13, 17) + ";";
		lineProcessed += line.substring(17, 24) + ";";
		lineProcessed += line.substring(24, 27) + ";";
		lineProcessed += line.substring(27, 28) + ";";
		lineProcessed += line.substring(28, 34) + ";";
		lineProcessed += line.substring(34, 42) + ";";
		lineProcessed += line.substring(42, 48) + ";";
		lineProcessed += line.substring(48, 50) + ";";
		lineProcessed += line.substring(50, 52) + ";";
		lineProcessed += line.substring(52, 56) + ";";
		lineProcessed += line.substring(56, 57) + ";";
		lineProcessed += line.substring(57, 92) + ";";
		lineProcessed += line.substring(92, 127) + ";";
		lineProcessed += line.substring(127, 137) + ";";
		lineProcessed += line.substring(137, 142) + ";";
		lineProcessed += line.substring(142, 151) + ";";
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
	
	private String processLineR(String line) {
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
		lineProcessed += line.substring(42, 77) + ";";
		lineProcessed += line.substring(77, 79) + ";";
		lineProcessed += line.substring(79, 109) + ";";
		lineProcessed += line.substring(109, 113) + ";";
		lineProcessed += line.substring(113, 133) + ";";
		lineProcessed += line.substring(133, 144) + ";";
		lineProcessed += line.substring(144, 151) + ";";
		lineProcessed += line.substring(151, 156) + ";";
		lineProcessed += line.substring(156, 181) + ";";
		lineProcessed += line.substring(181, 189) + ";";
		lineProcessed += line.substring(189, 197) + ";";
		lineProcessed += line.substring(197, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
	}
	
	private String processLineE(String line) {
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
		lineProcessed += line.substring(62, 65) + ";";
		lineProcessed += line.substring(65, 73) + ";";
		lineProcessed += line.substring(73, 83) + ";";
		lineProcessed += line.substring(83, 84) + ";";
		lineProcessed += line.substring(84, 97) + ";";
		lineProcessed += line.substring(97, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
	}
	
	private String processLineF(String line) {
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
		lineProcessed += line.substring(62, 78) + ";";
		lineProcessed += line.substring(78, 113) + ";";
		lineProcessed += line.substring(113, 120) + ";";
		lineProcessed += line.substring(120, 131) + ";";
		lineProcessed += line.substring(131, 135) + ";";
		lineProcessed += line.substring(135, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
	}
	
	private String processLineL(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 5) + ";";
		lineProcessed += line.substring(5, 8) + ";";
		lineProcessed += line.substring(8, 13) + ";";
		lineProcessed += line.substring(13, 17) + ";";
		lineProcessed += line.substring(17, 24) + ";";
		lineProcessed += line.substring(24, 27) + ";";
		lineProcessed += line.substring(27, 28) + ";";
		lineProcessed += line.substring(28, 34) + ";";
		lineProcessed += line.substring(34, 42) + ";";
		lineProcessed += line.substring(42, 48) + ";";
		lineProcessed += line.substring(48, 50) + ";";
		lineProcessed += line.substring(50, 52) + ";";
		lineProcessed += line.substring(52, 56) + ";";
		lineProcessed += line.substring(56, 57) + ";";
		lineProcessed += line.substring(57, 59) + ";";
		lineProcessed += line.substring(59, 84) + ";";
		lineProcessed += line.substring(84, 86) + ";";
		lineProcessed += line.substring(86, 136) + ";";
		lineProcessed += line.substring(136, 141) + ";";
		lineProcessed += line.substring(141, 146) + ";";
		lineProcessed += line.substring(146, 151) + ";";
		lineProcessed += line.substring(151, 171) + ";";
		lineProcessed += line.substring(171, 191) + ";";
		lineProcessed += line.substring(191, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
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
			
			FileWriter fwD = null;
			PrintWriter pwD = null;
			
			FileWriter fwF = null;
			PrintWriter pwF = null;
			
			FileWriter fwE = null;
			PrintWriter pwE = null;
			
			FileWriter fwR = null;
			PrintWriter pwR = null;
			
			FileWriter fwT = null;
			PrintWriter pwT = null;
			
			try {
				file = new File(this.files.get(i));
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				System.out.println("Processing file " + file.getName());
				
				fwL = new FileWriter(file.getPath() + str_date + "_L.csv");
				pwL = new PrintWriter(fwL);
				pwL.println(this.getHeaderL());
				
				fwD = new FileWriter(file.getPath() + str_date + "_D.csv");
				pwD = new PrintWriter(fwD);
				pwD.println(this.getHeaderD());
				
				fwF = new FileWriter(file.getPath() + str_date + "_F.csv");
				pwF = new PrintWriter(fwF);
				pwF.println(this.getHeaderF());
				
				fwE = new FileWriter(file.getPath() + str_date + "_E.csv");
				pwE = new PrintWriter(fwE);
				pwE.println(this.getHeaderE());
				
				fwR = new FileWriter(file.getPath() + str_date + "_R.csv");
				pwR = new PrintWriter(fwR);
				pwR.println(this.getHeaderR());
				
				fwT = new FileWriter(file.getPath() + str_date + "_T.csv");
				pwT = new PrintWriter(fwT);
				pwT.println(this.getHeaderT());
				
				while ( (line = br.readLine()) != null ) {
					if ( line.substring(199, 200).equals("L") ) {
						processedline = this.processLineL(line);
						pwL.println(processedline);
					} else if ( line.substring(199, 200).equals("D") ) {
						processedline = this.processLineD(line);
						pwD.println(processedline);
					} else if ( line.substring(199, 200).equals("F") ) {
						processedline = this.processLineF(line);
						pwF.println(processedline);
					} else if ( line.substring(199, 200).equals("E") ) {
						processedline = this.processLineE(line);
						pwE.println(processedline);
					} else if ( line.substring(199, 200).equals("R") ) {
						processedline = this.processLineR(line);
						pwR.println(processedline);
					} else if ( line.substring(199, 200).equals("T") ) {
						processedline = this.processLineT(line);
						pwT.println(processedline);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fwL != null) {
						fwL.close();
					}
					if (fwD != null) {
						fwD.close();
					}
					if (fwF != null) {
						fwF.close();
					}
					if (fwE != null) {
						fwE.close();
					}
					if (fwR != null) {
						fwR.close();
					}
					if (fwT != null) {
						fwT.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
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
