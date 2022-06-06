# このアプリケーションについて

- Kotlin * Spring bootの学習リポジトリです
  - バックエンド学習のためにtrelloを題材としたAPIを開発しています


# 作るもの

- https://devchallenges.io/challenges/wP0LbGgEeKhpFHUpPpDh


# アーキテクチャ

- DDD * オニオンアーキテクチャ　で構成されています。

<img width="627" alt="スクリーンショット 2022-06-06 11 40 21" src="https://user-images.githubusercontent.com/58138538/172085455-5a0bf5b0-74aa-45e9-a318-1998688d9218.png">


<img width="533" alt="スクリーンショット 2022-06-06 11 43 06" src="https://user-images.githubusercontent.com/58138538/172085670-cc09da08-d014-4f5d-8dcf-e50bbf8f4623.png">


※ アプリケーション層はユースケース層と呼び替えている

# パッケージ
オニオンアーキテクチャの各層に応じてパッケージを分けている。それぞれの層に則って実装を進めてください

- main/{hoge}
  - domain
  - usecases
  - presentation
  - infrastructure

# DB

- schemaspyで管理したい

# API仕様

- swaggerで管理したい 

# その他

- 概念モデリングとかは[whismical](https://whimsical.com/trello-HT3T4xCFTPPizny28xZaSW)で実施
