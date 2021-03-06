<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes"/>
	
	<xsl:template match="node() | @*">
  		<xsl:copy>
	        <xsl:apply-templates select="node() | @*" />
	    </xsl:copy>
	</xsl:template>

	<xsl:template match="userId">
		<userId/>
	</xsl:template>
	<xsl:template match="grantSource">
		<grantSource/>
	</xsl:template>
	<xsl:template match="grantSourceId">
		<grantSourceId/>
	</xsl:template>
    <xsl:template match="grantTime">
        <grantTime/>
    </xsl:template>

</xsl:stylesheet>