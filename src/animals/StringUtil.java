package animals;

public class StringUtil {

    private StringUtil() {

    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
