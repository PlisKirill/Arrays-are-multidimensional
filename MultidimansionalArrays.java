import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MultidimansionalArrays {
    public static final int SIZE = 8;
    public static final int CONST = SIZE -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        int[] point = {90, 180, 270};

        System.out.println("Выберите угол поворота:");
        for (int i = 0; i < point.length; i++){
            System.out.println(( i + 1 ) + ". " + point[i] + " градусов" );
        }
        System.out.println();

        System.out.print("Введите номер пункта: ");
        int pointNamber = scanner.nextInt();
        System.out.println();
        switch (pointNamber){
            case 1:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++){
                        rotatedColors[j][CONST - i] = colors[i][j];
                    }
                }
                printResult(colors, rotatedColors);
                break;
            case 2:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++){
                        rotatedColors[CONST - i][CONST - j] = colors[i][j];
                    }
                }
                printResult(colors, rotatedColors);
                break;
            case 3:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++){
                        rotatedColors[CONST - j][i] = colors[i][j];
                    }
                }
                printResult(colors, rotatedColors);
                break;
            default:
                System.out.println("Вы ошиблись, такого пункта нет. Перезапустите программу!");
                break;
        }
    }

    public static void printResult(int[][] colors, int[][] rotatadColors) {
        System.out.println("Дана следующая матрица:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Вывод:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                System.out.format("%4d", rotatadColors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Программа завершена!");
    }
}
