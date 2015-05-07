<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
 
<s:url id="jsonDataListaVededor" action="listaVendedorGrid" />
<sjg:grid id="idGridExtraccionEquipos" 
		 href="%{jsonDataListaVededor}"  
		 caption="Lista de Vendedores" 
		 dataType="json" 
		 pager="true" 
		 gridModel="grdVendedores" 
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
	<sjg:gridColumn name="intCodigo" key="true" index="idCodigo" editable="true"  title="Id" width="50" sortable="false"/>
	<sjg:gridColumn name="strNombre" index="strNombre" editable="true" title="Nombre" width="70" sortable="false"/>
	<sjg:gridColumn name="strApellido"  index="strApellido" editable="true" title="Apellido " width="70" sortable="false"/>
	<sjg:gridColumn name="strEstado"  index="strApellido" editable="true" title="Estado " width="70" sortable="false"/>
	<sjg:gridColumn name="strDistrito"  index="strDistrito" editable="true" title="Distrito" width="70" sortable="false"/>
	

</sjg:grid>		  


