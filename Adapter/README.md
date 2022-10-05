# Adapter - Padrão de Projeto
A utilização do padrão Adapter promove extensibilidade para um código, possibilitando que não sejam feitas sempre manutenções nele. </br>
Objetivo: converter a interface de uma classe em outra interface esperada pelos clientes. </br>
Adapter permite a comunicação entre classes que não poderiam trabalhar juntas devido à incompatibilidade de suas interfaces. </br>

Pensei em um exemplo onde duas entidades seriam inoperantes diretamente de forma conjunta. </br>
Temos uma rede cliente (interface), onde existe o método de conectar-se a rede de energia. Algo abstrato. </br>
No arquivo "Corrente", temos duas classes: Corrente Contínua e Corrente Alternada, as quais implementam o método da interface RedeCliente. </br>

Em determinado ponto, o cliente exige uma corrente alternada, porém, é provida apenas uma corrente contínua para ele. </br>
O que fazer? Adaptar a rede alternada para que se torne contínua, atendendo a demanda. </br>
