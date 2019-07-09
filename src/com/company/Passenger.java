package com.company;

import java.util.Scanner;

public class Passenger {
    Scanner input = new Scanner(System.in);
    private int x;
    private int Bplace,Dplace,no,ano;

    public void inputdetail()
    {
        System.out.print("Enter your Train number: ");
        x = input.nextInt();

        System.out.print("Enter your Boarding place no: ");
        Bplace = input.nextInt();

        System.out.print("Enter your Destination place no: ");
        Dplace = input.nextInt();

        System.out.print("Enter your Number of passengers. ");
        no = input.nextInt();

        if(no > 1)
        {
            System.out.print("Enter no of Adults: ");
            ano = input.nextInt();
        }


    }

}
