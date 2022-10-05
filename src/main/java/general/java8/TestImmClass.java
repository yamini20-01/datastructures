package general.java8;

import java.util.Random;

public class TestImmClass {

    public static void main(String[] args) {
/*
        ImmClass immClass = new ImmClass(20, "Ram");

        ImmClass immClass1 = new ImmClassChile(20, "ss");
        immClass1.getAge();*/

/*        Random random = new Random();


        String alphaString = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int inr = random.nextInt(alphaString.length());
            sb.append(alphaString.charAt(inr));
        }
        System.out.println(sb.toString());*/
        //System.out.println("baZ".hashCode());
       // System.out.println("bda".hashCode());


        Match m = new ODIMatch();
        System.out.println(m.matchId);


    }


}
