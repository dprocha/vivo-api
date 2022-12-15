# Accelerator Log

## Options
```json
{
  "database" : "postgresql_k8s",
  "gitRepoBranch" : "main",
  "gitRepoUrl" : "https://github.com/dprocha/vivo-api.git",
  "javaVersion" : "11",
  "k8sContextName" : "tap-iterate-admin",
  "namespace" : "vivo-4-0",
  "projectName" : "vivo-api",
  "repositoryPrefix" : "tapf3658e5b.azurecr.io/tap/sc/vivo-4-0"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ engine.transformations[0].validated.merge (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> included
┃ ┃ ┃ ┃ ┗ ┗ Debug vivo-accelerator.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml, db/**, vivo-accelerator.yaml] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#database == 'postgresql_k8s') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Condition (#database == 'postgresql_k8s') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [db/k8s/**]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml matched [db/k8s/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [db/k8s/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [namespace_name->vivo-4-0]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [: sample-api-accelerator-postgres->: vivo-api-postgres]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#database == 'postgresql_azure') evaluated to false
┃ ┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, ReplaceText, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [sample-api-accelerator->vivo-api]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [your-registry.io/project->tapf3658e5b.azurecr....(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [namespace_name->vivo-4-0]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[3].<combo>.transformations[1].transformations[3] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [k8s_context_name->tap-iterate-admin]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [config/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, ReplaceText, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [: sample-api-accelerator->: vivo-api]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [: namespace_name->: vivo-4-0]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [: git_repo_url->: https://github.com...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[4].<combo>.transformations[1].transformations[3] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [: git_repo_branch->: main]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README.md]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [README.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[5].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [sample-api-accelerator->vivo-api]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[6].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [sample-api-accelerator->vivo-api]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[7] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[7].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[7].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .envrc didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug bin/get-db-connection-secret.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/database-claim.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres-claim.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/azure/azure-postgres.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres-claim.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/gcp/cloudsql-postgres.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/k8s/tanzu-postgres.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker-compose.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_pgadmin_servers.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug db/local/docker_postgres_init.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/cloudsql-postgres-claim.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/quote-app.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/rabbitmq.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/runtimeview.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/software-model-entities.drawio.svg didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docs/supply-chain.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DatabaseQuoteService.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/DemoApplication.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/Quote.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/QuoteService.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/SpringSecurityConfiguration.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_quotes_table.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/quotes.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/jquery-3.3.1.min.js didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/DemoApplicationTests.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug vivo-accelerator.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[7].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[7].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [sample-api-accelerator->vivo-api]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[7].<combo>.transformations[1].transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#javaVersion == '17') evaluated to false
┃ ┃ ┃ ┗ ┗ ┗ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[1] (UniquePath)
┃ ┗ ┗ ┗ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┗ ╺ engine.transformations[1] (UniquePath)
```
