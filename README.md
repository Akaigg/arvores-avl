# Árvores AVL - Exercício de Inserção
# 📝 Descrição
Este projeto é um exercício acadêmico sobre Árvores AVL, uma estrutura de dados de árvore binária de busca auto-balanceada. O objetivo é implementar a lógica de inserção de valores em uma árvore AVL, garantindo que ela permaneça balanceada após cada inserção. O trabalho inclui a criação de um pseudocódigo, uma implementação em Java e a visualização das árvores resultantes para sequências específicas de inserção.

# 🎯 Objetivo
# O exercício consiste em:

Desenvolver um pseudocódigo que descreva a lógica de inserção em uma árvore AVL, incluindo o balanceamento por meio de rotações.
Implementar o pseudocódigo em Java, com uma classe que suporte a inserção e balanceamento da árvore.
Testar a implementação com três sequências de valores fornecidas:
Sequência 1: 40, 20, 60, 10, 30, 25
Sequência 2: 60, 40, 80, 35, 50, 90, 20, 38, 37
Sequência 3: 30, 20, 10, 25, 40, 50, 5, 35, 45


# 📂 Estrutura do Projeto
# O projeto contém os seguintes arquivos:

Pseudocódigo: Descrição detalhada da lógica de inserção em uma árvore AVL, incluindo verificação de balanceamento e rotações (disponível em pseudocode.txt ou no relatório).
Código Java: Implementação da árvore AVL em Java, com classes para nós e operações de inserção, balanceamento e impressão (AVLTree.java).
Desenho das Árvores: Representação textual ou gráfica das árvores resultantes para cada sequência (disponível no relatório ou como imagens em trees/).
README.md: Este arquivo, explicando o projeto e como utilizá-lo.


# 🔍 Descrição da Implementação

#O pseudocódigo descreve a lógica de inserção em uma árvore AVL, que segue os passos de uma árvore de busca binária (BST) com adição de:

Atualização da altura dos nós.
Verificação do fator de balanceamento.
Aplicação de rotações (simples ou duplas) para manter o balanceamento:
Left-Left (LL): Rotação à direita.
Left-Right (LR): Rotação à esquerda seguida de rotação à direita.
Right-Right (RR): Rotação à esquerda.
Right-Left (RL): Rotação à direita seguida de rotação à esquerda.



Código Java
A implementação em Java inclui:

Classe Node: Representa um nó da árvore com valor, altura e ponteiros para subárvores esquerda e direita.
Classe AVLTree:
Métodos para inserção (insert), cálculo de altura (height), balanceamento (getBalance) e rotações (rotateLeft, rotateRight).
Um método de impressão em pré-ordem (preOrder) para verificar a estrutura da árvore.
Testes no método main para as três sequências fornecidas.


Saída: O programa imprime cada sequência de inserção e a árvore resultante em pré-ordem.

Árvores Resultantes
As árvores foram construídas passo a passo para cada sequência. A estrutura final de cada uma é descrita abaixo (detalhes no relatório ou código):

Sequência 1: Árvore balanceada com raiz 40.
Sequência 2: Árvore balanceada com raiz 60.
Sequência 3: Árvore balanceada com raiz 20, após uma rotação à direita durante a inserção.


📊 Resultados
A execução do programa gera as seguintes árvores (em pré-ordem):

Sequência 1: 40, 20, 10, 30, 25, 60
Sequência 2: 60, 40, 35, 20, 38, 37, 50, 80, 90
Sequência 3: 20, 10, 5, 30, 25, 40, 35, 45

Os desenhos das árvores estão descritos no relatório ou representados graficamente em trees/.

🛠️ Instruções para Entrega

Formato: Compacte o projeto em um arquivo .zip contendo o código, pseudocódigo e desenhos. Alternativamente, hospede em um repositório GitHub.
Equipe: Informe ao professor os membros da equipe (máximo de 4 pessoas) para registro.
Prazo: Entregue dentro do prazo estipulado para garantir a pontuação extra (1 ponto na nota da prova).
Testes: Verifique a saída do programa para confirmar a corretude da implementação.


💡 Observações

O código foi testado com as sequências fornecidas e está funcional.


👥 Equipe

Vitor Machado Blume
Rhuan José Voltolini
Matheus Karpinski


Desenvolvido para a disciplina de Estruturas de Dados II, Universidade da Região de Joinville - UNIVILLE, Semestre6/2025.
