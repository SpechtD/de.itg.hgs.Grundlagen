# Prisoner's Dilemma

## Beschreibung
Bei diesem Spiel treten immer sind 2 Gefangene bei einem
Verh�r. Die Gefangenen werden unabh�ngig 400 mal zu einem Tathergang befragt, an dem beide beteiligt waren. 

## Szenarien
1. Gefangener g1 verr�t den g2 tut dies nicht.	$rightarrow$	2 Pkte f�r g1
2. Gefangener g1 und g2 verraten beide nicht.	$rightarrow$	1 Pkt f�r Beide
3. Beide Gefangenen verraten					$rightarrow$	0 Pkte f�r Beide

# Aufgabe
Entwickeln sie einen einen Algorithmus welcher `true` oder `false` zur�ckgibt.
Dabei steht `true` f�r Verrat. Als Entscheidungsgrundlage verwenden Sie ein bool'sches Array aller Entscheidungen von g1 (Sie selbst) und g2.

```java
class Prisoner_MEINNAME{
	public static boolean entscheidung(pIch[]:boolean, pGegner[]:boolean){
		boolean meineEntscheidung = true;

		//... Ihr Algorithmus
		
		return meineEntscheidung;
	}
}
```

# Auswertung
F�r die Auswertung treten immer 2 Algorithmen gegeneinander an. Kopieren Sie daf�r Ihre Klasse in das Tauschlaufwerk. Der Moderator am Lehrer-PC f�gt die Klassen zusammen, so dass getestet werden kann.

