# Objektorientierte Programmierung

Objektorientierte Programmierung (kurz *OOP*) ist *das* Programmierparadigma der 90er Jahre. Viele der heute verwendeten Programmiersprachen sind entweder von Grund auf objektorientiert oder wurden im Laufe der Zeit mit objektorientierten Erweiterungen versehen.

Die grundlegenden Elemente der objektorientierten Programmierung (OOP) in Java sind unter anderem Klassen, Objekte und Interfaces.

### Abstraktion

Eine der wichtigsten Ideen der objektorientierten Programmierung ist die Trennung zwischen *Konzept* und *Umsetzung*, etwa zwischen einem *Bauteil* und seinem *Bauplan*, oder einem *technischen Handbuch* und der *konkreten Apparatur*, die dadurch beschrieben wird. Diese Art von Unterscheidung ist in der wirklichen Welt sehr bedeutsam. In der objektorientierten Programmierung manifestiert sich diese Unterscheidung in den Begriffen *Objekt* und *Klasse*.

Diese Unterscheidung zwischen Objekten und Klassen kann als *Abstraktion* angesehen werden. Sie bildet die erste wichtige Eigenschaft objektorientierter Sprachen. 

##### Klassen und Objekte

Ein Objekt (Instanz) ist ein tatsächlich existierendes "Ding" aus der Anwendungswelt des Programms. Eine "Klasse" ist dagegen die Beschreibung eines oder mehrerer ähnlicher Objekte. Sie besteht aus einem Satz von Werten, die Daten enthalten, und einem Satz von Methoden, die auf diesen
Daten operieren.
Es kann mehrere Instanzen einer Klasse geben.

### Kapselung 

 In objektorientierten Programmiersprachen wird eine Klasse durch die Zusammenfassung einer Menge von Daten und darauf operierender Funktionen (die nun *Methoden* genannt werden) definiert. 

Bei der Implementierung einer Klasse sollten Sie darauf achten, dass die inneren Details einer Klasse private und nur über eine öffentliche Schnittstelle zugänglich sind. 
Die JavaBeans-Konvention ist, über Zugriffs- und Änderungsmethoden (z. B. getFirstName() und setFirstName("Leonardina")) indirekt auf die privaten Member einer Klasse zuzugreifen und zu
sichern, dass andere Klassen private Member nicht unerwartet ändern können. Eine andere Möglichkeit, Datenmember vor der Veränderung durch andere Objekte zu schützen, ist, unveränderliche Werte zu liefern (d. h. Strings, elementare Werte und Objekte, die bewusst unveränderlich gemacht wurden).
Diese Zusammenfassung von Methoden und Variablen zu Klassen bezeichnet man als *Kapselung*. Sie stellt die zweite wichtige Eigenschaft objektorientierter Programmiersprachen dar. Kapselung hilft vor allem, die Komplexität der Bedienung eines Objekts zu reduzieren. 

##### Klassensyntax

Eine Klasse hat eine Signatur, optionale Konstruktoren, Datenmember und Methoden:
[Java-Modifizierer] **class** Klassenname [**extends** eineOberklasse] [**implements** einige durch Kommata
																	getrennte Interfaces] {
			// Datenmember
			// Konstruktor(en)
			// Methode(n)
}



### Wiederverwendung 

Durch die Abstraktion und Kapselung wird die *Wiederverwendung* von Programmelementen gefördert, die dritte wichtige Eigenschaft objektorientierter Programmiersprachen. Wiederverwendung ist ein wichtiger Schlüssel zur Erhöhung der Effizienz und Fehlerfreiheit beim Programmieren.

### **Beziehungen** 

Objekte und Klassen existieren für gewöhnlich nicht völlig alleine, sondern stehen in Beziehungen zueinander. 

So ähnelt ein Fahrrad beispielsweise einem Motorrad, hat aber auch mit einem Auto Gemeinsamkeiten. Ein Auto ähnelt dagegen einem Lastwagen. Dieser kann einen Anhänger haben, auf dem ein Motorrad steht. Ein Fährschiff ist ebenfalls ein Transportmittel und kann viele Autos oder Lastwagen aufnehmen, genauso wie ein langer Güterzug. Dieser wird von einer Lokomotive gezogen. Ein Lastwagen kann auch einen Anhänger ziehen, muss es aber nicht. Bei einem Fährschiff ist keine Zugmaschine erforderlich, und es kann nicht nur Transportmittel befördern, sondern auch Menschen, Tiere oder Lebensmittel.  

 Wir wollen ein wenig Licht in diese Beziehungen bringen und zeigen, wie sie sich in objektorientierten Programmiersprachen auf wenige Grundtypen reduzieren lassen:  

- "is-a"-Beziehungen (Generalisierung, Spezialisierung) 
- "part-of"-Beziehungen (Aggregation, Komposition) 
- Verwendungs- oder Aufrufbeziehungen 



##### Generalisierung und Spezialisierung 

 Zuerst wollen wir die "is-a"-Beziehung betrachten. "is-a" bedeutet "ist ein" und meint die Beziehung zwischen "ähnlichen" Klassen. 

