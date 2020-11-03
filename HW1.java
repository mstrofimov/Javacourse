public class NewClass {
    public static void main(String[] args) {
        System.out.println("a*(b+(c/d)) = " + doOne(1,3,6,3));
        System.out.println(doTwo(10,10));
        doThree(-6);
        DoFour( "Maxim" );
        DoFive(2000);
    }

    static int doOne(int a, int b, int c, int d) {
        System.out.println("\nЗадача 1");
        return a*(b+(c/d));
    }

    static boolean doTwo(int a, int b) {
        System.out.println("\nЗадача 2");
        int sum = a+b;
        return sum >= 10 && sum <= 20;

    }

    static void doThree(int a){
        System.out.println("\nЗадача 3");
        if (a >= 0) System.out.println("Число " + a + " Положительное");
        else System.out.println("Число " + a + " Отрицательное" );
    }



    static void DoFour(String name){
        System.out.println("\nЗадача 5");
        System.out.println("Привет, " + name + " !" );
    }

    static void DoFive(int year){
        System.out.println("\nЗадача 6");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}


