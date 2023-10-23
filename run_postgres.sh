#!/bin/bash

dsi() { docker stop $(docker ps -a | awk -v i="^$1.*" '{if($2~i){print$1}}'); }

dsi postgres
docker rm postgres_flowers

docker run \
    --name postgres_flowers \
    -p 5432:5432 \
    -e POSTGRES_DB=flowerdb \
    -e POSTGRES_USER=floweruser \
    -e POSTGRES_PASSWORD=flowers \
    -d postgres

