<?xml version="1.0" encoding="UTF-8"?>
<!-- Based on schema version 20200226 (document number 2007) -->
<S421:DataSet gml:id="S421.TST.GMINI.00001" 
xsi:schemaLocation="http://www.iho.int/S421/gml/1.0 ../schemas/S421/S421.xsd" xmlns:S421="http://www.iho.int/S421/gml/1.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:S100_profile="http://www.iho.int/S-100/profile/s100_gmlProfile" xmlns:S100="http://www.iho.int/s100gml/1.0" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" >
	<member>
		<S421:route gml:id="RTE">
			<routeFormatVersion>1.0</routeFormatVersion>
			<routeID>GMINI.00001</routeID>
			<routeEditionNo>1</routeEditionNo>
			<routeInfo xlink:href="#RTE.INFO" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeInfo" />
			<routeWaypoints xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypoints"/>
		</S421:route>
	</member>
	<imember>
		<S421:routeInfo gml:id="RTE.INFO">
			<routeInfoName>Basic.Implementation</routeInfoName>
			<routeInfoAuthor>Mikael</routeInfoAuthor>
			<routeInfoEditionTime>2019-10-18T12:49:00Z</routeInfoEditionTime>
			<routeInfoDescription>Testdata with all values provided</routeInfoDescription>
			<routeInfoStatus>1</routeInfoStatus>
			<routeInfoValidityStart>2019-10-18T12:49:00Z</routeInfoValidityStart>
			<routeInfoValidityEnd>2020-10-18T12:49:00Z</routeInfoValidityEnd>
			<routeInfoVesselMMSI>265425000</routeInfoVesselMMSI>
		</S421:routeInfo>
	</imember>
	<member>
		<S421:routeWaypoints gml:id="RTE.WPTS">
			<routeWaypointsCollection xlink:href="RTE" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointsCollection"/>
			<routeWaypoint xlink:href="#RTE.WPT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPT.10" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypoint"/>
		</S421:routeWaypoints>
	</member>
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.1" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.1.PT" srsName="EPSG:4326">
						<gml:pos>59.892863 25.822235</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>1</routeWaypointID>
			<routeWaypointName>WP Name 1</routeWaypointName>
			<routeWaypointFixed>1</routeWaypointFixed>
			<routeWaypointTurnRadius>0.7</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
		</S421:routeWaypoint>
	</member>
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.10" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.10.PT" srsName="EPSG:4326">
						<gml:pos>54.752189 12.686162</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>10</routeWaypointID>
			<routeWaypointName>WP Name 10</routeWaypointName>
			<routeWaypointExternalReferenceID>GSN1.123456</routeWaypointExternalReferenceID>
			<routeWaypointFixed>0</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
		</S421:routeWaypoint>
	</member>

</S421:DataSet>