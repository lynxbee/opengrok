#!/bin/bash
TOMCAT_DIR=$PWD/tomcat

export CATALINA_BASE=$TOMCAT_DIR
export CATALINA_HOME=$TOMCAT_DIR
export CATALINA_TMPDIR=$TOMCAT_DIR/temp/
# OpenGrok exports
export OPENGROK_TOMCAT_BASE=$CATALINA_HOME
export OPENGROK_WAR_TARGET_TOMCAT=$TOMCAT_DIR/webapps/

export OPENGROK_INSTANCE_BASE=$PWD/opengrok/src/

#start tomcat server, 
bash $PWD/tomcat/bin/startup.sh
# server will be started at http://localhost:8080/


