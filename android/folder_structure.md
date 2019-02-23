
## Android Studio Folder Structure

## app folder {docsify-ignore}

**manifest**	- contains the AndroidManifest.xml file which contains all the information about your app’s structure and 
		functionality. It includes all the activities your app uses, the services it provides, any database 			content it makes available via a content provider, and any intents it processes.

**java** 	- where you can find your kotlin codes

**res**  	- Basically, resources are anything that isn’t Kotlin / Java code.

**drawable**	- drawable represents something that can be drawn on the screen. 
		This can be an image, an XML resource, or a custom class.
		where image resources are placed
			
**layout**	- contains the XML files that declare your application layout. 
		Android UI can be created using either XML or Java code. 
			
*It’s recommended to use XML for layouts, because it provides a good 
			separation between UI and application logic.*
			
**mipmap**	- contains bitmap images
		
**values**	- is where you place constant values used in your layout. 
		These are colors, dimensions, styles, and strings


![Folder Structure](../_media/media_android/folder-structure.png)
 
