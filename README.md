# DrinkIdentifier

## Beschreibung

<h3>

Mit der ``Drink.java`` Klasse kann man ein Drink Objekt erstellen und dem ein Namen (String) geben. Auf diesem Drink können dann verschiedene Methoden genutzt werden wie ``getVolume()`` um das Volumen des Drinks zu berechnen und auszugeben, ``getAlcoholPercent()`` um die Prozente des Alkohols zu berechnen,<br> ``isAlcoholic()`` um zu überprüfen ob der Drink überhaupt Alkoholisch ist und ein setter und getter für den Namen.

Mit der ``Liquid.java`` Klasse kann man ein Liquid Objekt erstellen und dem ein Namen (String), ein Volumen (double) und die Alkohol Prozente (double) überweisen. Die Klasse hat nur setter und getter Methoden für alle Attribute.

Mit der ``SimpleDrink.java`` Klasse kann man ein SimpleDrink Objekt erstellen welches eine Erweiterung/Extension vom Drink Objekt ist. Diesem Objekt überweist man einen Namen (String) und ein Liquid Objekt l. Die ``SimpleDrink.java`` Klasse hat genau die gleichen Methoden wie die ``Drink.java`` Klasse aber mit dem Unterschied das sie das Liquid Objekt überprüfen auf die jeweiligen Methoden (``getVolume()``, ``getAlcoholPercent()``, ``isAlcoholic()``).

Mit der Klasse ``Cocktail.java`` kann man eine Art Getränk erstellen das aus mehrere Flüssigkeiten (Liquids) besteht. Die Berechnung von ``getVolume()``, ``getAlcoholPercent()`` und ``isAlcoholic()`` erfolgt an dem Durchschnitt bzw der Summe der Flüssigkeiten.

Die Klasse ``DrinkQueue.java`` implementiert eine Queue für Drinks. Sie verwendet eine LinkedList um Getränke zu speichern und zu verwalten. Mit den verschiedenen Methoden kann man das erste Element der Queue removen und returnen.

Die anderen Queues wie ``DoubleQueue.java`` und ``StringQueue.java`` funktionieren ähnlich nur mit ihren entsprechenden Werten (``DoubleQueue.java`` mit Double und ``StringQueue.java`` mit Strings). Der Unterschied liegt darin zu ``DrinkQueue.java``, dass sie Listen anstatt von Linked Lists benutzen.

Die methoden:
- ``offer(Drink obj)``:
Fügt ein Getränk zur Warteschlange hinzu.
Gibt true zurück, wenn erfolgreich, sonst false, wenn die Warteschlange voll ist.

- ``poll()``:
Entfernt das erste Getränk aus der Warteschlange und gibt es zurück.
Gibt null zurück, wenn die Warteschlange leer ist.

- ``remove()``:
Entfernt das erste Getränk aus der Warteschlange und gibt es zurück.
Wirft eine Ausnahme (NoSuchElementException), wenn die Warteschlange leer ist.

- ``peek()``:
Gibt das erste Getränk der Warteschlange zurück, ohne es zu entfernen.
Gibt null zurück, wenn die Warteschlange leer ist.

- ``element()``:
Gibt das erste Getränk der Warteschlange zurück, ohne es zu entfernen.
Wirft eine Ausnahme (NoSuchElementException), wenn die Warteschlange leer ist.
</h3>

## Autoren

<h3>

> 

 [Ramsbacher Jasmin](https://github.com/LayaRamsbacher),
 [Umejr Džinović](https://github.com/Umex10),
 [Casper Zielinski](https://github.com/casper-zielinski)

>

</h3>
<br>

## Taskliste
<h3>

- [X] Ein Teammitglied erstellt ein neues Repository auf GitHub und ladet es hoch<br>
<u> Mitglied: **~Laya** </u>
<br>
<br>

- [X] Einen neuen Branch namens ``maven`` erstellen. Neues Maven-Projekt im Repository erstellen und die Vorlage Dateien integrieren<br>
<u> Mitglied: **~Laya** </u>
<br>
<br>

- [X] Den Branch ``readme`` erstellen und dort Projektnamen sowie die Namen der Mitglieder dieses Projektes notieren. Die Datei dann auch mit Inhalt ergänzen, dass sonst in einer README steht. Die Einteilung der Gruppen und der Aufgaben sowie die Erstellung der Tasklist<br>
<u> Mitglied: **~Casper** </u>
<br>
<br>

- [X] Den Branch ``maven_detail`` erstellen und in diesem Branch die pom.xml Datei erweitern um alle notwendigen Bibliotheken bzw. Konfigurationen
<u> Mitglied: **~Laya**</u>
<br>
<br>

- [X] Den Branch ``bug_hunt`` erstellen und dort im bestehenden Code nach drei Fehlern suchen<br>
<u> Mitglied: **~Umejr**</u>
<br>
<br>

- [X] Den Branch ``drink`` erstellen und dort die Klasse ``Cocktail`` erstellen. Die soll das Interface Drink implementieren<br>
<u> Mitglied: **~Casper** </u>
<br>
<br>

- [X] Den Branch ``queue`` erstellen und dort die Klasse ``DrinkQueue`` erstellen die es ermöglicht alle Getränke, also Klassen, die das Interface Drink implementieren, in einer Queue zu verwalten. Jedes Gruppenmitglied erstellt dann ungefähr gleich viele Methoden<br>
<u> Mitglied: **~Casper** **~Umejr** **~Laya** </u>
<br>
<br>

- [X] Den Branch ``javadoc`` erstellen und JavaDoc Kommentare zu den bereits existierenden Klassen, als auch den neuen Klassen. Sie sollen wie in der vorherigen Übung die Klassen, Attribute und Methoden beschreiben.<br>
<u> Mitglied: **~Casper** </u>
<br>
<br>

- [X] Den Branch ``test`` erstellen und dort für die bestehenden als auch die neuen Klassen Test erstellen, dabei soll für alle Klassen eine hundertporzentige Testabdeckung erreicht werden. Der Aufruf soll über die Kommandozeile mit ``mvn test`` ausführbar sein<br>
<u> Mitglied: **~Casper** **~Umejr** **~Laya** </u>
<br>
<br>

- [X] Den Branch ``double_queue`` erstellen und dort eine Queue Version zu erstellen, die es ermöglicht Double Werte in einer Queue zu verwalten. Das unter der Klasse ``DoubleQueue`` zu implementieren<br>
<u> Mitglied: **~Umejr** </u>
<br>
<br>

- [X] Den Branch ``maven_site`` erstellen und dort eine maven site Dokumentation erstellen. Jedes Teammitglied soll zusätzlich eine zusätzliche Markdown Datei hinzufügen, die auf der Hauptseite der maven site Dokumentation verlinkt wird. Dort nennen sie Ihren Namen und beschreiben welche Teile von ihnen umgesetzt wurden.

- [X] Abschluss der Übung
