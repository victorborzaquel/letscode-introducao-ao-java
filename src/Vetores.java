import java.util.Arrays;

public class Vetores {
    int[] numeros = new int[5];

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
        for (int i=0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
    }

    String[] letras = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(letras));

    int[] arrNumeros = { 9, 4, 2, 6, 1 };
    int maior = arrNumeros[0];
    int menor = arrNumeros[0];
    int media = 0;

        for (int i = 0; i < arrNumeros.length; i++) {
        if (arrNumeros[i] > maior) {
            maior = arrNumeros[i];
        }

        if (arrNumeros[i] < menor) {
            menor = arrNumeros[i];
        }

        media += arrNumeros[i];
    }
    media /= arrNumeros.length;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
}
