<?xml version="1.0" encoding="UTF-8"?>
<!-- Based on schema version 20200226 (document number 2007) -->
<S421:DataSet xmlns:S421="http://www.iho.int/S421/gml/1.0"
	xsi:schemaLocation="http://www.iho.int/S421/gml/1.0 ../schemas/S421/S421.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:gml="http://www.opengis.net/gml/3.2"
	xmlns:S100="http://www.iho.int/s100gml/1.0"
	xmlns:xlink="http://www.w3.org/1999/xlink" gml:id="S421.TST.SAMPL.00001">

  <gml:boundedBy>
    <gml:Envelope srsName="EPSG:4326">
      <gml:lowerCorner>-6.0000 40.0000</gml:lowerCorner>
      <gml:upperCorner>45.0000 65.0000</gml:upperCorner>
    </gml:Envelope>
  </gml:boundedBy>

  <member>
		<S421:route gml:id="RTE">
			<routeFormatVersion>1.0</routeFormatVersion>
			<routeID>SAMPL.00001</routeID>
			<routeEditionNo>1</routeEditionNo>
			<routeInfo xlink:href="#RTE.INFO" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeInfo" />
			<routeWaypoints xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypoints"/>
			<routeSchedules  xlink:href="#RTE.SCHEDS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeSchedules"/>
			<routeActionPoints xlink:href="#RTE.APTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPoints"/>
			<routeExtensions gml:id="RTE.EXT.1" 
			 routeExtensionsManufacturerId="ACME" 
			 routeExtensionsName="marpol_objects"  
			 routeExtensionsVersion="1.0" >
				<routeExtensionsNote> object id=”17”
					name="Oil for an oil tanker (International Convention
					Areas (MARPOL))"
					info="Areas in which the adoption of special mandatory methods for
					the prevention of sea pollution by oil or oil waters is required" 
				</routeExtensionsNote >
							<routeExtensionsNote> object id=”5”
					name="Not comminuted or disinfected sewage (International Convention
					Areas (MARPOL))"
					info="Areas in which the adoption of special mandatory methods for
					the prevention of sea pollution by Not comminuted or disinfected
					sewage is required" 
				</routeExtensionsNote >
			</routeExtensions>
		</S421:route>
	</member>	
  
  <imember>
    <S421:routeInfo gml:id="RTE.INFO">
		<routeInfoName>AAA</routeInfoName>
		<routeInfoAuthor>Mikael</routeInfoAuthor>
		<routeInfoEditionTime>2019-10-18T12:49:00Z</routeInfoEditionTime>
		<routeInfoDescription>Simple Test Data </routeInfoDescription>
		<routeInfoStatus>3</routeInfoStatus>
		<routeInfoValidityStart>2019-10-18T12:49:00Z</routeInfoValidityStart>
		<routeInfoValidityEnd>2020-10-18T12:49:00Z</routeInfoValidityEnd>
		<routeInfoVesselType>10</routeInfoVesselType>
		<routeInfoVesselMMSI>265425000</routeInfoVesselMMSI>
		<routeInfoVesselIMO>1234567</routeInfoVesselIMO>
		<routeInfoExtensions gml:id="RTE.INFO.EXT.1" routeExtensionsManufacturerId="AAA" routeExtensionsName="RouteInfoExt" routeExtensionsVersion="1.0">
			<routeExtensionsNote>position 10.40 20.20</routeExtensionsNote>
		</routeInfoExtensions>
	</S421:routeInfo> 
  </imember>
   
    <member>
		<S421:routeWaypoints gml:id="RTE.WPTS">
			<routeWaypointsCollection xlink:href="#RTE" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointsCollection"/>
			<routeWaypoint xlink:href="#RTE.WPT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint  xlink:href="#RTE.WPT.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
			<routeWaypoint  xlink:href="#RTE.WPT.3" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/consistsOfRouteWaypoint"/>
		</S421:routeWaypoints>
	</member>
	
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.1">
			<geometry>
				<S100:pointProperty><S100:Point gml:id="RTE.WPT.1.PT">
					<gml:pos>53.000595 0.251287</gml:pos>
				</S100:Point> </S100:pointProperty>
			</geometry>
			<routeWaypointID>1</routeWaypointID>
			<routeWaypointName>WP Name 1</routeWaypointName>
			<routeWaypointFixed>true</routeWaypointFixed>
			<routeWaypointTurnRadius>0.7</routeWaypointTurnRadius>
			<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
			<routeWaypointExtensions gml:id="RTE.WPT.1.EXT.1" 
				routeExtensionsManufacturerId="ACME" 
				routeExtensionsName="ref_points"  
				routeExtensionsVersion="1.0" >
				<routeExtensionsNote> refName=”Sommers Light House”</routeExtensionsNote >
				<routeExtensionsNote> position lat=”59.94708” lon=”27.09999”</routeExtensionsNote >
			</routeWaypointExtensions>
		</S421:routeWaypoint> 
	</member>
	
	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.2">
				<geometry>
					<S100:pointProperty><S100:Point gml:id="RTE.WPT.2.PT">
						<gml:pos>55.441282 4.085683</gml:pos>
					</S100:Point> </S100:pointProperty>
				</geometry>
				<routeWaypointID>2</routeWaypointID>
				<routeWaypointName>WP Name 2</routeWaypointName>
				<routeWaypointFixed>true</routeWaypointFixed>
				<routeWaypointTurnRadius>5.00</routeWaypointTurnRadius>
				<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
				<routeWaypointLeg xlink:href="#RTE.WPT.LEG.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>				
		</S421:routeWaypoint>
	</member>

	<member>
		<S421:routeWaypoint gml:id="RTE.WPT.3">
				<geometry>
					<S100:pointProperty><S100:Point gml:id="RTE.WPT.3.PT">
						<gml:pos>57.592398 8.145643</gml:pos>
					</S100:Point> </S100:pointProperty>
				</geometry>
				<routeWaypointID>3</routeWaypointID>
				<routeWaypointName>WP Name 3</routeWaypointName>
				<routeWaypointFixed>true</routeWaypointFixed>
				<routeWaypointTurnRadius>4.9</routeWaypointTurnRadius>
				<routeWaypointCollection xlink:href="#RTE.WPTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointCollection"/>
				<routeWaypointLeg xlink:href="#RTE.WPT.LEG.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLeg"/>				
		</S421:routeWaypoint>
	</member>
    <member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.1">
						<routeWaypointLegStarboardXTDL>1</routeWaypointLegStarboardXTDL>
						<routeWaypointLegPortXTDL>1</routeWaypointLegPortXTDL>
						<routeWaypointLegStarboardCL>10</routeWaypointLegStarboardCL>
						<routeWaypointLegPortCL>10</routeWaypointLegPortCL>
						<routeWaypointLegSafetyContour>11.20000000</routeWaypointLegSafetyContour>
						<routeWaypointLegSafetyDepth>22.20000000</routeWaypointLegSafetyDepth>
						<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
						<routeWaypointLegCollection xlink:href="#RTE.WPT.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg> 
    </member>
    <member>
		<S421:routeWaypointLeg gml:id="RTE.WPT.LEG.2">
						<routeWaypointLegStarboardXTDL>1</routeWaypointLegStarboardXTDL>
						<routeWaypointLegPortXTDL>1</routeWaypointLegPortXTDL>
						<routeWaypointLegStarboardCL>10</routeWaypointLegStarboardCL>
						<routeWaypointLegPortCL>10</routeWaypointLegPortCL>
						<routeWaypointLegSafetyContour>11.20000000</routeWaypointLegSafetyContour>
						<routeWaypointLegSafetyDepth>22.20000000</routeWaypointLegSafetyDepth>
						<routeWaypointLegGeometryType>1</routeWaypointLegGeometryType>
						<routeWaypointLegCollection xlink:href="#RTE.WPT.3" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeWaypointLegCollection"/>
		</S421:routeWaypointLeg> 
    </member>

	<member>
		<S421:routeActionPoints gml:id="RTE.APTS">
			<routeActionPointsCollection xlink:href="#RTE" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPointsCollection"/>
			<routeActionPoint xlink:href="#RTE.APT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPoint"/>
		</S421:routeActionPoints>
			
	</member>
	
	<member>
		<S421:routeActionPoint gml:id="RTE.APT.1">
			<geometry>
				<S100:pointProperty> <S100:Point gml:id="RTE.APT.1.PT">
						<gml:pos>55.441282 4.085683</gml:pos>
				</S100:Point></S100:pointProperty>
			</geometry>
			<routeActionPointID>1</routeActionPointID>
			<routeActionPointRadius>1.0</routeActionPointRadius>
			<routeActionPointTimeToAct>12</routeActionPointTimeToAct>
			<routeActionPointRequiredAction>1</routeActionPointRequiredAction>
			<routeActionPointRequiredActionDescription>Act Now</routeActionPointRequiredActionDescription>
			<routeActionPointCollection xlink:href="#APTS" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeActionPointCollection"/>
			<routeActionPointExtensions gml:id="APT.1.EXT.1" 
				routeExtensionsManufacturerId="ACME" 
				routeExtensionsName="astronomical_event" 
				routeExtensionsVersion="1.0" >
				<routeExtensionsNote>astronomical_event 
					eventType="sunrise" 
					moonPhase="lastQuarter" 
					time="2016-10-22T10:24:00Z" 
				</routeExtensionsNote>
			</routeActionPointExtensions>
		</S421:routeActionPoint>	
	</member>
	
	<imember>
		<S421:routeSchedules gml:id="RTE.SCHEDS">
			<routeSchedule xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/route/routeSchedules"/>
		</S421:routeSchedules>
	</imember>	
	
	<imember>
		<S421:routeSchedule gml:id="RTE.SCHED.1">
			<routeScheduleID>1</routeScheduleID>
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
			<routeScheduleElementETD>2019-09-02T14:00:00Z</routeScheduleElementETD>
			<routeScheduleElementNote>Manually set by operator</routeScheduleElementNote>
			<routeScheduleElementManualCollection xlink:href="#RTE.SCHED.1.MAN" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementManualCollection"/>
		</S421:routeScheduleElement>
	</imember>
	
	<imember>
		<S421:routeScheduleCalculated gml:id="RTE.SCHED.1.CAL">
			<routeScheduleCollection xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.CAL.ELEMENT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.CAL.ELEMENT.2" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
		</S421:routeScheduleCalculated>
	</imember>
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.CAL.ELEMENT.1">
			<routeWaypointId>1</routeWaypointId>
			<routeScheduleElementETD>2019-09-02T14:00:00Z</routeScheduleElementETD>
			<routeScheduleElementCalculatedCollection xlink:href="#RTE.SCHED.1.CAL" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementCalculatedCollection"/>
		</S421:routeScheduleElement>
	</imember>
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.CAL.ELEMENT.2">
			<routeWaypointId>2</routeWaypointId>
			<routeScheduleElementPlanSOG>15</routeScheduleElementPlanSOG>
			<routeScheduleElementETA>2019-09-02T20:39:46Z</routeScheduleElementETA>
			<routeScheduleElementCalculatedCollection xlink:href="#RTE.SCHED.1.CAL" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementCalculatedCollection"/>
		</S421:routeScheduleElement>
	</imember>

