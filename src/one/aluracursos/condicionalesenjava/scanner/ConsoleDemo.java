package one.aluracursos.condicionalesenjava.scanner;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = null;
        String alpha = null;

        try {
            // creates a console object
            console = System.console();

            // if console is not null
            if (console != null) {

                // read line from the user input
                alpha = console.readLine("Name: ");

                // prints
                System.out.println("Name is: " + alpha);

                // read password into the char array
                char[] pwd = console.readPassword("Password: ");

                // prints
                System.out.println("Password length: "+pwd.length);
            }

        } catch(Exception ex) {
            // if any error occurs
            ex.printStackTrace();
        }
    }
}