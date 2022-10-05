package general.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Training1 {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        integerList = integerList.stream().map(e -> e*100).collect(Collectors.toList());

        System.out.println(integerList);






    }

}
