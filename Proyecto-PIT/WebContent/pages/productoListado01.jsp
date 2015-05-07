<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
  
<div id="idDivConsultaProducto" align="left">

	<label id="idLabelTituloConsultaProducto">Producto por categoria</label>	
 
	<s:form action="consultaProducto">
				<s:url id="jsonProd" action="cargaCategoria"/> 
				<sj:select  href="%{jsonProd}"  
							id="idConsultaProducto"
							name="producto.categoria"  
					 		list="lstCategoria" 
					 		listKey="descripcion"
				 		    listValue="formato"  
				 		    emptyOption="false" 
				 		    headerKey=" " 
							headerValue="[ Seleccione ]"  />
				<sj:submit 
						id="idSubmitConsultaProducto"
						value="consultar" 
						button="true"
						targets="idGridProducto" />  
				</s:form>
				
<img id="indicator" src="images/indicator.gif" alt="Loading..." style="display:none"/>
				
</div> 
<sj:div id="idGridProducto" align="left"></sj:div>
	    


