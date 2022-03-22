import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        //создаем белку
        Squirrels squirrels1 = new Squirrels("Mary");
        Squirrels squirrels2 = new Squirrels("Alis");

        // передаем с какого числа белочка начала работать и сколько дней она работала
        squirrels1.goWork(new GregorianCalendar(2022, 2 , 20), 14);
        squirrels2.goWork(new GregorianCalendar(2022, 2 , 20), 21);

        System.out.println("Белка " + squirrels1.name + " расколола " + squirrels1.countNuts + " орехов. Нашла " + squirrels1.countDiamonds + " бриллиантов");
        System.out.println("Белка " + squirrels2.name + " расколола " + squirrels2.countNuts + " орехов. Нашла " + squirrels2.countDiamonds + " бриллиантов");
    }
}