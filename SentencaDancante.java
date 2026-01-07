import java.util.Scanner;

public class SentencaDancante {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        String fraseJunta=lerTexto();
        fraseJunta=fraseJunta.toLowerCase();
        char[] vetChar=fraseJunta.toCharArray();
        Character temp=vetChar[0];
        Character tempDois;
        temp.toUpperCase(0);
        
        Character [] vet=new Character[vetChar.length];
        for (int i = 0; i < vet.length; i++) {
            vet[i]=vetChar[i];
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+" ");

        }
        
        for (int j = 1; j < vet.length; j++) {
            temp=vetChar[j];
            tempDois=vetChar[j-1];
            
            if(temp.isWhitespace(temp)==true){
                j++;
            }
            if(tempDois.isUpperCase(tempDois)==true){
                temp=temp.toLowerCase(temp);
            } else {temp=temp.toUpperCase(temp);}
    
       }
    
    }

    public static String lerTexto(){
        String valor=null;
        valor=LER.nextLine();
        return valor;
    }
}

