## Installing Groovy in Oracle SQL Developer Data Modeler

SDDM allows scripts to be written in several JVM languages, however only the Nashorn JavaScript scripting engine in installed by default. To allow SDDM to use another language for scripting, the language jar file must be installed in a SDDM java extension directory. To find the location of these extension directories:

1. Select **Help | About** from the top-level menu.
2. Select the **Properties** tab.
2. Under the *Name* column, find the entry for *java.ext.dirs*.
3. The Value for that row is a listing of colon-separated entries of the Java extension directories.
  * Experimentation has shown that the language jar file can be installed in any of the directories listed, however not all of them may be accessible to the user.

To enable the Groovy Scripting Engine for SDDM:

1. Go to the [Groovy Download](http://groovy-lang.org/download.html) page and find the "2.4.15 distributions" section.
1. Download the "SDK bundle" and unpack it.
1. Go to the download location and open the *groovy-version* directory, and then the *embeddable* subdirectory.
1.	Copy the file *groovy-all-2.4.15.jar* to one of the java extension directories listed.
2.	Restart SDDM.

As an added bonus, SQLcl will also be Groovified!
