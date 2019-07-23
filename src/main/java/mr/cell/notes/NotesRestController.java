package mr.cell.notes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Marcel_Schally-Kacpr on 7/23/2019.
 */

@RequestMapping("/notes")
@RestController
public class NotesRestController {

    private final NotesRepository notes;

    public NotesRestController(NotesRepository notes) {
        this.notes = notes;
    }

    @GetMapping("/{id}")
    public Note getNote(@PathVariable("id") final Integer id) {
        return notes.findById(id).orElseThrow(() -> new NoteNotFoundException(id));
    }

    @GetMapping
    public List<Note> getAllNotes() {
        final List<Note> allNotes = new ArrayList<>();
        notes.findAll().forEach(allNotes::add);
        return allNotes;
    }

    @PostMapping
    public void saveNote(@RequestBody final Note note) {
        Note noteToSave = new Note();
        noteToSave.setTitle(note.getTitle());
        noteToSave.setBody(note.getBody());
        notes.save(noteToSave);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable("id") final Integer id) {
        notes.findById(id).ifPresent(notes::delete);
    }
}
