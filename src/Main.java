import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static int defineMinimum (int a, int b) {
        return Math.min(a,b);
    }
    public static void task1(){
        System.out.println("Задача 1");
        int one = 8;
        int two = 4;
        int min = defineMinimum(one, two);
        System.out.println(min);
    }
    public static boolean isEvenNumber (int a) {
        return a %2 == 0;
    }
    public static void task2 (){
        System.out.println("Задача 2");
        int number = 4;
        boolean result = isEvenNumber(number);
        System.out.println(result);
    }
    public static long squareNumber (int a) {
        return (long) Math.pow(a, 2);
    }
    public static void task3(){
        System.out.println("Задача 3");
        int num = 5;
        System.out.println(squareNumber(num));
    }
    public static long cubNumber (int a) {
        return (long) Math.pow(a, 3);
    }
    public static void task4() {
        System.out.println("Задача 4");
        int num = 5;
        System.out.println(cubNumber(num));
    }
    public static boolean is10(int a) {
        return a >=10;
    }
    public static void task5() {
        System.out.println("Задача 5");
        int num = 5;
        System.out.println(is10(num));
    }
    public static int[] sort (int[] nums){
        Arrays.sort(nums);
        System.out.println(nums);
        return nums;
    }
    public static void task6(){
        System.out.println("Задача 6");;
        int[] anna ={1, 5, 2, 10, 8, 7};
        int[] news = sort(anna);
        System.out.println(news);

    }
    public static void task7() {
        int num = (int) Math.random();
        System.out.println(num);
    }

}