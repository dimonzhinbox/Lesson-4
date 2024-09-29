public class Main {
    public static void main(String[] args) {
        int carrot = 23;
        int apple = 1234;
        System.out.println((carrot+apple) / 2);
                   // ПЕРЕМЕННЫЕ (примитивные типы данных)
          // ТИПЫ ДАННЫХ ДЛЯ ХРАНЕНИЯ ЦЕЛЫХ ЧИСЕЛ:
        byte b = 123;                   // 8 бит |1|0|0|1|1|0|0|0| числа от -128 до 127 (1 байт)
        short s = 12345;                // 16 бит (2 байта) от -32768 до 32767
        char с = 'b';                   // от -65535 до 65536 (принимает в себя различные символы)
        int i = 2147483647;             // 32 бита. от -2 140 000 000(2147483647) до 2 140 000 000
        long l = 123456789123456789l;   // 64 бита. 8 байт.
          // ТИП ДАННЫХ С ПЛАВАЮЩЕЙ ТОЧКОЙ:
        float f = 123.3f;               // 32 бита
        double d = 123.3;               // 64 бита
          // ЛОГИЧЕСКИЙ ТИП ДАННЫХ:
        boolean bool1 = true;
        boolean bool2 = false;          // от 8 до 32 бит
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i+1);  // вышли за предел чисел int.

    }
}
