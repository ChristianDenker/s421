<?xml version="1.0" encoding="UTF-8"?>

<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
   <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
    <xsl:template match="RouteWaypointLeg" priority="1">
        <!-- TextSelect : <1: TextPoint, else: TextLine> -->
	    <!-- FontSelect : <1: FontCharacteristics, else: FontReferences> -->
	    <xsl:param  name="s421TextSelect">2</xsl:param> 
	    <xsl:param name="s421FontSelect">2</xsl:param>

       <lineInstruction suppression="false">
         <featureReference>
            <xsl:value-of select="@id"/>
         </featureReference>
         <viewingGroup>21010</viewingGroup>
         <displayPlane>OVERRADAR</displayPlane>
         <drawingPriority>12</drawingPriority>
         <lineStyle capStyle="Round" joinStyle="Round" offset="0.01">
				<intervalLength>0.5</intervalLength>
				<pen width="0.2">
					<color transparency="0.5">#AA44A8</color>
				</pen>
				<dash>
				<start>53.000595</start>
					<length>0.2</length>
				</dash>
				<symbol reference="LineRef01" rotation="0.0" scaleFactor="1.0" crsType="LocalCRS" >
					<position>53.000595</position>
				</symbol>
		</lineStyle>
      </lineInstruction>
      <!-- routeWaypointLegIssue : Text Display Method 1-->
      <xsl:if test="routeWaypointLegIssue != ''">
		<xsl:choose>
			<xsl:when test="$s421TextSelect = 1"> <!-- TextPoint -->
				<textInstruction>
					<featureReference>
					   <xsl:value-of select="@id"/>
					</featureReference>
					<viewingGroup>21010</viewingGroup>
					<displayPlane>OVERRADAR</displayPlane>
					<drawingPriority>24</drawingPriority>
					<textPoint horizontalAlignment="Start" verticalAlignment="Bottom" rotation="0.0" >
						<element verticalOffset="0.0">
							<text>Shallow Water</text>
							<bodySize>2.0</bodySize>
							<flags>
								<flag>UpperLine</flag>
							</flags>
							<foreground transparency="0.5">AA44A8</foreground>
							<background transparency="0.5">AA44A8</background>
							<xsl:choose>
								<xsl:when test="$s421FontSelect = 1"> <!-- FontCharateristics -->
									<fontCharacteristics>
										<weight>Medium</weight>
										<slant>Upright</slant>
										<serifs>false</serifs>
										<proportion>Proportional</proportion>
									</fontCharacteristics>
								</xsl:when>
								<xsl:otherwise> <!-- FontReference -->	
									<fontReference reference="TextRef01">
										<weight>Medium</weight>
										<slant>Upright</slant>
									</fontReference>
								</xsl:otherwise>
							</xsl:choose>
						</element>
						<offset>
							 <x>0.5</x>
							 <y>1.0</y>
						</offset>
						<areaPlacement placementMode="VisibleParts"/>				 
					</textPoint>
				</textInstruction>
			</xsl:when>	
			<xsl:otherwise> <!-- TextLine -->
				<textInstruction>
					<featureReference>
					   <xsl:value-of select="@id"/>
					</featureReference>
					<viewingGroup>21010</viewingGroup>
					<displayPlane>OVERRADAR</displayPlane>
					<drawingPriority>24</drawingPriority>
					<textLine horizontalAlignment="Start" verticalAlignment="Bottom">
						<element>
							<text>
								<xsl:apply-templates select="routeWaypointLegIssue" mode="text">
								</xsl:apply-templates>
						    </text>
						    <bodySize>2.0</bodySize>
						    <flags>
								<flag>UpperLine</flag>
							</flags>
						    <foreground transparency="0.5">AA44A8</foreground>
						    <background transparency="0.5">AA44A8</background>
						    <xsl:choose>
								<xsl:when test="$s421FontSelect = 1"> <!-- FontCharateristics -->
									<fontCharacteristics>
										<weight>Medium</weight>
										<slant>Upright</slant>
										<serifs>false</serifs>
										<proportion>Proportional</proportion>
									</fontCharacteristics>
								</xsl:when>
								<xsl:otherwise> <!-- FontReference -->	
									<fontReference reference="TextRef01">
										<weight>Medium</weight>
										<slant>Upright</slant>
									</fontReference>
								</xsl:otherwise>
							</xsl:choose>
						</element>
						<startOffset>2.0</startOffset>
						<endOffset>2.0</endOffset>
						<placementMode>Relative</placementMode>
					</textLine>
			    </textInstruction>
			</xsl:otherwise>
		</xsl:choose>
      </xsl:if>
   </xsl:template>
</xsl:transform>

