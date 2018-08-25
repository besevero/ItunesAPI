package apitunes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.Music;
import Model.Results;
import Service.ItunesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import repository.ItunesRepository;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@Slf4j
@RequiredArgsConstructor
public class RestController {
	
	@Autowired
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
	@PostMapping(value = "save")
    public void addResult(@RequestBody @Valid Music music) {
		itunesService.saveMusic(music);
    }
}
