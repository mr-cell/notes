package mr.cell.notes;

/**
 * Created by Marcel_Schally-Kacpr on 7/23/2019.
 */
public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException(Integer id) {
        super("No note found for id :'" + id + "'");
    }
}
