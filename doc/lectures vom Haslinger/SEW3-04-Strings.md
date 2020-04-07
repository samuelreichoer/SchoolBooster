# Die Java Klasse String

#### Allgemeines 

- In Java werden Zeichenketten durch die Klasse String repräsentiert.
-  Reihung von Elementen des Typs char.
- Ein String ist eine indizierte Liste von Zeichen.
- Strings sind **unmutable!** (unveränderlich)
- Die Klasse String ist als final definiert, sodass Sie von ihr keine weiteren Klassen
  ableiten können.
- Beachte auch: `StringBuilder` zum Verketten von Strings zu einem neuen String



#### Zeichenextraktion

Jedes Zeichen eines Strings kann über einen Index angesprochen werden. Das erste Zeichen hat den Index 0.

```java
String str = "Dies ist ein Satz.";
char c = str.charAt(5); // i  
String substr = str.substring(9, 12);  //   “ein”
String finstr = str.substring(13); // “Satz.”
```

![alt_text](_img\SEW3-04-StringIndex.png)



#### Länge eines Strings

Länge eines Strings entspricht der Anzahl an Zeichen eines Strings. Die Länge eines leeren Strings ist 0.

```java
String str = "Dies ist ein Satz.";
int length = str.length();  // 18

String empty = ““;
int length = empty.length(); // 0

String empty2 = “ “;
length = empty2.length(); // 1
```



#### Vergleich von Strings 

Mit folgenden `equals` Methoden lassen sich Strings auf Gleichheit untersuchen:

```java
String hallo = new String("hallo");
String HALLO = "HALLO";
boolean gleich = hallo.equals(HALLO);  // false

gleich = hallo.equalsIgnoreCase(HALLO); // true
```

**Beachte**: 

- Im Gegensatz dazu  untersucht der  Vergleichsoperator == die Objekte (Referenz) und nicht
  den Inhalt des Strings auf Gleichheit! Dies ist ein häufiger Fehler!
- Strings, deren Inhalt beim Kompilieren bereits feststeht, z. B. `String s = "Text"`,
  werden nur einmal angelegt (ein String-Pool wird erzeugt). Existieren während des Kompilierens weitere Strings mit dem gleichen Inhalt, verweisen alle auf die gleiche interne Zeichenkette "Text", d. h. auf das gleiche String-Objekt.

```java
String s1 = "Text";
String s2 = "Text";
String s3 = new String("Text");
System.out.println("s1 == s2 : " + (s1 == s2)); // liefert true 
System.out.println("s2 == s3 : " + (s2 == s3)); // liefert false
```



Über eine weitere Methode der Klasse String, die Methode `compareTo`, besteht die Möglichkeit, Strings lexikografisch zu vergleichen. Rückgabewerte sind 0 (bei Gleichheit) oder entsprechend der lexikografischen Ordnung kleiner bzw. größer als 0.

```java
String name1 = "Müller";
String name2 = "Meier";

int res = name1.compareTo(name2); //> 0 (lexikalisch dahinter einzusortieren)

res = name2.compareTo(name1); // < 0 (lexikalisch davor einzusortieren)

res = name1.compareTo(name1);// = 0 (Zeichenketten sind gleich)
```

#### Suche im String

Mit der `indexOf` Methode lassen sich Zeichenketten in Strings finden:

```java
String str = "Dies ist ein Satz.";
int i = str.indexOf(“Satz”); // 13

i = str.indexOf(“existiert nicht”); // -1 (Suchstring wurde nicht gefunden)
i = str.indexOf(“i”); // 1
i = str.indexOf(„i“, 3);  // 5 - Suche beginnat ab Index 3 
```

![alt_text](_img\SEW3-04-StringIndex.png)

#### Ersetzungen im String

Mit den folgenden Methoden lassen sich Ersetzungen in Zeichenketten vornehmen:

```java
String str = "Dies ist ein Satz.";

String newstr = str.toLowerCase(); // dies ist ein satz.

newstr = str.toUpperCase();//DIES IST EIN SATZ.

newstr = str.replace(“ist ein“, “kein”);// Dies kein Satz.
```

![alt_text](_img\SEW3-04-StringIndex_keinSatz.png)



#### Zerlegung eines Strings

Mit der `split` Methode lassen sich Zeichenketten in Teilzeichenketten zerlegen.

```java
String str = "Dies ist ein Satz.";
String[] subs = str.split(" "); // liefert {"Dies", "ist", "ein", "Satz"}
```

#### Iteration durch einen String (Durchlaufen)

Eine Zeichenkette können Sie wie folgt *Zeichen für Zeichen* durchlaufen:

