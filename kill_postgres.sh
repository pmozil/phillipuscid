#!/bin/bash

dsi() { docker stop $(docker ps -a | awk -v i="^$1.*" '{if($2~i){print$1}}'); }

dsi postgres
docker rm postgres_flowers
