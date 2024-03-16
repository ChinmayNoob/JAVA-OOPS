package JAVA;
//never name your class by the name of the variables XD
public class Strings {
    public static void main(String[] args) {
        String message="Staring at the ceiling in the dark";
        String message2="Same Old Empty Feeling in my heart"+"!";
        System.out.println(message);
        System.out.println(message2);

        System.out.println(message + "\n" + message2);


        int size=message2.length();
        System.out.println(size);

        String message3=message.concat(" "+message2);
        String message4=message.concat(message2);
        System.out.println(message3);
        System.out.println(message4);

        System.out.println(message3.compareTo(message4));
        //negative number in output , reason below 
        //         A negative integer if the first string is lexicographically less than the second string.
        //         Zero if the strings are equal.
        //         A positive integer if the first string is lexicographically greater than the second string.

        System.out.println(message.indexOf("ceiling"));

        System.out.println(message3.replace("Empty", "full"));

        // does not modify the original string 

        System.out.println(message4.toLowerCase());

        String newstr="     Chinmay Noob           ";

        System.out.println(newstr.trim());
        //trim the extra spaces 
        //clears the after and before space of last and first words of the strings respectively 





    }
    
}
