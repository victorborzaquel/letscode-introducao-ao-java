package br.com.victorborzaquel.java;

public class Booleans {
    public static void main(String[] args) {
        boolean fimDeSemana = false;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;
        boolean vamosAPraia2 = fimDeSemana || fazendoSol;

        String mensagem = fimDeSemana ? "Fim de semana" : "nao é fim de semana";
        System.out.println(vamosAPraia);
    }
}
