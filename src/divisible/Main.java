/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        //String[]input = FileManager.readLines("C:/Users/Marco/Documents/NetBeansProjects/Taller2/Input.txt");
        //System.out.println(input[0]);
        //int peso = Integer.parseInt(input[0]);
        int peso = in.nextInt();
        if (peso % 2 == 0 && peso > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
