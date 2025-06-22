import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoMaior {

    public static void main(String[] args) {
        //criando objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        //solicitando o primeiro valor para o usuário
        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        //solicitando o segundo valor para o usuário
        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();

        //chamando o procedimento Maior para verificar qual é o maior valor
        Maior(valor1, valor2);

        //fechando o Scanner para evitar vazamento de recurso
        teclado.close();
    }

    //procedimento Maior que recebe dois inteiros e mostra qual é o maior ou se são iguais
    public static void Maior(int num1, int num2) {
        if (num1 > num2) {
            //num1 é maior que num2
            System.out.println("O maior valor é: " + num1);
        } else if (num2 > num1) {
            //num2 é maior que num1
            System.out.println("O maior valor é: " + num2);
        } else {
            //num1 e num2 são iguais
            System.out.println("Os dois valores são iguais: " + num1);
        }
    }
}
