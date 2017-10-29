import java.util.Scanner;

public class exercici3 {

    import java.util.Scanner;

    public class Exercici3 {

        public static void main(String[] args) {

            System.out.println("Exercici 3");

            int i;
            int suma = 0;
            int n;

            Scanner sc = new Scanner(System.in);

            System.out.println("Introdueix un número per esbrinar si és perfecte: ");

            n = sc.nextInt();

            for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 //
                // Però el segon element del for indica la condició de permanència, no de sortida. Quan la
                // condició de permanència no es compleix més, el blucle s'acaba.

                if (n % i == 0) {
                    suma = suma + i;     // si es divisor se suma i s'arxiva a dalt a la variable suma
                }
            }
            if (suma == n) {  // si n es igual a la suma dels seus divisors, n és perfecte

                System.out.println("El número que has introduït és perfecte");
            } else {
                System.out.println("El número que has introduït no és perfecte");

            }




            // EXERCICI PRIMERS 100 NUMEROS PRIMERS

        /*
        // aquest tros de codi l'he agafat d'internet, es per mostrar tooots els numeros primers que hi ha de l'1 al 100
        int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
       for (i = 1; i <= 100; i++)
       {
          int counter=0;
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }
       }
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}
}
         */

        /*
        // EXERCICI PARELLS / IMPARELLS
        System.out.println("Escriu un numero per esbrinar si es parell.");
        double numb = 0;
        numb = (sc.nextDouble());
        if (numb % 2==0) {
            System.out.println ("El teu numero es parell.");
        } else {
            System.out.println("El teu numero es imparell.");
        } */


        }
    }
}
