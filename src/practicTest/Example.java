package practicTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        final String regex = "Object-oriented programming";
        final String targetString = "OOP";
        final String string = "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(string);

        String[] strArray = string.split(regex);
        StringBuilder sb = new StringBuilder();
        sb.append(strArray[0]);
        int i = 1;
        while (matcher.find()) {
            if (i % 2 == 0){
                sb.append(targetString);
                sb.append(strArray[i]);
            } else {
                sb.append(regex);
                sb.append(strArray[i]);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
