<?xml version="1.0" encoding="UTF-8"?>
<!-- Based on schema version 20190924 (document number 1944) -->
<S421:DataSet gml:id="S421.TST.BASIC.00001" 
xsi:schemaLocation="http://www.iho.int/S421/gml/1.0 ../schemas/S421/S421.xsd" xmlns:S421="http://www.iho.int/S421/gml/1.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:S100_profile="http://www.iho.int/S-100/profile/s100_gmlProfile" xmlns:S100="http://www.iho.int/s100gml/1.0" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

	<gml:boundedBy>
		<gml:Envelope srsName="EPSG:4326">
			<gml:lowerCorner>-6.0000 40.0000</gml:lowerCorner>
			<gml:upperCorner>45.0000 65.0000</gml:upperCorner>
		</gml:Envelope>
	</gml:boundedBy>
	
	<member>
		<S421:route gml:id="RTE">
			<routeFormatVersion>1.0</routeFormatVersion>
			<routeID>BASIC.00001</routeID>
			<routeEditionNo>1</routeEditionNo>
			<routeInfo xlink:href="#RTE.INFO" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeInfo" />
			<routeWaypoints xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypoints"/>
			<routeSchedules xlink:href="#RTE.SCHEDS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeSchedules"/>
			<routeActionPoints xlink:href="#RTE.APTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPoints"/>
		</S421:route>
	</member>
	
	<imember>
		<S421:routeInfo gml:id="RTE.INFO">
			<routeInfoName>Basic.Implementation</routeInfoName>
			<routeInfoAuthor>Mikael</routeInfoAuthor>
			<routeInfoDescription>Testdata with all values provided</routeInfoDescription>
			<routeInfoStatus>1</routeInfoStatus>
			<routeInfoValidityStart>2019-10-18T12:49:00Z</routeInfoValidityStart>
			<routeInfoValidityEnd>2020-10-18T12:49:00Z</routeInfoValidityEnd>
			<routeInfoVesselMMSI>265425000</routeInfoVesselMMSI>
		</S421:routeInfo>
	</imember>
	
	<member>
		<S421:routeWaypoints gml:id="RTE.WPTS">
			<routeWaypointsCollection xlink:href="ROUTE.0dc2e440-2614-4be5-a290-deff75dcea39" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointsCollection"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.3" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.4" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.5" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.6" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.7" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.8" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.9" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint xlink:href="#RTE.WPTS.WP.10" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
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
		<S421:routeWaypoint gml:id="RTE.WPT.2" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.2.PT" srsName="EPSG:4326">
						<gml:pos>59.483136 22.609812</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>2</routeWaypointID>
			<routeWaypointName>WP Name 2</routeWaypointName>
			<routeWaypointFixed>0</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.3" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.3.PT" srsName="EPSG:4326">
						<gml:pos>59.142538 21.690909</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>3</routeWaypointID>
			<routeWaypointName>WP Name 3</routeWaypointName>
			<routeWaypointFixed>true</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.4" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.4.PT" srsName="EPSG:4326">
						<gml:pos>58.059303 20.333722</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>4</routeWaypointID>
			<routeWaypointName>WP Name 4</routeWaypointName>
			<routeWaypointFixed>false</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.3" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.5" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.5.PT" srsName="EPSG:4326">
						<gml:pos>56.346594 18.744942</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>5</routeWaypointID>
			<routeWaypointName>WP Name 5</routeWaypointName>
			<routeWaypointFixed>1</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.4" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.6" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.6.PT" srsName="EPSG:4326">
						<gml:pos>55.933128 17.609388</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>6</routeWaypointID>
			<routeWaypointName>WP Name 6</routeWaypointName>
			<routeWaypointFixed>0</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.5" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.7" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.7.PT" srsName="EPSG:4326">
						<gml:pos>55.599708 15.228708</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>7</routeWaypointID>
			<routeWaypointName>WP Name 7</routeWaypointName>
			<routeWaypointFixed>1</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.6" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.8" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.8.PT" srsName="EPSG:4326">
						<gml:pos>55.396588 14.538908</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>8</routeWaypointID>
			<routeWaypointName>WP Name 8</routeWaypointName>
			<routeWaypointFixed>0</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.7" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
			
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.9" >
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.WPT.9.PT" srsName="EPSG:4326">
						<gml:pos>55.051442 14.030897</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeWaypointID>9</routeWaypointID>
			<routeWaypointName>WP Name 9</routeWaypointName>
			<routeWaypointFixed>1</routeWaypointFixed>
			<routeWaypointTurnRadius>1.0</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.8" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
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
			<routeWaypointLeg xlink:href="#RTE.WPT.LEG.9" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>
		</S421:routeWaypoint>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.1" >
			<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.2" >
			<routeWaypointLegGeometryType>2</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.3" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.3" >
			<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.4" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.4" >
			<routeWaypointLegGeometryType>2</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.5" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.5" >
			<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.6" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.6" >
			<routeWaypointLegGeometryType>2</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.7" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.7" >
			<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.8" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.8" >
			<routeWaypointLegGeometryType>2</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.9" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	
	<member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.9" >
			<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
			<routeWaypointLegCollection xlink:href="#RTE.WPT.10" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg>
	</member>
	<imember>
		<S421:routeSchedules gml:id="RTE.SCHEDS">
			<routeSchedule xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeSchedule"/>
		</S421:routeSchedules>
	</imember>
	
	<imember>
		<S421:routeSchedule gml:id="RTE.SCHED.1">
			<routeScheduleID>1</routeScheduleID>
			<routeScheduleName>Excel</routeScheduleName>
			<routeScheduleCollection xlink:href="#RTE.SCHEDS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleManual xlink:href="#RTE.SCHED.1.MAN" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleManual"/>
			<routeScheduleCalculated xlink:href="#RTE.SCHED.1.CAL" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCalculated"/>
			<routeScheduleRecommended xlink:href="#RTE.SCHED.1.REC" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleRecommended"/>
		</S421:routeSchedule>
	</imember>
	
	<imember>
		<S421:routeScheduleManual gml:id="RTE.SCHED.1.MAN">
			<routeScheduleCollection xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.MAN.ELEMENT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
		</S421:routeScheduleManual>
	</imember>
	
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.MAN.ELEMENT.1">
			<routeWaypointId>1</routeWaypointId>
			<routeScheduleElementPlanSOG>10</routeScheduleElementPlanSOG>
			<routeScheduleElementETD>2019-02-05T12:25:00</routeScheduleElementETD>
			<routeScheduleElementETA>2019-01-31T15:25:00</routeScheduleElementETA>
			<routeScheduleElementManualCollection xlink:href="#RTE.SCHED.1.MAN" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementManualCollection"/>
		</S421:routeScheduleElement>
	</imember>
	
	<imember>
		<S421:routeScheduleCalculated gml:id="RTE.SCHED.1.CAL">
			<routeScheduleCollection xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.CAL.ELEMENT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
		</S421:routeScheduleCalculated>
	</imember>
	
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.CAL.ELEMENT.1">
			<routeWaypointId>1</routeWaypointId>
			<routeScheduleElementPlanSOG>10</routeScheduleElementPlanSOG>
			<routeScheduleElementETD>2019-02-05T12:25:00</routeScheduleElementETD>
			<routeScheduleElementETA>2019-01-31T15:25:00</routeScheduleElementETA>
			<routeScheduleElementCalculatedCollection xlink:href="#RTE.SCHED.1.CAL" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementCalculatedCollection"/>
		</S421:routeScheduleElement>
	</imember>
	
	<imember>
		<S421:routeScheduleRecommended gml:id="RTE.SCHED.1.REC">
			<routeScheduleCollection xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.REC.ELEMENT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
		</S421:routeScheduleRecommended>
	</imember>
	
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.REC.ELEMENT.1">
			<routeWaypointId>10</routeWaypointId>
			<routeScheduleElementPlanSOG>10</routeScheduleElementPlanSOG>
			<routeScheduleElementETD>2019-02-05T12:25:00</routeScheduleElementETD>
			<routeScheduleElementETA>2019-01-31T15:25:00</routeScheduleElementETA>
			<routeScheduleElementRecommendedCollection xlink:href="#RTE.SCHED.1.REC" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementRecommendedCollection"/>
		</S421:routeScheduleElement>
	</imember>
	
	<member>
		<S421:routeActionPoints gml:id="RTE.APTS">
			<routeActionPointsCollection xlink:href="#RTE" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPointsCollection"/>
			<routeActionPoint xlink:href="#RTE.APT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPoint"/>
		</S421:routeActionPoints>
	</member>
	
	<member>
		<S421:routeActionPoint gml:id="RTE.APT.1">
			<geometry>
				<S100:pointProperty>
					<S100:Point gml:id="RTE.APT.1.PT" srsName="EPSG:4326">
						<gml:pos>58.881067 21.255957</gml:pos>
					</S100:Point>
				</S100:pointProperty>
			</geometry>
			<routeActionPointID>1</routeActionPointID>
			<routeActionPointRadius>1.0</routeActionPointRadius>
			<routeActionPointTimeToAct>8</routeActionPointTimeToAct>
			<routeActionPointRequiredAction>1</routeActionPointRequiredAction>
			<routeActionPointRequiredActionDescription>Change radio channel</routeActionPointRequiredActionDescription>
			<routeActionPointCollection xlink:href="#RTE.APTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPointCollection"/>
		</S421:routeActionPoint>
	</member>
		
</S421:DataSet>