#!/bin/bash

sh ./kill_postgres.sh

docker run \
    --name postgres_flowers \
    -p 5432:5432 \
    -e POSTGRES_DB=flowerdb \
    -e POSTGRES_USER=floweruser \
    -e POSTGRES_PASSWORD=flowers \
    -d postgres

