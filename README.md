# Project3_v2.ScreeningService
Description
-----------
This screening microservice is able to create screenings and insert them into a database, as well as retrieve all screenings or retriever a screening by id. Screenings can also be updated on the screening score and screening notes property.

Endpoints:
---------

- GET: http://localhost:7000/screeningservice/screenings (Retrieve all screenings)
- GET: http://localhost:7000/screeningservice/screenings/{id} (Retriever screening by id)
- GET: http://localhost:7000/screeningservice/screenings/userId/{user_id} (Retriever screening by user id)
- GET: http://localhost:7000/screeningservice/screenings/candidateId/{candidate_id} (Retriever screening by candidate id)
- POST: http://localhost:7000/screeningservice/screenings (Add screening to database)
- PUT: http://localhost:7000/screeningservice/screenings/{id} (Update screening)


