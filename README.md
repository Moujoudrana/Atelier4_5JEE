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

-Gateway:
SpringBootActuator:
ConsulDiscovery:
Gateway:

-Config-service:
ConfigServer:
SpringBootActuator:
ConsulDiscovery:

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
