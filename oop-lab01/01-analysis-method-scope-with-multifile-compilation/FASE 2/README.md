## Osservazioni

Ho compilato in tutti e tre i modi:

### Alternativa 1 

```
javac TestScopesMain.java
javac Scopes.java
```

### Alternativa 2

```
javac TestScopesMain.java Scopes.java
```
### Alternativa 3

```
javac *.java
```

### Il programma compila perfettamente

Inoltre **esegue**, ma non da errori solo quando eseguo TestScopesMain:

```
$>java Scopes

Error: Main method not found in class Scopes, please define the main method as:
   public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application

$>java TestScopesMain

[build method:] I can access the field a (1), the field b (2), the input parameter a (1) and the input parameter b (2).
[dummyMethod:] I can access the field a (1), the field b (2) and the input parameter c (3).
[dummyMethod2:] I can access the field a (1), the field b (2), the input parameter a (4), and the loca

```

