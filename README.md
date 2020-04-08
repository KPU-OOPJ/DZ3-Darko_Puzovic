**Napravite klase DNKLanac i TestDNKLanac sa sledećim uslovima:**

a)	Klasa DNKLanac koja predstavlja deo DNKLanca čoveka i ima: 
-	Atribut koji predstavlja niz karika DNK lanca. Svaka karika DNK lanca može da ima samo jednu od vrednosti: 'A', 'C', 'G' ili 'T'. 
-	Atribut koji predstavlja trenutni broj karika u lancu. 
-	Konstruktor u kome se lanac kreira tako da mu maksimalni broj karika bude jednak vrednosti koja se prosleđuje konstruktoru u obliku ulaznog argumenta. Ako se desi da je ulazni argument manji ili jednak nula, maksimalni kapacitet treba podesiti na 256 karika. 
-	Metodu za dodavanje karika u DNK lanac. Nova karika se daje u vidu ulaznog argumenta. Dodavanje se vrši samo ako nova karika ima vrednost 'A', 'C', 'G' ili 'T' i ako u lancu ima mesta  (broj karika je manji od maksimalnog kapaciteta). U suprotnom, potrebno je ispisati poruku o grešci. 
-	Metodu koja prebrojava i vraća koliko ima 'A' karika u lancu. 
-	Metodu koja vraća trenutnu dužinu lanca (broj karika). 
-	Metodu koja vraća maksimalni kapacitet lanca. 
-	Metodu koja vraća broj nepopunjenih mesta u lancu. 
-	Metodu koja ispisuje karike DNK lanca u jednom redu. 
-	Metodu koja ispisuje karike DNK lanca u jednom redu ali u obrnutom redosledu. 

b)	Klasa TestDNKLanac koja kreira jedan DNK lanac maksimalne dužine 8 karika i unosi u njega elemente ACCGTTTT. Potrebno je ispisati ovaj DNK lanac u regularnom i obrnutom redosledu. 
