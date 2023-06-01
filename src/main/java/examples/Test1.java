package examples;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String name = "Carl";
//        System.out.println("Hello " + name);
//
//        String name2 = "Vasya";
//        Integer age = 27;
//        Float height = 178.5F;
//        Boolean student = true;
//
//        System.out.println(name2);
//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(student);
//
//        System.out.println("Hello " + name);
//        System.out.println("age: " + age);
//        System.out.println("height: " + height);
//        System.out.println("is student: " + student);


        String value_1 = "13";
        String value_2 = "23";
        System.out.println(value_1 + value_2);

        String value_3 = "13";
        String value_4 = "23";
        System.out.println(Integer.parseInt(value_3) + Integer.parseInt(value_4));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите свое имя");
        String name = scanner.nextLine();

        System.out.println("Укажите возраст");
        Integer age = scanner.nextInt();
        System.out.println("Вы студент");
        Boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Age: " + age);
        System.out.println("is student: " + isStudent);





    }

}


