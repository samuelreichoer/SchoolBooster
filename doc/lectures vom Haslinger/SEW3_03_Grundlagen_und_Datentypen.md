# Java Grundlagen und Datentypen

Bevor wir uns in diesem Kapitel mit den Datentypen von Java befassen, sollen zunächst einmal die  wichtigsten lexikalischen Eigenschaften der Sprache vorgestellt werden. Hierzu zählen der  Eingabezeichensatz, die Kommentare und die Struktur von Bezeichnern. 

### Eingabezeichen 

Ein Java-Programm besteht aus einer Folge von Unicode-Zeichen. Der Unicode-Zeichensatz fasst eine große Zahl internationaler Zeichensätze zusammen und integriert sie in einem einheitlichen Darstellungsmodell. Da die 256 verfügbaren Zeichen eines 8-Bit-Wortes bei weitem nicht ausreichen, um die über 30.000 unterschiedlichen Zeichen des Unicode-Zeichensatzes darzustellen, ist ein Unicode-Zeichen 2 Byte, also 16 Bit, lang. Der Unicode ist mit den ersten 128 Zeichen des ASCII- und mit den ersten 256 Zeichen des ISO-8859-1-Zeichensatzes kompatibel. 



### Kommentare

  Es gibt in Java drei Arten von Kommentaren:  

- *Einzeilige Kommentare* beginnen mit  // und enden am Ende der aktuellen Zeile. 
- *Mehrzeilige Kommentare* beginnen mit /* und enden mit */.  Sie können sich über mehrere Zeilen erstrecken. 
- *Dokumentationskommentare* beginnen mit /** und enden mit */ und können sich ebenfalls über mehrere Zeilen erstrecken. 

Kommentare derselben Art sind nicht schachtelbar. Ein Java-Compiler akzeptiert aber einen einzeiligen innerhalb eines mehrzeiligen Kommentars und umgekehrt.  
Dokumentationskommentare dienen dazu, Programme im Quelltext zu dokumentieren. Mit Hilfe des Tools **javadoc** werden sie aus der Quelle extrahiert und in ein HTML-Dokument umgewandelt.



### Bezeichner

Ein Bezeichner ist eine Sequenz von Zeichen, die dazu dient, die Namen von Variablen, Klassen oder Methoden zu spezifizieren. Ein Bezeichner in Java kann beliebig lang sein, und alle Stellen sind signifikant. Bezeichner müssen mit einem *Unicode-Buchstaben* beginnen (das sind die Zeichen 'A' bis 'Z', 'a' bis 'z', '_' und '$') und dürfen dann weitere Buchstaben oder Ziffern enthalten.

Java-Bezeichner dürfen jedoch nicht mit Schlüsselwörtern, den booleschen Literalen **true** und **false**
oder dem Literal **null** übereinstimmen.



### Operatoren

Operatoren sind Zeichen, die zusammen mit Operanden für die Berechnung eines Ausdrucks (engl. expression) bzw. die Ermittlung eines Wertes verwendet werden. Die meisten Sprachen besitzen unäre und binäre Operatoren. 
**Unäre** (einstellige) Operatoren werden auf nur einen Operanden angewendet. Der Vorzeichen-Operator '-' (Minus) ist ein unärer Operator. Er ändert das Vorzeichen des ihm folgenden Operanden. Beim Ausdruck -1 wird der Vorzeichen-Operator auf die Konstante 1 angewendet und diese so in eine negative Zahl umgewandelt.
**Binäre** (zweistellige) Operatoren werden auf zwei Operanden angewendet. Bei der Addition werden beispielsweise zwei Operanden über den Additionsoperator verknüpft.

Seltener gibt es auch **ternäre** (dreistellige) Operatoren. In den Sprachen C/C++, JavaScript oder Java existiert beispielsweise nur der Fragezeichen-Operator mit drei Operatoren. Liefert in der Anweisung *Ausdruck ? b : c* der *Ausdruck* den Wert wahr, wird der Wert von b zurückgegeben, anderenfalls der Wert von c.

