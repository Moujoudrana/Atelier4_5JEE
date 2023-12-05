# Atelier4_5JEE
On souhaite créer une application de e-commerce basée sur les micro services
# Travail a faire:
1. Consul Discovery

2. Spring Cloud Config

3. Spring Cloud Gateway

4. Customer-service

5. Inventory Service

6. Order Service

7. Consul Config (Billing Service)

8. Vault (Billing Service)

9. Frontend Web avec Angular

# Ressources :
Part 1- https://www.youtube.com/watch?v=LPdfVmllSQo

Part 2 : https://www.youtube.com/watch?v=L0mdrY36tpk

Part 3 : https://www.youtube.com/watch?v=L36O1edFPJE

Part 4 : https://www.youtube.com/watch?v=aQRgO2OxC0w

Part 5 : https://www.youtube.com/watch?v=iMCjDRUXoeM

# Les dépendances utilisées:
-Customer-service, inventory-service et Order-service:
Lombok:
RestRepositories:
ConsulDiscovery:
ConfigClient:
SpringWeb:
SpringDataJPA:
H2Database:
SpringBootActuator:

-Order-service:
OpenFeign
SpringHATEAOS

-Gateway:
SpringBootActuator:
ConsulDiscovery:
Gateway:

-Config-service:
ConfigServer:
SpringBootActuator:
ConsulDiscovery:

-Billing-service
Lombok
ConsulConfiguration
VaultConfiguration
SpringBootActuator
SpringWeb
ConsulDiscovery



# Qu'est ce que c'est Consul
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/25cc100b-af52-41b3-a398-48dc7b026e28)

Consul est un logiciel open-source développé par HashiCorp, une entreprise spécialisée dans les solutions d'infrastructure. Consul est principalement utilisé pour la découverte de services, la gestion de la configuration, et la surveillance des services dans des environnements distribués. Il offre des fonctionnalités clés pour aider à gérer l'infrastructure d'une manière moderne et scalable.

Voici quelques-unes des principales fonctionnalités de Consul :

Découverte de Services : Consul permet l'enregistrement et la découverte dynamique des services dans un environnement distribué. Les services peuvent s'inscrire et se retirer automatiquement de Consul, facilitant ainsi la gestion des connexions entre les différentes parties d'une application distribuée.

Santé des Services : Consul peut être configuré pour effectuer des vérifications de santé régulières sur les services enregistrés. Si un service échoue à une vérification de santé, Consul peut automatiquement le retirer de la liste des services disponibles, contribuant ainsi à la résilience de l'infrastructure.

Gestion de la Configuration : Consul peut stocker et distribuer la configuration de l'application. Cela permet de centraliser la configuration et de la mettre à jour dynamiquement sans nécessiter un redémarrage des services. La gestion de la configuration peut être basée sur des clés-valeurs ou des fichiers spécifiques.

Routage et Équilibrage de Charge : Consul peut être utilisé pour la découverte de services afin de faciliter le routage et l'équilibrage de charge entre les différentes instances d'un service. Cela est particulièrement utile dans les architectures de microservices.

Consistance du Stockage de Clé-Valeur : Consul offre un stockage de clé-valeur distribué qui peut être utilisé pour stocker des informations de configuration, des paires clé-valeur, etc.

Sécurité : Consul prend en charge la sécurisation des communications entre les nœuds et propose des fonctionnalités telles que le chiffrement des données.

Interface Utilisateur Web : Consul offre une interface utilisateur Web qui permet de visualiser l'état de la découverte des services, la configuration, et d'autres informations pertinentes.

-Commande pour lancer consul:

Se positionner sur le dossier de consul, chercher l'adresse ip avec la commande ipconfig en terminal

Lancer consul via la commande : consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.11.100

![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/14d67d6f-dd3f-4338-a40d-6a39c852f9f9)

Maintenant que tout les services sont démarer on peut les visualiser via consul
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/44c54878-cde8-450f-9bd1-cbbabdb93384)

# Qu'est ce que c'est Vault
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/509e2778-7663-4e39-97a0-87fad832bdb7)

