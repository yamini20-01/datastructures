package general.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@ToString
public class EmployeeJava8Practice {

    int age;
    BigDecimal salary;
    String name;


    public static void main(String[] args) {
        List<EmployeeJava8Practice> employeeList = Arrays.asList(new EmployeeJava8Practice[]{new EmployeeJava8Practice(20, new BigDecimal(20.10), "Damma"), new EmployeeJava8Practice(25, new BigDecimal(45.00), "Jyo")});

        List<BigDecimal> listSalaries = employeeList.stream().map(e -> e.salary).collect(Collectors.toList());
        BigDecimal total = listSalaries.stream().reduce((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2)).get();


        List<EmployeeJava8Practice> listEmp = employeeList.stream().map(e -> {
            EmployeeJava8Practice e1 = new EmployeeJava8Practice(e.age, e.salary, e.name + "SS");
            return e1;
        }).collect(Collectors.toList());
        System.out.println(listEmp);

        employeeList.forEach(e -> e.setName(e.getName() + "********"));
        employeeList.forEach(System.out::println);




        System.out.println(total);


    }


}
