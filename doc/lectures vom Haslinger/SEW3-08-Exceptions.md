# Exceptionhandling (Ausnahmebehandlung)

In Programmen können Fehler (Ausnahmen, Exceptions) auftreten wie arithmetische Fehler (z.B. Division durch Null) oder Datei-Zugriffsfehler, wenn man auf eine Datei zugreifen möchte, diese aber nicht vorhanden ist etc.

## Fehlerobjekte (Exceptions) und Fehlerklassen
In Java (wie auch in C#) wird beim Auftreten eines Fehlers ein Fehlerobjekt erzeugt, das genaue Auskunft über die Fehlerursache liefert. Die Fehlerobjekte können selbst definierte oder von Java festgelegte Standard-Objekte sein.

API: `java.lang.Exception`

**Einige wichtige Ausnahmezustände:**

| Bezeichner                | Art                                      |
| ------------------------- | ---------------------------------------- |
| ArithmeticException       | Division durch 0 bei int                 |
| NullPointerException      | Bezeichner zeigt auf kein Objekt         |
| ArrayOutOfBoundsException | Index außerhalb des definierten Bereichs |
| IOException               | Ein- und Ausgabeproblem                  |

## Der `try-catch`-Block

- Um Fehler abfangen zu können, muss der kritische Bereich, in dem ein Fehler auftreten kann und der vom Laufzeitsystem überwacht werden soll, definiert werden (`try`-Block).
- Tritt ein Fehler in diesem überwachten Block auf, dann erkennt die Laufzeitumgebung den Fehler,
  unterbricht die Abarbeitung an dieser Stelle und sucht nach `catch`-Blöcken, die diesen Fehler auffangen und einer Behandlung, der Ausnahmeroutine (Exception Handler), zuführen. 
- Wurde die Ausnahme von `catch` eingefangen und bearbeitet, dann wird das Programm nach dem `try`-Block fortgesetzt.
- Ist kein passender `catch`-Block vorhanden, dann wird die Ausnahme an die aufrufende Methode weitergeleitet. Wird der Fehler an die `main`-Methode weitergeleitet ohne abgefangen zu werden, dann bricht das Programm ab.

### Zwei Arten der Behandlung von Exceptions
- Die Ausnahme kann unmittelbar in einem `catch`-Block behandelt werden.
- Die Ausnahme wird durch `throws` weitergeleitet.

### Vorteil von Exceptions
- Modularisierung -  Fehlerroutinen werden getrennt von der Programmfunktion implementiert.
- Strukturierung: Fehlertypen und deren Behandlungen können nach Bereichen getrennt behandelt werden.
- Fehler können an die aufrufenden Methoden weitergereicht werden.
- Durch das Prinzip der Exceptions werden Programme leichter wart- und erweiterbar.

### Aufbau

```java
try {
    //Bereich (Scope) in dem ein Fehler auftreten kann.
}
catch (ExceptionTypeA BezeichnerA) {
    //Anweisungen um auf Ausnahme A zu reagieren
}
catch (ExceptionTypeB BezeichnerB) {
    //Anweisungen um auf Ausnahme B zu reagieren
}
finally { // optional
    // wird unabhängig vom try-Block immer durchlaufen.
	// wird für Aufräumarbeiten eingesetzt.
	// z.B.: schließen von offenen Dateien.
}    
```

### Beispiele

#### ArithmeticException

```java
class ArithmExc {
    public static void main(String[] args) {
        int d=0;
        int div=10/d; // hier tritt die Exception auf
        System.out.println(div);
    }
}
```

#### ArrayOutOfBoundsException

```java
class ArrayExc {
	static String[] charArray= {"a","b","c"};
	public static void main(String[] args)
	{
        int i;
        for (i=0;i<4;i++)
        System.out.println(charArray[i]);
    }
}
```

#### Ausnahmebehandlung mittels `try` und `catch`

```java
class TryCatch_Array {
    public static void main (String[] args) {
        double dArray[] = new double [5]; // Index 0..4
        double d;
        int i=5;
    
        try {
    		d = dArray[i];
    		System.out.println(d);
    	}
    	catch(ArrayIndexOutOfBoundsException ae) {
    		System.err.println("Die Exception lautet: " + ae);
    	}
    	System.out.println("nun geht es im Programm weiter");
    }
}
```

### Benutzerdefinierte Ausnahmen werfen (`throw`)
Wenn in Programmen Fehler auftreten können, die von den Standard-Exceptions nicht behandelt werden, dann müssen dafür eigene Exception-Klassen erstellt werden.

**Bezeichnung selbst definierter Exception-Klassen**: Üblicherweise wird nach dem Klassennamen das Wort `Exception` angehängt.

**Beispiel**:

```java
class MyException extends Exception
{
    public MyException(){}
    public MyException(String s){
    	super (s); // ruft Konstruktor der Elternklasse Excpetion auf
    }
}
```

**Auslösen der Exception:**

```java
throw new MyException(" Beschreibung des Fehlers ");
```

### Fehlermeldungen weiterleiten (`throws`)

Eine Methode kann die Fehlerbehandlung an die aufrufende Methode weiterleiten, wenn nach der Methodendefinition das Schlüsselwort `throws` und die Exception-Typen angegeben werden, die weitergeleitet werden sollen. Das macht dann einen Sinn, wenn die Ausnahmen an einer zentralen Stelle behandelt werden sollen.

**Aufrufbeispiel**:

```java
public readFile(String name) throws FileNotFoundException, MyExcpetion {
    // ...
}
```

**Ein längeres Beispiel:**

```java
class Test_throws
{
    public static double divide(double x, double y) throws Exception {
    	if(y == 0) throw new Exception("Division durch NULL!");
    	return x/y;
    }
    
    public static void main(String[] args) {
        try {
        	System.out.println("Ergebnis der Division: " + divide(3, 0)); 
        }
        catch (Exception ae) {
        	System.err.println("Die Exception lautet: " + ae);
        }
        
        System.out.println("Trotz Ausnahme geht es weiter.");
    }
}
```

In Methode `divide()` entsteht ein Ausnahmefall, wenn y = 0. Die Ausnahme wird in der `if`-Anweisung
abgefangen und mit `throws new Exception()` an die aufrufende Methode weitergereicht.



## Exercises

1. Erstellen ein Modul `<YYYYMMDD>_Exceptions` in ihrem SEW-Repository.
2. Erstellen Sie die Klasse `ArithmExc` wie oben beschrieben. Bauen Sie nun dazu eine Ausnahmebehandlung mit einem `try-catch`-Block ein.
3. Erweitern Sie das Programm von Punkt 2 so, dass die Berechnung in einer Methode erfolgt, die an
  die aufrufende Methode den Fehler weiterleitet.
4. Erstellen Sie nun eine kleine Klassenhierarchie mit einer Basisklasse `Shape` und zwei davon abgeleiteten Klassen `Rectangle` und `Triangle`.
  - Fügen Sie passende Konstruktoren, Attribute (Klassenvariablen) für die Seiten und dazugehörige Getter und Setter hinzu (nutzen Sie die Code-Erzeugung von von Intellj - `Alt + Insert`!).
  - Für die Klasse `Rectangle`soll eine Exception-Klasse mit der Bezeichnung `NegativException` geschrieben werden, die in den set-Methoden für Länge und Breite negative Werte abfängt.
  - Überlegen Sie, welche Exception-Klassen für die Klasse `Triangle` notwendig sind. (*Mathematik lässt grüßen*!), und setzen Sie diese Exceptions um.