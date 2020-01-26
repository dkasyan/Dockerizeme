# Dockerizeme 

binary/dockerizeme-0.0.1-SNAPSHOT.jar 

docker pull mongo

docker run -d -p 27017:27017 -v ~/docker/mongo/dbdata:/data/db mongo 

port 8080: 

GET http://localhost:8080/movies/init

GET http://localhost:8080/movies
