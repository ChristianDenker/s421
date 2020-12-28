========================================================================
How to use this directory structure and files

1. Open ./Input/S421-ExampleInputDataSet.xml using XML tools with XSLT Ver1.0
2. Select the opened file 
3. Open menu XSL/XQuery on the menu bar 
4. Select XSL Transformation 
5. Choose file ./PortrayalLibrary/Rules/	main_Simplified.xml and then push button OK
6. Save as output file on the ./Output
7. Select the output file
8. Save the file to validate the output file with the included schema

========================================================================
<this folder>			Where this README and the base folder of the dataset are located
  README.TXT			This file
  Input/				The Input data for Portrayal
  Output/				The output data is saved here to validate against presentation schema given by S100
  PortrayalLibrary/			Portrayal folder including rules for portrayal processing
========================================================================
  Input/				The Input Folder for Portrayal
    S100BaseModel.xsd		The S100 Schema for Input Schema  for Portrayal which is given by S100
    S421-InputSchema.xsd		The Input Schema of S421 for Portrayal   
    S421-ExampleInputDataSet.xml	The example input data set of S421 
========================================================================

  Output/				The output folder for portrayal which is given by S100
    S100CSL.xsd			The S100 Schema for Style sheet for Portrayal which is given by S100
    S100Presentation.xsd		The S100 Schema for Presenation for Portrayal which is given by S100
    S100SymbolDefinition.xsd		The S100 Schema for Symbol for Portrayal
    XSL Output.xml			The output example as the result of portrayal process
========================================================================

  PortrayalLibrary/			The base folder for the sample exchange set
   portrayal_catalogue.xml		Portrayal Catalog File
    S100CSL.xsd			The S100 Schema for Portrayal which is given by S100
    S100PortrayalCatalog.xsd		The S100 Schema of Portrayal Catalog which is given by S100
    S100SymbolDefinition.xsd		The S100 Schema for Symbol for Portrayal which is given by S100
    AreaFills/			The AreaFills folder for Portrayal 
       S100AreaFill.xsd		The S100 Schema of AreaFill for Portrayal which is given by S100
       s100SampleAreaFill.xml		The example of S100 AreaFill for Portrayal which is given by S100
    ColorProfiles/			The ColorProfiles folder for Portrayal
       s100ColorProfile.xsd		The S100 Schema of ColorProfiles for Portrayal which is given by S100
       colorProfile.xml		The example of colorProfile for Portrayal
       s100SampleColorProfile.xml	The example of s100SampleColorProfile for Portrayal which is given by S100
       svgStyle.css   		css file of svg style 
    Fonts/				The Fonts folder for Portrayal
       DroidSans.ttf			Example File of Font
       DroidSans-Bold.ttf		Example File of Font
       OpenSans-Bold.ttf		Example File of Font
       OpenSans-Regular.ttf		Example File of Font
    LineStyles/			The LineStyles folder for Portrayal
       s100LineStyle.xsd		The S100 Schema for LineStyles for Portrayal which is given by S100
       s100SampleLineStyle.xml	The example of s100SampleLineStyle for Portrayal which is given by S100 
       RTEACTLEGLINE.xml		Example File of LineStyle for S421
       RTEACTLIMITLINE.xml		Example File of LineStyle for S421 
       RTEACTWOLLINE.xml		Example File of LineStyle for S421 
       RTEALTLEGLINE.xml		Example File of LineStyle for S421 
       RTEALTLIMITLINE.xml		Example File of LineStyle for S421
       RTEALTWOLLINE.xml		Example File of LineStyle for S421 
    Pixmaps/			The Pixmaps folder for Portrayal
       s100Pixmap.xsd		The S100 Schema for Pixmaps for Portrayal which is given by S100
       s100SamplePixmap.xml		The example of s100 Pixmaps  for Portrayal which is given by S100
    Rules/				The Rules folder for Portrayal
       attributeRules.xml		Attribute Rules for Portrayal
       main_Simplified.xml		Main Rule of S421 for Portrayal 
       RouteActionPoint.xml		RouteActionPoint of S421 for Portrayal  
       RouteWaypoint.xml		RouteWaypoint of S421 for Portrayal
       RouteWaypointLeg.xml		RouteWaypointLeg of S421 for Portrayal 
    Symbols/			The Symbols folder for Portrayal
       RTEACTPOT01.svg		Example File of Symbols for S421
       RTEACTPOT02.svg		Example File of Symbols for S421
       RTEDOT01.svg		Example File of Symbols for S421
       RTEWOL01.svg		Example File of Symbols for S421
       RTEWPT01.svg		Example File of Symbols for S421
       RTEWPT02.svg		Example File of Symbols for S421
       RTEWPT03.svg		Example File of Symbols for S421
       svgStyle.css			Example File of Symbols for S421
========================================================================
