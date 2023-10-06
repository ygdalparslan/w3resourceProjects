package JavaMethodExercises;
/*
9. Write a Java method to print characters between two characters (i.e. A to P).
Note: Prints 20 characters per line

Expected Output:

( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z
 */

public class Exercise09 {
    public static void main(String[] args) {

        printCharacters('(','z',20);
    }

    public static void printCharacters(char chr1, char chr2, int n){

        for (char chr = chr1;  chr<=chr2 ; chr++) {

            System.out.print(chr+" ");
            if ((chr-chr1+1)%n==0) {
                System.out.println();
            }

        }

    }
}
