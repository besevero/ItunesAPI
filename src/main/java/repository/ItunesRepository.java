package repository;

import org.springframework.data.repository.CrudRepository;

import Model.Music;

public interface ItunesRepository extends CrudRepository<Music, Long>{	

}
