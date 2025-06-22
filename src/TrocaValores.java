import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class TrocaValores {

    //classe auxiliar para simular passagem por referência de dois valores double
    static class Valores {
        public double a;
        public double b;

        //construtor para inicializar os valores
        public Valores(double a, double b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //lendo o primeiro valor double
        System.out.print("Digite o valor de A: ");
        double valorA = teclado.nextDouble();

        //lendo o segundo valor double
        System.out.print("Digite o valor de B: ");
        double valorB = teclado.nextDouble();

        //criando o objeto que guarda os valores para passar por referência
        Valores valores = new Valores(valorA, valorB);

        //mostrando os valores antes da troca
        System.out.println("\nAntes da troca:");
        System.out.println("A = " + valores.a);
        System.out.println("B = " + valores.b);

        //chamando o procedimento para trocar os valores dentro do objeto
        Troca(valores);

        //mostrando os valores depois da troca
        System.out.println("\nDepois da troca:");
        System.out.println("A = " + valores.a);
        System.out.println("B = " + valores.b);

        teclado.close();
    }

    //procedimento Troca que troca os valores de A e B dentro do objeto Valores
    public static void Troca(Valores vals) {
        double temp = vals.a; //armazenando temporariamente o valor de A
        vals.a = vals.b;      //atribuindo valor de B para A
        vals.b = temp;        //atribuindo valor temporário para B (valor antigo de A)
    }
}
