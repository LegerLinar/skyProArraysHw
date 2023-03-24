public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
//        // Объявите три массива:
//Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.1

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
//Массив, в котором можно хранить
// три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.

        double[] doubles = {1.57, 7.654, 9,986};

//        Произвольный массив. Тип и количество данных определите сами.
//        Самостоятельно выберите способ создания массива:
//        с помощью ключевого слова или сразу заполненный элементами.

        boolean[] booleans = new boolean[6];
    }

    public static void task2 () {
        System.out.println("Задача 2");
//        ... // Распечатайте на отдельной строчке элементы каждого
//        массива по порядку через запятую. В конце строки запятую ставить не надо.
        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 5;
        numbers[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        boolean[] booleans = new boolean[6];


        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1){
                System.out.println(numbers[i]);
            } else {
                System.out.printf(numbers[i] + ", ");
            }
        }


        for (int i = 0; i < doubles.length; i++) {
            if(i == doubles.length - 1){
                System.out.println(doubles[i]);
            } else {
                System.out.print(doubles[i] + ", ");
            }
        }


        for (int i = 0; i < booleans.length; i++) {
            if(i == booleans.length - 1){
                System.out.println(booleans[i]);
            } else{
                System.out.printf(booleans[i] + ", ");
            }
        }
    }

    public static void task3(){
        System.out.println("Задача 3");
//        Распечатайте на отдельной строчке элементы каждого массива в
//        обратном порядке через запятую. В конце строки запятую ставить не надо.
//Если в задаче № 2 в консоль у вас вывелся результат:
//1, 2, 3
//1.57, 7.654, 9.986
//// произвольные элементы третьего массива
//то в этой задаче результат должен быть таким:
//3, 2, 1
//9.986, 7.654, 1.57
//// произвольные элементы третьего массива в обратном порядке
        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 5;
        numbers[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        boolean[] booleans = new boolean[6];

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(numbers[i]);
            } else {
                System.out.printf(numbers[i] + ", ");
            }

        }

        for (int i = doubles.length - 1; i >= 0 ; i--) {
            if (i == 0){
                System.out.println(doubles[i]);
            } else {
                System.out.printf(doubles[i] + ", ");
            }
        }

        for (int i = booleans.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(booleans[i]);
            } else {
                System.out.printf(booleans[i] + ", ");
            }
        }
    }



}