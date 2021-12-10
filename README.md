# Code der letzen Sitzungen


:warning::warning::warning:
Lasst euch nicht erschlagen.
In dem beigefügten Code ist ein bisschen was vorweggenommen worden zum Thema Vererbung.

-------------

Der Code aus den letzten Stunden behandelt Sichtbarkeitsmodifikatoren und besonders Klassenstrukturen und Vererbung. Es geht nämlich ans eingemachte der objektorientierten Programmierung. Geht es in Ruhe durch und keine Sorge, Börge geht es auch nochmal durch. Erstmal dazu keine Aufgabe, denn das Thema ist ja vorgezogen.

Der Code ist ein wenig wie (eine kleine) Erdensimulation. Wir erstellen eine Überklasse Mensch und daraus leiten sich die Klassen Male und Female ab. Und das kann man weiterführen. 

## Beispiel:
Tier --> Säugetier --> Raubkatze --> Tiger

Dabei bedeutet Vererbung, dass der Tiger alles kann, was eine Raubkatze kann, was die Raubkatze ergibt sich daraus, was ein Säugetier kann, was wiederum vom Tier abstammt.
Also eine ganz lineare __Vererbung__. Bedeutet im Umkehrschluss, dass wenn man eine solche Struktur aufbauen möchte, man sich Gedanken machen muss, welche Sachen Klassenübergreifen funktionieren sollen. 

## Beispiel:
Also welche Eigenschaften verbinden zum Beispiel Tiger und Löwen. Das wäre das was in der Klasse Raubkatze festgehalten wird. Was verbindet Raubkatzen und Nagetiere --> Säugetiere. Was verbindet Säugetiere und Kaltblüter --> Tiere. 

Natürlich noch ein wenig weitgreifender, aber das Konzept wird hoffentlich klar. Es gilt so viel wie möglich zu abstrahieren und sich doppelten Code zu sparen.
