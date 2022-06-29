FROM openjdk:11
# 作業ディレクトリworkを作る

# 作業実行用ユーザーを作る
RUN groupadd -r spring && useradd -r -gspring spring
# 作業実行用ユーザーを指定する

# 実行ファイル(JAR)をコンテナ内の作業ディレクトリにコピーする
COPY build/libs/*.jar work/app.jar
# 実行する