# dental-clinics
Spring boot with web page application + H2 database

A company owns a network of dental clinics and you need to design a database for them. Patients can make appointments to see a dentist at a clinic. Sometimes patients make appointments without knowing which dentist they are going to see. Dentists assign some treatments to be done on the patient. The treatments can be executed by dentists or by dental assistants. Bills are produced to record how much the patients need to pay for the treatments. One bill can contain the cost of many treatments done in one visit at a clinic. Besides dentists and dental assistants, there are also receptionists responsible for recording appointments and for processing the bill payments.

Design:
Starting from this general description, do the following initial steps in your database design process:
1. Create an ER diagram to represent the conceptual database schema for the above “application”.
2. In the diagram, mark the various constraints (keys, functional dependencies, cardinalities of the relationships, etc.). Identify any constraints that are not captured by the ER diagram.
3. Convert your ER diagram into a relational database schema. Make refinements to the DB schema if necessary. Identify the primary keys and the foreign keys of the relations.
The description is not very specific, it only gives a general idea of what’s required. The queries specified below can also help you figure out how the database will be used and what attributes might be needed.
 
Required Queries:
Formulate and evaluate the following SQL queries against an instance of your database in which every relation is populated with “sufficient” representative tuples.
a. Get details of all dentists in all the clinics.
b. Get details of all appointments for a given dentist for a specific week.
c. Get details of all appointments at a given clinic on a specific date.
d. Get details of all appointments of a given patient.
e. Getthenumberofmissedappointmentsforeachpatient(onlyforpatientswhohave
missed at least 1 appointment).
f. Getdetailsofallthetreatmentsmadeduringagivenappointment.
g. Get details of all unpaid bills.

Web Site:
Create a web site for your application. It should provide a basic interface to your database. At a minimum, the queries listed above (and their results) should be integrated in a logical way in your application. For example, when getting the details of all appointments of a given patient, then the given patient could be selected from a list of all patients, possibly rendered in a list or a table or inside a form, or in some other meaningful way.

Other Required Features (Clarification):
There should be a way to modify the data in your database through your interface. It should at least be possible to add new patients, schedule new appointments and modify and delete existing appointments.

There should also be a special feature that would normally be reserved for DBAs: a text area (probably on a different page) in which a user can type an SQL statement and execute it on the database. Results of the executed statement should be displayed in a logical way.

