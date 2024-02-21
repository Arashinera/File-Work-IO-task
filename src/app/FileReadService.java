package app;

import utils.Const;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {
    public String readFile(String fileTitle) {

        try (final BufferedReader br =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(
                                             Const.BASE_PATH_IN +
                                                     fileTitle + ".txt")))) {

            String line;

            StringBuilder stringBuilder = new StringBuilder();

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            return stringBuilder.toString();
        } catch (IOException exception) {
            return exception.getMessage();
        }
    }

    public static String getFileData(String file) {
        return new FileReadService().readFile(file);
    }
}
