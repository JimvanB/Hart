package hart.restendpoint;


import hart.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import hart.repository.DatabaseConnection;
import hart.repository.HartRepository;
import hart.response.Response;

/**
 * Created by Jim on 15-3-2016.
 */
@RestController
@RequestMapping("/hart/meeting")
public class HartController {

    @Autowired
    DatabaseConnection<Meeting> db;

    @Autowired
    HartRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Meeting> getAllMetingen() {
        return db.getAll(repository);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response deleteMeeting(@PathVariable("id") int id) {
        db.delete(repository,id);
        return Response.DELETE_SUCCES;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Meeting getMeeting(@PathVariable("id") int id) {
        return db.getById(repository, id);
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Meeting addMeeting(@RequestBody Meeting meeting) {
        return db.add(repository,meeting);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Meeting updateMeeting(@RequestBody Meeting meeting) {
        return db.update(repository,meeting);
    }
}
