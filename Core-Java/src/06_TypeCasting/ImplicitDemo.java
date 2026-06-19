/*
Implicit type casting will be be done
automaticaly by Java
 */

public class ImplicitDemo {
    public static void main(String[] args){

        byte b = 125;
        int x = b ;
         System.out.println("byte: "+ b + "convert to int :" + x);
        int k = 25441;
        float f = k;
        System.out.println("int : " + k + " converted to float : " + f);

        char ch = '#';
        int z = ch;
        System.out.println("char : " + ch + " converted to int : " + z);


    }
}