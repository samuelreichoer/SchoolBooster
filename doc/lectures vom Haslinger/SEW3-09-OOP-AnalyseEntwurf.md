# OOP - Analyse und Entwurf

# Grundbegriffe

*nach Alan Kay (1940, USA)*

- Alles ist ein Objekt.
- Objekte kommunizieren durch Nachrichtenaustausch (message).
- Objekte haben ihren eigenen Speicher.
- Jedes Objekt ist ein Exemplar (instance) einer Klasse.
- Die Klasse modelliert das gesamte Verhalten ihrer Objekte.
- Ein Programm wird ausgeführt, indem dem ersten Objekt die Kontrolle übergeben und der Rest als
  dessen Nachricht behandelt wird.

##### Warum OOP? Hauptargument: Wiederverwertbarkeit / Kapselung

## BEGRIFFE - MUST KNOW!

### Objekt
Ein Objekt ist ein **konkretes Exemplar** (Instanz) einer Klasse, gehört also zu einer Objektklasse (**Typ**), hat einen Zustand (Eigenschaften –> **Daten**) und kann Aktionen (Fähigkeiten ->**Methoden**) ausführen. 

Eine Objekt**variable** ist ein **Verweis** (Objektreferenz) auf ein Objekt.

### Klasse

Gleichartige Objekte werden zu Objekt-Klassen zusammengefasst.

Eine Klasse ist sozusagen der **Datentyp** eines Objekts. Sie legt fest, wie die Objekte aufgebaut sind und
wie sie sich verhalten. Eine Objekt-Klasse ist sozusagen eine Schablone für die Erstellung von Objekten.
In der Klasse werden Daten (Eigenschaften eines Objekts) und Methoden (Verhalten eines Objekts)
definiert.

### Klassenhierarchie

Klassen können hierarchisch gegliedert sein. So ist beispielsweise die Klasse der Rechteck eine
Teilmenge der Klasse Polygon, die ihrerseits wieder eine Teilmenge der grafischen Elemente bilden.

### Vererbung

Vererbung: Aufbauend auf eine bereits bestehende Klasse kann eine neue Klasse erstellt werden. Es muss nur beschrieben werden, wie sich diese Klasse von der ursprünglichen unterscheidet. Alle Eigenschaften der Ursprungsklasse bleiben erhalten.



## OO Analyse und Entwurf

- Die reale Welt wird in Objekte und Klassen abgebildet (Modelliert) und die Beziehungen zwischen den
  Objekten hergestellt.
- Da die Daten im Mittelpunkt stehen, werden zuerst die Objekte und die Beziehungen zwischen den
  Objekten untersucht. (Die Algorithmen werden im Moment nicht betrachtet.)
- **Ergebnis Analyse:** ist ein Objekt- bzw. Klassenstrukturmodell.
- Das Klassenmodell ist eine Zusammenfassung der herkömmlichen Daten- und Funktionsmodelle.
- **Ergebnis Entwurf:** Verfeinerung des Klassenmodells, sodass die Umsetzung in einer Programmiersprache möglich wird.
- **Ziel von Analyse und Entwurf:** Aus der Problemstellung heraus sollen möglichst *voneinander*
  *unabhängige Programmbausteine* entstehen, die getrennt übersetzt werden können.

> Kurzfassung Aus einer verbalen Problembeschreibung  wird bei Analyse und Entwurf eineStruktur von Klassen bzw. Klassenhierarchie erstellt.

#### Vorgehen

1. Herausfiltern der **Hauptwörter**: 
   - Gattungsnamen -> Klassen (z.B. Baum, Auto, Stadt)
   - Eigennamen -> Objekte (z.B. Eiche, Passat, Linz)
   - Mengen, Größenangaben, ... -> Daten (Eigenschaften, Attribute, Membervariablen)
2. Zusammenhang zwischen **Klassen**: (MUST-KNOW!) :bangbang:
   - **Ist-ein(e)-Relation** -> Klassenhierarchie (Vererbung)
   - **Hat-ein(e)-Relation** -> Assoziation (dazu später mehr) -> Daten (Attribut) 
3. Relevante **Zeitwörter** -> Methoden

