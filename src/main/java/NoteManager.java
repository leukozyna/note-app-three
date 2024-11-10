public class NoteManager {
    public static void main(String[] args) {
        NoteService noteService = new NoteService();

        // Dodawanie notatek
        Note note1 = new Note("Pierwsza notatka");
        Note note2 = new Note("Druga notatka");

        noteService.addNote(note1);
        noteService.addNote(note2);

        System.out.println("Wszystkie notatki:");
        for (Note note : noteService.getAllNotes()) {
            System.out.println(note);
        }

        // Usuwanie notatki
        noteService.removeNote(note1);

        System.out.println("\nPo usunięciu pierwszej notatki:");
        for (Note note : noteService.getAllNotes()) {
            System.out.println(note);
        }
    }
}
