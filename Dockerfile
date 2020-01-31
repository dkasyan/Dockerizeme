FROM tomcat
MAINTAINER dkasyan

RUN yum -y install java
RUN java -version

HEALTHCHECK --interval=5m --timeout=2s --retries=4 CMD curl -f http://127.0.0.1:80 || exit 1