<imember>
		<S421:routeScheduleRecommended gml:id="RTE.SCHED.1.REC">
			<routeScheduleCollection xlink:href="#RTE.SCHED.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleCollection"/>
			<routeScheduleElement xlink:href="#RTE.SCHED.1.REC.ELEMENT.1" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElement"/>
		    <routeScheduleRecommendedExtensions gml:id="RTE.SCHED.1.REC.EXT.1" routeExtensionsManufacturerId="AAA" routeExtensionsName="Test" routeExtensionsVersion="1">
				<routeExtensionsNote>check schedule</routeExtensionsNote>
		    </routeScheduleRecommendedExtensions>
		</S421:routeScheduleRecommended>
	</imember>
	
	<imember>
		<S421:routeScheduleElement gml:id="RTE.SCHED.1.REC.ELEMENT.1">
			<routeWaypointId>2</routeWaypointId>
			<routeScheduleElementPlanSOG>21.0</routeScheduleElementPlanSOG>
			<routeScheduleElementETD>2019-10-20T04:15:00Z</routeScheduleElementETD>
			<routeScheduleElementETA>2019-10-21T10:30:00</routeScheduleElementETA>
			<routeScheduleElementETAWindowBefore>60</routeScheduleElementETAWindowBefore>
			<routeScheduleElementETAWindowAfter>60</routeScheduleElementETAWindowAfter>
			<routeScheduleElementNote>Recommended from Port</routeScheduleElementNote>
			<routeScheduleElementRecommendedCollection xlink:href="#RTE.SCHED.1.REC" xlink:arcrole="http://www.iho.int/S-421/gml/1.0/roles/routeScheduleElementRecommendedCollection"/>
			<routeScheduleElementExtensions gml:id="RTE.SCHED.1.REC.ELEMENT.1.EXT.1" routeExtensionsManufacturerId="AAA" routeExtensionsName="Test" routeExtensionsVersion="1">
				<routeExtensionsNote>check schedule element</routeExtensionsNote>
			</routeScheduleElementExtensions>
		</S421:routeScheduleElement>
	</imember>	
	
</S421:DataSet>