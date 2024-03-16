package JAVA;

public class Types {
    public static void main(String[] args) {
        int age=69,temp=37;

        // different types of printing formats 
        System.out.println(age);
        System.out.println(temp);
        System.out.println(temp+" "+age);
        System.out.printf("%d age and %d temperature",age,temp);
        System.out.println(String.format("%d and %s are age and temperature respectively",age,temp));
        System.err.println("");

        // two types 
        // 1. Primitive-for storing simple values (byte,short,int,long,float,double,char,boolean)
        byte newAge=30;
        System.out.println(newAge);
        // int views =3123456789 -> error becuase number is too large 
        // long views=3123456789 -> still error coz compiler thinks this is still int 

        long views =3_123_456_789L;
        System.out.println(views);

        float price=99.99F;
        // use F as a suffix because the compiler thinks of decimal as double as default 

        System.out.println(price);

        char letter='C';
        System.out.println(letter);
        // 2. Reference-for storing complex objects

    }
    
}
