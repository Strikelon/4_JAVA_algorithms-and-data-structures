package hmJava3.GrokaemAlgoritms.dz.homework5;

import hmJava3.ExampleMaskTread;

public class Exponentiation {

    public static void main(String[] args){

        System.out.println(exponention(2,32));

        System.out.println(exponention(3,5));

        System.out.println(exponention(15,4));

    }


    public static long exponention(long a, int b){

        if(b < 0){

            throw new IllegalArgumentException("b argument must be positive");

        }else if(b == 0){

            return 1;

        }else {

            return a * exponention(a,b-1);

        }

    }

}
