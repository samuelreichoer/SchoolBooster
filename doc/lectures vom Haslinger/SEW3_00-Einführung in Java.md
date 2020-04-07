# SEW - Objektorientierte Programmierung mit Java

## Object-oriented programming (OOP)

> **Object-oriented programming (OOP)** is a **programming paradigm** based on the concept of "**objects**", which may contain **data**, in the form of fields, often known as **attributes**; and **code**, in the form of procedures, often known as **methods**.[^1]

[^1]: https://en.wikipedia.org/wiki/Object-oriented_programming

- *Programmparadigma* - beschreibt die Denkweise (=Paradigma), wie eine reale Problemstellung programmtechnisch erfasst und beschrieben werden kann.
- *Objekt* - Ein Element, welches Funktionen, Methoden, Prozeduren, einen inneren Zustand, oder mehrere dieser Dinge besitzt.
- *Attribute* - Daten, die den Zustand bzw. die Eigenschaften eines Objektes beschreiben.
- *Methoden* - Prozeduren (bzw. "Funktionen"), die den Zugriff und die Manipulation (Veränderung) der Daten des Objekts ermöglichen.

## Java
> **Java** is a general-purpose computer programming language that is concurrent, **class-based**, **object-oriented**, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers **"write once, run anywhere"** (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to **bytecode** that can run on any **Java virtual machine (JVM)** regardless of computer architecture.[^2]

[^2]: https://en.wikipedia.org/wiki/Java_(programming_language)

### Unterschied zwischen JRE, JDK und JVM[^3]

[^3]: http://www.letustweak.com/tutorials/difference-between-jdk-jre-and-jvm/

#### JRE (Java Runtime Environment)

**Die JRE (Java Laufzeitumgebung) ermöglich das Ausführen von Java-Programmen.**

- Üblicherweise  auf allen gängigen Betriebssystemen vorinstalliert.
- Beinhaltet die JVM, Klassen- und Laufzeitbibliotheken.
- Ist die Implementierung der JVM.

#### JDK (Java Development Kit)

**Eine "Werkzeugkiste" (Kit), die eine Sammlung von Entwicklerwerkzeugen und die JRE (Java Runtime Environment) beinhaltet. Sie ermöglicht daher einerseits das Erstellen und andererseits das Ausführen von Java Programmen.**

- *Developer tools* - Entwicklerwerkzeuge wie Compiler (javac.exe), Debugging, Applet-viewer, usw.
  - Compiler konvertiert Java Programme in byte code (*class Dateien).
  - Java application launcher (java.exe) öffnet die JRE, lädt die Klasse, und ruft die main-Methode auf.
- *JRE* - kümmert sich um das Ausführen der Java Programme.

JDK (wie auch die JRE) ist plattform-spezifisch, d.h. es gibt eigene Installer für jedes Betriebssystem.

![JDK](D:\repos\SEW\SEW-MashUp\SEW3\_img\SEW3-00-JDK.png)

#### JVM (Java Virtual Machine)

**JVM ist das "Herz" der Java Programmiersprache. Eine abstrakte Maschine, die eine Laufzeitumgebung für Java byte code zur Verfügung stellt.**

- *Virtuell* - Maschinen-Schnittstelle unabhängig vom darunterliegenden Betriebsystem und Hardware. (“Write Once Run Anywhere”)
- *Java byte code* - Maschinensprache für die JVM.
- JVM ist verantwortlich für
  - Garbage Collection (Speicherplatz Freigabe)
  - Array Bounds Checks
  - Sicherheit
  - Speicherverwaltung
  - ...
- JVM ist anpassbar (Customization), wie z.B. minimaler oder maximaler verwendeter Speicherplatz

Bei der Ausführung von Java Programmen wird beides benötigt - **Compilation und Interpretation**:

1. Java source code wird mit Hilfe des Compilers in JVM Maschinencode umgewandelt (*.class Dateien, sogen. byte code).
2. Die JVM interpretiert dann (mit Hilfe des JIT - Just in Time Compilers) den byte code und erzeugt einen neuen Maschinencode, der von Betriebssystem und Hardware abhängig ist (via JRE) .

![ByteCode-Generierung-Java](D:\repos\SEW\SEW-MashUp\SEW3\_img\SEW3-00-Bytecode-Generierung-Java.png)

#### JIT (Just in Time Compiler)

JIT ist die Bezeichnung des Compilers der JVM. Ein spezieller Compiler für die Optimierung des byte codes in die spezifische Sprache des OS (Operating System) und der Hardware. Führt dabei unterschiedlichste Optimierungen durch (Verbesserung der Performance).


### JAVA versus C#

Wichtige links:  
https://www.harding.edu/fmccown/java_csharp_comparison.html
https://msdn.microsoft.com/en-us/library/ms836794.aspx

#### Direkter Vergleich

##### Programmstruktur - allgemein

```java
//import java.lang.System.out;

package hello;

public class HelloWorld {
   public static void main(String[] args) {
      String name = "Java";

      // See if an argument was passed from the command line
      if (args.length == 1)
         name = args[0];

      System.out.println("Hello, " + name + "!");
    }
}
```
```c#
using System; 

namespace Hello {
   public class HelloWorld {
      public static void Main(string[] args) {
         string name = "C#";

         // See if an argument was passed from the command line
         if (args.Length == 1)
            name = args[0];

         Console.WriteLine("Hello, " + name + "!");
      }
   }
}
```


