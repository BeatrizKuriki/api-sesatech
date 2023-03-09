# 📋 Indíce

- [Proposta do projeto](#id01)
- [O desafio](#id02)
- [Status do projeto](#id03)
- [Feito com](#id04)
- [Pré-requisitos](#id05)
- [Dificuldades na execução do projeto](#id06)
- [Pessoa desenvolvedora do projeto](#id07)

<h1 align="center"> Desafio Técnico - Rick and Morty - CRUD <a name="id01"></a></h1>

<h2 align="center">🚀 Proposta do projeto </h2>
<p>Desafio técnico de processo seletivo.</p>
<p>Data inicial: 03/03/2023</p>
<p>Prazo final: 09/03/2023</p>
<p>Data de entrega: 09/03/2023</p>
<br>

<h2 align="center">:dart: O Desafio <a name="id02"></a></h2>
<p>Rick and Morty é uma série de animação adulta norte-americana de comédia e ficção científica criada por Justin Roiland e Dan Harmon para o bloco de programação noturno Adult Swim, exibido no canal Cartoon Network. Desejamos criar uma comunidade de fanfic e, para facilitar a vida dos fanfiqueiros, precisamos armazenar os personagens e locais criados por eles, para manter a consistência de suas histórias. Para isso, você deve criar uma API que permita o CRUD de personagens e suas respectivas localidades de nascença.
Recentemente surgiu a necessidade de obter informações específicas dos personagens e seu trabalho é resolver este problema.

- ``Primeira Etapa``: Utilizando as ferramentas de sua preferência, seu trabalho será desenhar e implementar uma API que permita criar, ler, atualizar e deletar personagens e locais das fanfics.

  - Deverá ser possível tanto listar personagens e locais;
  - Deve ser possível requisitar personagens e locais específicos;
  - Informações relevantes de cada personagem:

    - Id
    - Nome
    - Status
    - Espécie
    - Gênero Sexual
    - Origem(nome e link)
    - Local onde foi visto pela última vez(nome e link)
    
    - Informações relevantes de cada local:
      - Nome
      - Dimensão
      - residentes (array com todos os personagens que foram vistos pela última vez nesse local)


<br>



<br>
<h2 align="center">:hourglass: Status do projeto <a name="id03"></a></h2>
<h4> :white_check_mark: FINALIZADO :white_check_mark: </h4>


<br>



<br>
<h2 align="center"> 🛠 Feito com <a name="id04"></a></h2>

- ``Java``
- ``Spring``
- ``Banco de dados de teste H2``
- ``JPA``
- ``Banco de dados PostgreSQL``




<h2 align="center"> 📝 Rodando a API localmente <a name="id05"></a></h2>

```bash

➩ Clone este repositório
$ git clone <https://github.com/BeatrizKuriki/api-sesatech.git>

➩ Acesse o código com STS Eclipse ou outro editor de sua preferência

➩ Utilize a branch main
$ git checkout main

➩ Instale as dependências que estão no pom.xml(normalmente o proprio editor instala as dependências)

➩ Rode a aplicação

➩ O servidor inciará na porta:8080 por default - acesse <http://localhost:8080>
```
<h2>Recursos disponíveis</h2>

- [x] **Cadastro de Personage - POST:**
<br>Caminho local: http://localhost:8080/character1
- [X] **Buscar todos os Personagens - GET:**
<br>Caminho local: http://localhost:8080/character1
- [X] **Buscar personagem por ID - GET:**
<br>Caminho local: http://localhost:8080/character1/{id}
- [x] **Exclusão de personagem - DELETE:**
<br>Caminho local: http://localhost:8080/character1/{id}
- [X] **Atualização de clientes - PUT:**
<br>Caminho local: http://localhost:8080/character1/{id}
-----------------------------
- [x] **Cadastro de Locais - POST:**
<br>Caminho local: http://localhost:8080/locations
- [X] **Buscar todos os locais - GET:**
<br>Caminho local:  http://localhost:8080/locations
- [x] **Exclusão de Local - DELETE:**
<br>Caminho local: http://localhost:8080/locations/{id}
- [X] **Atualização de Locais - PUT:**
<br>Caminho local: http://localhost:8080/locations/{id}
- [X] **Buscar locais por ID - GET:**
<br>Caminho local: http://localhost:8080/locations/{id}
------------------------------

<h3>✏️ Exemplo de Json para criação de Personagem:<br></h3>

![image](https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/JSONCriaPersonagem.png)

<h3>✏️ Exemplo de Json para Atualização de personagem:<br></h3>

![image](https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/JSONUpdatePersonagem.png)

<h3>✏️ Exemplo de Json para criação de Local:<br></h3>

![image](https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/JsonCriaLocal.png)

<h3>✏️ Exemplo de Json para atualização de Local:<br></h3>

![image](https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/JSONUpdateLocal.png)



<h2 align="center">:camera_flash: Dificuldades na execução do projeto <a name="id06"></a></h2>

<p>Os campos location e origin foram criandos como Strings contendo apenas um valor e não um objeto, porque ao tentar criar um objeto com eles utilizando o relacionamento muitos para muitos, como mostra a figura abaixo, não era possível fazer atualizações e criações de novas entitades por motivos de violação de integridade por causa da chave estrangeira.</p>
<p>Acredito que o problema seja o tipo de mapeamento utilizado, cheguei a fazer algumas pesquisas para solucionar esse obstáculo mas restaram infrutíferas.</p>
<p align="center"><img src="https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/telaMapeamento.png" width="800px"></p>
<br>

<p align="center"><img src="https://github.com/BeatrizKuriki/assetsDesafioTecnico/blob/main/DeleteMostrandoErrodeViolatioIntegrity.png" width="800px"></p>
<br>



<br>
<h2 align="center"> :sunglasses: Pessoa desenvolvedora do projeto <a name="id07"</h2>

| <img src="https://github.com/BeatrizKuriki/SistemaEnvioDeEmail/blob/main/assets/beatrizdev.jpg" width=115><br><sub>Beatriz Alencar Kuriki</sub> | 
| :---: |
