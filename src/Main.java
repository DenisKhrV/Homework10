public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        String street = "манежная";
        String streetTrue = street.replace("м", "М");
        System.out.println(streetTrue);

        String phone = "+79-12 96-661-02";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Слишком длинный номер телефона");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Слишком короткий номер телефона");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Иностранный номер");
        }
        System.out.println("phone = " + phone);
    }
}