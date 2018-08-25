package Service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import Model.Music;
import Model.Results;
import lombok.RequiredArgsConstructor;
import repository.ItunesRepository;

@Service
@RequiredArgsConstructor
public class ItunesService {
	
	@Autowired
	private ItunesRepository itunesRepository;
	
	private final String url = "https://itunes.apple.com/search?term=";
	
	public Results getArtistData(String artistName) {
		String query = artistName.concat("&media=music") ;
		RestTemplate restTemplate = new RestTemplate();

		ajustaConverterRestTemplate(restTemplate);         
		
	    return restTemplate.getForObject(url.concat(query), Results.class);
	}
	
	public Results searchByAlbum(String collectionName) {
		String query = collectionName.concat("&entity=album&media=music");
		
		RestTemplate restTemplate = new RestTemplate();

		ajustaConverterRestTemplate(restTemplate);         
		
	    return restTemplate.getForObject(url.concat(query), Results.class);
	}
	
	public Results searchBySong(String trackName) {
		String query = trackName.concat("&entity=song&media=music");
		
		RestTemplate restTemplate = new RestTemplate();

		ajustaConverterRestTemplate(restTemplate);         
		return restTemplate.getForObject(url.concat(query), Results.class);
	}
	
	public boolean saveMusic(Music music) {
		System.out.println(music.getArtistName());
		itunesRepository.save(music);
		return true;
	}
	public boolean deleteMusic(Music music) {
		System.out.println(music.getArtistName());
		itunesRepository.delete(music);
		return true;
	}
	
	
	private void ajustaConverterRestTemplate(RestTemplate restTemplate) {
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = 
                new MappingJackson2HttpMessageConverter();
		 mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
                              Arrays.asList(MediaType.ALL));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter); 
	}
}
