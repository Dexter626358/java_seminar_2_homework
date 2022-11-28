import org.json.simple.parser.ParseException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ParseException {
        //int[] array = {3, 5, 10, 1, 23, 12, 45, 0, 200, 79, 23, 46, 123, 1};
        String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"18\"}";
        //System.out.println(Arrays.toString(array));
        //BubbleSort.getSortedArray(array);
        //System.out.println(Arrays.toString(array));
        SqlRequest.getSQL(jsonString);
    }
}