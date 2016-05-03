package hart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Jim on 15-3-2016.
 */

@Component
public class DatabaseConnection<T> {

    public DatabaseConnection() {}

    public T getById(CrudRepository repository, int id){
        return (T) repository.findOne(id);
    }

    public Iterable<T> getAll(CrudRepository repository){
        return repository.findAll();
    }

    public void delete(CrudRepository repository, int id){
        repository.delete(id);
    }

    public T update(CrudRepository repository, T t){
        return (T) repository.save(t);
    }

    public T add(CrudRepository repository, T t){
        return (T) repository.save(t);
    }

    public T findByUuid(HartRepository repository, int id){
        return (T) repository.findById(id);
    }

}
