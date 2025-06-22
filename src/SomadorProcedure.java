import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class SomadorProcedure {

    public static void main(String[] args) {
        //criando objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        //solicitando o primeiro valor para o usuário
        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        //solicitando o segundo valor para o usuário
        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();

        //chamando o procedimento Somador passando os dois valores lidos
        Somador(valor1, valor2);

        //fechando o Scanner para evitar vazamento de recurso
        teclado.close();
    }

    //procedimento Somador que recebe dois inteiros, calcula e mostra a soma deles
    public static void Somador(int num1, int num2) {
        int resultado = num1 + num2; //calculando a soma

        //mostrando o resultado da soma para o usuário
        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + resultado);
    }
}
