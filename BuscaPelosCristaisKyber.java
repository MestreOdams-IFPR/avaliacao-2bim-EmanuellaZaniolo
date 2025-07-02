import java.util.Scanner;

public class BuscaPelosCristaisKyber {
    final static Scanner LER =new Scanner (System.in);
    public static void main(String[] args) {
        int n=0;
        int q=0;
        int posicao=0;
        int caso=0;
        do{
            caso++;
            System.out.println("CASE# "+caso+" :");
        n=lerInteiro();
        q=lerInteiro();
        posicao=0;
        int []vetCristais=new int [n];
        int []vetTestes=new int [q];
        int inicio=0;
        int fim = vetCristais.length;
        for (int i = 0; i < vetCristais.length; i++) {
            vetCristais[i]=lerInteiro();

        }
        for (int i = 0; i < vetCristais.length; i++) {
            vetTestes[i]=lerInteiro();
        }
        vetCristais=mergeSortRec(vetCristais, inicio, fim);
        for (int i = 0; i < vetTestes.length; i++) {
            posicao=buscaBinaria(vetCristais, vetTestes[i]);
            if(posicao==-1){
               System.out.println(vetTestes[i]+"not found");

            } else {  System.out.println(vetTestes[i]+" found at "+posicao);}
            }
        
        } while(n!=0 && q!=0);
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
    public static int lerInteiro(){
        int valor=0;
        valor=LER.nextInt();
        return valor;
    }
    public static int buscaBinaria(int [] vetCristais, int  num){
        int posicao=0;
        int inf=0;
        int sup=vetCristais.length;
        int meio=0;
        while (inf<=sup) {
            meio=(inf+sup)/2;
            if(num==vetCristais[meio]){
                return meio;
            } else if( num<vetCristais[meio]){
                sup=meio-1;
            } else { inf=meio+1;}
        }
        return -1;
    }
}
