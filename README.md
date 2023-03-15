# Star Wars Quote API Documentation
This API provides access to a database of Star Wars quotes that are stored using MongoDB. The following endpoints are available:

# Get all quotes
Returns a list of all quotes in the database.

Endpoint: /api/all

HTTP Method: GET

Response
Status Code: 200 OK

Response Body:

![image](https://user-images.githubusercontent.com/114260075/225430098-431b34be-3a78-4c83-a8ac-31db19abeac9.png)

# Get a random quote
Returns a random quote from the database.

Endpoint: /api/random

HTTP Method: GET

Response
Status Code: 200 OK

Response Body:

![image](https://user-images.githubusercontent.com/114260075/225430263-5ce8c407-dcf2-443c-b6ab-b01669b5e9bd.png)

# Get a quote by character
Returns a random quote spoken by a specific character.

Endpoint: /api/character

HTTP Method: POST

Headers:  character: the name of the character (e.g. "Obi-Wan Kenobi")

Response Status Code: 200 OK

Response Body:

![image](https://user-images.githubusercontent.com/114260075/225430453-04bbc5c0-1ad4-413f-ac89-16ec8a25e98d.png)

# Get a quote by movie
Returns a random quote spoken in a specific movie.

Endpoint: /api/movie

HTTP Method: POST

Headers:  movie: the name of the movie (e.g. "A New Hope")

Response Status Code: 200 OK

Response Body:

![image](https://user-images.githubusercontent.com/114260075/225430591-5bfa9a11-c07e-482c-a2d6-9102db713700.png)

