package hexlet.code;

public class Utils {
    public static final int MAX_NUMBER = 100;
    public static int generateRandomNumber(int min, int max) {   //Генератор случайного числа в диапазоне [min ; max]
        max = max - min;
        return (int) (Math.random() * (max + 1) + min);
    }
    public static int generateRandomNumber() {                  //Генератор случайного числа в диапазоне [0 ; 100]
        return (int) (Math.random() * (MAX_NUMBER + 1));
    }
}