#### Arithmetische Operatoren

| **Operator** | **Bezeichnung**      | **Bedeutung**                                                |
| ------------ | -------------------- | ------------------------------------------------------------ |
| +            | Positives Vorzeichen | +n ist gleichbedeutend mit n                                 |
| -            | Negatives Vorzeichen | -n kehrt das Vorzeichen von n um                             |
| +            | Summe                | a + b ergibt die Summe von a und b                           |
| -            | Differenz            | a - b ergibt die Differenz von a und b                       |
| *            | Produkt              | a * b ergibt das Produkt aus a und b                         |
| /            | Quotient             | a / b ergibt den Quotienten von a und b                      |
| %            | Restwert             | a % b ergibt den Rest der ganzzahligen Division von a durch b. In Java läßt sich dieser Operator auch auf Fließkommazahlen anwenden. |
| ++           | Präinkrement         | ++a ergibt a+1 und erhöht a um 1                             |
| ++           | Postinkrement        | a++ ergibt a und erhöht a um 1                               |
| --           | Prädekrement         | --a ergibt a-1 und verringert a um 1                         |
| --           | Postdekrement        | a-- ergibt a und verringert a um 1                           |

#### Relationale Operatoren

| **Operator** | **Bezeichnung** | **Bedeutung**                                                |
| ------------ | --------------- | ------------------------------------------------------------ |
| ==           | Gleich          | a == b ergibt true, wenn a gleich b ist. Sind a und b Referenztypen, so ist der Rückgabewert true, wenn beide Werte auf dasselbe Objekt zeigen. |
| !=           | Ungleich        | a != b ergibt true, wenn a ungleich b ist. Sind a und b Objekte, so ist der Rückgabewert true, wenn beide Werte auf unterschiedliche Objekte zeigen. |
| <            | Kleiner         | a < b ergibt true, wenn a kleiner b ist.                     |
| <=           | Kleiner gleich  | a <= b ergibt true, wenn a kleiner oder gleich b ist.        |
| >            | Größer          | a > b ergibt true, wenn a größer b ist.                      |
| >=           | Größer gleich   | a >= b ergibt true, wenn a größer oder gleich b ist.         |

#### Logische Operatoren

| **Operator** | **Bezeichnung** | **Bedeutung**                                                |
| ------------ | --------------- | ------------------------------------------------------------ |
| !            | Logisches NICHT | !a ergibt false, wenn a wahr ist, und true, wenn a false ist. |
| &&           | UND             | a && b ergibt true, wenn sowohl a als auch b wahr sind. Ist a bereits falsch, so wird false zurückgegeben und b nicht mehr ausgewertet. |
| \|\|         | ODER            | a \|\| b ergibt true, wenn mindestens einer der beiden Ausdrücke a oder b wahr ist. Ist bereits a wahr, so wird true zurückgegeben und b nicht mehr ausgewertet. |
| &            | UND             | a & b ergibt true, wenn sowohl a als auch b wahr sind. Beide Teilausdrücke werden ausgewertet. |
| \|           | ODER            | a \| b ergibt true, wenn mindestens einer der beiden Ausdrücke a oder b wahr ist. Beide Teilausdrücke werden ausgewertet. |
| ^            | Exklusiv-ODER   | a ^ b ergibt true, wenn beide Ausdrücke einen unterschiedlichen Wahrheitswert haben. |

#### Bitweise Operatoren

