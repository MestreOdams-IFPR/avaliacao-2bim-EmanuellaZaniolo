import java.util.Scanner;

public class EmanuellaZanioloQuestaoUm {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int [] vet=new int[4];
        int e=0;
        int d=vet.length;
        for (int i = 0; i < vet.length; i++) {
            vet[i]=lerInteiro();
        }
        metodo(vet,e,d);
    }
    public static void metodo(int[]vet, int e, int d){
        int t;
        if(e>=d){
            
            for (int i = 0; i < vet.length; i++) {
                System.out.println(vet[i]);
                System.out.println();
            }
            return;
        }
        else{
            t=vet[e];
            vet[e]=vet[d];
            vet[d]=t;
            metodo(vet,e-1, d+1);
        }
    }
    public static int lerInteiro(){
        int valor=0;
        valor=LER.nextInt();
        return valor;
    }
}
//retorna o vet invertido
