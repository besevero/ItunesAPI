# ItunesAPI

API REST to acquire Itunes Music/Album/Artist data.

#Technologies

Java Spring Boot 2.0.4
Maven
Lombok
Mysql

#Request Methods

curl --request GET \
  --url 'http://localhost:8080/artist/{artistName}'
  
curl --request GET \
--url 'http://localhost:8080/album/{collectionName}'
  
curl --request GET \
--url 'http://localhost:8080/song/{trackName}'
  
curl --request POST \
--url http://localhost:8080/save
  
curl --request DELETE \
--url http://localhost:8080/delete
