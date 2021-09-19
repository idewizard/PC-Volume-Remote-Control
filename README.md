# PC-Volume-Remote-Control
## Projeto para controlar o volume do PC a partir do celular e finalmente parar de levantar da cama quentinha para ajustar o volume do PC. 😂


**Como usar**: Existem **duas** pastas no repositório

- voume-control: Aplicação Spring que deve ser rodada no PC (código fonte)
- RemoteControl: Aplicação Android que deve ser instalada no Android (código fonte)


# Parte do PC

Baixe a pasta *voume-control* (eu sei 😒) e importe ela como projeto maven na IDE de sua preferência (eu recomendo Intellij) e gere a sua JAR.
use o comando "shell:startup" no autorun do (Windows+R) e cole um atalho para o arquivo JAR.
ou pode usar um script que rode direto basta usar o comando "java -jar nome_da_sua_jar.jar" e rodar esse script no startup do windows.
_obs: veja as portas configuradas (atual é 8089)!



# Parte do Android

Baixe a pasta *RemoteControl* e abra ela na sua IDE para desenvolvimento Android de preferência (eu recomendo Android Studio).
**vá na MainActivity.class e altere a String "URL" modificando o IP para o IP local da sua máquina** (o jeito mais fácil de descobrir o seu ip local
é rodando o comando "ipconfig" no CMD do Windows)

Habilite as opções de Desenvolvedor no seu Android, habilite a opção "USB Debbuging", conecte seu celular ao PC e dê permissão para acesso.
Rode a aplicação com o Target sendo o seu celular.

Também é possível gerar uma APK e instalar direto no Android, mas é necessário habilitar uma opção que baixa a segurança do Android, então não recomendo.

_obs: esse projeto é apenas uma brincadeira usando Requsições HTTP, Spring Boot, Android, Powershell para um propósito simples portanto ele só funciona na sua 
rede local, ou seja, o seu PC e o seu celular precisam estar na mesma rede._

_Você pode checar se esta rodando pois vai ter um "java.exe" rodando no seu gerenciado de tarefas_
