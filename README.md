Distributed System for HairbyJoyceline
Project Overview: This assignment involves developing a distributed system for HairbyJoyceline, a hair business. The objective is to design and implement a RESTful service that allows customers to book appointments, view available services, manage bookings, and interact with the hairstylist (Joyceline). The system should provide both customer-facing and admin-facing functionalities to support seamless operations of the business.

Functional Requirements:
Customer Registration and Management:
Customers can register on the platform by providing their name, email, and phone number.
Upon registration, customers receive a unique customer ID.
Customers can log in using their email and view their profile, including their upcoming and past appointments.
Customers can delete their profile, which will also remove all associated appointments.

Appointment Scheduling:
Customers can browse available services and select an appointment date and time.
They can choose a specific hairstyle and confirm their booking.
Customers can view, update, or cancel their appointments.
Service Listings and Management:

The system should display a list of services (e.g., braiding, blowouts), including duration and price.
Admin (Joyceline) can add, update, or delete services as needed.
Customers can search for services based on type and price.

Appointment History and Transactions:
Customers can view their appointment history and the status of any completed bookings.
The system should track all transactions (i.e., bookings, cancellations) and keep a record for admin review.

Non-Functional Requirements:
Scalability: The system should be able to handle an increasing number of users and appointments without affecting performance.
Security: Ensure customer data is protected with encryption and secure login.
Persistence: All customer, appointment, and service data should be stored in a PostgreSQL database.
Performance: Responses to user actions should be processed within 2 seconds.

Technologies to Use:
Backend: Java with Spring Boot for RESTful API development.
Frontend: Angular for the user interface.
Database: PostgreSQL for storing data.
Deployment: Docker for containerization and easy deployment across environments.
Expected Deliverables:

A functional distributed system with RESTful services.
A working frontend interface allowing users to interact with the system.
Complete documentation, including API specifications and user guides.
A short presentation outlining the system’s design, implementation, and features.


RESTful Service Interface Specification
Customer Services
GET /customer/{customerId}: Retrieve customer details.

Request Example: GET /customer/123
Response Example:
json
Copy code
{
  "customerId": 123,
  "name": "Jane Doe",
  "appointments": [456, 789]
}
POST /customer: Register a new customer.

Request Example:
json
Copy code
{
  "name": "Jane Doe",
  "email": "jane@example.com",
  "phone": "555-1234"
}
DELETE /customer/{customerId}: Remove a customer and all their appointments.

Request Example: DELETE /customer/123
Appointment Services
POST /appointment: Book a new appointment.

Request Example:
json
Copy code
{
  "customerId": 123,
  "serviceId": 1,
  "date": "2024-09-15T14:00:00"
}
GET /appointment/{appointmentId}: Retrieve details of a specific appointment.

Request Example: GET /appointment/456
DELETE /appointment/{appointmentId}: Cancel an appointment.

Request Example: DELETE /appointment/456
Service Management
GET /services: Retrieve the list of available services.

Request Example: GET /services
Response Example:
json
Copy code
[
  {
    "serviceId": 1,
    "name": "Braiding",
    "duration": "2 hours",
    "price": 50.00
  },
  {
    "serviceId": 2,
    "name": "Haircut",
    "duration": "1 hour",
    "price": 30.00
  }
]
POST /service: Add a new service (admin only).

Request Example:
json
Copy code
{
  "name": "Haircut",
  "duration": "1 hour",
  "price": 30.00
}
DELETE /service/{serviceId}: Remove a service (admin only).

Request Example: DELETE /service/2
