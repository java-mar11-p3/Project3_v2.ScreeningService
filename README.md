# Project3_v2.ScreeningService
Description
-----------
This screening microservice is able to create screenings and insert them into a database, as well as retrieve all screenings or retriever a screening by id. Screenings can also be updated on the screening score and screening notes property.

Endpoints:
---------

- GET: http://domain-name/screenings (Retrieve all screenings)
- GET: http://domain-name/screenings/{id} (Retriever screening by id)
- GET: http://domain-name/screenings/userId/{user_id} (Retriever screening by user id)
- POST: http://domain-name/screenings (Add screening to database)
- PUT: http://domain-name/screenings/{id} (Update screening)


