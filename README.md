# ldapAsResource
This project has a sample maven project where ldap connection is used as a resource

## Run the Project
mvn clean install tomcat7:run

## Verification of Context initialization
` ldapContext.getEnvironment()` has been printed on successfull initialization of Context.
