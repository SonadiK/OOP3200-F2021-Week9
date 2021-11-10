/**
 * @author: Sonadi Kannangara
 * @studentID: 100778336
 * @date: November, 8 2021
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    public static int NUM_OF_STRINGS = 5;

    /**
     * This method get a string from the console.
     * @param prompt a friendly message to show the user
     * @param object the object type to store the console input
     * @return the value from the console
     */
    //public static String getConsoleInput(String prompt)
    public static Object getConsoleInput(String prompt, Object object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        //System.out.println(object.getClass().getSimpleName());
        switch (object.getClass().getSimpleName())
        {
            case "String":
                return console.nextLine();

            case "Integer":
               return console.nextInt();

            case "Float":
                return console.nextFloat();

            default:
                return console.nextLine();
        }

        //return console.nextLine();
        //return (T) console.nextLine();
    }

    /**
     * This method prints the log to the console
     * @param log String array of input lines
     */
    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }
    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
        int intNumber = 0;
        float floatNumber = 0.0f;
        String stringInput = "";

        stringInput = (String) getConsoleInput("Enter a string: " , stringInput);
        System.out.println("Our string is: " + stringInput);

        stringInput = (String) getConsoleInput("Enter a second string: " , stringInput);
        System.out.println("Our second string is: " + stringInput);

        //getConsoleInput("Enter an Integer", intNumber);
        intNumber = (int) getConsoleInput("Enter an Integer: ", intNumber);
        System.out.println("Our integer is: " + intNumber);

        floatNumber = (float) getConsoleInput("Enter an Float Number: ", floatNumber);
        System.out.println("Our integer is: " + floatNumber);
        //Step 1. - Creating an empty space/ container for collection
        //String[] log = new String[NUM_OF_STRINGS];

        /*for (int i = 0; i < NUM_OF_STRINGS; i++)
        {
            log[i] = getConsoleInput("Enter your info: ");
        }
        printLog(log);*/

    }
}
