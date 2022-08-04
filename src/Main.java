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

                int clientAndroid1 = 0;
                int PhonAge1 = 2015;
                if (clientAndroid1 == 1 && PhonAge1 <= 2014) {
                    System.out.println("Установите облегченную версию для Андроид по ссылке");
                    if (clientAndroid1 == 1 && PhonAge1 >= 2015) {
                        System.out.println("Установите версию для Андроид по ссылке");
                    } else
                        if (clientAndroid1 == 0 && PhonAge1 >= 2015) {
                            System.out.println("Установите версию для iOS по ссылке");
                        } else {
                            System.out.println("Установите облегченную версию для иос по ссылке");

                    }
                }




            }

        }
    }


}