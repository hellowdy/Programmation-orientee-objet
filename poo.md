#### Introduction: 
La programmation orienté objet est une méthode de programmation permettant d'intérargir avec des objets et des classes.

#### Qu'est-ce qu'un objet et une classe ?
Dans java, un objet est une classe instancié. L'instanciation s'effectue grâce à l'opérateur **new** suivi du nom de la classe et de parenthèses contenant les paramètres d'instanciation.
```java
employe 1 = new Employe();
```

La classe se construira avec plusieurs parties : attribut, constructeur et méhtode.
 ```java
 public class Animal(){ 
     ...  
 }
 ```
**L'attribut** permet de donner des caractéristiques, qui sont stockés dans des variables.
```java
 public class Animal(){ 
     private String carnivore;
     private String vegetarien;
     private String omnivore;
 }
```

Ils existent plusieurs types primitifs qui renvoient des valeurs, voici quelques exemples :
|Type|Mots-clès|
|-------|------|
|Booléan|boolean|
|Caractère|char|
|Entier|int|
|Chaîne de caractère| String|

Le **constructeur** déclare et permet d'initialiser les données de votre classe lors de l'instanciation. Il portera le même nom que votre classe mais ne renverras aucune valeur étant donnée qu'il n'a pas de type.

```java
 public class Animal(){ 
     private String carnivore;
     private String vegetarien;
     private String omnivore;
     
     public Animal(String carnivore, String vegetarien, String omnivore){
         this.carnivore = carnivore;
         this.vegetarien = vegetarien;
         this.omnivore = omnivore;
     }
 }
```
Dans une classe, la fonction est appelée **méthode**. Elle permet d'intéragir avec la ou les classe(s) faisant fonctionner l'objet.
```java
 public class Animal(){ 
     private String carnivore;
     private String vegetarien;
     private String omnivore;
     
     public Animal(String carnivore, String vegetarien, String omnivore){
         this.carnivore = carnivore;
         this.vegetarien = vegetarien;
         this.omnivore = omnivore;
     }
     publi void speak(){
         ...
     }
 }
```
Les attributs est les méthodes se construisent de la même manière : [portée] [type] [nom]

![attribut & héritage](https://1.bp.blogspot.com/-OG0QLqcJx0A/XhCrsbmEXgI/AAAAAAAAIJw/5EY_LKcVehMaAtGxxt5ciSqQJd9EQM2IACNcBGAsYHQ/s1600/car-poo.png)

#### Qu'est-ce que l'encaplusation ?
L'encapsulation permet de sécuriser les données en verrouillant l'accès à vos objets (attribut, méthode, class...) afin qu'elles ne soient pas modifiées ou lues à votre encontre. 
La visibilité de l'objet est diviséd en trois catégories:
-**Public** : accessible à tous, pouvant modifier le contenu depuis l'extérieur et l'intérieur.
-**Protected**: fonctionne avec l'héritage, permettant à la sous-classe de récupérer le protect de la super classe.
-**Private**: il est modifiable depuis l'intérieur de la classe mais inaccessible depuis l'extérieur.