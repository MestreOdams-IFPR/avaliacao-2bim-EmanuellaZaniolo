import java.util.Scanner;

public class EmanuellaZaniolo_maiorForca {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
       

            // --------------------
            int qtdJovens = 0;
            int qtdAceitos = 0;
            int soma=0;
            qtdJovens = lerInteiro();
            qtdAceitos = lerInteiro();
            int[] vetJovens = new int[qtdJovens];
            int [] vetAceitos= new int [qtdAceitos];
            // --------------
            int inicio = 0;
            int fim = vetJovens.length;
            for (int i = 0; i < fim; i++) {
                vetJovens[i] = lerInteiro();
            }
            vetJovens = mergeSortRec(vetJovens, inicio, fim);
            for (int i = 0; i < vetAceitos.length; i++) {
            }
            System.out.println(soma);
        
    }

    public static int lerInteiro() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }

    public static int[] mergeSortRec(int[] vet, int inicio, int fim) {
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mergeSortRec(vet, inicio, meio);
            mergeSortRec(vet, meio, fim);
            mergeSort(vet, inicio, meio, fim);

        }
        return vet;
    }

    public static void mergeSort(int[] vet, int inicio, int meio, int fim) {
        int i = inicio;
        int j = meio;
        int k = 0;
        int[] vetAux = new int[fim - inicio];
        while (i < meio && j < fim) {
            if (vet[i] <= vet[j]) {
                vetAux[k++] = vet[i++];
            } else {
                vetAux[k++] = vet[j++];
            }
        }
        while (i<meio) {
           vetAux[k++]=vet[i++]; 
        }
        while(j<fim){
            vetAux[k++]=vet[j++];

        }
        for (i= inicio, k=0; i < fim; i++, k++) {
            vet[i]=vetAux[k];
        }
    }
}
