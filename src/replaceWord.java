import java.util.Arrays;
import java.util.Scanner;
    /*  pseudocode:
        Declare string and string array variables.
        prompt user to enter or quit using 'q'.
        use while loop with a condition stop the loop if user enter q.
        copy the txt into array using split method.
        using for loop check the txt if the txt contain the word "the" or not.
        If the txt contain "the" replace with "BE".
        After we check everything using another for loop print the updated string.
        finally we ask the user to enter another word or to quit the loop.
     */

public class replaceWord {
    public static void main(String[] args){
        String txt;
        String txt_arr [];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your text or 'q' to quit: ");
        txt = sc.nextLine();

        while (!(txt.equalsIgnoreCase("q"))){

            txt_arr = txt.split(" ");

            for(int x = 0; x < txt_arr.length; x++){

                if(txt_arr[x].equalsIgnoreCase("the")){
                    txt_arr[x] = "BE";
                }
            }

            for (int x = 0; x < txt_arr.length; x++) {
                System.out.print(txt_arr[x] + " ");
            }
            System.out.println();
            System.out.println("Enter Your text or 'q' to quit: ");
            txt = sc.nextLine();
        }
        System.out.println("Thank you for using this program.");
    }
}
