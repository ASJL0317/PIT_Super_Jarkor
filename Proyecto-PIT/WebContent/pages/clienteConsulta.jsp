<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>

<div id="idDivConsultaVendedor" align="left">

	<label id="idLabelTituloConsulta">Consulta de Cliente por Estado Civil</label>	
 
	<s:form action="consultaCliente">
				<s:url id="jsonEstadoCivil" action="cargaDinamicoEstadoCivil"/> 
				<sj:select  href="%{jsonEstadoCivil}"  
							id="idConsultaVendedor"
							name="estado"  
					 		list="lstEstadoCivil" 
					 		listKey="id"
				 		    listValue="descripcion"  
				 		    emptyOption="false" 
				 		    headerKey="-1" 
							headerValue="[ Seleccione ]" />
				<sj:submit 
						id="idSubmitConsultaVendedor"
						value="consultar" 
						button="true"
						targets="idGridVendedor" />  
				</s:form>
				
<img id="indicator" src="images/indicator.gif" alt="Loading..." style="display:none"/>
				
</div> 
<sj:div id="idGridVendedor" align="left"></sj:div>


