import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<Note> notes;

    public NoteService() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public boolean removeNote(Note note) {
        return notes.remove(note);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    public void clearAllNotes() {
        notes.clear();
    }
}
