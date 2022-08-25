import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings {
    String nome =  "Victor";

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());

    String outroNome = "victor";

        System.out.println(nome.equals(outroNome));
        System.out.println(nome.equalsIgnoreCase(outroNome));

    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");
    LocalDateTime agora = LocalDateTime.now();
    int horaAgora = agora.getHour();
    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    String saudacao;
        if (horaAgora >= 0 && horaAgora < 12) {
        saudacao = "bom dia";
    } else if (horaAgora >= 12 && horaAgora < 18) {
        saudacao = "boa tarde";
    } else if (horaAgora >= 18 && horaAgora < 24) {
        saudacao = "boa noite";
    } else {
        saudacao = "ola";
    }

        System.out.println(hoje);
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
}
