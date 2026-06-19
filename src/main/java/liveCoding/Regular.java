package liveCoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    static void main() {
        String s = "жил-был в норе под землей хоббит." +
                " не в какой то там мерзкой грязной сырой норе ";
        Pattern pattern = Pattern.compile("\\b(?i)нор.\\b", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            System.out.println(matcher.group());

        Matcher matcher1 = pattern.matcher(s);
        StringBuilder buffer = new StringBuilder();
        while (matcher1.find()) {
            matcher1.appendReplacement(buffer, "кусь");
        }
        matcher1.appendTail(buffer);
        System.out.println(buffer);


        String z = "abc def ghi";
        Pattern pat = Pattern.compile("^def");
        Matcher mat = pat.matcher(z);
        mat.region(4,7);
        System.out.println(mat.lookingAt());
        mat.useAnchoringBounds(false);
        System.out.println(mat.lookingAt());

        String string = "test";
//        string.replaceAll();   todo те же самые регулярные выражения

    }
}
