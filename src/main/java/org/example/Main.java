package org.example;

import org.example.model.Contato;

import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.Files;
import java.text.DecimalFormat;

public class Main {
	public static void main(String args[]) throws IOException {
		Contato contato = new Contato("luzia", "luzia@gmail.com");
		System.out.println(Contato.COMPANY_USER);
		AutenticationUser autenticationUser= new AutenticationUser();
		autenticationUser.autication();


		//Realizar leitura de arquivo em txt
		File file = new File("file.txt");
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();// leitura do arquivo
		System.out.println(line);
		
		while (line != null){
			System.out.println(line);
			line = br.readLine();
		}
		System.out.println(System.getProperty("user.dir"));// Saber o diretorio central
	}
}
