Notepad
=======
A bunch of random (but useful!) notes you might keep in a plain txt file...


Java notes
------------
    // where the hell my log4j settings come from??
    System.out.println(Loader.getResource("log4j.properties"));
    System.out.println(Loader.getResource("log4j.xml"));
    
    // how much memory am I using?
    System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    
    // the name of the caller method was...?
    Thread.currentThread().getStackTrace()[2]


Sybase notes
------------
```
-- all tables in the database
SELECT * FROM sysobjects WHERE type='U' order by name

-- all columns of a table
SELECT syscolumns.name, syscolumns.* 
FROM syscolumns JOIN sysobjects
       ON syscolumns.id=sysobjects.id
WHERE sysobjects.name='the_table'
```
