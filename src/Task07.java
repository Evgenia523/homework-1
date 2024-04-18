public class Task07 {

    public static final int YEAR_PERCENT = 10;

    public static void main(String[] args) {
        System.out.println("Задание 7");
        int money = 1000;
        int i = money + ((money * YEAR_PERCENT) * 2)/100;
        System.out.println("Итоговая сумма по вкладу: " + i);
    }
}
