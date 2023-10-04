package ejer1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos;
		int numEnteros = 0;
		int numRestante = 0;
		int numeros = 0;
		String letras = "";
		while (true) {
			numCasos = sc.nextInt();
			if (numCasos == 0)

				break;
			while (numCasos > 0) {
				if (numCasos > 0 && numCasos < 10) {
					letras += "T";
					numCasos -= 1;
				}
				if (numCasos >= 10 && numCasos < 100) {
					letras += "G";
					numCasos -= 100;
				}
				if (numCasos >= 100 && numCasos < 1000) {
					letras += "C";
					numCasos -= 100;
				}
				if (numCasos >= 1000 && numCasos < 10000) {
					letras += "F";
					numCasos -= 1000;
				}
				if (numCasos >= 10000 && numCasos < 100000) {
					letras += "D";
					numCasos -= 10000;
				}
				if (numCasos >= 100000 && numCasos < 1000000) {
					letras += "R";
					numCasos -= 100000;
				}
				if (numCasos >= 1000000 && numCasos < 10000000) {
					letras += "H";
					numCasos -= 1000000;
				}
			}
			System.out.println(letras);
		}
	}
}
