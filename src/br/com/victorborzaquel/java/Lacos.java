package br.com.victorborzaquel.java;

public class Lacos {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiplicacao = i * j;
                String mensagem = j + "x" + i + " = ";
                System.out.println(mensagem + multiplicacao);
            }
        }
    }
}
