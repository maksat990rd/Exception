package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Viberite iz spiska:  parallelepiped  sfera  celindr  konus");
while (true) {
    switch (scanner.nextLine().toLowerCase(Locale.ROOT)) {
        case "parallelepiped":
            try {
                System.out.println("Vvedite dlinu: ");
                int length = scanner.nextInt();
                if (length < 0) {
                    throw new MyException("Otricatelnoe chislo nepozvolitelno!");
                }
                if (length > 20) {
                    throw new MyException("Dlina ne doljna sostavliat bolshe 20");
                }
                System.out.println("Vvedite razmer shirini: ");
                int width = scanner.nextInt();
                if (width < 0) {
                    throw new MyException("Otricatelnoe chislo v shirine ne pozvolitelno!");
                }
                if (width > 20) {
                    throw new MyException("Dlina shirini ne doljna privishat 20ti");
                }
                System.out.println("Vvedite visotu: ");
                int height = scanner.nextInt();
                if (height < 0) {
                    throw new MyException("Visota ne doljna prinimat otricatelnoe chislo");
                }
                if (height > 20) {
                    throw new MyException("Visota ne doljna privishat 20ti");
                }
                Parallelepiped para = new Parallelepiped(length, width, height);
                para.area();
                para.volume();

            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e1) {
                System.out.println("Vvvodit bukvi zapresheno!");
            }
            break;
        case "sfera":
            try {
                System.out.println("Vvedite radius: ");
                int radius = scanner.nextInt();
                if (radius < 0) {
                    throw new MyException("Radius ne doljna bit nije nulia!");
                }
                if (radius > 30) {
                    throw new MyException("Radius ne doljna privishat 30ti");
                }
                Sfera sfera = new Sfera(radius);
                sfera.sfera();
                sfera.volume();

            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e1) {
                System.out.println("Vvedite chisla pojaluysta!");
            }
            break;
        case "celindr":
            try {
                System.out.println("Vvedite radius celindra: ");
                int radius = scanner.nextInt();
                if (radius < 0) {
                    throw new MyException("Radius ne doljna bitt nijenulia");
                }
                if (radius > 30) {
                    throw new MyException("Radius ne doljna privishat 30ti");
                }
                System.out.println("Vvedite visotu: ");
                int visota = scanner.nextInt();
                if (visota < 0) {
                    throw new MyException("Visota ne doljna bit nuje nulia!");
                }
                if (visota > 30) {
                    throw new MyException("Visota ne doljna bit vishe 30ti");
                }
                Celindr celindr = new Celindr(radius, visota);
                celindr.area();
                celindr.volume();

            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e1) {
                System.out.println("Vvodite chisla pojaluysta!");
            }
            break;
        case "konus":
            try {
                System.out.println("Vvedite radius");
                int radius = scanner.nextInt();
                if (radius < 0) {
                    throw new MyException("Radius ne doljen bit nuje nulia");
                }
                if (radius > 30) {
                    throw new MyException("Radius ne doljen previshat 30ti");
                }
                System.out.println("Vvedite visotu");
                int visota = scanner.nextInt();
                if (visota < 0) {
                    throw new MyException("Visota ne doljna bit nije nulia");
                }
                if (visota > 30) {
                    throw new MyException("Visota ne doljna previshat 30ti");
                }
                Konus konus = new Konus(radius, visota);
                konus.Area();
                konus.Volume();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e1) {
                System.out.println("Vvedite chisla pojaluysta!");
            }
            break;
        default:
            System.out.println("Viberite iz spiska:  parallelepiped  sfera  celindr  konus");
    }

}

    }
}