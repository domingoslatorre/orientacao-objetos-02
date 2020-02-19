# Instruções Git e GitHub

## O que é o Git
- Sistema de controle de versão de arquivos
- Versionamento de um projeto de software
- Possibilidade de trabalho em equipe de forma organizada

## O que é o GitHub
- Plataforma para armazenamento de repositórios git
- Oferece outras ferramentas como de PM, issues, code review

## Roteiro básico do git

### Instalação

```
https://git-scm.com/
```

### Configuração Inicial

```
$ git config
```

**--system** (todos os usuários do sistema operacional)
```
$ git config --system 
```

**--global** (somente para o usuário atual)
```
$ git config --global 
```

**--local** (apenas no repositório)
```
$ git config --local 
```

**Proxy** (labs ou em outros locais que possuem proxy)
```
$ git config --global http.proxy http://10.100.4.253:3128
```

**Nome e E-mail** (nos labs ou em outros locais que possuem proxy)
```
$ git config --global user.name "Seu Nome"
$ git config --global user.email "seu@email.com"
```

**Verificar as configurações**
```
$ git config --list
$ git config user.email
```

### Obter um Repositório Git

**Iniciar do zero**
```
$ git init
```
Cria um novo subdiretório chamado `.git` que contém todos os arquivos necessários de seu repositório

**Obter uma cópia**:
```
$ git clone https://github.com/domingoslatorre/orientacao-objetos-02.git
```
Isso cria um diretório chamado `orientacao-objetos-02`, com um diretório .git dentro dele e recebe todos os arquivos do repositório. 

### Registrar mudanças em um repositório git

![](https://git-scm.com/book/en/v2/images/lifecycle.png)

**Verificar status dos arquivos**
```
$ git status

On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)
```
```
$ git status -s
```

**Adicionar um arquivo**
```
$ git add README.md
```

```
$ git status

On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   README.md
```

**Ignorar Arquivos**
Criar o arquivo `.gitignore`
```
TODO
```

**Commitar os Arquivos**
Criar o arquivo `.gitignore`
```
git commit -m "Mensagem descritiva do que foi realizado"
```

```
git log
git log --oneline
```


## Trabalhando com repositórios remotos
```
git remote -v
```

```
git remote add <nome> <url>
```
```
git remote add origin <url>
```

```
git push -u origin master
```