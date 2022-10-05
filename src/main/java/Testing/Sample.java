package Testing;

import java.util.Collections;

public class Sample {

    public static void main(String[] args) {
        Employee e = new Employee(20, "Rambabu", 1000);
        Employee e2 = new Employee(21, "Rambabu", 2000);

        Collections.singletonList("BLR");


    }


    static class Employee {
        int age;
        String name;
        int salary;

        public Employee(int age, String name, int salary) {
            this.age = age;
            this.name = name;
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

}


