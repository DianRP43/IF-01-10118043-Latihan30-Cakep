/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    private static final String Reset = "\033[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jawaban;
    Scanner scan = new Scanner(System.in);
    
    System.out.println((char)27+"[01;31m KAMU"+(char)27+"[01;32m NGERJAIN SENDIRI"+(char)27+"[01;33m LATIHAN 17 SAMPE"+(char)27+"[01;34m LATIHAN 30 INI ?");
    System.out.print((char)27+"[01;34m JAWAB"+(char)27+"[01;31m (YOI/ENGGAK) : ");
    jawaban = scan.nextLine().toUpperCase();
        System.out.println("");
    
        if (jawaban.equals("YOI")) {
            System.out.println((char)27+"[01;31m CAKEP BENER."+(char)27+"[01;35m GOODJOB");
        }else{
            
            System.out.println((char)27+"[01;31m TETEP CAKEP SIH.");
            System.out.println((char)27+"[01;36m SING PENTING YAKIN.");
            System.out.println((char)27+"[00;00m KEEP THE CODE WORKS DUDE."+Reset);
        }
    
    }
    
}
