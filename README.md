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
-
    Lombok: est une bibliothèque Java qui permet de réduire le code boilerplate en générant automatiquement des méthodes telles que les getters, setters, equals, hashCode, et d'autres méthodes couramment utilisées à partir d'annotations.

    RestRepositories:Les repositories REST (RestRepositories) sont une fonctionnalité de Spring Data qui simplifie la création de couches d'accès aux données pour les applications RESTful. Ils permettent de créer des points d'accès REST pour interagir avec les données de la base de données.

    ConsulDiscovery:Consul est un service de découverte et de configuration distribué. En utilisant Consul Discovery avec Spring Cloud, les applications peuvent s'enregistrer auprès de Consul et découvrir d'autres services enregistrés.

    ConfigClient: Le client de configuration (ConfigClient) de Spring Cloud permet à une application de récupérer sa configuration à partir d'un serveur de configuration externe, tel que Spring Cloud Config Server.

    SpringWeb:Spring Web est une partie de Spring Framework qui fournit des fonctionnalités pour le développement d'applications web. Il inclut Spring MVC, qui est un framework pour la création de services web RESTful.

    SpringDataJPA:Spring Data JPA simplifie l'accès aux données relationnelles en fournissant un ensemble d'abstractions sur JPA (Java Persistence API). Il facilite l'utilisation de JPA pour interagir avec des bases de données relationnelles.

    H2Database: H2 Database est une base de données relationnelle écrite en Java. Elle est souvent utilisée comme base de données intégrée pendant le développement et les tests en raison de sa légèreté et de sa facilité d'utilisation.

    SpringBootActuator:Spring Boot Actuator fournit des fonctionnalités pour la surveillance et la gestion des applications Spring Boot. Il expose des points de terminaison (endpoints) qui peuvent être utilisés pour obtenir des informations sur l'état de l'application.

-Order-service:
-
    OpenFeign: OpenFeign est une bibliothèque de déclaration de client REST pour Java. Elle simplifie la création de clients REST en permettant aux développeurs de déclarer des interfaces Java annotées, ce qui est ensuite utilisé pour générer automatiquement des clients HTTP.

    SpringHATEAOS: :Spring HATEOAS simplifie la création de services web RESTful qui suivent les principes HATEOAS. HATEOAS consiste à inclure des liens hypertextes dans les réponses des services web pour permettre à l'application cliente de naviguer de manière dynamique à travers les ressources.

    Gateway

    SpringBootActuator

    ConsulDiscovery


-Config-service:
-
    ConfigServer: ConfigServer fait référence à Spring Cloud Config Server. C'est un composant de Spring Cloud qui permet de centraliser et de gérer la configuration des applications dans un environnement distribué.

    SpringBootActuator

    ConsulDiscovery

-Billing-service
-
    Lombok

    ConsulConfiguration: ConsulConfiguration fait référence à la configuration liée à Consul. Consul est un logiciel d'orchestration open source et un service de découverte de services, souvent utilisé dans des architectures de microservices. ConsulConfiguration dans un contexte Spring Boot/Spring Cloud peut inclure des paramètres spécifiques liés à l'intégration et à la configuration de Consul avec les applications.

    VaultConfiguration: VaultConfiguration fait référence à la configuration liée à HashiCorp Vault. Vault est un outil de gestion de secrets qui permet de stocker, d'accéder et de distribuer des secrets, tels que des mots de passe, des clés d'API, etc., de manière sécurisée.

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
-
Se positionner sur le dossier de consul, chercher l'adresse ip avec la commande ipconfig en terminal

Lancer consul via la commande : consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.11.100

![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/14d67d6f-dd3f-4338-a40d-6a39c852f9f9)

Maintenant que tout les services sont démaré on peut les visualiser via consul
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/bbe79715-7172-4955-80a0-260e6b3fd674)


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
-
Se positionner sur le dossier de Vault, Lancer la commande "vault server -dev"

set VAULT_ADDR=http://127.0.0.1:8200

vault kv put secret/billing-service user.username=rana user.password=123456

vault kv get secret/billing-service

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

# Les interfaces:
Produits
-
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/5b500879-e22b-468c-bf48-2de7e14d88ed)

Clients
-
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/19bb45dc-49b8-4872-a1b0-3c31a728b98c)

Commandes des clients
-
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/14b9c024-ebc1-40d4-8daa-51e469708292)

Détails de la commande
-
![image](https://github.com/Moujoudrana/Atelier4_5JEE/assets/93864104/7329d82a-c301-41b2-97e4-6299710710b7)





