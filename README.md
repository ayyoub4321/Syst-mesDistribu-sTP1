# SystmesDistribu-sTP1
## TP1 - Injection de dépendances manuelle

### Structure du projet

```
src/
├── tp1/
│   ├── dao/
│   │   ├── IDao.java
│   │   └── DaoImpl.java
│   ├── Metier/
│   │   ├── IMetier.java
│   │   └── Metier.java
│   └── pres/
│       └── PresStat.java
└── img/
    └── result1.png
```

### Interfaces

* **IDao** : récupère les données (`getData()`).
* **IMetier** : définit la méthode de calcul (`clalcul()`).

### Implémentations

* **DaoImpl** : implémente `IDao` et renvoie une valeur fixe.
* **Metier** : implémente `IMetier`, utilise un `IDao` pour effectuer le calcul.

### Présentation statique

Le point d'entrée est la classe `PresStat` qui crée manuellement les objets :

```java
DaoImpl dao = new DaoImpl();
Metier metier = new Metier(dao);
System.out.println(metier.clalcul());
```

### Exécution

1. Compiler le projet.
2. Lancer `PresStat`.

### Résultats

![Sortie console](img/result1.png)

### Notes

* Dossier des images : `img/`.
* Ajouter d'autres captures dans `img/` et référencer ici.

