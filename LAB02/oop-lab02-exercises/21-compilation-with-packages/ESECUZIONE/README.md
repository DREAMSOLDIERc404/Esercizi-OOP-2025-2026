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
...\ESECUZIONE> cd bin\compilation\lab\math
...\math> java ComplexNum

/*NON FUNZIONA*/
```

Per ben **2 motivi**:

- Manca il percorso di package alla classe
- Non c'è riferimento alla main folder di build ( `bin/` )

e poi lanciare:

```
...\math> java -cp "..\..\..\..\bin" compilation.lab.math.Comple
```