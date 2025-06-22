//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoGerador {

    public static void main(String[] args) {
        //chamando o procedimento Gerador para mostrar a mensagem com as linhas decorativas
        Gerador();
    }

    //procedimento Gerador: mostra a mensagem "Bom, dia!" com um componente visual de linhas
    public static void Gerador() {
        //imprimindo a linha superior decorativa
        System.out.println("+——-=======——+");

        //imprimindo a mensagem
        System.out.println("Bom, dia!");

        //imprimindo a linha inferior decorativa
        System.out.println("+——-=======——+");
    }
}