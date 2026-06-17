# チーム開発SNS (仮) API仕様書

チーム開発SNS(仮)で構築する Web API の API仕様書。OpenAPI 3.1.0の形式で定義し、コードの自動生成などに使用する。

## 開発方法
OpenAPIの開発にあたって Redocly の使用を推奨する。

以下のコマンドでインストールを行う。
```bash
pnpm i -g @redocly/cli
```
### プレビュー
Redoclyはプレビュー機能を有しており、以下のコマンドでプレビュー可能

```bash
redocly preview
```

### Lint
以下のコマンドでLintが可能。
```bash
redocly lint ./openapi/openapi.yaml
```
プロジェクトのルートに配置された `redocly.yaml` では Lint のルールを定義している。このルールはGitHub Actionsによるワークフローでも評価している。
今後OpenAPI Generatorなどを実験し、必要な項目などが分かり次第Lintのルールに追加していく。

### ドキュメント生成
PDF形式のエクスポートはできないが、HTML形式のエクスポートが可能なため、これを使って静的ファイルの形にエクスポートすることができる。

```bash
redocly build-docs
```

## 変更方法

変更作業を行う際は、基本的には [GitHubフロー](https://docs.github.com/ja/get-started/using-github/github-flow) に従って変更すること。**mainブランチ直接へのコミットは禁止していないが、これはあくまでGitHubの無料プランでは設定できないため。**

以下のような、全体に関わる変更を行う際には、Pull Request を送る前に Issue を作成する。可能であれば他のメンバーにメンションを飛ばして、レビューを受けること。
- 新規エンドポイントの追加
- パラメーター構成や仕様の大幅な変更
- Redocly のルール変更
- GitHub Actions の Workflow 変更

反対に、以下のような影響の小さい変更に関しては、Issueを立てる必要はない。
- 誤字脱字の修正
- 説明文の修正
- パラメーター追加やフィールドの追加等（DBや画面の設計に変更が出る場合は、Issueを立ててからPull Requestを飛ばす方針とする）

以下の条件を満たさないコードを main ブランチにマージしないこと。

- Redocly による Lint を通過していない変更
- Issue を立てずに行った重大な変更

## 開発ルール

### エラーの取り扱い
エラーの表示には必ず `ProblemDetail` を使う。また、失敗する可能性のあるAPIでは必ずレスポンスを定義し、`example` を必ず指定する。ここには、`detail`と`title` は最低限定義する。
```yaml
responses:
    "204":
        description: ユーザー登録に成功した
    "401":
        description: 対象のリソースにアクセスする権限がない
        example:
            title: 認可エラー
            detail: 対象のリソースにアクセスする権限がありません
```

