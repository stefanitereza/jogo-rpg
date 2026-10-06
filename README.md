# ⚔️ RPG Battle System

Jogo de RPG em turnos desenvolvido em Java (console), com foco na aplicação prática de conceitos fundamentais da Orientação a Objetos: **Classes Abstratas**, **Herança**, **Interfaces**, **Polimorfismo** e **Encapsulamento**.

---

## 🎯 Sobre o Projeto

O jogador escolhe entre duas classes (`Guerreiro` ou `Mago`) e enfrenta um inimigo controlado pelo computador. O combate ocorre em turnos até que um dos participantes tenha a sua vida reduzida a zero.

---

## 🧠 Conceitos de POO Aplicados

* **Classe Abstrata (`Personagem`):** Serve como base para todas as entidades do jogo. Possui atributos privados (`nome`, `vida`, `ataque`, `defesa`), métodos concretos (`receberDano()`, `estaVivo()`) e o método abstrato `atacar(Personagem adversario)`. Não pode ser instanciada diretamente.
* **Herança (`extends`):** As classes `Guerreiro` e `Mago` herdam de `Personagem`, reaproveitando atributos/métodos e implementando o seu próprio ataque básico.
* **Interface (`HabilidadeEspecial`):** Define o contrato `usarHabilidadeEspecial(Personagem adversario)`, implementado por ambas as classes com comportamentos distintos.
* **Polimorfismo:** Os combatentes podem ser manipulados através da referência base (ex.: `Personagem jogador = new Guerreiro(...)`).
* **Encapsulamento:** Todos os atributos são privados e acedidos exclusivamente via getters e setters.

---

## 🏛️ Estrutura das Classes

             Personagem
         <<classe abstrata>>
                  | 
         +--------+--------+
         |                 |   
     Guerreiro           Mago 
         |                 |         
         +--------+--------+
                  |  
                  |  
          HabilidadeEspecial
            <<interface>>

* **Guerreiro** `extends` **Personagem** `implements` **HabilidadeEspecial**
* **Mago** `extends` **Personagem** `implements` **HabilidadeEspecial**

---

## ⚔️ Classes e Atributos

| Classe | Vida | Ataque | Defesa | Habilidade Especial | Efeito |
| :--- | :---: | :---: | :---: | :--- | :--- |
| **Guerreiro** | 100 | 25 | 10 | **Golpe de Fúria** | Dano massivo com ataque dobrado |
| **Mago** | 80 | 30 | 5 | **Bola de Fogo** | Dano mágico com bónus fixo que perfura defesa |

### Regra de Dano Normal
* Dano = Ataque - Defesa do Alvo
* *(Se o resultado for inferior a 1, o dano mínimo aplicado é 1).*

---

## 📂 Estrutura do Repositório

## 📂 Estrutura do Repositório

```text
rpg/
├── src/
│   ├── Guerreiro.java
│   ├── HabilidadeEspecial.java
│   ├── Mago.java
│   ├── Main.java
│   └── Personagem.java
├── .gitignore
└── README.md

---
