<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>


<script type="text/javascript">
			$.subscribe('rowselectVendedor', function(event,data) {
				 document.getElementById("idSeleccion").value= event.originalEvent.id;
				 
				 var grid = event.originalEvent.grid; 
				 var sel_id = grid.jqGrid('getGridParam', 'selrow');
				 
			
				 document.getElementById("idMantNombre").value = grid.jqGrid('getCell', sel_id, 'strNombre');
				 document.getElementById("idMantApellido").value = grid.jqGrid('getCell', sel_id, 'strApellido');
				 document.getElementById("idMantEdad").value = grid.jqGrid('getCell', sel_id, 'intEdad');
				 document.getElementById("idMantFecha").value = grid.jqGrid('getCell', sel_id, 'strFecha');
				 document.getElementById("idMantEstadoCivil").value = grid.jqGrid('getCell', sel_id, 'strEstado');
				 document.getElementById("idMantDistrito").value = grid.jqGrid('getCell', sel_id, 'strDistrito');
				 
			}); 

		function actualizarVendedor(){
				document.getElementById("idForm").action = 'actualizaVendedor';
				return true;
		}  
		function eliminaVendedor(){
			document.getElementById("idForm").action = 'eliminaVendedor';
			return true;
		}  
		function registrarVendedor(){
				document.getElementById("idForm").action = 'registraVendedor';
				return true;
		} 
		function listaVendedor(){
			document.getElementById("idForm").action = 'listaVendedor';
			return true;
		} 
</script>   
<div id="idDivMantVendedor" align="left">
<label id="idMantLabelTituloRegistro">Crud de Vendedor</label>	
<div id="idDivMensajeForm02" align="left"></div> 
 
	<s:form id="idForm" >
	 		<s:hidden id="idSeleccion" name="idSeleccion"/>
		
			<label id="idMantLabelNombre">Nombre</label>
			<s:textfield   id="idMantNombre"  name="nombre"  />
			
			<label id="idMantLabelApellido">Apellido</label>
			<s:textfield id="idMantApellido"  name="apellido"  />
			
			<label id="idMantLabelEdad">Edad</label>
			<s:textfield  id="idMantEdad"  name="edad"  />
			
			<label id="idMantLabelFecha">Fecha</label>
			<sj:datepicker id="idMantFecha" name="fecha"  displayFormat="yy-mm-dd" showOn="focus"/>
			
			<label id="idMantLabelEstadoCivil">Estado Civil</label>
			<s:url id="jsonEstadoCivil" action="cargaEstadoCivil"/> 
			<sj:select id="idMantEstadoCivil" href="%{jsonEstadoCivil}"  name="estado"  list="lstEstadoCivil" listKey="descripcion"  listValue="formato"  emptyOption="false" headerKey=" " headerValue="[ Seleccione ]"  />
			
			<label id="idMantLabelDistrito">Distrito</label>
			<s:url id="jsonDistrito" action="cargaDistrito"/> 
			<sj:select id="idMantDistrito" href="%{jsonDistrito}"  name="distrito"  list="lstDistrito" listKey="descripcion"  listValue="formato"  emptyOption="false" headerKey=" " headerValue="[ Seleccione ]"  />
	</s:form>


	<sj:submit id="idFormAgregar"  value="Registrar" button="true"  targets="idDivManVenResultado" formIds="idForm" onclick="javascript:registrarVendedor();"/>
	<sj:submit id="idFormActualizar"  value="Actualizar" button="true"  targets="idDivManVenResultado"  formIds="idForm" onclick="javascript:actualizarVendedor();"/>
	<sj:submit id="idFormEliminar"  value="Eliminar" button="true"  targets="idDivManVenResultado" formIds="idForm" onclick="javascript:eliminaVendedor();"/>
	<sj:submit id="idFormSalir"  value="Listar" button="true"  targets="idDivManVenResultado" formIds="idForm" onclick="javascript:listaVendedor();"/>

	<div id="idDivManVenResultado" align="left">

	</div>	
	

</div>

