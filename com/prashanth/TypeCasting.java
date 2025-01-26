package com.prashanth;

public class TypeCasting {
    public static void main(String[] args) {
        double d=43.44;
        int i=(int)d;
//        The above code is an example of explicit type casting \
//        double is of larger datatype it cannot be stored in int datatype so we explicitly typecasted it to int we might loose date ie., 0.44 doesnot matter

        byte b=120;
        int j=b;
//        Here in the above code we are implicitly typecasting byte to int it is done by the compiler itself as int is of larger datatype than byte
//        for example : we can store half litre of water in 1 litre bottle.

        byte b1=120;
        short s=1200;
        int i1=12000;
        long l=120000;
        char c='a';
        float f=12.34f;
        double d1=12.34;

        double result = (f * b1) + (i1 * c) - (d1 * s);
        System.out.println((f * b1) + " + " + (i1 * c) + " - " + (d1 * s));
//        1480.8 + 1164000 - 14808.0  this is the output of statement of line 24  if we look at the output 1480.8 is the result of f*b1
//        Here f is float and b1 is byte so the result is float and the result is stored in float because float is of larger datatype than byte
//        similarly i1*c is of int datatype and the result is stored in int because int is of larger datatype than char
//        similarly d1*s is of double datatype and the result is stored in double because double is of larger datatype than short
//        so the final result is float + int - double so the result is of double datatype


        System.out.println(result);

        System.out.println(d);
        System.out.println(i);
        System.out.println(b);
        System.out.println(j);
    }
}
