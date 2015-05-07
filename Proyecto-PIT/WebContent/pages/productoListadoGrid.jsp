<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
 
<s:url id="jsonDataListaProducto" action="listaProductoGrid" />
<sjg:grid id="idGridExtraccionEquipos" 
		 href="%{jsonDataListaProducto}"  
		 caption="Lista de Productos" 
		 dataType="json" 
		 pager="true" 
		 gridModel="grdProducto" 
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
	<sjg:gridColumn name="idProducto" key="true" index="idProducto" editable="true"  title="Id" width="50" sortable="false"/>
	<sjg:gridColumn name="nombre" index="nombre" editable="true" title="Nombre" width="70" sortable="false"/>
	<sjg:gridColumn name="precio"  index="precio" editable="true" title="Apellido " width="70" sortable="false"/>
	<sjg:gridColumn name="stock"  index="stock" editable="true" title="Estado " width="70" sortable="false"/>
	<sjg:gridColumn name="fecha"  index="fecha" editable="true" title="Distrito" width="70" sortable="false"/>
	<sjg:gridColumn name="categoria"  index="categoria" editable="true" title="Distrito" width="70" sortable="false"/>

</sjg:grid>		  


