FROM openjdk:11
# 作業ディレクトリworkを作る
RUN mkdir work
# 作業実行用ユーザーを作る
RUN groupadd -r spring && useradd -r -gspring spring
# 作業実行用ユーザーを指定する
USER spring:spring
# 実行ファイル(JAR)をコンテナ内の作業ディレクトリにコピーする
COPY build/libs/*.jar work/app.jar
# 実行する
ENTRYPOINT ["java", "-jar", "/work/app.jar"]