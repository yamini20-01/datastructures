package general.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Dog", "Cat", "Pig", "Giraffe");


        List<Animal> list = animals.stream().map(s -> new Animal(s)).collect(Collectors.toList());

        System.out.println(list);

        String[] array = {"Geeks", "for", "Geeks"};

        // The result of the reduce() method is an Optional because the list on which reduce() is called may be empty.
        String combinedString = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2).get();
        System.out.println(combinedString);

        Integer[] intArray = {1, 2, 3};

        Optional sum = Arrays.stream(intArray).reduce(Integer::sum);
        System.out.println(sum
        );
        List<Employee> empList = Arrays.asList(new Employee[]{new Employee(10), new Employee(20), new Employee(30)});
        empList.stream().forEach(e -> e.setSalary(e.getSalary() + 40));
        System.out.println(empList);


        Map<String,Integer> map = new HashMap<String,Integer>(){
            {
                put("Rambabu",1);put("Jyothi",3);put("Nirvik",2);
            }
        };




    }


    static class Employee {
        Integer salary;

        public Employee(int salary) {
            this.salary = salary;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "" + salary;
        }
    }

}
