package note;

public class Main {
    /**
     * Создание заметки, запись ее в файл и воспроизведение всех заметок из файла.
     */
    public static void main(String[] args) {
        Note1 note23 = new Note1();
        Save1 save23 = new Save1();
        String str = note23.addNote();
        save23.saveNote(str);
        save23.loadeNote();
    }
}
