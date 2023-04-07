---
title:  Dossier de tests
author: Lucas Da Silva Ferreira
---
# Dossier de tests
## Sommaire<!-- omit in toc -->
- [Dossier de tests](#dossier-de-tests)
  - [1. Introduction](#1-introduction)
  - [2. Description de la procédure de test](#2-description-de-la-procédure-de-test)
  - [3. Description des informations à enregistrer pour le test](#3-description-des-informations-à-enregistrer-pour-le-test)
    - [1. Campagne de test](#1-campagne-de-test)
    - [2. Tests](#2-tests)
    - [3. Résultats](#3-résultats)
    - [4. Conclusions](#4-conclusions)
  
## 1. Introduction
blabla

## 2. Description de la procédure de test
g

## 3. Description des informations à enregistrer pour le test
g

### 1. Campagne de test
| Contexte                             |                                                                         |
| :----------------------------------- | :---------------------------------------------------------------------- |
| Configuration logicielle :           | Visual Studio 1.74, Java Extension Pack 0.9, OpenJDK 11, Windows 10 Pro |
| Configuration matérielle :           | INTEL® I7-11800H 4,6Ghz × 16, 64Go RAM 3200Mhz                          |
| Date de début :  3/02/2023           | Date de finalisation : semaine du 6/02/2023                             |
| Tests à appliquer :                  | testdernierJourDuMois()                                                 |
| Responsable de la campagne de test : | Lucas Da Silva Ferreira                                                 |

### 2. Tests
| Test 1                |                          |
| :-------------------- | :----------------------- |
| Identification :      | Version : 1.0            |
| Description :         | Tests sur Date.compareTo |
| Ressources requises : | JUnit + JDK17 +          |
| Responsable :         | Lucas Da Silva Ferreira  |

| Classe | Jour  | Mois  | Année | Résultats Attendus |
| :----- | :---: | :---: | :---: | :----------------: |
| P1     |   >   |   >   |   >   |         >          |
| P2     |   <   |   >   |   >   |         >          |
| P3     |   <   |   <   |   >   |         >          |
| P4     |   <   |   <   |   <   |         <          |
| P5     |   >   |   <   |   <   |         <          |
| P6     |   >   |   >   |   <   |         <          |
| P7     |   =   |   >   |   >   |         >          |
| P8     |   =   |   <   |   >   |         >          |
| P9     |   =   |   =   |   >   |         >          |
| P10    |   =   |   =   |   <   |         <          |
| P11    |   =   |   =   |   =   |         =          |
| P12    |   <   |   =   |   =   |         <          |
| P13    |   >   |   =   |   =   |         >          |
| P14    |   =   |   <   |   =   |         <          |
| P15    |   =   |   >   |   =   |         >          |
| P16    |   >   |   =   |   >   |         >          |
| P17    |   <   |   =   |   >   |         >          |
| P18    |   <   |   =   |   <   |         <          |
| P19    |   >   |   >   |   =   |         >          |
| P20    |   <   |   >   |   =   |         >          |
| P21    |   <   |   <   |   =   |         <          |

### 3. Résultats
| Test 1                       |                         |
| :--------------------------- | :---------------------- |
| Référence du test appliqué : | D/C                     |
| Responsable :                | Lucas Da Silva Ferreira |
| Date d'application :         | 07/04/2023              |
| Résultat :                   | Non effectué            |
| Occurences des résultats :   | Systèmatique            |

### 4. Conclusions
...