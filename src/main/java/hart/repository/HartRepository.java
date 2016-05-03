package hart.repository;

import hart.model.Meeting;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by biezenj on 11-4-2016.
 */
public interface HartRepository extends CrudRepository<Meeting, Integer> {

    Meeting findById(int id);

}
