package note;

import java.util.Date;
import java.util.Scanner;

public class Note1 {
    /**
     * Создание заметки:
     * - ввод строки из консоли;
     * - формирование текущей даты и времени;
     * @param note1 - текст заметки;
     * @param str1 - текущая дата и время;
     * @param text - сформированная заметка;
     * @return text - возвращаем сформированную заметку.
     */
    public String addNote() {
        try(Scanner scan1 = new Scanner(System.in)) {
            Date date = new Date();
            System.out.println("Введите текст заметки: ");
            String note1 = scan1.nextLine();
            String str1 = String.format("%1$tD, %1$tI:%1$tM %1$Tp", date);
            String text = note1 + " --> " + str1 + "\n";
            return text;
        }
    }
}
