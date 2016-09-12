/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relocate;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Relocate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Vvedite chislo:");
        int ch;
        ch = sn.nextInt();
        int q, w, e, r;
        r = ch % 10;
        e = ch % 100 / 10;
        w = ch % 1000 / 100;
        q = ch % 10000 / 1000;
        System.out.println(r);
        System.out.println(e);
        System.out.println(w);
        System.out.println(q);
        int[] x;
        x = new int[4];
        x[0] = q;
        x[1] = w;
        x[2] = e;
        x[3] = r;
        int xmin = 10;

        for (int j = 0; j < x.length; j++) {
            if (x[j] < xmin) {
                xmin = x[j];
            System.out.print(xmin);}
        }

    }
}
