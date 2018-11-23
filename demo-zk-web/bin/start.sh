#!/usr/bin/env bash


rm -f tpid
JAVA_OPTS=" -server  -Xss256k -XX:+UseConcMarkSweepGC -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=70"
JAVA_DEBUG_OPTS=""
if [ "$1" = "debug" ]; then
     JAVA_DEBUG_OPTS=" -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=9881,server=y,suspend=n "
fi

 nohup java $JAVA_DEBUG_OPTS $JAVA_OPTS  -jar   demo-zk-web.jar > stdout.log 2>&1 &

echo $! > tpid
echo Start Success!

