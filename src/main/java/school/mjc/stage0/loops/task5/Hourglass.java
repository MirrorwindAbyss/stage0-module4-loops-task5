package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i && j < height - i || j >= height - i - 1 && j <= i) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