| **Operator** | **Bezeichnung**                | **Bedeutung**                                                |
| ------------ | ------------------------------ | ------------------------------------------------------------ |
| ~            | Einerkomplement                | ~a entsteht aus a, indem alle Bits von a invertiert werden.  |
| \|           | Bitweises ODER                 | a \| b ergibt den Wert, der entsteht, wenn die korrespondierenden Bits von a und b miteinander ODER-verknüpft werden. |
| &            | Bitweises UND                  | a & b ergibt den Wert, der entsteht, wenn die korrespondierenden Bits von a und b miteinander UND-verknüpft werden. |
| ^            | Bitweises Exklusiv-ODER        | a ^ b ergibt den Wert, der entsteht, wenn die korrespondierenden Bits von a und b miteinander Exklusiv-ODER-verknüpft werden. |
| >>           | Rechtsschieben mit Vorzeichen  | a >> b ergibt den Wert, der entsteht, wenn alle Bits von a um b Positionen nach rechts geschoben werden. Falls das höchstwertige Bit gesetzt ist (a also negativ ist), wird auch das höchstwertige Bit des Resultats gesetzt. |
| >>>          | Rechtsschieben ohne Vorzeichen | a >>> b ergibt den Wert, der entsteht, wenn alle Bits von a um b Positionen nach rechts geschoben werden. Dabei wird das höchstwertige Bit des Resultats immer auf 0 gesetzt. |
| <<           | Linksschieben                  | a << b ergibt den Wert, der entsteht, wenn alle Bits von a um b Positionen nach links geschoben werden. Das höchstwertige Bit (also das Vorzeichen) erfährt keine besondere Behandlung. |

#### Zuweisungsoperatoren

| **Operator** | **Bezeichnung**                          | **Bedeutung**                                                |
| ------------ | ---------------------------------------- | ------------------------------------------------------------ |
| =            | Einfache Zuweisung                       | a = b weist a den Wert von b zu und liefert b als Rückgabewert. |
| +=           | Additionszuweisung                       | a += b weist a den Wert von a + b zu und liefert a + b als Rückgabewert. |
| -=           | Subtraktionszuweisung                    | a -= b weist a den Wert von a - b zu und liefert a - b als Rückgabewert. |
| *=           | Multiplikationszuweisung                 | a *= b weist a den Wert von a * b zu und liefert a * b als Rückgabewert. |
| /=           | Divisionszuweisung                       | a /= b weist a den Wert von a / b zu und liefert a / b als Rückgabewert. |
| %=           | Modulo Zuweisung                         | a %= b weist a den Wert von a % b zu und liefert a % b als Rückgabewert. |
| &=           | UND-Zuweisung                            | a &= b weist a den Wert von a & b zu und liefert a & b als Rückgabewert. |
| \|=          | ODER-Zuweisung                           | a \|= b weist a den Wert von a \| b zu und liefert a \| b als Rückgabewert. |
| ^=           | Exklusiv-ODER-Zuweisung                  | a ^= b weist a den Wert von a ^ b zu und liefert a ^ b als Rückgabewert. |
| <<=          | Linksschiebezuweisung                    | a <<= b weist a den Wert von a << b zu und liefert a << b als Rückgabewert. |
| >>=          | Rechtsschiebezuweisung                   | a >>= b weist a den Wert von a >> b zu und liefert a >> b als Rückgabewert. |
| >>>=         | Rechtsschiebezuweisung mit Nullexpansion | a >>>= b weist a den Wert von a >>> b zu und liefert a >>> b als Rückgabewert. |



## Elementare (primitive) Datentypen

##### Integer Datentypen

| Datentyp | Wertebereich                                            | Speichergröße |
| -------- | ------------------------------------------------------- | ------------- |
| byte     | -128 ... 127                                            | 1 Byte        |
| short    | -32768 ... 32767                                        | 2 Byte        |
| int      | -2.147.483.648 ... 2.147.483.647                        | 4 Byte        |
| long     | -9.223.372.036.854.775.808 ...9.223.372.036.854.775.807 | 8 Byte        |

##### Gleitkomma-Datentypen

| Datentyp | Genauigkeit | Speichergröße |
| -------- | ----------- | ------------- |
| float    | 7 Stellen   | 4 Byte        |
| double   | 15 Stellen  | 8 Byte        |

#####   Zeichen-Datentyp

| Datentyp | Wertebereich         | Speichergröße |
| -------- | -------------------- | ------------- |
| char     | Alle Unicode-Zeichen | 2 Byte        |

#####  Boolescher Datentyp

| Datentyp | Wertebereich | Speichergröße |
| -------- | ------------ | ------------- |
| boolean  | true, false  | 1 Byte        |

 

