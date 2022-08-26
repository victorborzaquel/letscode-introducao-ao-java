package br.com.victorborzaquel.java;

public class Funcao {
    public static void main(String[] args) {
        String nome = "Victor";
        saudacao(nome);

        int resultado = soma(2,4);
        System.out.println(resultado);
    }

    public static void saudacao(String nome) {
        System.out.println("Hello, " + nome);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
