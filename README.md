# MIS311_Final_Project
SQL Injection demonstration and prevention techniques

This project shows what SQL Injection is and how  to prevent it.
For this purpose we developed a simple web server using Java servlet for handling requests and responses.
This server connect to the database and execute sql queries then return results and render.

We prepared three usecases and configured web server for usecase behaviours.

First case: No Input Control. Service put request parameter into the native SQL then execute.
Second case: Control logic for expected input. Service checks requested paramaters for unexpected values using regex.
Third case: Prepared Statement pre-compiled sql. Service takes the values and put into query by given order.
