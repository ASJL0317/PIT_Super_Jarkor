<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
  
<div id="idDivConsultaVendedorDina" align="left">

	<label id="idLabelTituloConsultaDina">Consulta Dinámica de Vendedor por Estado Civil</label>	
 
	<s:form action="consultaDinamica01">
				<s:url id="jsonEstadoCivil" action="cargaEstadoCivil"/> 
				<sj:select  href="%{jsonEstadoCivil}"  
							id="idConsultaVendedorDina1"
							name="filtroBean.estados"  
					 		list="lstEstadoCivil" 
					 		listKey="descripcion"
				 		    listValue="descripcion"  
				 		    emptyOption="false" 
							multiple="true"/>
				<sj:submit 
						id="idSubmitConsultaVendedorDina"
						value="consultar" 
						button="true"
						targets="idGridVendedorDina" />  
				</s:form>
				
<img id="indicator" src="images/indicator.gif" alt="Loading..." style="display:none"/>
				
</div> 
<sj:div id="idGridVendedorDina" align="left"></sj:div>


