#!/bin/sh

mvn clean package
docker build -t localhost:5000/quarkus-sample:1.0.1 -f src/main/docker/Dockerfile.jvm .
docker push localhost:5000/quarkus-sample:1.0.1