package general.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@ToString
public class EmployeeJava8Practice2 {

    int age;
    double salary;
    String name;
    String city;


    public static void main(String[] args) {
        List<EmployeeJava8Practice2> employeeList = Arrays.asList(new EmployeeJava8Practice2[]{new EmployeeJava8Practice2(20, 20.10, "Damma", "London"), new EmployeeJava8Practice2(25, 45.00, "Jyo", "Delhi"), new EmployeeJava8Practice2(25, 45.00, "Jyo", "Delhi")});
        List<EmployeeJava8Practice2> c = employeeList.stream().collect(Collectors.partitioningBy(e -> e.salary > 21.00)).get(true);
        employeeList.sort(new Comparator<EmployeeJava8Practice2>() {
            @Override
            public int compare(EmployeeJava8Practice2 o1, EmployeeJava8Practice2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(c);

        System.out.println(employeeList.stream().collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.groupingBy(e -> e.getCity()))));


        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);

    }


}
