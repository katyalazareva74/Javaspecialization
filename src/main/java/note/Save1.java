package note;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Save1 {
    /**
     * Записываем заметку в файл.
     */
    public void saveNote(String str) {
        try (FileWriter fw = new FileWriter("data.txt", true)) {
            fw.write(str);
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }
    }
    /**
     * Воспроизводим все заметки из файла в консоль.
     */
    public void loadeNote(){
        try(FileReader fr = new FileReader("data.txt"); Scanner scanner1= new Scanner(fr)){
            int i=0;
            while(scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }
        }catch (IOException e) {
            System.out.println("FileNotFound");
        }
    }
}
