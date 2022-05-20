import java.util.ArrayList;
import java.util.List;

public class HouiseTicket {
    public static void main(String[] args) {

        List<Integer> randomValues = new ArrayList<>();

        int[][] a = new int[3][9];

        // first column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 2) {
                int randomRow = (int) (Math.random() * 3);
                double random1 = Math.random() * 10;
                randomValues.add((int) random1);
                a[randomRow][0] = (int) random1;
            }
        }
        // second column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 4) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (20 - 11) + 11;
                randomValues.add((int) random1);
                a[z][1] = (int) random1;
            }
        }
        // third column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 6) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (30 - 21) + 21;
                randomValues.add((int) random1);
                a[z][2] = (int) random1;
            }
        }
        // fourth column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 8) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (40 - 31) + 31;
                randomValues.add((int) random1);
                a[z][3] = (int) random1;
            }
        }
        // fifth column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 10) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (50 - 41) + 41;
                randomValues.add((int) random1);
                a[z][4] = (int) random1;
            }
        }
        // sixth column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 12) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (60 - 51) + 51;
                randomValues.add((int) random1);
                a[z][5] = (int) random1;
            }
        }  // seventh column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 14) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (70 - 61) + 61;
                randomValues.add((int) random1);
                a[z][6] = (int) random1;
            }
        }
        // eight column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 16) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (80 - 71) + 71;
                randomValues.add((int) random1);
                a[z][7] = (int) random1;
            }
        }
        // ninth column
        for (int i = 0; i < 3; i++) {
            if (randomValues.size() < 18) {
                double random = Math.random() * 3;
                int z = (int) random;
                double random1 = Math.random() * (90 - 81) + 81;
                randomValues.add((int) random1);
                a[z][8] = (int) random1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(a[i][j] + "    ");
            }
            System.out.println("   ");
        }
    }

}
