//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoGeradorPersonalizado {

    public static void main(String[] args) {
        //chamando o procedimento Gerador passando a mensagem personalizada como argumento
        Gerador("Aprendendo Subrotinas");
    }

    //procedimento Gerador que recebe uma mensagem do tipo String como parâmetro
    //e imprime essa mensagem com as linhas decorativas acima e abaixo
    public static void Gerador(String mensagem) {
        //imprime a linha superior decorativa
        System.out.println("+——-=======——+");

        //imprime a mensagem que foi passada como parâmetro
        System.out.println(mensagem);

        //imprime a linha inferior decorativa
        System.out.println("+——-=======——+");
    }
}