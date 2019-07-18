#!/bin/bash

#If it is in lighthweight mode, please modify the registration center, config center, and monitoring center as "-Dcse.service.registry.address=https://$CONFIGIP:$CSE_REGISTRY_PORT -Dcse.config.client.serverUri=https://$CONFIGIP:$CSE_CONFIG_CENTER_PORT -Dcse.monitor.client.serverUri=https://$CONFIGIP:$CSE_MONITOR_SERVER_PORT",and add the corresponding ports as environment variables while deploying.
CMDVAR="-Dcse.service.registry.address=https://$CONFIGIP:30100 -Dcse.config.client.serverUri=https://$CONFIGIP:30103 -Dcse.monitor.client.serverUri=https://$CONFIGIP:30109 -Dcse.credentials.accessKey=$AK -Dcse.credentials.secretKey=$SK -Dcse.credentials.project=$PROJECT" 

trap 'ps | grep -w test |grep -v grep |cut -c 1-6 |xargs kill -15;sleep 5s '  SIGTERM
nohup java $CMDVAR -jar test-0.0.1-SNAPSHOT.jar 2>&1 &
wait $!