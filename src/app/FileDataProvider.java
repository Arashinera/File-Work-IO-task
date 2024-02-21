package app;

import java.util.Locale;
import java.util.Scanner;

public class FileDataProvider {

    public static String fileText;
    public static String fileTitle;

    public static void getFileWriteData() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Input file name, e.g. readme: ");
        fileTitle = input.nextLine();

        System.out.println("Input your file text: ");
        fileText = input.nextLine();
    }

    public static String getFileReadData() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.print("Input file name, e.g. readme: ");

        return input.nextLine();
    }
}
