import java.util.Scanner;

//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoContador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //solicitando o valor inicial da contagem
        System.out.print("Digite o valor de início da contagem: ");
        int inicio = teclado.nextInt();

        //solicitando o valor final da contagem
        System.out.print("Digite o valor do fim da contagem: ");
        int fim = teclado.nextInt();

        //solicitando o valor do incremento (passo) da contagem
        System.out.print("Digite o valor do incremento (passo): ");
        int incremento = teclado.nextInt();

        //chamando o procedimento Contador para realizar a contagem com os valores informados
        Contador(inicio, fim, incremento);

        teclado.close();
    }

    //procedimento Contador que recebe início, fim e incremento e mostra a contagem na tela
    public static void Contador(int inicio, int fim, int incremento) {
        System.out.println("Contagem:");

        //laço para contar do valor inicial até o final, pulando conforme o incremento
        for (int i = inicio; i <= fim; i += incremento) {
            System.out.println(i);
        }
    }
}
