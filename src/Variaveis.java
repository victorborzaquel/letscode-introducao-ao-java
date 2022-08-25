public class Variaveis {
    private int a, b;

    public Variaveis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int soma = a + b;
    int subtracao = a - b;
    int multiplicacao = a * b;
    float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
}
