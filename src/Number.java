

public class Number implements Comparable {
    private int value;

    public Number(int newValue){
        value = newValue;
    }

    @Override
    public int compareTo(Object o) {
        int result;

        int valueFirst = ((Number)o).getValue();

        result = value;

        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }
}
