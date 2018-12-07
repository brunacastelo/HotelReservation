# HotelReservation
Para a execução do projeto é necessário passar como parâmetro argumentos para a classe HotelReservation. Essa classe é a classe principal do projeto e que contem a main.

É necessário definir dois argumentos:
- args [0] é o caminho que contém o arquivo (.txt) que será lido pelo programa.
- args [1] é o nome do arquivo (.txt) que será lido pelo programa. Este arquivo deve estar no caminho anteriormente passado no parâmetro args[0]

Exemplo de como executar:
 
args [0]: E:\\workspace\\tw\\HotelReservation\\
args [1]: file.txt

Lembrete: o args[0] deve conter dois '\', uma vez que args[0] é uma String e esse caractere precisa ser escapado na String.

Este projeto contém seis classes:

- HotelReservation.java
- ReadFile.java
- Hotel.java
- Lakewood.java
- Bridgewood.java
- Ridgewood.java

A classe principal encontrada em 'HotelReservation.java'. Esta classe contém a base do projeto que será executado.
A classe 'ReadFile.java' é responsável pela leitura e interpretação do arquivo de entrada.
Hotel.java é uma interface que contém os métodos que as classes que a implementa deveram ter. Nesta interface também contém métodos default (Recurso Java 1.8).
Lakewood.java, Bridgewood.java, Ridgewood.java são as classes que implementam a interface Hotel.java. Estas classes contêm as particularidades de cada hotel.

Para o desenvolvimento deste projeto, apliquei o princípio do clean code e Single Responsabilitry.

O diretório de test contém todos os junit implementados. Tais Junit tentam cobrir as mais diversas situações de execução.

IMPORTANTE: É pressuposto que que o arquivo de entrada contém apenas uma única linha. Caso o arquivo contenha mais de uma linha, apenas a primeira será utilizada como insumo de execução.
