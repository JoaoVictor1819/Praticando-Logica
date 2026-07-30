# meu projeto 

git init
- inicia um novo projeto com git 

git add <nome-arqivo>/.
- add os arquivos estao pronto para serem commitados

git commit -m "Mensagem commit"
- commit os arquvis no historico

git log --oneline
- mostra os utimos commits, log de alteracao

git status
- como esta o estado da ramificacao 

git diff
- o que tem de alteracao na ramificacao

git merge
- merge de ramificacao, mescla ramificoes 

git branch 
- mostra a branch atual


git checkout <nome-da-branch>
- muda para essa branch

git branch -b <nome-da-branch>
- cria uma nova branch apartir do historico da branch atual

git remote add <nome> <url>
- adiciona um novo repositorio remoto

git push <nome> ou <url> e <nome-da-branch>
- manda as alteracoes locais para o repositorio remoto, para cada branch

git pull <nome> <nome-da-branch>
- pega as alteracoes do repositorio remoto, e joga para a maquina local

git fetch 
- atualiza o historico local de acordo com o historico salvo la no repositorio remoto

