# このアプリケーションについて

- Kotlin * Spring bootの学習リポジトリです

# 方針

- springboot MVCで一旦書いて慣れる
  - 慣れた後にクリーンアーキテクチャを取り込んでみる

  

  


# メモ

- serviceクラスはアプリケーションの業務ロジックなのでusecasesに入る気がしている。しかしusecaseはフレームワークなどに依存させないと思うので/usecases/service内で@serviceアノテーションをつけてクラスをつけるとおかしい気がしている