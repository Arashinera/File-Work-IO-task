package app;

import utils.DataOutput;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class FileDataView {
    public static int choice;

    public static void Choice() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        do {
            try {
                System.out.println("""
                        Tell me what do you want to do?
                        1) Create and write file
                        2) Read File""");
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Your choice must be Integer Value.");
                break;
            }
        } while (choice < 1 || choice > 2);

        if (choice == 1) {
            FileDataProvider.getFileWriteData();
            DataOutput.getOutput(FileWriteService.handleData());
        } else {
            DataOutput.getOutput(FileReadService.getFileData(FileDataProvider.getFileReadData()));
        }

    }
}
