public class Main {
    public static void main(String[] args) {

        int balance = 50;
        int transfer = 1110;
        int bonus;
        if (transfer > 1000) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + (balance + transfer + bonus));
        System.out.println("Бонусные рубли: " + (bonus));
    }
}