import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class NoteServiceTest {
    private NoteService noteService;

    @BeforeEach
    public void setUp() {
        noteService = new NoteService();
    }

    @Test
    public void testAddNote() {
        Note note = new Note("Testowa notatka");
        noteService.addNote(note);
        assertEquals(1, noteService.getAllNotes().size());
        assertTrue(noteService.getAllNotes().contains(note));
    }

    @Test
    public void testRemoveNote() {
        Note note = new Note("Notatka do usunięcia");
        noteService.addNote(note);
        boolean result = noteService.removeNote(note);
        assertTrue(result);
        assertFalse(noteService.getAllNotes().contains(note));
    }

    @Test
    public void testRemoveNonExistentNote() {
        Note note = new Note("Notatka do usunięcia");
        boolean result = noteService.removeNote(note);
        assertFalse(result);
    }

    @Test
    public void testAddMultipleNotes() {
        Note note1 = new Note("Pierwsza notatka");
        Note note2 = new Note("Druga notatka");
        noteService.addNote(note1);
        noteService.addNote(note2);
        assertEquals(2, noteService.getAllNotes().size());
    }

    @Test
    public void testClearAllNotes() {
        Note note1 = new Note("Notatka 1");
        Note note2 = new Note("Notatka 2");
        noteService.addNote(note1);
        noteService.addNote(note2);
        noteService.clearAllNotes();
        assertEquals(0, noteService.getAllNotes().size());
    }

    @Test
    public void testGetAllNotes() {
        Note note1 = new Note("Notatka 1");
        Note note2 = new Note("Notatka 2");
        noteService.addNote(note1);
        noteService.addNote(note2);
        List<Note> notes = noteService.getAllNotes();
        assertEquals(2, notes.size());
        assertTrue(notes.contains(note1));
        assertTrue(notes.contains(note2));
    }

    @Test
    public void testNoteConstructorWithNullContent() {
        assertThrows(IllegalArgumentException.class, () -> new Note(null));
    }

    @Test
    public void testNoteConstructorWithEmptyContent() {
        assertThrows(IllegalArgumentException.class, () -> new Note(""));
    }

    @Test
    public void testRemoveNoteWhenEmpty() {
        Note note = new Note("Notatka do usunięcia");
        boolean result = noteService.removeNote(note);
        assertFalse(result);
    }

@Test
public void testAddNoteToNonEmptyList() {
    // Tworzymy dwie notatki
    Note note1 = new Note("Pierwsza notatka");
    Note note2 = new Note("Druga notatka");
    
    // Dodajemy pierwszą notatkę
    noteService.addNote(note1);
    
    // Sprawdzamy, czy lista zawiera 1 notatkę
    assertEquals(1, noteService.getAllNotes().size());
    assertTrue(noteService.getAllNotes().contains(note1));
    
    // Dodajemy drugą notatkę
    noteService.addNote(note2);
    
    // Sprawdzamy, czy lista zawiera obie notatki
    assertEquals(2, noteService.getAllNotes().size());
    assertTrue(noteService.getAllNotes().contains(note2));
}

}
