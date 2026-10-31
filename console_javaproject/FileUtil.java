package JavaProject;

import java.io.*;

public class FileUtil {

    public static void saveData(Object data, String fileName) {

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream(fileName));

            out.writeObject(data);
            out.close();

            System.out.println(fileName + " saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving " + fileName);
        }
    }


    public static Object loadData(String fileName) {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream(fileName));

            Object data = in.readObject();

            in.close();

            System.out.println(fileName + " loaded successfully.");

            return data;

        } catch (FileNotFoundException e) {

            System.out.println(fileName + " not found.");
            return null;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error while loading " + fileName);
            return null;
        }
    }
}