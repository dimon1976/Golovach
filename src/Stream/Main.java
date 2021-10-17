package Stream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String test = r.nextLine();


        try (FileOutputStream fos = new FileOutputStream("test.txt");   // файловый поток вывода
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {  // создаем буферизированный поток и берем имя файла куда писать будем

            byte[]array = test.getBytes();  // обязательно байтовый массив
            bos.write(array,0, array.length); // пишем в файл

        } catch (IOException e) {  // ловим возможную ошибку
            System.out.println(e.getStackTrace());
        }
    }
}
