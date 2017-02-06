# MovieLibrary

This is a small back-end project which handles a movie library and provides basic CRUD operations.

# Dependencies

Spring Boot, Maven.

# How to use it

1) Import the project in Spring Tool Suite (https://spring.io/tools).

2) Launch the app.

3) Go to address http://localhost:8080/ with your browser. It should display a list with three "test" movies.

4) To access the details of a movie, go to http://localhost:8080/{title of the movie}.

5) To add a new movie, go to http://localhost:8080/add?[title={the title}][&][releaseYear={the release year}][&][genre={the genre}][&][actors={the actors}][&][plot={the plot}]. (Not all arguments are necessary).

6) To update a movie, go to http://localhost:8080/update?title={the title of the movie you want to update}&[newTitle={the new title}][&][releaseYear={the release year}][&][genre={the genre}][&][actors={the actors}][&][plot={the plot}]. (Not all arguments are necessary).

7) To delete a movie, go to http://localhost:8080/delete/{title of the movie}.

8) To get the list of movies stored in memory which were released in a particular year, go to http://localhost:8080/byYear?year={the year}.
