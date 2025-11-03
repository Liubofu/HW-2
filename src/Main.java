//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи 1,2,3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(" Общая масса " + "= " + totalWeight + " кг");

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(" Разница в массе " + "= " + differenceWeight + " кг");

        System.out.println("Задача 7");

        var balanceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(" Остаток от деления " + "= " + balanceWeight + " кг");

        System.out.println("Задача 8");

        var totalWorkTime = 640;
        var oneEmployeeTime = 8;
        var stuff = totalWorkTime / oneEmployeeTime;
        System.out.println(" Всего работников в компании " + "- " + stuff + " человек");

        var totalStuff = stuff + 94;
        var workTime = oneEmployeeTime * totalStuff;
        System.out.println(" Если в компании работает " + totalStuff + " человека," + " то всего " + workTime + " часов работы может быть поделено между сотрудниками.");

    }
}
