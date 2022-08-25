public class Boolean {
    boolean fimDeSemana = false;
    boolean fazendoSol = true;

    boolean vamosAPraia = fimDeSemana && fazendoSol;
    boolean vamosAPraia2 = fimDeSemana || fazendoSol;

    String mensagem = fimDeSemana ? "Fim de semana" : "nao é fim de semana";
        System.out.println(vamosAPraia);
}
