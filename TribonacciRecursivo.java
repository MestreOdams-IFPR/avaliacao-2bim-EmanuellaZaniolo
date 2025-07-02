import java.util.Scanner;

public class TribonacciRecursivo{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int valor=lerInteiro();
        recTribonacci(valor);
        System.out.println();
    }
    public static int recTribonacci(int valor){
        int res=0;
        int i=0;
        if(valor==0 || valor==1){
           
            return 0;
        } else if (valor==2){
            return 1;
        }
        else {
            
            return recTribonacci(valor-1+recTribonacci(valor-2) +recTribonacci(valor-3));
            
        }
     
    }
    public static int lerInteiro(){
        int valor=0;
        valor=LER.nextInt();
        return valor;
    }
}