# Journal
Phase 1
Keeping data management and notification logic separate in software architecture creates loosely 
coupled design and separation of concerns to increase maintainability and extensibility. When components
are only concerned with their small set of responsibilities they can be more extensible and reusable.

Phase 2
The Subject and Observer interfaces create an abstract contract between the subject and observer classes,so
that methods can be passed between them without changing or breaking the code of any of the classes through direct
inheritance.

Phase 3
The Subject doesn't need to know what kind of displays are listening. It will loop through every observer in the    
list, and will broadcast updates to every class that implements the observer interface.

Phase 4
I used the push method, and added a String variable to the update method in the interface so that data could be passed  
directly from the subject to observers through the update.

Phase 5
If I used the pull method I would create getter methods for the observers in GameTicker, and add the subject class to the observer  
classes as a variable that they can access the getters from. The push method is useful when you want to send the same data
to many observers, like different news outlets. The pull method is better used when each observer wants different pieces
of data (weather, sports news, local news).
