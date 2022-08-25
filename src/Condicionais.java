public class Condicionais {
    int nota = 70;
    String graduacao;

        if (nota >= 70) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Nao aprovado");
    }

        if (nota >= 80) {
        graduacao = "A";
    } else if (nota < 80 && nota >= 70) {
        graduacao = "B";
    } else if (nota < 70 && nota >= 60) {
        graduacao = "C";
    } else if (nota < 60 && nota >= 0) {
        graduacao = "D";
    } else {
        graduacao = "";
    }

        switch (graduacao) {
        case "A":
        case "B":
            System.out.println("Aprovado");
            break;
        case "C":
        case "D":
            System.out.println("Reprovado");
            break;
        default:
            System.out.println("Graduacao invalida");
    }
}
