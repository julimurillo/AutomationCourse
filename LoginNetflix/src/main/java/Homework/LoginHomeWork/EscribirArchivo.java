package Homework.LoginHomeWork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
	void escribirArchivo() {
		BufferedWriter bw;
	
			try {
				bw = new BufferedWriter(new FileWriter("data.txt"));
				bw.write("Isam09@hotmail.com,1019113318ia");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

	
}
	