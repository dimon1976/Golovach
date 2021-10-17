package Stream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String test = r.nextLine();


        try (FileOutputStream fos = new FileOutputStream("test.txt");   // �������� ����� ������
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {  // ������� ���������������� ����� � ����� ��� ����� ���� ������ �����

            byte[]array = test.getBytes();  // ����������� �������� ������
            bos.write(array,0, array.length); // ����� � ����

        } catch (IOException e) {  // ����� ��������� ������
            System.out.println(e.getStackTrace());
        }
    }
}
