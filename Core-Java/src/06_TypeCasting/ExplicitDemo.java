
/*
 * For explicit type casting, a developer
 * has to write the target data type within
 * the parenthesis
 */

public class ExplicitDemo {
    public  static  void main(String[] args){

        double d = 35.298298298298298298;
        float f = (float) d ;
        System.out.println("double : " + d + " converted to float : " + f);
        byte b = 121;
        char ch = (char) b;
        System.out.println("byte : " + b + " converted to char : " + ch);

        float x = 4.534F;
        int k = (int) x;
        System.out.println("float : " + x + " converted to int : " + k);

    }
}