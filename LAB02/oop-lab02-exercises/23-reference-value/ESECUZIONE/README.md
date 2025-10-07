# NOTE

## Previsione output

La previsione dell'output è la seguente:  


```
-OUTPUT CallByValue-

//La funzione è void e il parametro non viene
//passato per riferimento quindi la modifica non ha effetto
x=1


-OUTPUT CallByReference1-

x=2;y=3;z=4


-OUTPUT CallByReference2-

[main] x=11;y=12;z=13


```

## Risultato ottenuto

Il risultato ottenuto con i miei commenti:

```
-OUTPUT CallByValue-

//Ci ho preso!
x=1


-OUTPUT CallByReference1-

//Sono stupido! logicamente i dati stampati sono double e quindi println() li stampa in 0.0
x=2.0;y=3.0;z=4.0


-OUTPUT CallByReference2-

//Qua non avevo letto per niente! Tutto sbagliato
[print] x=11.0;y=12.0;z=13.0
[main] x=1.0;y=2.0;z=3.0

```
**NOTA A MARGINE**  
## NON ESISTE IN JAVA IL PASSAGGIO PER REFERNCE SOLO PER VALUE!!!

*PERCIÒ QUANTO HO DETTO NELLA SPECULAZIONE ALL'INIZIO È SBAGLIATO E LA **CONSERVAZIONE DEI VALORI NON C'È** PERCHÉ PER OGNI TIPO DI ENTITÀ QUANDO NOI LO PASSIAMO COME ARGOMENTO, A QUESTO VERRÀ **SEMPRE** ESTRATTO IL VALORE CHE VERRÀ **SEMPRE** MESSO IN UNA NUOVA VARRIABILE ACCESSIBILE INTERNAMENTE DALLA FUNZIONE*