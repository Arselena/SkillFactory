import java.util.Calendar;
// если номер расколотого ореха в квадрате совпадает с днем недели, то там бриллиант
public class Nut {
    public boolean isDiamond(Calendar calendar, int num) {
        if (calendar.get(Calendar.DAY_OF_WEEK) == Math.pow(num, 2)) {
            return true;
        }
        return false;
    }
}
