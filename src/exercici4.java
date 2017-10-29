public class exercici4 {

    //aquest és el meu: no funciona
    public static void main(String[] args) {

        System.out.println("Exercici 4");

        int i;
        int suma = 0;
        int n;

        for (n=2; n < 1001; n++) {

            for (i = 1; i < n; i++) {


                if (n % i == 0) {

                    suma = suma + i;     // si és divisor, es suma i s'arxiva a dalt a la variable suma
                }

                if (suma == n) {  // si n es igual a la suma dels seus divisors, n és perfecte

                    System.out.println("El número " + n + "és perfecte");
                }
            }
        }

    }
}


//aquest és el d’en Guillem: sí funciona
package com.itnove.basic;

public class Exercici4 {
    public static void main(String[] args) {

        System.out.println("Exercici 4");


        for (int n = 0; n < 1001; n++) {

            if (esPerfecto(n)) {
                System.out.println(n);
            }
        }

    }

    private static boolean esPerfecto(int n) {
        int suma = 0;

        for (int i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 //
            // Però el segon element del for indica la condició de permanència, no de sortida. Quan la
            // condició de permanència no es compleix més, el blucle s'acaba.

            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma i s'arxiva a dalt a la variable suma
            }
        }
        if (suma == n) {  // si n es igual a la suma dels seus divisors, n és perfecte
            return true;
        } else {
            return false;
        }
    }
}
}
