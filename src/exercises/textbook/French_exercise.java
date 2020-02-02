package exercises.textbook;

public class French_exercise {
    public static void main(String[] args) {
        /* Write a program that reads the French name of a country and adds the article:
        le for masculine or la for feminine, such as le Canada or la Belgique.

char­last­=­name.charAt(4);

names are feminine when they end with the letter e, masculine other­
wise, except for the following which are masculine even though they end with e:
except for the following which are masculine even though they end with e:
• le Belize
• le Cambodge
• le Mexique
• le Mozambique
• le Zaïre
• le Zimbabwe

int digit = . . .; switch (digit)
{
case 1: digitName = "one"; break;
les Etats­Unis
• les Pays­Bas
         */

        String name = "Belize";
        char last = name.charAt(name.length() - 1);
        char first = name.charAt(0);



        if (name.equals("Etats-Unis")|| name.equals("Pays-Bas")){
            System.out.println("les " + name);
        }
        else {


            switch (first) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("l'" + name);
                    break;
                default:


                    if (last == 'e') {
                        if (name.equals("Belize") || name.equals("Cambodge") || name.equals("Mozambique") || name.equals("Zaire") || name.equals("Zimbabwe")) {
                            System.out.println("le " + name);
                        } else {

                            System.out.println("la " + name);
                        }

                    } else {
                        System.out.println("le " + name);
                    }
                    break;
            }
        }
    }
}
