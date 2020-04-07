# Rekursion

In Java kann sich eine Methode auch selbst aufrufen, dies nennt man Rekursion.

**Beispiel:**

```java
public int sum(int n){
    if(n > 1){
        return sum(n-1) + n;
    }
    return 1;
}
```

Bei rekursiven Algorithmen werden die Methoden bzw. deren Zustand vor der konkreten Abarbeitung auf einem Stapel (Stack) abgelegt. Die Ausführung erfolgt, indem der Stapel von oben nach unten abgearbeitet wird. Der letzte rekursive Schritt wird also als Erstes ausgeführt.

**Wie muss eine rekursive Methode aufgebaut sein:**

1. Sie braucht eine Abbruchsbedingung - die Methode returniert einen Wert, wenn eine bestimmte Bedingung erfüllt ist.
2. Den rekursiven Aufruf - die Methode ruft sich selbst wieder auf, übergibt aber einen geänderten Eingangswert (der Eingangswert muss sich der Abbruchbedingung nähern.)



**Iterativ oder rekursiv?**
Die iterativen und rekursiven Algorithmen spielen in der Programmierung eine wesentliche Rolle, da viele Probleme je nach Anforderung entweder durch Iteration oder Rekursion gelöst werden können.
Vor- und Nachteile iterativer und rekursiver Algorithmen

|           | Vorteil                                                      | Nachteil                                                     |
| --------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Iteration | keine hohen Systemanforderungen, da lokale Variablen genutzt werden können. | Bei größeren Aufgaben kann ein komplexer Algorithmus entstehen.<br />Langer und unübersichtlicher Code |
| Rekursion | Einfacher und kurzer Quellcode<br />Passt sich an die Komplexität an(Anzahl der Schritte muss nicht vorher berechnet werden) | Je nach Rekursionsstufe besteht ein hoher Ressourcenbedarf (Methodenaufrufe werden auf einen Stapel gelegt)<br /> |



Übungsbeispiel:

1. Berechnen Sie die Fakultät einer Zahl n.
   Die Fakultät ist definiert als: n! = n\*(n-1)! mit dem Abbruchkriterium 0! = 1
2. Drehen Sie eine eingegebene Zeichenkette um, also aus `Hallo 3AHIT`wird die Zeichenkette`TIHA3 ollaH`. Einmal mit Hilfe von Rekursion und einmal mit einem Algorithmus ihrer Wahl.