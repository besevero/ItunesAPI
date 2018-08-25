package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity(name="itunes")
public class Music {
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String wrapperType;
    private String trackName;
    private String artistName;
    private String collectionName;
}
