package com.company;

import java.util.Scanner;

public class TVMachine {
    Scanner input = new Scanner(System.in);

    public void welcome()
    {
        int y;
        System.out.print("\n\nWelcome to the Ticket Vending machine.\n\n"+
                        "Enter 1 to get the ticket from this machine.\n" +
                "Enter 0 to exit the program.\n"+
        "Enter Your choice: ");
        y = input.nextInt();
        if(y == 1)
        {
            Passenger x = new Passenger();
            x.inputdetail();
        }
        else if(y == 0)
        mainmenu();
        else
        {
            System.out.print("Sorry you entered wrong value.\n");
            welcome();
        }
    }

    public void mainmenu()
    {
        int x;

        System.out.print("\n\nEnter 1 to log in as Operator.\n"+
                         "Enter 2 to log in as Passenger.\n"+
                         "Enter 3 to exit.\n"+
                            "Enter your choice: ");
        x = input.nextInt();

        if(x == 1)
        {
            report myreport = new report();
        }
        else if(x == 2)
        {
            welcome();
        }
        else if(x == 3);
        else
        {
            System.out.print("Sorry no operation for you value.\n");
            mainmenu();
        }
    }

}