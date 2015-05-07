<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
 
<s:url id="jsonData" action="listaClienteGrid" />
<sjg:grid id="idGridExtraccionEquipos" 
		 href="%{jsonData}"  
		 caption="Lista de Clientes" 
		 dataType="json" 
		 pager="true" 
		 gridModel="grdCliente" 
		 multiselect="false" 
		 navigator="true"
		 navigatorAdd="false"    
		 navigatorSearch="false" 
		 navigatorRefresh="false" 
		 navigatorDelete="false"
		 navigatorEdit="false"
		 rowNum="4"
		 scroll="false"
		 width="1010" >
	<sjg:gridColumn name="idCliente" key="true" index="idCodigo" editable="true"  title="Id" width="50" sortable="false"/>
	<sjg:gridColumn name="nombre"  editable="true" title="Nombre" width="70" sortable="false"/>
	<sjg:gridColumn name="apellido"   editable="true" title="Apellido " width="70" sortable="false"/>
	<sjg:gridColumn name="estado.descripcion"  editable="true" title="Estado " width="70" sortable="false"/>
	<sjg:gridColumn name="ubigeo.departamento"  editable="true" title="Departamento " width="70" sortable="false"/>
	<sjg:gridColumn name="ubigeo.provincia"   editable="true" title="Provincia " width="70" sortable="false"/>
	<sjg:gridColumn name="ubigeo.distrito"   editable="true" title="Distrito " width="70" sortable="false"/>


</sjg:grid>		  


