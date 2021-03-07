package fes.aragon.inicio;

import java.util.StringTokenizer;

public class inicio {

    public static void main(String[] args) {
        String lorem = "Vamos a intentar poner esto en dos dos parrafos la verdad es "
                + "que no se que se deb de hacer exactamente pero pues ya ya que "
                + "somos chavos la verdad la verdad";
        String[] arrayLorem = lorem.split(" ");
        String[] arrayLoremVocal = new String[arrayLorem.length];
        arrayLoremVocal = arrayLorem.clone();
        int numPalabras = arrayLorem.length;
        for (int i = 0; i < numPalabras; i++) {
            arrayLorem[i] = arrayLorem[i].replaceAll("[aeiou]", "");
        }
        int[] numRep = new int[numPalabras];
        int cont = 0;

        for (int i = 0; i < numPalabras; i++) {
            if (!arrayLoremVocal[i].equals("")) {
                for (int j = 0; j < numPalabras; j++) {
                    if (arrayLoremVocal[i].equals(arrayLoremVocal[j])) {
                        numRep[cont]++;
                        if (numRep[cont] > 1) {
                            arrayLoremVocal[j] = "";
                        }
                    }
                }
            }
            cont++;
        }

        int longi = lorem.length();
        System.out.println("---------------------");
        System.out.println("Numero de caracteres: ");
        System.out.println(longi);
        System.out.println("---------------------");
        System.out.println("Numero de Palabras: ");
        System.out.println(numPalabras);
        System.out.println("---------------------");
        System.out.println("Palabras repetidas: ");
        for (int i = 0; i < numPalabras; i++) {
            if (numRep[i] > 0) {
                System.out.print(arrayLoremVocal[i] + ": ");
                System.out.println(numRep[i]);
            }

        }
        System.out.println("---------------------");
        System.out.println("Palabrs sin vocales:");
        for (int i = 0; i < numPalabras; i++) {
            System.out.print(arrayLorem[i] + " ");
            if (i % 5 == 0 && i > 0) {
                System.out.println("");
            }
        }

    }
}
