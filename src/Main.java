public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);// Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);        // Пишем код для задачи 3
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);// Пишем код для задачи 4
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);// Пишем код для задачи 5
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers = boxer1 + boxer2;
        var boxers3 = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + boxers + " кг!");
        System.out.println("Разница между весами боксеров " + boxers3 + " кг!");


    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers3 = boxer2 - boxer1;
        var baxers4 = boxer2 % boxer1;
        System.out.println("Разница между весами боксеров " + boxers3 + " кг!");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var totalHours = 640;
        var oneWorker = 8;
        var totalWorker = totalHours / oneWorker;
        System.out.println("«Всего работников в компании — " + totalWorker + " человек»");
        totalWorker = totalWorker + 94;
        totalHours = totalWorker * oneWorker;
        System.out.println("«Если в компании работает " + totalWorker + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками»");
    }

}