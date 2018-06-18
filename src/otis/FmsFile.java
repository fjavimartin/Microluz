package otis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FmsFile {
	
	private File file = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	
	private FileWriter fwL = null;
	private PrintWriter pwL = null;
	
	private FileWriter fwD = null;
	private PrintWriter pwD = null;
	
	private FileWriter fwF = null;
	private PrintWriter pwF = null;
	
	private FileWriter fwEX = null;
	private PrintWriter pwEX = null;
	
	private FileWriter fwR = null;
	private PrintWriter pwR = null;
	
	private FileWriter fwT = null;
	private PrintWriter pwT = null;
	
	private FileWriter fwU = null;
	private PrintWriter pwU = null;
	
	private FileWriter fwSP = null;
	private PrintWriter pwSP = null;
	
	private FileWriter fwC = null;
	private PrintWriter pwC = null;
	
	private int lineCounter = 0;
	
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
	
	private String getHeaderEX() {
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
	
	private String getHeaderU() {
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
		header = header + "Descripción idioma X;";
		header = header + "Descripción idioma X;";
		header = header + "Descripción idioma X;";
		header = header + "Descripción idioma X;";
		header = header + "N/A;";
		header = header + "Indicador de tipo de registro;";
		
		return header;
	}
	
	private String getHeaderSP() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "Grupo;";
		header = header + "N/A;";
		header = header + "N/A;";
		header = header + "Cantidad necesaria acumulada;";
		header = header + "Semana otis expedición;";
		header = header + "N/A;";
		header = header + "Proveedor;";
		header = header + "N/A;";
		header = header + "Código de material;";
		header = header + "N/A;";
		header = header + "Descripción material;";
		header = header + "Acumulado de cables;";
		header = header + "Vinculado a cables;";
		header = header + "Cantida necesaria acumulada;";
		header = header + "N/A;";
		header = header + "Uso interno;";
		header = header + "Autorización de fábrica;";
		header = header + "N/A;";
		header = header + "Código de proveedor;";
		header = header + "N/A;";
		header = header + "Indicador de tipo de registro;";
		
		return header;
	}
	
	private String getHeaderC() {
		String header;
		
		header = "Código Fábrica;";
		header = header + "TRAN;";
		header = header + "Grupo;";
		header = header + "Número registros;";
		header = header + "N/A;";
		header = header + "Indicador de tipo de registro;";
		
		return header;
	}
	
	private String processLineC(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 5) + ";";
		lineProcessed += line.substring(5, 9) + ";";
		lineProcessed += line.substring(9, 14) + ";";
		lineProcessed += line.substring(14, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
	}
	
	private String processLineSP(String line) {
		String lineProcessed = "";
		
		lineProcessed += line.substring(0, 1) + ";";
		lineProcessed += line.substring(1, 5) + ";";
		lineProcessed += line.substring(5,13) + ";";
		lineProcessed += line.substring(13,17) + ";";
		lineProcessed += line.substring(17,24) + ";";
		lineProcessed += line.substring(24,27) + ";";
		lineProcessed += line.substring(27,28) + ";";
		lineProcessed += line.substring(28,34) + ";";
		lineProcessed += line.substring(34,42) + ";";
		lineProcessed += line.substring(42,58) + ";";
		lineProcessed += line.substring(58,62) + ";";
		lineProcessed += line.substring(62,97) + ";";
		lineProcessed += line.substring(97,103) + ";";
		lineProcessed += line.substring(103,108) + ";";
		lineProcessed += line.substring(108,115) + ";";
		lineProcessed += line.substring(115,151) + ";";
		lineProcessed += line.substring(151,152) + ";";
		lineProcessed += line.substring(152,156) + ";";
		lineProcessed += line.substring(156,157) + ";";
		lineProcessed += line.substring(157,163) + ";";
		lineProcessed += line.substring(163,199) + ";";
		lineProcessed += line.substring(199,200) + ";";
		
		return lineProcessed;
	}
	
	private String processLineU(String line) {
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
		lineProcessed += line.substring(127, 162) + ";";
		lineProcessed += line.substring(162, 197) + ";";
		lineProcessed += line.substring(197, 199) + ";";
		lineProcessed += line.substring(199, 200) + ";";
		
		return lineProcessed;
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
	
	private String processLineEX(String line) {
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
	
	/**
	 * Process otis file
	 * @param pathfile
	 */
	public void processFile(String pathfile) {
		String line = "";
		String processedline = "";
		
		// Init files
		this.initFiles(pathfile);
		
		// Process file
		try {
			while ( (line = this.br.readLine()) != null ) {
				this.lineCounter++;
				if ( line.substring(199, 200).equals("L") ) {
					processedline = this.processLineL(line);
					pwL.println(processedline);
				} else if ( line.substring(199, 200).equals("D") ) {
					processedline = this.processLineD(line);
					pwD.println(processedline);
				} else if ( line.substring(199, 200).equals("F") ) {
					processedline = this.processLineF(line);
					pwF.println(processedline);
				} else if ( line.substring(199, 200).equals("E") || line.substring(199, 200).equals("X")) {
					processedline = this.processLineEX(line);
					pwEX.println(processedline);
				} else if ( line.substring(199, 200).equals("R") ) {
					processedline = this.processLineR(line);
					pwR.println(processedline);
				} else if ( line.substring(199, 200).equals("T") ) {
					processedline = this.processLineT(line);
					pwT.println(processedline);
				} else if ( line.substring(199, 200).equals("U") ) {
					processedline = this.processLineU(line);
					pwU.println(processedline);
				} else if ( line.substring(199, 200).equals("S") || line.substring(199, 200).equals("P")) {
					processedline = this.processLineSP(line);
					pwSP.println(processedline);
				} else if ( line.substring(199, 200).equals("C") ) {
					processedline = this.processLineC(line);
					pwC.println(processedline);
				}
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Line " + this.lineCounter + " too short -> " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(this.lineCounter + " Line processed.");
		// Close files
		this.closeFiles();
	}
	
	/**
	 * Init files where app is going to write otis lines.
	 * @param pathfile
	 */
	private void initFiles(String pathfile) {
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		String str_date = date_format.format(date);
		
		try {
			this.file = new File(pathfile);
			this.fr = new FileReader(this.file);
			this.br = new BufferedReader(this.fr);
			System.out.println("Processing file " + this.file.getName());
			
			this.fwL = new FileWriter(this.file.getPath() + str_date + "_L.csv");
			this.pwL = new PrintWriter(this.fwL);
			this.pwL.println(this.getHeaderL());
			
			this.fwD = new FileWriter(this.file.getPath() + str_date + "_D.csv");
			this.pwD = new PrintWriter(this.fwD);
			this.pwD.println(this.getHeaderD());
			
			this.fwF = new FileWriter(this.file.getPath() + str_date + "_F.csv");
			this.pwF = new PrintWriter(this.fwF);
			this.pwF.println(this.getHeaderF());
			
			this.fwEX = new FileWriter(this.file.getPath() + str_date + "_EX.csv");
			this.pwEX = new PrintWriter(this.fwEX);
			this.pwEX.println(this.getHeaderEX());
			
			this.fwR = new FileWriter(this.file.getPath() + str_date + "_R.csv");
			this.pwR = new PrintWriter(this.fwR);
			this.pwR.println(this.getHeaderR());
			
			this.fwT = new FileWriter(this.file.getPath() + str_date + "_T.csv");
			this.pwT = new PrintWriter(this.fwT);
			this.pwT.println(this.getHeaderT());
			
			this.fwU = new FileWriter(this.file.getPath() + str_date + "_U.csv");
			this.pwU = new PrintWriter(this.fwU);
			this.pwU.println(this.getHeaderU());
			
			this.fwSP = new FileWriter(file.getPath() + str_date + "_SP.csv");
			this.pwSP = new PrintWriter(fwSP);
			this.pwSP.println(this.getHeaderSP());
			
			this.fwC = new FileWriter(this.file.getPath() + str_date + "_C.csv");
			this.pwC = new PrintWriter(this.fwC);
			this.pwC.println(this.getHeaderC());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Close files open at the end of process.
	 */
	private void closeFiles() {
		try {
			if (this.fwL != null) {
				this.fwL.close();
			}
			if (this.fwD != null) {
				this.fwD.close();
			}
			if (this.fwF != null) {
				this.fwF.close();
			}
			if (this.fwEX != null) {
				this.fwEX.close();
			}
			if (this.fwR != null) {
				this.fwR.close();
			}
			if (this.fwT != null) {
				this.fwT.close();
			}
			if (this.fwU != null) {
				this.fwU.close();
			}
			if (this.fwSP != null) {
				this.fwSP.close();
			}
			if (this.fwC != null) {
				this.fwC.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
