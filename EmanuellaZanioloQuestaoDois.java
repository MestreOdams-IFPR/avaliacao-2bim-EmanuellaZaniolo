import java.util.Scanner;

public class EmanuellaZanioloQuestaoDois{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int valor=lerInteiro();
        int res=0;
        int num=0; 
        int f=0;
        res=recTribonacci(valor, num, f);
    }
    public static int recTribonacci(int valor, int num,int f){
        int res=0;
        int i=0;
        if(valor==0 || valor==1){
            res=0;
            return res;
        }
        if (num>valor) {
            return res;
        } else {
            i++;
            recTribonacci(valor, num-i, f);
            
        }
     
    }
    public static int lerInteiro(){
        int valor=0;
        valor=LER.nextInt();
        return valor;
    }
}