#### Literale für primitive Datentypen

Werte, die im Quelltext eingeben werden (z. B. Zahlen), werden als Literale bezeichnet. Für deren
Schreibweise gelten entsprechende Regeln, damit der Datentyp ersichtlich ist.

##### Numerische Datentypen

- Für numerische Werte des Datentyps int können Sie beispielsweise die Vorzeichen +
  bzw. - und die Ziffern 0 … 9 verwenden (das Vorzeichen + kann entfallen).
- Als Dezimaltrennzeichen bei Fließkommawerten verwenden Sie einen Punkt.
- Für Fließkommawerte können Sie die Exponentialschreibweise verwenden. Den Wert
  4,56*10³ können Sie im Quelltext beispielsweise folgendermaßen eingeben: 4.56e3.
  Die Schreibweise 4.56E3 ist ebenfalls zulässig, die Verwendung des Kleinbuchstabens
  erleichtert jedoch die Lesbarkeit.
- Wenn Sie explizit den Datentyp long benötigen, müssen Sie das Suffix L verwenden
  (z. B. 126L).
- Wenn Sie explizit den Datentyp float benötigen, müssen Sie das Suffix F verwenden
  (z. B. 100.0F).

##### Boolescher Datentyp

Für die Eingabe eines logischen Wertes existieren lediglich die beiden Literale true (wahr) und
false (falsch).

##### Alphanumerischer Datentyp char

- Einzelne Zeichen werden bei der Wertzuweisung in Apostrophe 7 eingeschlossen.
- Sie können ein Zeichen auch als Unicode-Escape-Sequenz darstellen. Die Unicode-Repräsentation
  ist dann in Apostrophe 7 zu setzen. Escape-Sequenzen beginnen mit einem Backslash `\`.
- Mit der Escape-Sequenz `\u` können Sie den Unicode für das gewünschte Zeichen direkt angeben.

| Escape Sequenz | Bedeutung         |
| -------------- | ----------------- |
| \b             | Backspace         |
| \t             | Tabulator         |
| \n             | line feed         |
| \f             | form feed         |
| \r             | return            |
| \\"            | Anführungszeichen |
| \\'            | Hochkomma         |
| \\\            | Backslash         |



#### Wrapper-Klassen

Viele Methoden innerhalb von Java erwarten als Parameter einen Object-Typ. Da Sie von primitiven Datentypen keine Objekte bilden können, stellt Java für jeden primitiven Datentyp eine sogenannte Wrapper-Klasse bereit. Die Klassen besitzen ein gekapseltes Attribut, das den Wert speichert, und Methoden, um beispielsweise den entsprechenden primitiven Datentyp zurückzugeben oder eine Konvertierung von String-Typen in den betreffenden Datentyp vorzunehmen.

Folgende Wrapper-Klassen existieren in Java und sind im Package java.lang enthalten:

- Byte
- Short
- Integer
- Long
- Float
- Double
- Boolean
- Character

Wrapper Klassen haben Methoden um den primitiven Datentyp zurück zu geben (z.B. `int Integer.intValue()`), den primitiven Datentyp aus einem String zu konvertieren (z.B. `int parseInt(String s)`oder `valueOf(String s)`), in einen String umzuwandeln `toString(...)`

##### Autoboxing

Die Umwandlung von einem Objekt einer Wrapper-Klasse in den entsprechenden primitiven
Datentyp können Sie mit der entsprechenden Methode wie z. B.  `intValue()`erreichen. Um ein
Objekt zu erstellen, verwenden Sie den Konstruktor der Wrapper-Klasse. Um diese aufwendige
Schreibweise zu vereinfachen, ist seit der Version Java 5 eine automatische Umwandlung
implementiert, das sogenannte **Autoboxing**.

```java
Integer number = 10; // nicht empfohlene Variante, verwende besser
Integer num = Integer.valueOf(10);
```

##### Unboxing

Bezeichnet die Rückumwandlung in einen primitiven Datentyp

```java
int i = number.intValue();
```



### Referenztypen

