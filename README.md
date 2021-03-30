     https://levelup.gitconnected.com/the-state-design-pattern-to-implement-likes-and-dislikes-958389b379ff
     https://github.com/zhenyanghua/design-patterns

# 1 - CREATIONAL PATTERN

## I - Static Factory Method Pattern
  
    (a) PROBLEM : 
        Client should not directly instantiate any object in the application using new() keyword i.e 
        > Internal implementation of object creation should be hidden to the client 
        > Choose objects dynamically at run time i.e 
          If you need to instantiate one class or another based on some argument, system property or environment variable
         
         
    (b) SOLUTION :
        Factory Class : 
        Object-Creation should be done by a separate Class i.e Factory-Class.
        This Factory-Class provides a public-static-factory-method,
        which is simply a static method that returns an instance of the class based on some argument.
        The most common example of a factory method is getInstance() method of any Singleton class, which many of you have already used. 
       
       
     (c) CONSTRUCTOR vs STATIC-FACTORY-METHOD
         Both Used to create an instance of a class.
         Prefer Static-Factory-Method instead of constructor to create an instance of a class using some argument passed at run time.
          
          
     (d) STATIC-FACTORY-METHOD vs DEPENDENCY-INJECTION


     (e) JDK Implementation of Static-Factory-Method
         String value1 = String.valueOf(1);
         String value2 = String.valueOf(1.0L);
         String value3 = String.valueOf(true);
         String value4 = String.valueOf('a');

         Executors.newSingleThreadExecutor()
         Executors.newFixedThreadPool(int poolsize)
         Executors.newCachedThreadPool()
         Executors.newScheduledThreadPool(int poolsize)
          
          
     (f) Examples 
         Ex.1) 
         Client               : Calls PizzaFactory class by passing type of pizza it want to create. 
         PizzaFactory Class   : have a public-static-factory-method to create an instance of the class based on some argument.
               
         Ex.2) 
         https://kousiknath.medium.com/design-patterns-different-approaches-to-use-factory-pattern-to-choose-objects-dynamically-at-run-71449bceecef
         
  
## II - Abstarct Factory Pattern
  
    (a) PROBLEM :
        Static Factory Method Pattern : Factory of Products 
        Abstarct Factory Pattern      : Factory of factories 
        If scenario discussed in Static Factory Method Pattern, needs to be designed for related-Group of Pizza Classes(Veg and NonVeg).
        Then Group of related individual factories is encapsulated under one Base Factory .
     
     
    (b) SOLUTION :
        > Factory Class               : Abstract-Class|Interface with the abstract-method  
        > Subclasses of Factory class : 
          Each Subclass overides the factory-class-abstract-method and is responsible for object-creation of same type(Veg or Non-Veg pizza)
          Each Subclass overides the factory-class's abstract-method and decides which class to instantiate based on some argument at runtime. 


    (c) Implementation of Abstract-Factory-Pattern
        > JDK    : javax.xml.parsers.DocumentBuilderFactory class 
        > Spring : FactoryBean interface
        
        
  
## III - [Singleton Pattern](https://www.callicoder.com/java-singleton-design-pattern-example/)
  
    (a) PROBLEM :
        If a class is used by every other classes in the application,
        Then all Other class to call its method first needs to instantiate its object and then call its method.
        As the result there will be Many Objects of a same class in the HEAP , Not memory efficient 
         
         
    (b) SOLUTION
        If a class is used by every other classes in the application, make the class singleton i.e 
        there will be only one instance available to all classes.
          
        Singleton Pattern ensures that only a single instance of a class exists and a global point of access to it exists


    (c) Implementation of Singleton Pattern
          > Caches, thread pools, Database are examples of objects that should only have a single instance.
          
          > Logging Class,
            Database Connection Class : we make Hibernate's Session Factory which is used to connect the Database as singleton object.
            
          >JDK : Runtime class which provides getRuntime() method to get access of it and used to get free memory and total memory in Java.
          
          >Spring : Singleton is the default scope of the IOC container 
                    creates exactly one instance of the object per spring IOC container. 
         
         - Best way to create Singleton class : ENUM
  
  
## IV - Builder Pattern
      
       - Problem Statement :
         If application requires too many parametrized constructor 
         i.e constructors with different member-variable-combinations.
  
       - Solution : 
         Lombok library has an @Builder annotation which solves such scenarios.
       

## V  - Prototype Pattern

          - Problem Statement :
            When Object to create is very heavy and there are too many objects to create.
            Suppose we have an Method that loads an Heavy-Object from database. 
            Now we need to modify this Heavy-Object in our program multiple times.
            it’s not a good idea to load Heavy-Object again from database.
            
          - Solution
            create a new object by copying fully-initialized existing object.
            >Shallow  
            >Deep  


# 2 - STRUCTURAL PATTERN

**I - Adapter Pattern.**  


**II - Decorator Pattern.** 

      - Problem Statement : 
        You need to add functionality to a specific object instead of an entire class of objects.
        Are used when we simply need to pass some custom behavior to a specific set of objects.

      - Example : 
        Suppose a Company whick makes Cars.They genrally makes Basic-Cars
        But sometimes on special User requirement(at runtime)
        They need to make 
        >Sports-Car  : which has Basic-Car-Features + Sport-Car-Features 
        >Luxury-Car  : which has Basic-Car-Features + Luxury-Car-Features 
        >Special Car : which has Basic-Car-Features + Sport-Car-Features + Luxury-Car-Features


