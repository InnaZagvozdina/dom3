public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");


        //Задание 1

        int clientIOS = 0;
        if (clientIOS >= 1) {
            System.out.println("Установите версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");


            //Задание 2

            int clientAndroid = 0;
            int PhonAge = 2014;
            if (clientAndroid == 1 && PhonAge <= 2014) {
                System.out.println("Установите облегченную версию для Андроид по ссылке");
            } else if (clientAndroid == 1 && PhonAge >= 2015) {
                System.out.println("Установите версию для Андроид по ссылке");
            } else if (clientAndroid == 0 && PhonAge <= 2014) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите версию для iOS");
            }


            // Задание 3

            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год " + year + " является високосным");
            } else {
                System.out.println("Год " + year + " является не високосным");
            }

            // Задание 4

            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется один день");
            }
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется два дня доставки");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется три дня");
                }


            //Задание 5

            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца нет");

            }
            }
        }
    }






