Ein Fahrrad ist kein Motorrad, aber beide sind Zweiräder. Ein Zweirad, und damit sowohl das Fahrrad als auch das Motorrad, ist ein Straßenfahrzeug, ebenso wie das Auto und der Lastwagen. All diese Klassen repräsentieren Transportmittel, zu denen aber auch die Schiffe und Güterzüge zählen.  

 Die "is-a"-Beziehung zwischen zwei Klassen *A* und *B* sagt aus, dass "*B* ein *A* ist", also alle Eigenschaften von *A* besitzt, und vermutlich noch ein paar mehr. *B* ist demnach eine Spezialisierung von *A*. Andersherum betrachtet, ist *A* eine Generalisierung (Verallgemeinerung) von *B*. 

 "is-a"-Beziehungen werden in objektorientierten Programmiersprachen durch ***Vererbung*** ausgedrückt.

Eine Klasse wird dabei nicht komplett neu definiert, sondern von einer anderen Klasse *abgeleitet*. In diesem Fall erbt sie alle Eigenschaften dieser Klasse und kann nach Belieben eigene hinzufügen. Vererbungen können mehrstufig sein, d.h. eine abgeleitete Klasse kann Basisklasse für weitere Klassen sein.

![Vererbung Transportmittel](D:\repos\SEW\SEW-MashUp\SEW3\_img\SEW3-08_Vererbung-Transportmittel.png)

##### Aggregation und Komposition 

 Der zweite Beziehungstyp, die "part-of"-Beziehungen, beschreibt die *Zusammensetzung* eines Objekts aus anderen Objekten (dies wird auch als *Komposition* bezeichnet).

So besteht zum Beispiel ein Güterzug aus einer (oder mehreren) Lokomotiven. Ein Fahrrad besteht aus vielen Einzelteilen.

"part-of"-Beziehungen müssen nicht zwangsläufig beschreiben, *woraus* ein Objekt zusammengesetzt ist. Vielmehr können sie auch den allgemeineren Fall des *einfachen Aufnehmens* anderer Objekte beschreiben (was auch als *Aggregation* bezeichnet wird). Ein Fahrrad kann einen Gepäckträger haben, es besteht zwar eine "part-of"-Beziehung, sie ist aber nicht *essentiell* für die Existenz des aufnehmenden Objekts.

##### Verwendungs- und Aufrufbeziehungen 

Die dritte Art von Beziehungen zwischen Objekten oder Klassen hat den allgemeinsten Charakter. Benutzt beispielsweise eine Methode während ihrer Ausführung ein temporäres Objekt, so besteht zwischen beiden eine Verwendungsbeziehung: Objekt *x* verwendet eine Instanz der Klasse *Y*, um bestimmte Operationen auszuführen.

### Polymorphismus 

 Als letztes wichtiges Konzept objektorientierter Programmiersprachen wollen wir uns mit dem *Polymorphismus* beschäftigen. Polymorphismus bedeutet direkt übersetzt etwa "Vielgestaltigkeit" und bezeichnet zunächst einmal die Fähigkeit von Objektvariablen, Objekte unterschiedlicher Klassen aufzunehmen. Das geschieht allerdings nicht unkontrolliert, sondern beschränkt sich für eine Objektvariable des Typs *X* auf alle Objekte der Klasse *X* oder einer daraus abgeleiteten Klasse.  

Eine Objektvariable vom Typ *Straßenfahrzeug* kann also nicht nur Objekte der Klasse *Straßenfahrzeug* aufnehmen, sondern auch Objekte der Klassen *Zweirad*, *Vierrad*, *Anhänger*, *Motorrad*, *Fahrrad*, *Auto* und *Lastwagen*. Ein *Zweirad* ist nun mal ein *Straßenfahrzeug*, hat alle Eigenschaften eines Straßenfahrzeugs und kann daher durch eine Variable repräsentiert werden, die auf ein Straßenfahrzeug verweist. Dass es möglicherweise ein paar zusätzliche Eigenschaften besitzt, stört den Compiler nicht.

Interessant wird Polymorphismus, wenn die Programmiersprache zusätzlich das Konzept des *Late Binding* implementiert. Im Unterschied zum "Early Binding" wird dabei nicht bereits zur Compilezeit entschieden, welche Ausprägung einer bestimmten Methode aufgerufen werden soll, sondern erst zur Laufzeit. Wenn beispielsweise auf einem Objekt der Klasse *X* eine Methode mit dem Namen *f* aufgerufen werden soll, ist zwar prinzipiell bereits zur Compilezeit klar, wie der Name lautet. Objektorientierte Programmiersprachen erlauben aber das *Überlagern* von Methoden in abgeleiteten Klassen, und da - wie zuvor erwähnt - eine Objektvariable des Typs *X* auch Objekte aus allen von *X* abgeleiteten Klassen aufnehmen kann, könnte *f* in einer dieser nachgelagerten Klassen überlagert worden sein. Welche konkrete Methode also aufgerufen werden muss, kann damit erst zur Laufzeit entschieden werden.