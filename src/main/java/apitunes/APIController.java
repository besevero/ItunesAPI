package apitunes;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Music;
import Model.Results;
import Service.ItunesService;


@RestController
public class APIController {
	 
	private ItunesService itunesService = new ItunesService();
	
	@GetMapping(value = "artist/{artistName}")
    public Results findArtistByName(@PathVariable String artistName) {
		return itunesService.getArtistData(artistName);
    }
	@GetMapping(value = "album/{collectionName}")
    public Results findAlbumByName(@PathVariable String collectionName) {
		return itunesService.searchByAlbum(collectionName);
    }
	@GetMapping(value = "song/{trackName}")
    public Results findSongByName(@PathVariable String trackName) {
		return itunesService.searchBySong(trackName);
    }
	@GetMapping(value = "/getall}")
    public Iterable<Music> getAllFromLocalStorage() {
		Iterable<Music> musics = itunesService.getAll();
		return musics;
    }
	@PostMapping(value = "/save")
    public boolean addResult(@RequestBody @Valid Music music) {
		return itunesService.saveMusic(music);
    }
	@DeleteMapping(value = "/delete")
    public boolean deleteResult(@RequestBody @Valid Music music) {
		return itunesService.saveMusic(music);
    }
}
