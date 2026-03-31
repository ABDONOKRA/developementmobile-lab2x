# Lab 2 – Calculateur d’impôts locaux

## But du lab
L'objectif est de créer une application Android permettant de calculer le montant total des impôts locaux en fonction de plusieurs critères :
- La surface de la maison (en m²)
- Le nombre de pièces
- La présence ou non d’une piscine

## Fonctionnalités
- Saisie du nom et de l'adresse du propriétaire.
- Saisie numérique de la surface et du nombre de pièces.
- Sélection via une CheckBox pour la piscine.
- Calcul dynamique avec affichage détaillé (Base, Supplément, Total).
- Gestion des erreurs de saisie (champs vides ou format incorrect).

## Formule de calcul
- **Impôt de base** : Surface × 2 DH.
- **Supplément** : (Nombre de pièces × 50 DH) + (100 DH si piscine présente).
- **Total** : Impôt de base + Supplément.

## Captures d'écran
| Interface de saisie | Résultat du calcul |
| :---: | :---: |
| 345 | 1140|

## Vidéo de démonstration
*(Ajoutez ici le lien vers votre vidéo ou un GIF de démonstration)*
> [Regarder la démo vidéo] https://github.com/ABDONOKRA/developementmobile-lab2x/issues/1

## Structure du projet
- `MainActivity.java` : Contient la logique de calcul et la gestion des événements.
- `activity_main.xml` : Définit l'interface utilisateur avec un `LinearLayout`.

---
*Réalisé dans le cadre du cours de Développement Mobile.*
