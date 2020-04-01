$ sudo apt-get install openjdk-8-jdk
$ sudo apt-get remove exuberant-ctags
$ sudo snap install universal-ctags

$ wget -c https://github.com/oracle/opengrok/releases/download/1.3.11/opengrok-1.3.11.tar.gz
$ wget -c https://mirrors.estointernet.in/apache/tomcat/tomcat-8/v8.5.53/bin/apache-tomcat-8.5.53.tar.gz

$ tar xvf apache-tomcat-8.5.53.tar.gz
$ mv apache-tomcat-8.5.53 tomcat

$ mkdir -p $PWD/opengrok/{src,data,dist,etc,log}
$ tar -C $PWD/opengrok/dist --strip-components=1 -xzf opengrok-1.3.11.tar.gz

$ cp $PWD/opengrok/dist/doc/logging.properties $PWD/opengrok/etc
$ cp $PWD/opengrok/dist/lib/source.war tomcat/webapps/

Example :

$ cd $PWD/opengrok/src
$ git clone https://github.com/githubtraining/hellogitworld.git
$ git clone https://github.com/OpenGrok/OpenGrok



