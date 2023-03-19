package separadordefrases;

import java.util.Scanner;

public class SeparadoeDeFrases {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = "";

        System.out.println("Ingrese una frase inspiradora: ");
        frase = cin.nextLine();

        String[] palabras = frase.split(" ");

//        for (int i = 0; i <= palabras.length - 1; i++) { // le agregamos el -1 si igualamos con un <=
        for (int i = 0; i < palabras.length; i++) { // no le agregamos el -1 ya que el ultimo indice no lo cuenta
            System.out.println("Palabra " + (i+1) + ": " + palabras[i]);
        }
    }
}