**III - Facade Pattern.**  

       - Problem Statement : 
         If an application has a number of interfaces that perform similar kind of jobs.
         Then provide a unified interface to a 'set of interfaces that perform similar kind of jobs'.
         
       - Example 
         There are multiple Data Sources(Oracle,Hadoop,MongoDB)
         Each Data-Sources generates multiple Reports in different Format(PDF,CSV,Excel)
         Note : Application must be extensible to add more Data-Sources and Generate other types of reports
                
         
**IV - Proxy Pattern.** 
       
       - Problem Statement : 
         There are many objects to be created but the object creation is expensive.
         
       - Exmaple : 
         Proxy is a class that acts as a placeholder for another expensive-object.
         Consider an Image Gallery application :  
         Image gallery displays all the image-icons(less-expensive in KBs).Here all  image-icons are Proxy to real Big Images
         When person clicks on a specific Image the whole Image(More-Expensive in MB's) gets loaded.

       - Use Case 
          > Spring :  AOP



# 3 - BEHAVIORAL PATTERN

**I - Chain Of Responsibility.**  

       - Problem Statement : 
         Client request goes through a chain of Handler classes arranged sequentially,
         If one Handler class can't handle the request it passes the request to the next handler in the chain.
           
        - Example :
          There are different Handler classes defined sequentially in a chain,each handling files of different types.
          If client sends file of type 'XML' to the application,It goes through the 
          chain of handler classes sequentially.
           -> If a handler class do not process XML file,it passes the request to next Handler class
           -> Process goes on and If no Handler class is found,The defaultHandler class is called.
           
         
**II - Command Pattern.**  

        - Problem Statement : 
          Client request is a 'command-object' which is passed to 'Invoker object'. 
          Invoker object looks for the appropriate object which can handle this command and 
          passes the command to the corresponding object which executes the command.
        
         - Example : 
           command-objects : TurnTvOn | TurnTvOff | TurnAcOn | TurnAcOff | TurnAllOf  
           Invoker Object  : RemoteControl : 
                           : Client passes the command-object to Remote control 
                           : RemoteControl sets and executes the command
           
 
 **III - Mediator Pattern.**  
 
       - Problem Statement : 
         Multiple Objects of same type no longer communicate directly with each other but 
         instead communicate via Mediator 
         
       - Example : 
         Multiple Person chatting in a Chatroom application.
         Chatroom application here acts as an Mediator among multiple persons chatting.
         
       
  
  
 **IV - Observer Pattern.** 
    
        - Problem Statement : 
          Subject(One Object of a type) maintains list of its Observers(Objects of another type)
          If subject changes its state , All Observers are notified.
          
        - Observer Pattern vs Publisher-Subscriber Pattern 
          Publishers(Subject), do not send messages directly to Subscribers(Observers).
          There is a third component, called broker or message broker or event bus, 
          which is known by both the publisher and subscriber, which filters all incoming messages and 
          distributes them accordingly.
          
          
         - Exmaple : Blog(Subject) publishes post
                     Peoples(Observers) get the notification about the published post
         
          
          
  **V - State Pattern.** 
   
        - Problem Statement :
          An Object can be in many states and it can change its behaviour depending upon its current internal state
 
 
 
  **VI - Memento Pattern.** 
    
        - Problem Statement :
          A object needs to save its state at any point and 
          Restore the last-saved-state of the object.
          
        - Example
          In Games(Pub-G),you can save your Player's state multiple times and 
          Then Restore it back the last saved state, when you resume your play.
 
 
  **VII - Template and Strategy Pattern.**
  
        - Problem Statement :
          An object has a method which can be excuted in many different ways 
          
        - Exmaple 1 : 
          You need to sort an Array.
          Array can be sorted using Insertion-Sort,Selection-Sort,Bubble-Sort etc.
          where each sorting method has different algorithms.
          You can select at runtime on which sorting algorithm you want to sort the array.
          
        - Exmaple 2 : 
          A user doing an online-shopping.
          Payment can be done either by Cash-On-Delievery,Debit-Card,Credit-Card,PayTM etc,
          each having its own implementation.
          User can select at runtime on which payment method they want to pay with.
          
        
  **VIII - Visitor Pattern.**
  
        - Problem Statement : 
          Suppose you have an Interface defined 'Interview' with below abstract methods
           > getMaxMarks();
           > getMinMarks();

          Now you have multiple classes implementing the 'Interview' interface 
           >AptitudeRound   
           >TechnicalRound  
           >ManagerialRound 

          Now You need to add One more method in Interview Interface i.e getAverage() 

          The problem is that you need to @Override getAverage() method in each of the classes 
          that have implemented getAverage() 
  
  
        - Solution :
           Vistor Pattern 
           Note :After Java 8 Features : Default and static methods in Interface.
                 Visitor pattern need is downsizing.
                     
  
  
  
  
  
  
  
 
       
       
 
