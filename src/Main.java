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

        System.out.println("Funkcijos užduotis 14");
        testCountDivisors();

        System.out.println("Funkcijos užduotis 15");
        testSortByDivisors();

        System.out.println("Funkcijos užduotis 16");
        testCountPrimes();

        System.out.println("Funkcijos užduotis 17");
        testAddUntilAllPrimes();

        System.out.println("Funkcijos užduotis 18");
        testAdjustUntilPrimeAverage();
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
        String symbols = "[159GHLKMP]";
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
            if (Character.isDigit(currentChar) && currentChar == numberToBracket) {
                System.out.println("[" + currentChar + "]"); // Apgaubiame skliaustais
            } else {
                System.out.println(currentChar); // Spausdiname be skliaustų
            }
        }
    }

    // 14 užduotis: Funkcija, kuri skaičiuoja daliklių be liekanos kiekį (išskyrus 1 ir patį skaičių)
    static int countDivisors(int number) {
        if (number <= 1) return 0; // Skaičiai <= 1 neturi daliklių pagal sąlygą
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    static void testCountDivisors() {
        System.out.println(countDivisors(12)); // Testuojame su 12 (dalikliai: 2, 3, 4, 6 → 4 dalikliai)
    }

    // 15 užduotis: Masyvas iš 100 elementų (33–77), rūšiuojamas pagal daliklių kiekį mažėjimo tvarka
    static void sortByDivisors(int[] arr) {
        // Rūšiuojame masyvą pagal daliklių kiekį mažėjimo tvarka
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (countDivisors(arr[j]) < countDivisors(arr[j + 1])) {
                    // Keičiame vietomis
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void testSortByDivisors() {
        int[] array = randomArray(33, 77, 100); // Generuojame masyvą
        sortByDivisors(array); // Rūšiuojame pagal daliklių kiekį
        printArray(array); // Spausdiname išrūšiuotą masyvą
    }

    // Pagalbinė funkcija: Tikrina, ar skaičius pirminis
    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 16 užduotis: Masyvas iš 100 elementų (333–777), suskaičiuoti pirminius skaičius
    static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) count++;
        }
        return count;
    }
    static void testCountPrimes() {
        int[] array = randomArray(333, 777, 100); // Generuojame masyvą
        System.out.println("Pirminių skaičių kiekis: " + countPrimes(array));
    }

    // 17 užduotis: Masyvas iš 3 elementų (1–33), pridedame elementus, kol visi pirminiai
    static int[] addUntilAllPrimes() {
        int[] array = randomArray(1, 33, 3); // Pradinis masyvas iš 3 elementų
        while (true) {
            boolean allPrime = true;
            // Tikriname paskutinius 3 elementus
            int start = Math.max(0, array.length - 3);
            for (int i = start; i < array.length; i++) {
                if (!isPrime(array[i])) {
                    allPrime = false;
                    break;
                }
            }
            if (allPrime) break; // Jei visi pirminiai, baigiame
            // Pridedame naują elementą
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = randomNumber(1, 33);
            array = newArray;
        }
        return array;
    }
    static void testAddUntilAllPrimes() {
        int[] result = addUntilAllPrimes();
        printArray(result); // Spausdiname galutinį masyvą
    }

    // 18 užduotis: 10x10 masyvas (1–100), didiname mažiausią skaičių, kol pirminių vidurkis ≥ 70
    static void adjustUntilPrimeAverage(int[][] matrix) {
        while (true) {
            // Skaičiuojame pirminių skaičių sumą ir kiekį
            int primeSum = 0;
            int primeCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (isPrime(matrix[i][j])) {
                        primeSum += matrix[i][j];
                        primeCount++;
                    }
                }
            }
            // Skaičiuojame pirminių skaičių vidurkį
            double primeAverage = primeCount == 0 ? 0 : (double) primeSum / primeCount;
            if (primeAverage >= 70) break; // Jei vidurkis ≥ 70, baigiame

            // Randame mažiausią skaičių ir jo poziciją
            int min = Integer.MAX_VALUE;
            int minI = 0, minJ = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        minI = i;
                        minJ = j;
                    }
                }
            }
            // Pridedame 3 prie mažiausio skaičiaus
            matrix[minI][minJ] += 3;
        }
    }
    static void testAdjustUntilPrimeAverage() {
        // Generuojame 10x10 masyvą
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            matrix[i] = randomArray(1, 100, 10);
        }
        adjustUntilPrimeAverage(matrix); // Koreguojame masyvą
        // Spausdiname galutinį masyvą
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}






















































































        






















































