Vault est un outil open-source développé par HashiCorp, conçu pour la gestion des secrets et la protection des données sensibles au sein des infrastructures informatiques. Il offre une solution centralisée pour stocker, gérer, et contrôler l'accès aux informations sensibles, telles que les mots de passe, les clés d'API, les certificats, et d'autres données confidentielles.

Principales fonctionnalités de Vault :

Stockage sécurisé des secrets : Vault permet de stocker divers types de secrets de manière sécurisée. Les secrets peuvent être structurés sous forme de paires clé-valeur et organisés en différents chemins.

Gestion des droits d'accès : Vault offre un système de gestion des accès robuste, basé sur des politiques. Les politiques permettent de définir les actions autorisées pour un ensemble donné de secrets.

Génération dynamique de secrets : Vault peut générer dynamiquement des secrets avec une durée de vie limitée. Cela renforce la sécurité en réduisant la période pendant laquelle les secrets sont exposés.

Chiffrement de données : Les données stockées dans Vault peuvent être chiffrées, ce qui ajoute une couche de sécurité supplémentaire.

Audit et traçabilité : Vault permet de suivre les activités d'accès aux secrets grâce à des journaux d'audit. Cela facilite la conformité avec les réglementations et offre une visibilité sur l'utilisation de Vault.

Intégration avec d'autres technologies : Vault s'intègre facilement avec d'autres outils et technologies. Il prend en charge divers backends de stockage (consul, AWS, MySQL, etc.) et peut être utilisé dans des environnements cloud ou sur site.

Authentification multi-facteur : Pour renforcer l'authentification, Vault supporte l'utilisation de plusieurs facteurs, tels que les tokens, les certificats, les codes PIN, etc.

-Commande pour lancer Vault
Se positionner sur le dossier de Vault, Lancer la commande "vault server -dev"


![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/6e545c15-286c-4d93-9fbf-dedb66bac0cb)

![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/d4e48f16-876f-4bb7-9771-75443c334fe2)

![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/ede06cfb-38c8-4bba-b437-02f2894384f1)

# Les services
-Customer
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/31d1f1d2-355d-456d-bf35-9f6ece186901)

-Inventory
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/3b438156-7a6a-40d7-af56-319b62e86698)

-Orders
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/99c0220f-0964-4cfb-af1f-1659af90a74c)

Visualisation des données:
-
Customers
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/1ee0c865-d84f-4a95-b2d4-6ef3a036f602)

Products
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/93337cdd-d693-4718-8f55-6a71031e44ab)

Orders
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/f1eaae76-daf6-4957-b984-9888576b15c5)


# Integration de Angular

![image](https://github.com/Moujoudrana/Atelier6_JEE/assets/93864104/8af91fb5-d44f-41ab-ae73-166a3444166e)
Angular est un framework open-source développé par Google. Il est utilisé pour créer des applications web dynamiques et interactives. Angular est basé sur le langage TypeScript, qui est une extension de JavaScript.

Angular est largement utilisé pour développer des applications web d'entreprise, des applications de gestion, des tableaux de bord, des applications mobiles, etc. Il est apprécié pour sa performance, sa robustesse et sa capacité à créer des applications complexes et évolutives.

Parmi ses principales caractéristiques :
-
Composants : Angular utilise une architecture basée sur des composants. Les composants sont des éléments autonomes de l'application qui encapsulent à la fois le HTML, le CSS et le comportement de l'interface utilisateur. Ils permettent de créer une application modulaire et réutilisable.

Liaison de données : Angular propose une liaison de données bidirectionnelle entre les composants et les vues. Cela signifie que les modifications effectuées dans la vue sont reflétées dans les données du composant, et vice versa. Cela facilite la manipulation des données et maintient l'interface utilisateur synchronisée avec l'état de l'application.

Routage : Angular fournit un système de routage qui permet de gérer la navigation entre les différentes vues de l'application. Le routage permet de créer des liens profonds et des URL significatives pour chaque vue, facilitant ainsi la navigation et le partage de liens.

Services : Les services dans Angular sont des classes réutilisables qui fournissent des fonctionnalités spécifiques à travers l'application. Ils sont utilisés pour gérer la logique métier, l'accès aux données externes, les appels API, etc. Les services favorisent la séparation des préoccupations et permettent de créer une application plus modulaire.



