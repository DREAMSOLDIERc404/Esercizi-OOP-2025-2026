# Opinioni

## Punti 1-3

Per compilare correttamente bisogna posizionarsi in `ESECUZIONE/` ed eseguire
il segunete comando:

```
...\ESECUZIONE> javac -d bin -cp ..\..\21-compilation-with-packages\ESECUZIONE\bin .\src\compilation\lab\math\UseComplex.java
```

## Punti 4-5
Per far andare i codici l'unica è includere nell class path anche il bin dell'es 21, è un po' più macchinoso con il mio tree di come lo fa nella consegna:

```
...\ESECUZIONJE> java -cp "bin;..\..\21-compilation-with-packages\ESECUZIONE\bin" compilation.lab.math.UseComplex
```