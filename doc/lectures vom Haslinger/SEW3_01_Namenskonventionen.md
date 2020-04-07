# Namenskonventionen

Wie in allen Programmiersprachen, gibt es auch in Java Konventionen für die Vergabe von Namen. Sie sind zwar nicht zwingend erforderlich, erleichtern aber das Lesen und Verständnis der Quelltexte ungemein und sollten daher unbedingt eingehalten werden.

#### Klassennamen

Klassennamen sollten Hauptwörter sein, da sie Objekte ("Dinge") repräsentieren. Klassennamen beginnen stets mit einem Großbuchstaben (z.B. String, Vector oder Date). Besteht ein Klassenname aus mehreren Silben/Wörtern, so beginnen auch die Folgesilben/-wörter mit einem Großbuchstaben (z.B. HelloWorld, Keyadapter). Diese gemischte Groß-/ Kleinschreibweise bezeichnet man auch als CamelCase.

#### Methodennamen

Methodennamen beginnen mit einem Kleinbuchstaben. Haben sie mehrere Silben, ist die erste oft ein Verb. Weitere beginnen mit einem Großbuchstaben. Methodennamen können Adjektive und Nomen enthalten (z.B. println, hasMoreElements, isEnabled, getAirDensity).

#### Variablennamen

Variablennamen sollten Nomen sein und es gelten dieselben Konventionen wie für Methoden (z.B name, date)

#### Konstanten

Namen von Konstanten sollten gänzlich groß geschrieben werden (z.B. KELVIN=273.15, GRAVITY=9.81)

#### Paketnamen

Paketnamen sollten einzigartig sein und bestehen ausschließlich aus Kleinbuchstaben (z.B. java.lang, com.solution.util)
Paketnamen die mit java oder javax beginnen sind reserviert.

#### Namen von Parametern und lokalen Variablen

Die Namen von  Parametern und lokalen Variablen sollten aussagekräftige einzelne Wörter oder Abkürzungen sein. Wenn mehrere Wörter nötig sind, so gilt die gleiche Konvention wie bei Methodennamen.
Die Namen temporärer Variablen (z.B. Schleifenvariable i) können aus nur einem einzigen Buchstaben bestehen.

**Ratschlag für Variablennamen:** Halten Sie häufige und lokale Variablennamen kurz und Klassenvariablennamen länger (und sprechender).

#### Enumerationsnamen

Für Enumerationsnamen gilt die gleiche Konvention wie für Klassennamen. Die Namen der Elemente sollten gänzlich groß geschrieben werden.

```java
public enum Units{
	SI, US, EU, CUSTOM
}
```

#### Interfacenamen

Interfacenamen sollten Adjektive sein, die auf "able" oder "ible" enden, wenn ein Interface eine Fähigkeit darstellt (z.B Remotable, Serializeable). Andernfalls sollten die Interfacenamen Nomen sein und es gilt die gleiche Konvention wie für Klassennamen.



---

Quellen: Java Kurz und Gut

