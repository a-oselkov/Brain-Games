package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int min, int max) {   //Генератор случайного числа в диапозоне [min ; max]
        max = max - min;
        return (int) (Math.random() * (max + 1) + min);
    }
    public static int generateRandomNumber() {   //Генератор случайного числа в диапозоне [min ; max]
        int min = 0;
        int max = 100;
        max = max - min;
        return (int) (Math.random() * (max + 1) + min);
    }
}
