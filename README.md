# Exercice : Git, GitHub et intégration continue avec GitHub Actions

## Objectif

Dans cet exercice, vous devez prendre un petit projet Java existant, le versionner avec Git, le publier sur GitHub, utiliser une branche de travail, créer une Pull Request, puis configurer un pipeline d’intégration continue (CI) avec GitHub Actions.

## Contexte

Le projet fourni est une petite application Java Maven contenant :
- une classe `Calculator`
- quelques tests unitaires JUnit

Le projet fonctionne déjà localement. Votre travail ne consiste pas à développer l’application, mais à mettre en place un flux de travail de base avec Git, GitHub et CI.

---

## Tâches à réaliser

### Partie A — Vérification locale
1. Ouvrez le projet dans votre terminal ou votre IDE.
2. Exécutez les tests localement avec Maven.
3. Vérifiez que tous les tests passent.

Commande utile :
```bash
mvn test