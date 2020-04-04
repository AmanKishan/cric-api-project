# cric-api-project

###Eureka Server
    ** Url : http://localhost:8761/

####Gateway 
    ** Url : http://localhost:8090/actuator/info

###Cric-Score-Microservice
     ** Url : http://localhost:8081/actuator/info

### Calling Using Microservice 

curl --location --request POST 'http://localhost:8081/api/cricWinnerTeamApi' \
--header 'Content-Type: application/json' \
--header 'User-Agent: PostmanRuntime/7.21.0' \
--header 'Accept: */*' \
--header 'Cache-Control: no-cache' \
--header 'Postman-Token: bc61f777-483e-4cce-8bc2-10ee998c766b' \
--header 'Host: localhost:8081' \
--header 'Accept-Encoding: gzip, deflate' \
--header 'Content-Length: 72' \
--header 'Connection: keep-alive' \
--data-raw '{
  "unique_id": "1136614",
  "apikey": "WmPJrX2s3KMyZVPFwlm1vxXLXKw1"
}'

### Calling Using Zull
curl --location --request POST 'http://localhost:8090/cric-score-api/api/cricWinnerTeamApi' \
--header 'Content-Type: application/json' \
--header 'User-Agent: PostmanRuntime/7.21.0' \
--header 'Accept: */*' \
--header 'Cache-Control: no-cache' \
--header 'Postman-Token: debd813b-4f62-40ff-ac5d-2a27d33775c2' \
--header 'Host: localhost:8090' \
--header 'Accept-Encoding: gzip, deflate' \
--header 'Content-Length: 72' \
--header 'Connection: keep-alive' \
--data-raw '{
  "unique_id": "1136614",
  "apikey": "WmPJrX2s3KMyZVPFwlm1vxXLXKw1"
}'
     
