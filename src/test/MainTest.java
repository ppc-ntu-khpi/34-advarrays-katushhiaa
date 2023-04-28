package test;

import domain.Main;
import java.util.Scanner;

/**
 *
 * @author kanur
 */
public class MainTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть кількість рядків матриці: ");
        int rows = input.nextInt();
        System.out.print("Введіть кількість стовпців матриці: ");
        int cols = input.nextInt();

        Main.MatrixSumOutput(rows, cols);
    }
}
