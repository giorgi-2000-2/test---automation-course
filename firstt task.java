import java.util.Scanner;

public class Main {
    int countXmovani(String text) {
        char[] vowels = {'ა', 'ე', 'ი', 'ო', 'უ','a', 'e', 'i', 'o', 'u'};
        int count = 0;
         text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            for (char v : vowels) {
                if (ch == v) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    int countTanxmovani(String text) {
        char[] vowels = {'ა', 'ე', 'ი', 'ო', 'უ','a', 'e', 'i', 'o', 'u'};
        int count = 0;
        int i = 0;
        text = text.toLowerCase();
            while (i < text.length()) {
            char ch = text.charAt(i);
            boolean xmovania = false;


            for (char v : vowels) {
                if (ch == v) {
                    xmovania = true;
                    break;
                }
            }


            if (!xmovania && Character.isLetter(ch)) {
                count++;
            }

            i++;
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        String text = Obj.nextLine();
          Main m = new Main();
        m.countXmovani(text);
        m.countTanxmovani(text);

        int vowels = m.countXmovani(text);
        int consonants = m.countTanxmovani(text);

        System.out.println("ხმოვანი: " + vowels);
        System.out.println("თანხმოვანი: " + consonants);

        Obj.close();
    }}
