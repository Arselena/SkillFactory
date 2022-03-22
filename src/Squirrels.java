import java.util.Calendar;
import static java.lang.Math.abs;

public class Squirrels {

    int countNuts = 0;
    int countDiamonds = 0;
    int countNutsOfWeek = 0;
    Calendar calendar;
    String name;

    public Squirrels(String name) {
        this.name = name;
    }

    public void goWork(Calendar calendar, int amountOfDays) {
        this.calendar = calendar;
        while (amountOfDays != 0) {
            // белочка раскалывает в день countNutsOfDay = (abs(месяц - день недели)) орехов
            int countNutsOfDay = abs(this.calendar.get(Calendar.MONTH) - this.calendar.get(Calendar.DAY_OF_WEEK));

            // в цикле белка раскалывает countNutsOfDay орехов
            for (int i = 0; i < countNutsOfDay; i++) {
               nibblingNuts(new Nut());
            }
            this.calendar.add(Calendar.DATE, 1);
            amountOfDays--; // уменьшаем кол-во дней
        }
    }

    public void nibblingNuts(Nut nut){
        // увеличиваем счетчик орехов в неделю и всего орехов
        countNutsOfWeek = (this.calendar.get(Calendar.DAY_OF_WEEK) == 1) ? 1 : countNutsOfWeek+1;
        countNuts += 1;

        if (nut.isDiamond(calendar, countNutsOfWeek) == true){
            countDiamonds += 1;
        }
    }
}

