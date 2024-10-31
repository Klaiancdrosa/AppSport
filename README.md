# **App Sport**
&gt; Desenvolvido para ajudar o usuário a cálcular a distância percorrida pelo menos através da contagem de passo ou elementos.

## Descrição
O **App Sport** permite ao usuário trocar entre imagens selecionada e telas do cardápio.

## Funcionalidades
- [x] Entrada de dados (Passo, Tamanho dos passos e se estava correndo  )
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **CoordinatorLayout, BarLayout e CollapsingTooBarLayout** para interface responsiva e dinâmica
- [x] **TextView**,**Image Button**,**CheackBox**e**RadioButton** para exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/AppSport.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.example.appsport
│ │ │ │ | ├── MainActivity.java # Atividade aonde ocorre os cálculos dos passos.
│ │ │ │ | ├── SplashActivityIni.java # Atividade aonde ocorre o GIF de abertura do aplicativo. 
| │ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ | ├── activity_main.xml # Layout da tela do Fit Pulse  
│ │ │ │ │ ├── activity_splash_ini.xml # Layout da tela de início  
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **CoordinatorLayout, BarLayout e CollapsingTooBarLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade e entendimento.

## Tela do App Sport
**Tela Principal**
Tela que permite ao usuário realizar o cálculos da distañcia percorrida através da quantidade de passos inseridas.

![image](https://github.com/user-attachments/assets/c6e77696-c0a2-467f-9ef1-cd1d74d7bae8)

![image](https://github.com/user-attachments/assets/e88d3b5c-70dc-4a8b-b0c6-c1a7a4f98ace)

![image](https://github.com/user-attachments/assets/b9de2a95-7d9b-428b-9da3-de124778e94d)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
