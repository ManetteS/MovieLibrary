# MovieLibrary

This is a small back-end project which handles a movie library and provides basic CRUD operations.

# Dependencies

Spring Boot, Maven.

# How to import the project

1) Download the zip file from github.

2) Unzip it.

3) Launch Spring Tool Suite (https://spring.io/tools).

4) Import the project : File -> Import -> (Maven) Existing Maven Projects -> Next -> Browse (Root Directory) -> Select the unzipped file -> Select the file in "Projects" -> Finish.

# How to use it

1) Launch the app.

2) Go to address http://localhost:8080/ with your browser. It should display a list with three "test" movies.

3) To access the details of a movie, go to http://localhost:8080/{title of the movie}.

4) To add a new movie, go to http://localhost:8080/add?[title={the title}][&][releaseYear={the release year}][&][genre={the genre}][&][actors={the actors}][&][plot={the plot}]. (Not all arguments are necessary).

5) To update a movie, go to http://localhost:8080/update?title={the title of the movie you want to update}&[newTitle={the new title}][&][releaseYear={the release year}][&][genre={the genre}][&][actors={the actors}][&][plot={the plot}]. (Not all arguments are necessary).

6) To delete a movie, go to http://localhost:8080/delete?title={title of the movie}.

7) To get the list of movies stored in memory which were released in a particular year, go to http://localhost:8080/byYear?year={the year}.
