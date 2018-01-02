/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primecheck;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class PrimeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        while (true) {
            double test = s.nextDouble();
            System.out.println(a(test));
        }
    }

    public static boolean check(double x) {
        if (x == 1) {
            return false;
        }
        return prime(x, (x - 1));
    }

    public static boolean prime(double x, double y) {
        if (y != 1) {
            if (x % y == 0) {
                return false;
            }
            return prime(x, y - 1);
        }
        return true;
    }

    public static boolean a(double a) {
        if (a == 1 || a == 0) {
            return false;
        }
        for (double i = a - 1; i > 1; i--) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
