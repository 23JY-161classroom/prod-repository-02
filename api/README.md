# Teqnolo API
TeqnoloのバックエンドAPIです。OpenAPI Generatorによりコード生成しています。

## 環境
- **Java 25+**
- Docker / Docker Compose
- Gradle

## プロジェクト構造
```
src/                            # コード本体
src/.../generated               # OpenAPI Generator で生成されたコード
specs/openapi   -> ../openapi   # OpenAPI 仕様書への symlink
Dockerfile                      # Dockerfile
build.gradle
README.md
```

## 開発環境のセットアップ

1. レポジトリのクローン
```
git clone https://github.com/23JY-161classroom/prod-repository-02.git
cd prod-repository-02
```

2. プロジェクトの実行（Hot reload）
```
docker compose -f docker-compose.dev-api.yml up -d
```

3. プロジェクトのテスト
```
# 単発のテスト
./gradew test
./gradlew test -t

# docker環境でテスト（daemonの恩恵がないためやや遅い）
docker run -v "${PWD}:/app" -w /app gradle:jdk25 gradle test
docker run -v "${PWD}:/app" -w /app gradle:jdk25 gradle test -t
```

## OpenAPI Generator によるコード生成
以下のコマンドでコードの生成が可能です。
```
./gradlew openApiGenerate
```
運用面の注意点として、以下留意ください。
- APIの更新がない場合、コードを再生成しない 
  ※再生成してしまった場合は以下のように戻す
  ```
  git checkout src/main/java/teqnolo/teqnolo/api/generated .openapi-generator
  ```
- コード生成とその後の変更では、コミットを分割する

