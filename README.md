# TestsUnit

##Pour commencer

Assurez vous d'avoir docker sur votre machine

##Pour tester

placez vous dans le dossier .docker et faites
```
docker build -it calculatrice .
```

l'image docker "calculatrice" sera  donc crée en local. Pour lancer ensuite, faites un :
```
docker run calculatrice
```

cette commande exécutera automatiquement le code et vous pourrez voir le résultat des tests.