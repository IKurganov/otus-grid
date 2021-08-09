docker pull selenoid/vnc_chrome:85.0
docker-compose up -d
docker-compose ps
cd ../
pwd
mvn clean test
