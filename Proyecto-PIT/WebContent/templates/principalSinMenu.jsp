<?xml version="1.0" encoding="utf-8"?>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<html>

<body>
	<div id="idPrincipal">
			<div id="idCabecera">
				<tiles:insertAttribute	name="cabecera" />
			</div>
			<div id="idCuerpo">
				<div id="idCentralSinMenu"><tiles:insertAttribute name="central" /></div>
			</div>
	</div>

</body>
</html>
