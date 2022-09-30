/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum3;
import java.util.Scanner;
/**
 *
 * @author Azura
 */
public class NewClass {
public static void main(String[] args){
Scanner masukan = new Scanner (System.in);
    System.out.print("Masukan IP : ");
    double ip = masukan.nextDouble();
    String sks = "";
    if (ip != 0 && ip <=4){
    if (ip > 0 && ip < 2.5){
        sks = "18";
}
    else if(ip == 2.5 || ip < 2.75 ){
        sks = "20";
    }
    else if (ip == 2.75 || ip < 3){
        sks = "22";
    }
    else if(ip == 3 || ip < 3.5){
        sks = "23";
    }
    else if (ip == 3.5 || ip <= 4){
        sks = "24";
    }
    System.out.print( "Jatah SKS : " + sks);
    }
    else{ System.out.println("Sistem Eror");
            
            }
}
}
