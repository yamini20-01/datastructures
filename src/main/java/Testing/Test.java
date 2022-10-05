package Testing;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test");
        String input = "-12/369/--8/5/11221/3";

        //convert to char arra


        List<Frame> frames = new ArrayList<>();
        Frame prevFrame = null;
        Frame f = new Frame(-1, -1);
        int extraRoll = 0;
        for (int i = 0; i < input.length(); ) {
            int firstRoll = -1;
            int secondRoll = 0;

            try {
                firstRoll = Integer.parseInt(String.valueOf(input.charAt(i)));
                i = i + 1;
            } catch (Exception e) {
                if (input.charAt(i) == 'X') {
                    f = new Frame(10, 0);
                    frames.add(f);
                    i = i + 1;
                    continue;
                }
                if (input.charAt(i) == '-') {
                    firstRoll = 0;
                    i = i + 1;
                }
            }

            try {

                secondRoll = Integer.parseInt(String.valueOf(input.charAt(i)));
                i = i + 1;
            } catch (Exception e) {

                if (i < input.length() && input.charAt(i) == '-') {
                    secondRoll = 0;

                }
                if (i < input.length() && input.charAt(i) == '/') {
                    firstRoll = 0;
                    secondRoll = 10;
                }  i = i + 1;
            }
            f = new Frame(firstRoll, secondRoll);
            frames.add(f);
        }

        if(input.length() >20){
            try {
                extraRoll = Integer.parseInt(String.valueOf(input.charAt(20)));
            } catch (Exception e) {

                if ( input.charAt(20) == '-') {
                    extraRoll = 0;
                }
                if ( input.charAt(20) == '/') {
                    extraRoll = 10;
                }
                if ( input.charAt(20) == 'X') {
                    extraRoll = 10;
                }
            }
        }

        System.out.println(frames.size());
        System.out.println(frames);
        int sumOfScores = 0;

        for (int i = 0; i < 11; i++) {
            int firstRollScore = frames.get(i).getFirstRoll();
            int secondRoll = frames.get(i).getSecondRoll();

            if (firstRollScore == 10) {
                sumOfScores = sumOfScores + firstRollScore + frames.get(i + 1).getFirstRoll() + frames.get(i + 1).getSecondRoll();
            } else if (secondRoll == 10) {
                sumOfScores = sumOfScores + firstRollScore + secondRoll + frames.get(i + 1).getFirstRoll();
            } else {
                sumOfScores = sumOfScores + firstRollScore + secondRoll;
            }
            if(i ==10 & extraRoll>0){
                sumOfScores = sumOfScores +extraRoll;
            }
        }



        System.out.println(sumOfScores);


    }
}
