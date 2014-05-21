Grizzly-Bug-Issue-1676
======================

Sample code which reproduces bug filed with Grizzly (Issue # 1676).

Site URL:

	The web bundle provided is deployed on <ip address>/test/faces/pages/counter.xhtml.

What Should be on the Page and What Should Happen:

	The page should just have a button and a text item which indicates how many times the 
	button has been clicked. 
	
	Clicking on the button should update the count shown on the page without having to 
	refresh. However, this does not happen as the error occurs on load of the page.

How to reproduce the issue:

	Take either the built bundle or the artifact bundle and load it onto the GlassFish 
	Server. You should see the error as soon as you try to access the URL of the web 
	app. 

Code Folder:

	Contains the sample code that I built in order to produce the error. It is an Eclipse 
	project that builds using ANT (On my machine it is apache-ant-1.8.4) 
	
	The bundle is created by executing the build target. The build target executes a bnd 
	task which uses the example.bnd file to build the appropriate OSGi web bundle. You can
	find the built bundle in the build folder located under the root of the project.

Artifacts:

	I've provided the built jar that I have used just in case. 

Tools:

	Contains the version of ANT that I am using. 
