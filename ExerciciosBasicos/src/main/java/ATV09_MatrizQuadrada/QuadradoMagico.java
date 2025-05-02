package ATV09_MatrizQuadrada;

public class QuadradoMagico {

    public static boolean eQuadradoMagico(int[][] matriz){

        int soma = 0;
        int soma2 = 0;
        // Somar elementos da primeira linha
        for(int j = 0; j < matriz.length; j++){
            soma = soma + matriz[0][j];
        }
        // Somar elementos das demais linhas
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                soma2 = soma2 + matriz[i][j];
            }
            if(soma2 != soma){
                return false; // Não é quadrado mágico
            }
            soma2 = 0; // Resetando soma2 para a próxima linha
        }
        // Somar colunas
        for(int j = 0; j < matriz[0].length; j++){
            soma2 = 0;
            for(int i = 0; i < matriz.length; i++){
                soma2 = soma2 + matriz[i][j];
            }
            if(soma2 != soma){
                return false;
            }
        }
        // Somar diagonal principal
        soma2 = 0;
        for(int i = 0; i < matriz.length; i++){
            soma2 = soma2 + matriz[i][i];
        }
        if(soma2 != soma){
            return false;
        }
        // Somar diagonal secundária
        soma2 = 0;
        int i = 0;
        for(int j = matriz.length - 1; j >= 0; j--){
            soma2 = soma2 + matriz[i][j];
            i++;
        }
        if(soma2 != soma){
            return false;
        }
        return true; // É quadrado mágico
    }

    public static void exibirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Impressão de cada elemento com uma tabulação para melhor visualização
            }
            System.out.println(); // Pular linha ao final de cada linha da matriz
        }
    }

    public static void main(String[] args){

        int [][] matriz = new int [3][3];
        matriz[0][0] = 3;
        matriz[0][1] = 4;
        matriz[0][2] = 8;
        matriz[1][0] = 10;
        matriz[1][1] = 5;
        matriz[1][2] = 0;
        matriz[2][0] = 2;
        matriz[2][1] = 6;
        matriz[2][2] = 7;

        if(eQuadradoMagico(matriz)){
            System.out.println("Matriz é quadrado mágico!");
            System.out.println();
            exibirMatriz(matriz);
        }
        else{
            System.out.println("Matriz não é quadrado mágico.");
        }
    }
}
