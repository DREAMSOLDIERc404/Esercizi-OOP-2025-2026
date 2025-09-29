# NOTE  

Ho eseguito i seguenti comandi
```
//Per generare la cartella bin
..\ESECUZIONE> mkdir bin 

//Per compilare
..\ESECUZIONE> javac -d bin src\compilation\lab\math\ComplexNum.java

//Per eseguire
..\ESECUZIONE> java -cp bin compilation.lab.math.ComplexNum
``` 

Per compilare è necessario settare con cp la cartella di build al suo interno ci sono i path di package che se in **src sono facoltativi** in **build sono indispensabili** e non puoi modificarli! E quelli si aspetta! una volta 

# Per il punto 9

```
..\ESECUZIONE> cd bin\compilation\lab\math
..\math> java ComplexNum

/*NON FUNZIONA*/
```

L'unico modo è creare un'altra volta il package e nella cartella corrente `math\` creare di nuovo `compilation\lab\math\ComplexNum.java`

e poi lanciare:

```
java compilation.lab.math.ComplexNum
```