import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //solicitando a quantidade de termos da sequência Fibonacci para o usuário
        System.out.print("Digite a quantidade de termos da sequência Fibonacci: ");
        int termos = teclado.nextInt();

        //chamando o procedimento Fibonacci para mostrar a sequência com a quantidade informada
        Fibonacci(termos);

        teclado.close();
    }

    //procedimento Fibonacci que recebe a quantidade de termos e mostra a sequência na tela
    public static void Fibonacci(int n) {
        //variáveis para controlar os dois últimos termos da sequência
        int a = 1;
        int b = 1;

        //imprime o primeiro termo
        System.out.print(a + " » ");

        if (n > 1) {
            //imprime o segundo termo se n for maior que 1
            System.out.print(b + " » ");
        }

        //imprime os termos restantes da sequência até o n-ésimo termo
        for (int i = 3; i <= n; i++) {
            int proximo = a + b; //calcula o próximo termo da sequência
            System.out.print(proximo + " » ");
            a = b;  //atualiza o termo anterior
            b = proximo; //atualiza o termo atual
        }

        //finaliza a sequência com a palavra FIM
        System.out.println("FIM");
    }
}
