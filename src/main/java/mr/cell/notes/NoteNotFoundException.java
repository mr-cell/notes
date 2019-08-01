package mr.cell.notes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Marcel_Schally-Kacpr on 7/23/2019.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException(Integer id) {
        super("No note found for id :'" + id + "'");
    }
}
