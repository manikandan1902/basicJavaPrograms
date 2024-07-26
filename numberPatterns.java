import java.util.Scanner;

class numberPatterns {
    static void numericOne(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 4 - i || j == 3 || i == 7)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericTwo(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || (j == 5 && i <= 4) || (j == 1 && i >= 4))
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericThree(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 5)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericFour(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 5 || i == 5 || j == 6 - i)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericFive(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || (j == 1 && i <= 4) || (j == 5 && i >= 4))
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericSix(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || i == 7 || (j == 5 && i >= 4))
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericSeven(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 7 - i)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericEight(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 || j == 5)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericNine(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || (j == 1 && i <= 4) || j == 5)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numericZero(char patternChar) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 7 || j == 5 || j == 1)
                    System.out.print(patternChar);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number between 0 to 9");
        int numericValue = sc.nextInt();
        System.out.println("Enter any character");
        char pattern = sc.next().charAt(0);

        switch (numericValue) {
            case 1:
                numericOne(pattern);
                break;
            case 2:
                numericTwo(pattern);
                break;
            case 3:
                numericThree(pattern);
                break;
            case 4:
                numericFour(pattern);
                break;
            case 5:
                numericFive(pattern);
                break;
            case 6:
                numericSix(pattern);
                break;
            case 7:
                numericSeven(pattern);
                break;
            case 8:
                numericEight(pattern);
                break;
            case 9:
                numericNine(pattern);
                break;
            case 0:
                numericZero(pattern);
                break;
            default:
                System.out.println("Please enter the valid number");
                break;
        }
    }
}