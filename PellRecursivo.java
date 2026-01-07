import java.util.Scanner;

public class PellRecursivo{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int valor=lerInteiro();
        pell(valor);
        System.out.println();
    }
    public static int pell(int valor){
        int res=0;
        int i=0;
        if(valor==0 ){
           
            return 0;
        } else if (valor==1){
            return 1;
        }
        else {
            
            return pell(2*pell(valor-1+pell(valor-2)));
            
        }
     
    }
    public static int lerInteiro(){
        int valor=0;
        valor=LER.nextInt();
        return valor;
    }
}