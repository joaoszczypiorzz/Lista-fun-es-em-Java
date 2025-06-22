//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoGeradorRepetido {

    public static void main(String[] args) {
        //chamando o procedimento Gerador passando a mensagem e a quantidade de repetições
        Gerador("Aprendendo Subrotinas", 4);
    }

    //procedimento Gerador que recebe uma mensagem e a quantidade de vezes que essa mensagem deve ser mostrada
    public static void Gerador(String mensagem, int vezes) {
        //imprimindo a linha superior decorativa
        System.out.println("+——-=======——+");

        //laço para imprimir a mensagem na quantidade de vezes informada pelo usuário
        for (int i = 0; i < vezes; i++) {
            System.out.println(mensagem);
        }

        //imprimindo a linha inferior decorativa
        System.out.println("+——-=======——+");
    }
}