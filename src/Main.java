public class Main {
    public static void main(String[] args) {
        int carrot = 23;
        int apple = 1234;
        System.out.println((carrot+apple) / 2);
                   // ���������� (����������� ���� ������)
          // ���� ������ ��� �������� ����� �����:
        byte b = 123;                   // 8 ��� |1|0|0|1|1|0|0|0| ����� �� -128 �� 127 (1 ����)
        short s = 12345;                // 16 ��� (2 �����) �� -32768 �� 32767
        char � = 'b';                   // �� -65535 �� 65536 (��������� � ���� ��������� �������)
        int i = 2147483647;             // 32 ����. �� -2 140 000 000(2147483647) �� 2 140 000 000
        long l = 123456789123456789l;   // 64 ����. 8 ����.
          // ��� ������ � ��������� ������:
        float f = 123.3f;               // 32 ����
        double d = 123.3;               // 64 ����
          // ���������� ��� ������:
        boolean bool1 = true;
        boolean bool2 = false;          // �� 8 �� 32 ���
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i+1);  // ����� �� ������ ����� int.

    }
}
