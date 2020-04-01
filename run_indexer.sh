#check where ctags is using "which ctags" command...
java \
    -Djava.util.logging.config.file=$PWD/opengrok/etc/logging.properties \
    -jar $PWD/opengrok/dist/lib/opengrok.jar \
    -c /snap/bin/ctags \
    -s $PWD/opengrok/src -d $PWD/opengrok/data -H -P -S -G \
    -W $PWD/opengrok/etc/configuration.xml -U http://localhost:8080/source
