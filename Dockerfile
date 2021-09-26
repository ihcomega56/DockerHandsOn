FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=password

COPY my.cnf /etc/mysql/conf.d/my.cnf
COPY create-profiles.sql /docker-entrypoint-initdb.d/create-profiles.sql