

# Datum und Zeit

Für Datumsangaben wird seit Java 1.1 die Klasse `Date` verwendet. Allerdings sind viele Methoden dieser Klasse als **deprecated** gekennzeichnet und sollten nicht mehr verwendet werden.

Mit der Java 8 wurde in Java eine neue API `java.time` mit einer Vielzahl von Klassen für
die Berechnung von Datumswerten und Zeitangaben eingeführt.

Merkmale und Vorteile der Klassen der neuen Datums- und Zeit API
Die neue API zeichnet sich unter anderem durch folgende Merkmale aus:

- Sie unterstützt den international genutzten Zeit Standard ISO 8601.
- International häufig verwendete Kalender, wie beispielsweise der japanische, der aktuell in
  China verwendete (Minguo), der islamische (Hijriah) sowie der buddhistische werden
  unterstützt.
- Alle Klassen dienen einem speziellen Zweck, ohne dabei Seitenwirkung auf andere Datums und Zeit Objekte zu haben.
-  Die API kann mit weiteren Klassen, beispielsweise für spezielle Kalender, erweitert werden.
- Alle `java.time` Objekte sind immutable.

Objekte der bis Java 8 zur Verfügung stehenden Klassen waren mutable, durch Berechnung
änderten sich also die Zeitwerte. Durch die Verwendung von immutablen Objekten seit Java 8
erzeugt jede Berechnung einen neuen Wert. Damit ist es möglich, einen Wert mit einem parallel
laufenden Task oder einer Bibliothek zu teilen, ohne dass das Risiko besteht, dass sich der Wert
unerwartet ändert.

Das Package `java.time` umfasst z. B. Klassen für

- die Berechnung von Zeitpunkten und die Differenz zwischen zwei Zeitpunkten
  (Klassen Instant, Duration),
-  die Arbeit mit Datumsangaben mit (`ZonedDateTime`) und ohne (`LocalDate`)
  Zeitzonen Verwendung,
-  die Beschreibung von Teilen eines Datums (z. B. `YearMonth`),
-  typische Kalendermanipulationen (`TemporalAdjuster`),
-  Berechnungen mit Zeiten (`LocalTime`),
-  die Formatierung und Darstellung von Datum- und Zeit (`DateTimeFormatter`).



#### Berechnung der Zeitdauer

Die Dauer zwischen zwei Zeiten wird mit der Klasse `Duration`und die Zeitpunkte mit der Klasse `Instant` berechnet.

```java
Instant start = Instant.now();
// do something
Instant end = Instant.now();

Duration d = Duration.between(start, end);
d.toMillis();
```



#### Datumsangaben

Während Zeitpunkte mit der Klasse `Instant`die absolute Zeit darstellen, werden die Klassen `LocalDate`und `ZoneDateTime`für Datumsangaben verwendet.

```java
LocalDate today = LocalDate.now();
LocalDate javaBirthday = LocalDate.of(1995, 5, 23);
Period liveTime = Period.between( javaBirthday, today);

System.out.println("Java wurde veröffentlicht vor: " +
	liveTime.getYears() + " Jahren, " +
	liveTime.getMonths() + " Monaten und " +
	liveTime.getDays() + " Tagen." );

LocalTime bedTime = LocalTime.of(23, 00);
LocalTime standUp = bedTime.plusHours(8);
if (today.isAfter(bedTime) && today.isBefore(standUp)){
	System.out.println("Es ist Schlafenszeit...");
}
```



#### Datumsangaben mit Zeitzone

Da es weltweit verschiedene Zeitzonen gibt, reicht die Klasse `LocalDate`oft nicht aus. Die Klasse `ZoneDateTime`berücksichtigt auch die Zeitzone (mit Sommerzeit).

```java
LocalDateTime ldt = LocalDateTime.now();
ZoneId z = ZoneId.of("Asia/Shanghai");
ZonedDateTime zdt = ldt.atZone(z);
System.out.println("Datum und Zeit in Shanghai:" + zdt +
                   " " + ldt);
```

Die Datenbank der Internet Assigned Authority (IANA) listet die Zeitzonen auf, siehe
https://www.iana.org/time-zones.
Java nutzt die Datenbank der IANA, welche mehrfach im Jahr aktualisiert wird. Jede Zeitzone
besitzt eine ID. Aktuell gibt es nahezu 600 Zeitzonen-IDs.



#### Datums- und Zeitangaben formatieren

Mithilfe der Klasse DateTimeFormatter bestehen drei Möglichkeiten, einen Datums- bzw.
Zeitwert darzustellen:

- mithilfe eines vordefinierten Standardformats
- in einem lokalspezifischen Format
- unter Verwendung eines selbst definierten Musters

Die gebräuchlichsten lokalspezifischen Formatierer sind:

| Stil   | Datum                       | Zeit           |
| ------ | --------------------------- | -------------- |
| SHORT  | 12.11.2019                  | 10:41          |
| Medium | 12.11.2019                  | 10:41:31       |
| Long   | 12.November.2019            | 10:41:31 MESZ  |
| Full   | Dienstag, 12. November 2019 | 10:41 Uhr MESZ |

Diese Formatierungen:

```java
ZonedDateTime ldt = ldt.atZone(ZoneId.of("Europe/Vienna"));
String formatted = DateTimeFormatter.ISO_DATE_TIME.format(ldt);
formatted = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).
    format(ldt);
formatted = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm").format(ldt);
   
```

erzeugen folgende Ausgabe:

2019-11-12T19:23:03.1267863+01:00[Europe/Vienna]
Dienstag, 12. November 2019 um 19:23:03 Mitteleuropäische Normalzeit
Di. 2019-11-12 19:23

