# Dateneingabe im Programm

Neben der Übergabe von Startparametern besteht die Möglichkeit, im Laufe der Programmabarbeitung
Dateneingaben vom Anwender von der Konsole entgegenzunehmen bzw. Daten aus einer Date auszulesen. 

## Die Klasse Scanner

Die Klasse Scanner (seit Java 1.5) liest Daten nicht nur von der Konsole, sondern kann auch
Zeichenketten und den Inhalt von Dateien auswerten.

#### Einlesen von der Konsole

```java
Scanner in = new Scanner(System.in); // Einlesen vom Standard Input Stream, der Konsole

try {
    System.out.println("Geben Sie eine Zeichenkette ein:");
    int i = in.nextInt(); // liest einen Integer
    System.out.println(s);
}
catch(InputMismatchException ex){
    System.out.println("Es wurde ein Integer erwartet");
}

in.close();
```

```java
in.nextLine(); // liest eine ganze Zeile ein
in.next(); // liest den nächsten String ein
```

#### Lesen aus einer Datei

```java
try  {
    Scanner scanner = new Scanner(new File("D:\\test.txt"));

    while(scanner.hasNext()){ // Einlesen solange es Daten gibt
        String line = scanner.nextLine(); // lies das nächste Token - eine ganze Zeile
        String[] s = line.split(" ");
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("-----new line------");
    }
    scanner.close();
}
catch (FileNotFoundException e){
    System.out.println(e);
}

```



#### Übung:

Erweitern Sie das Beispiel WordProcessor.
Am Beginn des Programmes wird gefragt, ob von einer Datei oder von der Konsole der zu verarbeitende Text eingelesen werden soll. Wird Datei ausgewählt muss der Pfad und die Datei eingegeben werden, anschließend werden alle Zeilen der Datei eingelesen und umgewandelt (processWord()).
Wird die Konsole gewählt, so wird die Eingabe von dieser ausgewertet.