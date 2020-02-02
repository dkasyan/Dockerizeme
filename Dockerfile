FROM tomcat
MAINTAINER dkasyan

RUN yum -y install wget
RUN wget https://cdn.azul.com/zulu/bin/zulu11.37.17-ca-jdk11.0.6-linux_x64.tar.gz


HEALTHCHECK --interval=5m --timeout=2s --retries=4 CMD curl -f http://127.0.0.1:80 || exit 1