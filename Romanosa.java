package romanoa;

import java.util.Scanner;

/**
 *
 * @author Jesus Tuz
 */
public class Romanosa {

      public static void main(String[] args) {
        int DECI, UNI, DECE, CENT, MILE;
        String unid, dece, cent, mill;
        
        Scanner li = new Scanner(System.in);
        System.out.println(">Introduzca un numero menor o igual a 1000: \n");
        DECI = li.nextInt();
        
        UNI = (DECI%10);
        DECE = (DECI/10)%10;
        CENT = (DECI/100)%10;
        MILE = (DECI/1000);
        
        switch(UNI){
            case 1:
                unid= "I";
                break;
            case 2:
                unid= "II";
                break;
            case 3:
                unid= "III";
                break;
            case 4:
                unid= "IV";
                break;
            case 5:
                unid= "V";
                break;
            case 6:
                unid= "VI";
                break;
            case 7:
                unid= "VII";
                break;
            case 8:
                unid= "VIII";
                break;
            case 9:
                unid= "IX";
                break;
            default:
                unid= "";
                break;
        }
        switch(DECE){
            case 1:
                dece= "X";
                break;
            case 2:
                dece= "XX";
                break;
            case 3:
                dece= "XXX";
                break;
            case 4:
                dece= "XL";
                break;
            case 5:
                dece= "L";
                break;
            case 6:
                dece= "LX";
                break;
            case 7:
                dece= "LXX";
                break;
            case 8:
                dece= "LXXX";
                break;
            case 9:
                dece= "XC";
                break;
            default:
                dece= "";
                break;
        }
        switch(CENT){
            case 1:
                cent= "C";
                break;
            case 2:
                cent= "CC";
                break;
            case 3:
                cent= "CCC";
                break;
            case 4:
                cent= "CD";
                break;
            case 5:
                cent= "D";
                break;
            case 6:
                cent= "DC";
            case 7:
                cent= "DCC";
                break;
            case 8:
                cent= "DCCC";
                break;
            case 9:
                cent= "CM";
                break;
            default:
                cent= "";
                break;
        }
        switch(MILE){
            case 1:
                mill= "M";
                break;
            default:
                mill= "";
                break;
        }
        if(DECI>=1 && DECI <=1000){
      System.out.println("Nos da como resultado: "+mill+cent+dece+unid+"\n");
      }else{
        System.out.println("Aqui pasa algo... No es un numero entre el rango (1-1000)");
        Romanosa.main(null);
        }
    }  
    
    
}
