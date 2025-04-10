public class Main {
    public static void main(String[] args) {
        // Kviečiame testavimo metodus kiekvienai užduočiai
        System.out.println("Funkcijos užduotis 1");
        testSum();

        System.out.println("Funkcijos užduotis 2");
        testPISq();

        System.out.println("Funkcijos užduotis 3");
        testMultiply();

        System.out.println("Funkcijos užduotis 4");
        testPrintArray();

        System.out.println("Funkcijos užduotis 5");
        testRandomNumber();

        System.out.println("Funkcijos užduotis 6");
        testRandomArray();

        System.out.println("Funkcijos užduotis 7");
        testSumArray();

        System.out.println("Funkcijos užduotis 8");
        testArrayAverage();

        System.out.println("Funkcijos užduotis 9");
        testPrintRectangle();

        System.out.println("Funkcijos užduotis 10");
        testCountLettersAndSpaces();

        System.out.println("Funkcijos užduotis 11");
        testReverseString();

        System.out.println("Funkcijos užduotis 12");
        testPrintWithDashes();

        System.out.println("Funkcijos užduotis 13");
        testGenerateRndStr();
    }

    // 1 užduotis: Funkcija suma
    static void sum(int a, int b) {
        System.out.println(a + b);
    }
    static void testSum() {
        sum(5, 3); // Testuojame su 5 ir 3
    }

    // 2 užduotis: Funkcija PISq
    static double PISq() {
        return 9.8596;
    }
    static void testPISq() {
        System.out.println(PISq()); // Testuojame spausdindami reikšmę
    }

    // 3 užduotis: Funkcija sandauga
    static int multiply(int a, int b) {
        return a * b;
    }
    static void testMultiply() {
        System.out.println(multiply(4, 6)); // Testuojame su 4 ir 6
    }

    // 4 užduotis: Funkcija masyvo spausdinimui
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    static void testPrintArray() {
        int[] array = {1, 2, 3, 4};
        printArray(array); // Testuojame su masyvu {1, 2, 3, 4}
    }

    // 5 užduotis: Funkcija random skaičiui
    static int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    static void testRandomNumber() {
        System.out.println(randomNumber(1, 10)); // Testuojame su intervalu [1, 10]
    }

    // 6 užduotis: Funkcija random masyvui
    static int[] randomArray(int min, int max, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = randomNumber(min, max);
        }
        return arr;
    }
    static void testRandomArray() {
        int[] randomArray = randomArray(1, 10, 5);
        printArray(randomArray); // Testuojame su 5 elementų masyvu, intervalas [1, 10]
    }

    // 7 užduotis: Funkcija masyvo sumai
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    static void testSumArray() {
        int[] randomArray = randomArray(1, 10, 5);
        System.out.println(sumArray(randomArray)); // Testuojame su atsitiktiniu masyvu
    }

    // 8 užduotis: Funkcija masyvo vidurkiui
    static double arrayAverage(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }
    static void testArrayAverage() {
        int[] randomArray = randomArray(1, 10, 5);
        System.out.println(arrayAverage(randomArray)); // Testuojame su atsitiktiniu masyvu
    }

    // 9 užduotis: Funkcija stačiakampiui
    static void printRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void testPrintRectangle() {
        printRectangle(3, 4); // Testuojame su 3 eilutėmis ir 4 stulpeliais
    }

    // 10 užduotis: Funkcija raidėms ir tarpams
    static void countLettersAndSpaces(String sentence) {
        int letters = 0;
        int spaces = 0;
        for (char c : sentence.toCharArray()) {
            if (c == ' ') spaces++;
            else letters++;
        }
        System.out.println("Raidės: " + letters + ", Tarpai: " + spaces);
    }
    static void testCountLettersAndSpaces() {
        countLettersAndSpaces("Šiandien labai graži diena"); // Testuojame su duotu sakiniu
    }

    // 11 užduotis: Funkcija sakinio apvertimui
    static String reverseString(String sentence) {
        StringBuilder reversed = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed.append(sentence.charAt(i));
        }
        return reversed.toString();
    }
    static void testReverseString() {
        System.out.println(reverseString("Naglis")); // Testuojame su "Naglis"
    }

    // 12 užduotis: Funkcija, kuri spausdina tekstą su --- pradžioje ir gale
    static void printWithDashes(String text) {
        System.out.println("---" + text + "---");
    }
    static void testPrintWithDashes() {
        printWithDashes("labas"); // Testuojame su "labas"
    }

    // 13 užduotis: Funkcija, kuri generuoja atsitiktinį tekstą
    static String generateRndStr(int length) {
        String symbols = "1T5GHLKMPB";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }
    static void testGenerateRndStr() {
        String randomText = generateRndStr(10); // Generuojame 10 simbolių tekstą
        char numberToBracket = '5'; // Pasirenkame skaičių, kurį apgaubsime skliaustais (pvz., 5)
        for (int i = 0; i < randomText.length(); i++) {
            char currentChar = randomText.charAt(i);
            // Tikriname, ar simbolis yra skaičius ir ar jis yra tas, kurį norime apgaubti
            if (Character.isDigit(currentChar) && currentChar == numberToBracket) {
                System.out.println("[" + currentChar + "]"); // Apgaubiame skliaustais
            } else {
                System.out.println(currentChar); // Spausdiname be skliaustų
            }
        }





















    }
}



































































        






















































































