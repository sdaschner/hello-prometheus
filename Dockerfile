FROM open-liberty:javaee7

COPY openliberty/server.xml /config/

COPY target/hello-prometheus.war /config/dropins/
