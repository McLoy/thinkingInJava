package arrays;

/**
 * Created by Ostin on 22.11.2015.
 */
import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(
                new CompType[12], CompType.generator());
        print("before sorting:");
        print(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        print("after sorting:");
        print(Arrays.toString(a));
    }
}
