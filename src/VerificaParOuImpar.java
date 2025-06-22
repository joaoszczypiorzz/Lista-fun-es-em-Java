import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class VerificaParOuImpar {

    public static void main(String[] args) {
        //criando objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        //solicitando um número inteiro para o usuário
        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        //chamando o procedimento ParOuImpar passando o número lido
        ParOuImpar(numero);

        //fechando o Scanner para evitar vazamento de recurso
        teclado.close();
    }

    //procedimento ParOuImpar que verifica se o número é par ou ímpar e mostra na tela
    public static void ParOuImpar(int num) {
        //usando operador módulo (%) para verificar o resto da divisão por 2
        if (num % 2 == 0) {
            //resto 0 significa número par
            System.out.println("O número " + num + " é PAR.");
        } else {
            //resto diferente de 0 significa número ímpar
            System.out.println("O número " + num + " é ÍMPAR.");
        }
    }
}