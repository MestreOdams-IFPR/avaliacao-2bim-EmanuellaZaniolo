import java.util.Scanner;

public class TesteDaForca {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
            int qtdJovens = 0;
            int qtdAceitos = 0;
            int soma=0;
            qtdJovens = lerInteiro();
            qtdAceitos = lerInteiro();
            int[] vetJovens = new int[qtdJovens];
            int fim = vetJovens.length;
            for (int i = 0; i < fim; i++) {
                vetJovens[i] = lerInteiro();
            }
            vetJovens = insertion(vetJovens);
            for (int i = 0; i <qtdAceitos; i++) {
                soma=vetJovens[i]+soma;
            }
            System.out.println(soma);
        
    }

    public static int lerInteiro() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }

    static int []insertion(int []vet){
        int tamanho=vet.length;
        for (int i = 0; i < tamanho; i++) {
            int eleito=vet[i];
            int j=i-1;
            while(j>=0 && vet[j]<eleito){
                vet[j+1]=vet[j];
                j--;
            }
            vet[j+1]=eleito;
          
        }
        return vet;
        
    }
    
}
