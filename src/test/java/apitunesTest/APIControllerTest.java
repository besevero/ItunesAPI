package apitunesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import Model.Results;
import apitunes.APIController;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {APIController.class})
@WebMvcTest(APIController.class)
public class APIControllerTest {

	@Autowired
	APIController api;
	
	@Test
	public void testFindArtistByName() {
		
		Results results = api.findArtistByName("Aerosmith");
		assertEquals(50,results.getResultCount());
		assertEquals("Aerosmith",results.getResults().get(0).getArtistName());
	}

	@Test
	public void testFindAlbumByName() {
		Results results = api.findAlbumByName("The Essential Aerosmith");
		assertEquals("The Essential Aerosmith",results.getResults().get(0).getCollectionName());
	}

	@Test
	public void testFindSongByName() {
		Results results = api.findSongByName("Sweet Emotion");
		assertEquals("Sweet Emotion",results.getResults().get(0).getTrackName());
	}
}
