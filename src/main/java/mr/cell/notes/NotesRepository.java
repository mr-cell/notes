package mr.cell.notes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marcel_Schally-Kacpr on 7/23/2019.
 */

@Repository
public interface NotesRepository extends CrudRepository<Note, Integer> {
}
