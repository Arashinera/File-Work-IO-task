package app;

import utils.Const;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String handleFile(String fileTitle, String fileText) {

        try (FileOutputStream fileOutput = new FileOutputStream(Const.BASE_PATH_OUT + fileTitle + ".txt")) {
            byte[] byteArray = fileText.getBytes();
            fileOutput.write(byteArray, 0, byteArray.length);
        } catch (IOException exception) {
            return exception.getMessage();
        }

        return "The file was created and handled";
    }

    public static String handleData() {
        return new FileWriteService().handleFile(FileDataProvider.fileTitle, FileDataProvider.fileText);
    }
}
