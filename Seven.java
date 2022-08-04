import java.util.ArrayList;
import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        ArrayList<String>pitches=new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String result=String.join(" ",pitches);
        System.out.println(result);
    }
}