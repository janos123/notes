// where the hell my log4j settings come from??
System.out.println(Loader.getResource("log4j.properties"));
System.out.println(Loader.getResource("log4j.xml"));

// how much memory am I using?
System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

// the name of the caller method was...?
Thread.currentThread().getStackTrace()[2]
