# TODO

- [x] Configuração inicial do spring
- [x] Configuração do docker-compose kafka
- [x] rota web para producer
- [x] producer e consumer simples
- [x] producer e consumer json
- [ ] teste *unitário e de integração
- [ ] Documentação com guia de uso
- [ ] \+ cobertura de teste
- [ ] \+ configuração de kafka com autenticação
- [ ] \+ topico com arvo
- [ ] Config SonarQube


## SonarQube
````sh
./mvnw clean verify sonar:sonar \
  -Dsonar.projectKey=spring-kafka \
  -Dsonar.projectName='Spring Kafka' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_be05018d8e8179bd9a867611de3e3040fbb0730e
````

testSonar123!
sqp_be05018d8e8179bd9a867611de3e3040fbb0730e