```java
String str = "Beispiel";
for (char c : str.toCharArray()) {
  System.out.println(c);
}
```

Eine Zeichenkette können Sie auch *Wort für Wort* durchlaufen:

```java
String str = "Dies ist ein Beispiel";
for (String w : str.split(" ")) {
  System.out.println(w);
}
```



# Die Klasse StringBuilder

#### Veränderliche Zeichenketten

Die Klasse String bietet keine Möglichkeit, einen String nachträglich zu ändern. Durch Ersetzen von Zeichen eines Strings, werden immer ein neue String-Objekt erzeugt und der entsprechenden Variablen zugewiesen.

Die Klasse StringBuilder stellt einen Datentyp bereit, bei dem sich die Größe dynamisch der gespeicherten Zeichenkette anpasst.

Aufgrund der dynamischen Verwaltung der Zeichenkette sind Operationen, wie z. B. das Verketten von Strings, mit einem StringBuilder in der Ausführung schneller als mit Zeichenketten vom Typ String.
Die Größe des Puffers (Buffer) wird automatisch an die Größe des Strings dynamisch angepasst, sie ist aber größer als die gespeicherte Länge des Strings. Die Vergrößerung des Puffers wird jeweils durch Verdopplung der momentanen Speichergröße erreicht.

**Verwendung:**

```java
StringBuilder sb = new StringBuilder("Das"); // es kann auch der leere Konstruktor 	
											 //verwendet werden
sb.append(" ").append("ist").append(" ");
sb.append("ein").append(" ").append("Satz.");

// es können auch unterschiedliche Parametertypen mit append angehängt werden, wie
// int, double, Object,...

sb.append(" Mit ").append(4).apeend(" Wörtern");
String set = sb.toString(); // Umwandlung in ein String Objekt
```



### Übungsaufgaben

#### Übung 1 - Wordprocessor

Sie sollen nun ein Programm schreiben, dass eine Zeichenkette vom Nutzer einliest, welches einzelne Wörter in dieser Zeichenkette in Abhängigkeit eines Formatierungssymbols komplett in Groß- oder Kleinbuchstaben wandelt.

Die Formatierung funktioniert dabei nach folgendem Prinzip:

- Wird einem Wort ein _ als Formatierungszeichen vorangestellt, so soll dieses Wort komplett großgeschrieben werden.
- Wird einem Wort ein _ als Formatierungszeichen angehängt, so soll dieses Wort komplett klein geschrieben werden
- Ist einem Wort sowohl ein _ vorangestellt als auch angehängt (z.B. ’\_Hello\_’), so gilt das letzte Formatierungszeichen (aus ’\_HellO\_’ wird also bspw. ’hello’).
- Hat ein Wort kein Formatierungszeichen, bleibt es in der Schreibweise bestehen.
- Das Formatierungszeichen _ wird niemals mit ausgegeben (ein _ das in der Mitte eines Wortes steht, gilt allerdings nicht als Formatierungszeichen, z.B. in ’Hello_World’).
- Ein Wort ist von einem anderen Wort durch mindestens ein Leerzeichen getrennt
-  (Satz- und Sonderzeichen gelten als normale einem Wort zugeordnete Zeichen, bspw. wird also `Hello_!!!! World???!`in die Worte `Hello_!!!` und `World???!` zerlegt).



#### Beispiel:

Eingabe: `meiN_  _Name iSt _Hase. Ich weiß BESCHEID._  _wirklich!`

wird wie folgt ausgegeben:

`mein NAME iSt HASE. Ich weiß bescheid. WIRKLICH!!!` 



#### Übung 2 - LineWrapper

Schreibe eine Klasse `LineWrapper` mit einer statischen Methode `String wrapLine(String s, int len)`, die eine Zeichenkette `s`  in kleine Teilzeichenketten der Länge `len` zerlegt und mit Return getrennt  wieder zurückgibt. 
Mit diesem String 

```
Die Klasse String bietet keine Möglichkeit, einen String nachträglich zu ändern.
Durch Ersetzen von Zeichen eines Strings, werden immer ein neue String-Objekt erzeugt und der entsprechenden Variablen zugewiesen.
```

wird zum Beispiel bei einer Zeilenlänge von 20 der folgende String zurückgegeben: 

```
Die Klasse String 
bietet keine 
Möglichkeit, einen 
String nachträglich 
zu ändern. Durch 
Ersetzen von Zeichen 
eines Strings, 
werden immer ein 
neue String-Objekt 
erzeugt und der 
entsprechenden 
Variablen 
zugewiesen.
```