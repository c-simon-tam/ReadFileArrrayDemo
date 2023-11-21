import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String filename = input.nextLine().strip();

        int[] numbers = readFileIntoArray(filename);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
    public static int countLinesInFile(String nameOfFile) throws FileNotFoundException {

        File file = new File(nameOfFile);
        Scanner scanner = new Scanner(file);

        int lineCount = 0;
        while (scanner.hasNextLine()) {
            lineCount++;
            scanner.nextLine();
        }
        return lineCount;
    }

    public static int[] readFileIntoArray(String nameOfFile) throws FileNotFoundException {

        int linesInFile = countLinesInFile(nameOfFile);
        int[] array = new int[linesInFile];

        File file = new File(nameOfFile);
        Scanner scanner = new Scanner(file);

        int index = 0;
        while (scanner.hasNextLine()) {
            array[index++] = scanner.nextInt();
        }
        return array;
    }

}
