<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
  
<div id="idDivConsultaVendedor" align="left">

	<label id="idLabelTituloConsulta">Consulta de Vendedor por Estado Civil</label>	
 
	<s:form action="consultaVendedor">
				<s:url id="jsonEstadoCivil" action="cargaEstadoCivil"/> 
				<sj:select  href="%{jsonEstadoCivil}"  
							id="idConsultaVendedor"
							name="vendedor.strEstado"  
					 		list="lstEstadoCivil" 
					 		listKey="descripcion"
				 		    listValue="descripcion"  
				 		    emptyOption="false" 
				 		    headerKey=" " 
							headerValue="[ Seleccione ]"  />
				<sj:submit 
						id="idSubmitConsultaVendedor"
						value="consultar" 
						button="true"
						targets="idGridVendedor" />  
				</s:form>
				
<img id="indicator" src="images/indicator.gif" alt="Loading..." style="display:none"/>
				
</div> 
<sj:div id="idGridVendedor" align="left"></sj:div>


