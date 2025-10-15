public class Escape {
    public static void main(String[] args) {
        System.out.println("Hello \"Sudhanshu\"");

        /*agar aap bina backslash lgaye
        "" ye lagyenge to error aayega bcz string toh compiler ke liye star ho chuki thi fir aapne end kr diya
        jisse ek dum se compiler confuse hogya so use escape function to demonstrate anything in the double inverted
        commas in the print function*/

        System.out.println("Hello \\Sudhanshu\\"); /*Isse name ke aage peeche backslash aa jayega*/


        System.out.println("Hello \n Sudhanshu"); /*Prints sudhanshu in the next line*/

        System.out.println("Hello \tSudhanshu"); /*Gives a space of tab*/
        System.out.println("Hello\bSudhanshu"); /*Ek character peeche le jayega*/
    }
}
