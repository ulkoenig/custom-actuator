# Demo of a custom actuator endpoint

Provide a actuator endpoint with a list of licenses of used software and show a custom info endpoint 
## Generate license list
./gradlew downloadLicenses

## Copy licence json file to resource folder
./gradlew copyLicense

## Run
./gradlew bootRun

## Get license via /actuator
curl --location --request GET 'http://localhost:8080/actuator/licenses'



