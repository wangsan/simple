#! /bin/sh
service_path=./
cd $service_path
logback_opts=" -Dlogback.configurationFile="$service_path"logback.xml "
export PATH=/home/work/monitor/local/jdk1.8.0_101/bin:$PATH
nohup java -Dfile.encoding=UTF-8 $logback_opts -jar ./simple-1.0-SNAPSHOT.jar