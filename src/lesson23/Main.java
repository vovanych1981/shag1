package lesson23;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {


//    �������� �����, ������� ��������� � �������� ��������� ����� ������, �������� �I like Java!!!�.

        //String str = "I like Java!!!";
//    ����������� ��������� ������ ������. ���������� ����� String.charAt().
        //System.out.println(str.charAt(str.length() - 1));
//    ���������, ������������� �� ���� ������ ���������� �!!!�. ���������� ����� String.endsWith().
        //System.out.println(str.endsWith("!!!"));
//    ���������, ���������� �� ���� ������ ���������� �I like�. ���������� ����� String.startsWith().
        //System.out.println(str.startsWith("I like"));
//    ���������, �������� �� ���� ������ ��������� �Java�. ���������� ����� String.contains().
        //System.out.println(str.concat("Java"));
//    ����� ������� ��������� �Java� � ������ �I like Java!!!�.
        //System.out.println(str.indexOf("Java"));
//    �������� ��� ������� ��� �� ��.
        // System.out.println(str.replace('a', 'o'));
//    ������������ ������ � �������� ��������.
        //System.out.println(str.toLowerCase(Locale.ENGLISH));
//    ������������ ������ � ������� ��������.
        // System.out.println(str.toUpperCase(Locale.ENGLISH));
//    �������� ������ Java c ������� ������ String.substring().
        //int startIndex, endIndex;
        //System.out.println(str.substring(str.indexOf("I like"),str.indexOf("I like") +  "I like".length()));


//        ���� ��� �����, �������� 3 � 56, ���������� ��������� ��������� ������:
//        3 + 56 = 59
//        3 � 56 = -53
//        3 * 56 = 168.
//        ���������� ����� StringBuilder.append().
//        �������� ������ �=� �� ����� ������. ����������� ������ StringBuilder.insert(), StringBuilder.deleteCharAt().
//        �������� ������ �=� �� ����� ������. ����������� ������ StringBuilder.replace().

        /*Integer x, y;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        x = Integer.parseInt(str);
        str = buf.readLine();
        y = Integer.parseInt(str);
        Integer res = x + y;
        StringBuilder sb = new StringBuilder(x.toString());
        sb.append(" + ");
        sb.append(y.toString());
        sb.append(" = ");
        sb.append(res.toString());
        Integer res1 = x - y;
        StringBuilder sb1 = new StringBuilder(x.toString());
        sb1.append(" - ");
        sb1.append(y.toString());
        sb1.append(" = ");
        sb1.append(res1.toString());
        Integer res2 = x * y;
        StringBuilder sb2 = new StringBuilder(x.toString());
        sb2.append(" * ");
        sb2.append(y.toString());
        sb2.append(" = ");
        sb2.append(res2.toString());
        //System.out.println(sb1);
        sb2.insert((sb2.indexOf(" = ")), " �����");
        sb2.deleteCharAt(sb2.indexOf("="));
        System.out.println(sb2);
        sb2.replace(sb2.indexOf("�����"), sb2.indexOf(" 168"), "=");
        System.out.println(sb2);*/

//        �������� �����, ���������� � ������ ������ (������) ��������� �object-oriented programming�
//        (�� ��������� ������� ��������) �� �OOP�. ��������, ������ "Object-oriented programming is a programming
//         language model organized around objects rather than "actions" and data rather than logic.
//         "Object-oriented programming blabla. Object-oriented programming bla."
//        ������ ���� ������������� �"Object-oriented programming is a programming language model organized around
//        objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."

        String text = "Object-oriented programming is a programming language model organized around objects " +
                "rather than actions and data rather than logic. " +
                "Object-oriented programming blabla. Object-oriented programming bla.";

        String newText = "Object-oriented programming";
        text = text.replace(newText, "OOP");
        System.out.println(text);


//        4. ����� ��� ������� ����� ������
//        ���� ������ ������ ����� (����� - ������ �����), ���������� ������� �� ��� ������� �����.
//        ��������, ���� ���� ������ "string"  ��������� ����� "ri", ��� ������ "code" ��������� "od",
//        ��� "Practice" ��������� "ct".
//        String[] words = {"string", "code", "Practice"};
//        for (String word : words) {
//            System.out.println(word.substring(word.length()/2 -1, word.length()/2+1));
//        }


    }

}

