<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
 
<s:url id="jsonDataListaSede" action="listaSedeGrid" />
<sjg:grid id="idGridExtraccionEquipos" 
		 href="%{jsonDataListaSede}"  
		 caption="Lista de Sede" 
		 dataType="json" 
		 pager="true" 
		 gridModel="grdSede" 
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
	<sjg:gridColumn name="idSede" key="true" index="idCodigo" editable="true"  title="Id" width="50" sortable="false"/>
	<sjg:gridColumn name="nombre" index="strNombre" editable="true" title="Nombre" width="70" sortable="false"/>
	<sjg:gridColumn name="direccion"  index="strApellido" editable="true" title="Apellido " width="70" sortable="false"/>
	<sjg:gridColumn name="gerente"  index="strApellido" editable="true" title="Estado " width="70" sortable="false"/>
	<sjg:gridColumn name="distrito"  index="strDistrito" editable="true" title="Distrito" width="70" sortable="false"/>
	

</sjg:grid>		  


