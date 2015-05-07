<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
  
<div id="idDivConsultaSede" align="left">

	<label id="idLabelTituloConsultaSede">Consulta de Vendedor por Estado Civil</label>	
 
	<s:form action="consultaSede">
				<s:url id="jsonDistrito" action="cargaDistrito"/> 
				<sj:select  href="%{jsonDistrito}"  
							id="idConsultaSede"
							name="sede.distrito"  
					 		list="lstDistrito" 
					 		listKey="descripcion"
				 		    listValue="formato"  
				 		    emptyOption="false" 
				 		    headerKey=" " 
							headerValue="[ Seleccione ]"  />
				<sj:submit 
						id="idSubmitConsultaSede"
						value="consultar" 
						button="true"
						targets="idGridSede" />  
				</s:form>
				
<img id="indicator" src="images/indicator.gif" alt="Loading..." style="display:none"/>
				
</div> 
<sj:div id="idGridSede" align="left"></sj:div>

