package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        //capturando array nuevo
        int num[] = new int[5];

        for (int i = 0; i < num.length; i++) {

            System.out.println("digite número");
            num[i] = lectura.nextInt();

            System.out.println("el número es " + num[i]);

        }

        int index = 0;
        for (int num2 : num) {
            System.out.println(num2);
            num[index] = lectura.nextInt();
            System.out.println(num[index]);
            //index++;

        }

    }

}
   
//@FERNANDO OLIVEROS OCAMPO
