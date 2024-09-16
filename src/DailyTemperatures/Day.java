package DailyTemperatures;

public class Day implements Comparable<Day> {
    public int index;
    public int temp;

    public Day(int index, int temp) {
        this.index = index;
        this.temp = temp;
    }

    @Override
    public int compareTo(Day o) {
        return (this.temp - o.temp);
    }
}
