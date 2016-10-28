package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double Lenght;
        double Height;
        double Width;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wymiary kuchni");
        System.out.println("Podaj wysokosc");
        Height = scanner.nextDouble();

        System.out.println("Podaj Dlugosc");
        Lenght = scanner.nextDouble();

        System.out.println("Podaj Szerokosc");
        Width = scanner.nextDouble();


	    Room kitchen = new Room(Lenght,Height,Width);

        System.out.println("Podaj wymiary Lazienki");
        System.out.println("Podaj wysokosc");
        Height = scanner.nextDouble();

        System.out.println("Podaj Dlugosc");
        Lenght = scanner.nextDouble();

        System.out.println("Podaj Szerokosc");
        Width = scanner.nextDouble();

        Room bathroom = new Room(Lenght,Height,Width);

        System.out.println("Podaj wymiary Pokoju dzinnego");
        System.out.println("Podaj wysokosc");
        Height = scanner.nextDouble();

        System.out.println("Podaj Dlugosc");
        Lenght = scanner.nextDouble();

        System.out.println("Podaj Szerokosc");
        Width = scanner.nextDouble();

        Room livingRoom = new Room(Lenght,Height,Width);

        System.out.println("Kuchnia :");
        System.out.println("Objetosc : " + kitchen.Objetosc());
        System.out.println("Powierzchnia Scian : " + kitchen.PowierzchniaScian());
        System.out.println("Powierzchnia Podloig : " + kitchen.PowierzchniaPodlogi());
        System.out.println("Powierzchnnia Scian : " + kitchen.PowierzchniaScian());
        System.out.println("Koszt Podlogi : " + kitchen.KosztPodlogi());
        System.out.println("Koszt malowania scian : " + kitchen.KosztMalowania());

        System.out.println("Lazienka :");
        System.out.println("Objetosc : " + bathroom.Objetosc());
        System.out.println("Powierzchnia Scian : " + bathroom.PowierzchniaScian());
        System.out.println("Powierzchnia Podloig : " + bathroom.PowierzchniaPodlogi());
        System.out.println("Powierzchnnia Scian : " + bathroom.PowierzchniaScian());
        System.out.println("Koszt Podlogi : " + bathroom.KosztPodlogi());
        System.out.println("Koszt malowania scian : " + bathroom.KosztMalowania());

        System.out.println("Pokoj dzienny :");
        System.out.println("Objetosc : " + livingRoom.Objetosc());
        System.out.println("Powierzchnia Scian : " + livingRoom.PowierzchniaScian());
        System.out.println("Powierzchnia Podloig : " + livingRoom.PowierzchniaPodlogi());
        System.out.println("Powierzchnnia Scian : " + livingRoom.PowierzchniaScian());
        System.out.println("Koszt Podlogi : " + livingRoom.KosztPodlogi());
        System.out.println("Koszt malowania scian : " + livingRoom.KosztMalowania());


        PrintWriter out = new PrintWriter("TextFile.txt");

        out.println("Kuchnia :");
        out.println("Objetosc : " + kitchen.Objetosc());
        out.println("Powierzchnia Scian : " + kitchen.PowierzchniaScian());
        out.println("Powierzchnia Podloig : " + kitchen.PowierzchniaPodlogi());
        out.println("Powierzchnnia Scian : " + kitchen.PowierzchniaScian());
        out.println("Koszt Podlogi : " + kitchen.KosztPodlogi());
        out.println("Koszt malowania scian : " + kitchen.KosztMalowania());

        out.println("Lazienka :");
        out.println("Objetosc : " + bathroom.Objetosc());
        out.println("Powierzchnia Scian : " + bathroom.PowierzchniaScian());
        out.println("Powierzchnia Podloig : " + bathroom.PowierzchniaPodlogi());
        out.println("Powierzchnnia Scian : " + bathroom.PowierzchniaScian());
        out.println("Koszt Podlogi : " + bathroom.KosztPodlogi());
        out.println("Koszt malowania scian : " + bathroom.KosztMalowania());

        out.println("Pokoj dzienny :");
        out.println("Objetosc : " + livingRoom.Objetosc());
        out.println("Powierzchnia Scian : " + livingRoom.PowierzchniaScian());
        out.println("Powierzchnia Podloig : " + livingRoom.PowierzchniaPodlogi());
        out.println("Powierzchnnia Scian : " + livingRoom.PowierzchniaScian());
        out.println("Koszt Podlogi : " + livingRoom.KosztPodlogi());
        out.println("Koszt malowania scian : " + livingRoom.KosztMalowania());

        out.flush();
        out.close();
    }
}

class Room
{
    public double Lenght;
    public double Height;
    public double Width;
    public static int KosztPodlogi = 25;
    public static int KosztMalowania = 14;

    public Room(double lenght, double height, double width)
    {
        Lenght = lenght;
        Height = height;
        Width = width;
    }

    public double Objetosc()
    {
        return Lenght*Height*Width;
    }

    public double PowierzchniaScian()
    {
        return (2*(Lenght+Height))+(2*(Width+Height));
    }

    public double PowierzchniaPodlogi()
    {
       return 2*(Width+Lenght);
    }

    public double KosztMalowania()
    {
        return KosztMalowania*PowierzchniaScian();
    }

    public double KosztPodlogi()
    {
        return KosztPodlogi*PowierzchniaPodlogi();
    }
}

class RoomException extends Exception
{
    public String Number;
    public String Message;

    public RoomException(String number, String message)
    {
        Number = number;
        Message = message;
    }
}