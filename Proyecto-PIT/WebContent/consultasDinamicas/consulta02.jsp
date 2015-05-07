<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
  
<div id="idDivConsultaVendedor" align="left">

	<label id="idLabelTituloConsulta">Consulta Dinámica de Vendedor por Estado Civil</label>	
 
	<s:form action="consultaDinamica02">
				<s:url id="jsonEstadoCivil" action="cargaEstadoCivil"/> 
				<sj:select  href="%{jsonEstadoCivil}"  
							id="idConsultaVendedorDina2"
							name="filtroBean.estado"  
					 		list="lstEstadoCivil" 
					 		listKey="descripcion"
				 		    listValue="descripcion"  
				 		    emptyOption="false" 
				 		    headerKey="-1" 
							headerValue="[ Seleccione ]" />
				
				<s:url id="jsonDistrito" action="cargaDistrito"/> 
				<sj:select  href="%{jsonDistrito}"  
							id="idConsultaVendedorDina3"
							name="filtroBean.distrito"  
					 		list="lstDistrito" 
					 		listKey="descripcion"
				 		    listValue="descripcion"  
				 		    emptyOption="false" 
				 		    headerKey="-1" 
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


