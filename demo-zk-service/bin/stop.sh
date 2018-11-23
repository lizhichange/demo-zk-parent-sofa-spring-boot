
APP_NAME=demo-zk-service


tpid=`ps -ef  | grep java |grep  $APP_NAME|grep -v grep|grep -v kill|awk '{print $2}'`


if [ -z "$tpid" ]; then
    echo "ERROR: The $APP_NAME does not started!"
    exit 1
fi

echo -e "Stopping the $APP_NAME ...\c"


for PID in $tpid ; do
    kill $PID > /dev/null 2>&1
done

sleep 1

COUNT=0
while [ $COUNT -lt 1 ]; do    
    echo -e ".\c"
    sleep 1
    COUNT=1
    for PID in $tpid ; do
        PID_EXIST=`ps -f -p $PID | grep java`
        if [ -n "$PID_EXIST" ]; then
            COUNT=0
            break
        fi
    done
done

echo "OK!"
echo "PID: $tpid"
