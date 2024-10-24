
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ElevenPointSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try (Scanner fileScanner = new Scanner(file)) {
            int rowNum = 1;

            // Process each row
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();

                if (line.isEmpty()) {
                    // If the row is blank, print zero as the average
                    System.out.println("Row " + rowNum + " average: 0.0");
                } else {
                    // Calculate the average of numbers in the row
                    try (Scanner lineScanner = new Scanner(line)) {
                        double sum = 0;
                        int count = 0;

                        while (lineScanner.hasNextDouble()) {
                            sum += lineScanner.nextDouble();
                            count++;
                        }

                        if (count > 0) {
                            double average = sum / count;
                            System.out.println("Row " + rowNum + " average: " + average);
                        } else {
                            // If no valid numbers were found in the row, treat it as blank
                            System.out.println("Row " + rowNum + " average: 0.0");
                        }
                    } catch (InputMismatchException e) {
                        // This should not happen because we handle line parsing separately
                        System.out.println("Error in row " + rowNum + ": Invalid data.");
                    }
                }

                rowNum++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name and try again.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

