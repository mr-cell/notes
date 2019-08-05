#!/bin/bash

docker run -e "SPRING_PROFILES_ACTIVE=prod" --env-file env.list -p 8080:8080 fd03
