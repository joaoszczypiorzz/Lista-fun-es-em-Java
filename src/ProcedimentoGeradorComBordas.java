//Aluno João Vitor Szczypior Tavares ; Matricula 25104160
public class ProcedimentoGeradorComBordas {

    public static void main(String[] args) {
        //chamada de exemplo: mensagem "Bom dia", repetida 3 vezes, com a borda número 2
        Gerador("Bom dia", 3, 2);
    }

    //procedimento Gerador recebe mensagem, quantidade de repetições e o número da borda
    public static void Gerador(String mensagem, int vezes, int borda) {
        String bordaEscolhida = "";

        //selecionando a borda de acordo com o número informado
        if (borda == 1) {
            bordaEscolhida = "+——-=======——+";
        } else if (borda == 2) {
            bordaEscolhida = " ̃ ̃ ̃ ̃ ̃ ̃ ̃ ̃::::::: ̃ ̃ ̃ ̃ ̃ ̃";
        } else if (borda == 3) {
            bordaEscolhida = "««««——-»»»>";
        } else {
            //caso o usuário informe um número inválido, usamos a borda 1 como padrão
            bordaEscolhida = "+——-=======——+";
        }

        //imprime a borda superior
        System.out.println(bordaEscolhida);

        //imprime a mensagem repetida a quantidade de vezes informada
        for (int i = 0; i < vezes; i++) {
            System.out.println(mensagem);
        }

        //imprime a borda inferior
        System.out.println(bordaEscolhida);
    }
}
