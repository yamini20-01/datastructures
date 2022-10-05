package general.BFS;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] oranges = {{2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
    //Extra boolean variable and update each orange two for loops
        int timeFrames = 0;
        boolean stillRotting = false;
        for (int i = 0; i < oranges.length; i++) {
            for (int j = 0; j < oranges[i].length; j++) {
                if (oranges[i][j] == 2) {
                    if (i < oranges.length - 1 && oranges[i + 1][j] == 1) {
                        stillRotting = true;
                        oranges[i + 1][j] = oranges[i + 1][j] + 1;
                    }
                    if (i > 0 && oranges[i - 1][j] == 1) {
                        stillRotting = true;
                        oranges[i - 1][j] = oranges[i - 1][j] + 1;
                    }
                    if (j < oranges[i].length - 1 && oranges[i][j + 1] == 1) {
                        stillRotting = true;
                        oranges[i][j + 1] = oranges[i][j + 1] + 1;
                    }
                    if (j > 0 && oranges[i][j - 1] == 1) {
                        stillRotting = true;
                        oranges[i][j - 1] = oranges[i][j - 1] + 1;
                    }
                }
            }
            if (stillRotting == false) {
                System.out.println("All Oranges rottened");
                break;
            }
            stillRotting = false;
            timeFrames++;
        }
        for (int i = 0; i < oranges.length; i++) {
            for (int j = 0; j < oranges[i].length; j++) {

                // If any orange is found to be
                // not rotten then ans is not possible
                if (oranges[i][j] == 1)
                    timeFrames = -1;
            }
        }

        System.out.println(timeFrames);


    }

}
