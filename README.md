# 🏦 E-Banking Backend

Une API REST sécurisée construite avec **Spring Boot** pour gérer les clients et leurs comptes bancaires, avec authentification JWT et contrôle d'accès basé sur les rôles (`USER`, `ADMIN`).

---

---

## 🔧 Fonctionnalités

- 🔐 Authentification JWT avec rôles `ADMIN`, `USER`
- 👥 Gestion des clients : CRUD via API REST
- 💰 Gestion des comptes : solde, historique, opérations (débit, crédit, virement)
- 🌐 CORS activé pour communication frontend-backend
- 📊 Base de données en mémoire (H2) pour développement

---

## 🛠️ Technologies

- **Java 17** : Langage de programmation
- **Spring Boot 3.x** : Framework pour API REST
- **Spring Security** : Authentification et autorisation JWT
- **Nimbus JOSE JWT** : Encodage/décodage JWT
- **Maven** : Gestion des dépendances

---

## 🚀 Lancement

### Prérequis
- **Java 17+** : JDK (OpenJDK ou Oracle)
- **Maven** : Pour la compilation
- **Git** : Pour cloner le dépôt
- **Optionnel** : MySQL/PostgreSQL pour base persistante
- **IDE** : IntelliJ IDEA, VS Code, ou similaire

### Installation
1. Cloner le dépôt :
   ```bash
   git clone https://github.com/HananeIouiri/Digital-Banking-App-Backend.git

   ```
2. Configurer `src/main/resources/application.properties` :
   ```properties
   server.port=8085
   jwt.secret=your-secure-secret-key
   ```
   Remplacer `your-secure-secret-key` par une clé sécurisée (256 bits).
3. Compiler et lancer :
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
   L'API est disponible sur `http://localhost:8085`.

---

## 🌐 Endpoints REST

| Méthode | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/auth/login` | Connexion + génération JWT |
| `GET` | `/customers` | Liste des clients |
| `GET` | `/customers/search?keyword={kw}` | Recherche par mot-clé |
| `POST` | `/customers` | Créer un client |
| `DELETE` | `/customers/{id}` | Supprimer un client (Admin) |
| `GET` | `/accounts/{accountId}/history?page={p}&size={s}` | Historique paginé |
| `POST` | `/accounts/debit` | Débiter un compte (Admin) |
| `POST` | `/accounts/credit` | Créditer un compte (Admin) |
| `POST` | `/accounts/transfer` | Virement entre comptes (Admin) |

---

## 📂 Structure

```
ebanking-backend/
├── src/
│   ├── main/
│   │   ├── java/iouiri/hanane/backend/
│   │   │   ├── BackendApplication.java  # Point d'entrée
│   │   │   ├── dtos/                            # Objets de transfert
│   │   │   ├── entities/                        # Entités JPA
│   │   │   ├── enums/                           # Enums
│   │   │   ├── exceptions/                      # Exceptions
│   │   │   ├── mappers/                         # Mappage
│   │   │   ├── repositories/                    # Repositories JPA
│   │   │   ├── security/                        # Sécurité
│   │   │   ├── services/                        # Logique métier
│   │   │   └── web/                             # Contrôleurs REST
│   │   └── resources/
│   │       ├── application.properties           # Configuration
├── pom.xml                                      # Maven
└── mvnw                                         # Wrapper Maven
```

---

## 🔮 Améliorations Futures

- Base persistante (MySQL/PostgreSQL)
- Modification des clients
- Création de comptes
- Traçabilité des opérations (identifiant utilisateur)
- Meilleure gestion des erreurs et logging
- Déploiement cloud (AWS, Heroku)

---

## 🧪 Tests

### 🔹 Test de base de données H2 :
Voici quelques captures illustrant les tests réalisés avec la base de données **H2** intégrée :

![H2 Test 1](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img1.jpg)
---
![H2 Test 2](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img2.jpg)
---
![H2 Test 3](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img3.jpg)
---
![H2 Test 4](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img4.jpg)

---

### 🔄 Remplacement de la stratégie `SINGLE_TABLE` par `TABLE_PER_CLASS` :

![Table per Class](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img5.jpg)

---

### 🔁 Passage de `TABLE_PER_CLASS` à `JOINED` :

![JOINED Strategy](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img6.png)

---

### 🛠 Migration de la base de données de H2 vers MySQL
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img7.jpg)

Le projet a été migré vers MySQL pour une meilleure persistance en production. La configuration est assurée via `application.properties`.

---

## ⚙️ Modules ajoutés


  
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img8.png)

## CustomerRestController` : pour la gestion des clients via l’API
- ---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img9.png)
---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img10.png)
---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img11.png)
---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img12.png)
---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img13.png)
---
## BankAccountController` : pour les comptes et opérations
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img14.png)
---
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img15.png)

  ## 📜 Historique des opérations : possibilité de consulter l’historique complet d’un compte
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img15.png)
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img16.png)

 ## 📄  Pagination : gestion des historiques avec pages et tailles personnalisées
![](https://github.com/HananeIouiri/Digital-Banking-App-Backend/raw/backend/captures/img17.png)

## 🤝 Contribuer

1. Forker le dépôt.
2. Créer une branche : `git checkout -b feature/VotreFonctionnalite`.
3. Committer : `git commit -m 'feat: ajouter VotreFonctionnalite'`.
4. Pousser : `git push origin feature/VotreFonctionnalite`.
5. Ouvrir une pull request.

 
