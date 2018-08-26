package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Music;

@Repository
public interface ItunesRepository extends CrudRepository<Music, Long>{	

}
