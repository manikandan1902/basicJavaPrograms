public class randomPatterns {
    static void backslash(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void forwardslash(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 8 - i)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void cross(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || j == 8 - i)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        backslash('*');
        forwardslash('+');
        cross('*');
    }
}
