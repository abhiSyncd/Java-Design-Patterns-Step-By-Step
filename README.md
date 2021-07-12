

#
# 1 - CREATIONAL PATTERN

## I - [Static Factory Method Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/1_Creational_1_StaticFactory_a.png)
  
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
         
  
## II - [Abstract Factory Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/1_Creational_2_AbstractFactory.png)
  
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
        
        
  
## III - [Singleton Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/1_Creational_3_Singleton_b.png)
   
   **(a) PREREQUISITE :**
   
    - When we create an object of a class a memory is allocated in the RAM.
      > HEAP  : stores actual object|Instance 
      > Stack : stores Reference Variables of the Objects-stored-in-Heap
       
    - What happen when  we create multiple object of a  Class?      
      If we create multiple objects of the same class, 
      Multiple memory will be allocated to the same object but with different cell addresses in RAM.
      Thus, in this way, the memory is wasted, while we create a new instance of a class in every call
    
    - Object-level-lock vs Class-Level-Lock vs Singleton
      > Object level lock
        When we want to synchronize a non-static-method-or-codeBlock such that
        Only one thread will be able to execute the code block ON GIVEN INSTANCE OF THAT CLASS.
      
      > Class Level Lock
        Prevents multiple threads to enter in synchronized-block in any of ALL AVAILABLE INSTANCES OF THE CLASS on runtime.
        This means if in runtime there are 100 instances of DemoClass,
        This means if in runtime there are 100 instances of DemoClass,
        all other instances will be locked for other threads.
        
      > Singleton
        Restricts the instantiation of a class to one object.
        Please note singleton pattern will not apply lock on the object.
        For example
        2 different threads are sharing the same single object reference and
        can call the different method on that single object simultaneously.
      
    - For More Info : 
      https://dzone.com/articles/java-singletons-using-enum  : Testing Singleton
      https://www.c-sharpcorner.com/article/singleton/
      https://www.callicoder.com/java-singleton-design-pattern-example/
            
 **(b) Need**
 
    PROBLEM : If a class is used by every other classes in the application,
              Then all Other class to call its method first needs to instantiate its object and then call its method.
              As the result there will be Many Objects of a same class in the HEAP.
              Thus, in this way, the memory is wasted, while we create a new instance of a class in every call. 
        
    SOLUTION : If a class is used by every other classes in the application, make the class singleton i.e 
               Singleton Pattern ensures that only a single instance of a class exists and a global point of access to it exists.
               Since, its a global access to all threads,we need to make it thread safe.


  **(c) Steps to Implement Singleton**

        - Private Constructor
          Declare a private constructor for the class for which you want to make Singleton.
          A private constructor cannot be inherited and its not possible to instantiate it from outside
   
        - Static Member (Variable and Method)
          > Declare a static-variable for that class.
          > Create a static-method for that class and assign the Object to the declared-static-variable.
            The only way to get an instance is to call this static method.
         
        - For More Info : Refer Diagram
    
 **(d) CHALLENGES and SOLUTIONS**
 
        - Thread Safety 
        - Reflection Safe
        - Serailzable Safe
        - Clonable Safe
       
       
 **(e) Best way to create a Singleton class**
 
      Using ENUM
    
 **(f) [Testing Singleton](https://dzone.com/articles/prevent-breaking-a-singleton-class-pattern)**
 
      @Test
      public void testThreadSafeSingleton() throws InterruptedException {

          int threadsAmount = 500;
          Set < Integer > singletonSet = new HashSet < > ();
          ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

          for (int i = 0; i < threadsAmount; i++) {
              executorService.execute(() -> {
                  Singleton singleton = Singleton.getInstance();
                  singletonSet.add(singleton.hashCode());
              });
          }

          executorService.shutdown();
          executorService.awaitTermination(1, TimeUnit.MINUTES); // Execute Below statement After All threads are completed

          assertEquals(1, singletonSet.size(), "");
      }
         For More Info 
         https://blog.marcnuri.com/spring-bean-scopes-guide-to-understand-the-different-bean-scopes
      
      
 **(g) Implementation of Singleton Pattern**
 
        - JDK Implementation of Static-Factory-Method
          > java.lang.Runtime#getRuntime()
          > java.awt.Desktop#getDesktop()
        
     
 **(h) Use Cases**
 
        > Caches, thread pools, Database are examples of objects that should only have a single instance.
        > Logging Class,
          Database Connection Class : we make Hibernate's Session Factory which is used to connect the Database as singleton object.
  
  
## IV - Builder Pattern
      
    - PROBLEM :
      If application requires too many parametrized constructor 
      i.e constructors with different member-variable-combinations.
  
    - SOLUTION : 
      Lombok library has an @Builder annotation which solves such scenarios.
       

## V  - [Prototype Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/1_Creational_5_Prototype.png)

    - PROBLEM :
      When Object to create is very heavy and there are too many objects to create.
      Suppose we have an Method that loads an Heavy-Object from database. 
      Now we need to modify this Heavy-Object in our program multiple times.
      So, it’s not a good idea to load Heavy-Object again from database.
            
    - SOLUTION
      create a new object by copying fully-initialized existing object.
      >Shallow  
      >Deep  

#
# 2 - STRUCTURAL PATTERN

## I - [Adapter Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/2_Structural_1_Adapter.png)


## II - [Decorator Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/2_Structural_2_Decorator.png) 

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


## III - [Facade Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/2_Structural_3_Facade.png)

       - Problem Statement : 
         If an application has a number of interfaces that perform similar kind of jobs.
         Then provide a unified interface to a 'set of interfaces that perform similar kind of jobs'.
         
       - Example 
         There are multiple Data Sources(Oracle,Hadoop,MongoDB)
         Each Data-Sources generates multiple Reports in different Format(PDF,CSV,Excel)
         Note : Application must be extensible to add more Data-Sources and Generate other types of reports
                
         
## IV - [Proxy Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/2_Structural_4_Proxy.png)
       
       - Problem Statement : 
         There are many objects to be created but the object creation is expensive.
         
       - Exmaple : 
         Proxy is a class that acts as a placeholder for another expensive-object.
         Consider an Image Gallery application :  
         Image gallery displays all the image-icons(less-expensive in KBs).Here all  image-icons are Proxy to real Big Images
         When person clicks on a specific Image the whole Image(More-Expensive in MB's) gets loaded.

       - Use Case 
          > Spring :  AOP


#
# 3 - BEHAVIORAL PATTERN

## I - [Chain Of Responsibility](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_1_ChainOf%20Responsibility.png)

    - PROBLEM : 
      Client request goes through a chain of Handler classes arranged sequentially,
      If one Handler class can't handle the request it passes the request to the next handler in the chain.
           
     - SOLUTION :
       There are different Handler classes defined sequentially in a chain,each handling files of different types.
       If client sends file of type 'XML' to the application,It goes through the 
       chain of handler classes sequentially.
       > If a handler class do not process XML file,it passes the request to next Handler class
       > Process goes on and If no Handler class is found,The defaultHandler class is called.
           
     - Implemntation :
       > Spring : Security Filter Chain 


## II - [Command Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_2_Command.png) 

    - PROBLEM 
      Client request is a 'command-object' which is passed to 'Invoker object'. 
      Invoker object looks for the appropriate object which can handle this command and 
      passes the command to the corresponding object which executes the command.
        
     - SOLUTION : 
       command-objects : TurnTvOn | TurnTvOff | TurnAcOn | TurnAcOff | TurnAllOf  
       Invoker Object  : RemoteControl : 
                         > Client passes the command-object to Remote control 
                         > RemoteControl sets and executes the command
           
 
 ## III - [Mediator Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_3_Mediator.png)  
 
    - PROBLEM : 
      Multiple Objects of same type no longer communicate directly with each other but 
      Instead communicate via Mediator 
         
    - SOLUTION : 
      Multiple Person chatting in a Chatroom application.
      Chatroom application here acts as an Mediator among multiple persons chatting.
         
         
 ## IV - [Observer Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_4_Observer.png)
    
    - PROBLEM : 
      Subject(One Object of a type) maintains list of its Observers(Objects of another type)
      If subject changes its state , All Observers are notified.
          
    - Observer Pattern vs Publisher-Subscriber Pattern 
      Publishers(Subject), do not send messages directly to Subscribers(Observers).
      There is a third component, called broker or message broker or event bus, 
      which is known by both the publisher and subscriber, which filters all incoming messages and 
      distributes them accordingly.
          
          
    - Exmaple : Blog(Subject) publishes post
                Peoples(Observers) get the notification about the published post
         
          
          
  ## V - [State Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_5_State.png)
   
    - PROBLEM 
      An Object can be in many states and it can change its behaviour depending upon its current internal state
 
 
 
  ## VI - [Memento Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_6_Memento.png)
    
    - PROBLEM :
      A object needs to save its state at any point and 
      Restore the last-saved-state of the object.
          
    - SOLUTION
      In Games(Pub-G),you can save your Player's state multiple times and 
      Then Restore it back the last saved state, when you resume your play.
 
 
  ## VII - [Template and Strategy Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_7_Strategy.png)
  
    - PROBELM :
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
          
        
  ## VIII - [Visitor Pattern](https://github.com/abhiSyncd/Java-Design-Patterns-Step-By-Step/blob/master/4_Image_Repo/3_Behavior_8_Visitor.png)
  
    - PROBLEM : 
      Suppose you have an Interface defined 'Interview' with below abstract methods
      > getMaxMarks();
      > getMinMarks();

      Now you have multiple classes implementing the 'Interview' interface 
      > AptitudeRound   
      > TechnicalRound  
      > ManagerialRound 

      Now You need to add One more method in Interview Interface i.e getAverage() 

      The problem is that you need to @Override getAverage() method in each of the classes 
      that have implemented getAverage() 
  
  
    - SOLUTION :
      Vistor Pattern 
      Note : After Java 8 Features : Default and static methods in Interface.
             Visitor pattern need is downsizing.

# 
     For more info : 
     Youtube : Optimus Growth : Must See
     https://levelup.gitconnected.com/the-state-design-pattern-to-implement-likes-and-dislikes-958389b379ff
     https://github.com/zhenyanghua/design-patterns
     
