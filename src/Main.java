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
                int PhonAge = 2015;
                if (clientAndroid == 1 && PhonAge <= 2014) {
                    System.out.println("Установите облегченную версию для Андроид по ссылке");
                    if (clientAndroid == 1 && PhonAge >= 2015) {
                        System.out.println("Установите версию для Андроид по ссылке");
                    } else
                        if (clientAndroid == 0 && PhonAge >= 2015) {
                            System.out.println("Установите версию для iOS по ссылке");


                    }
                }




            }

        }
    }


}