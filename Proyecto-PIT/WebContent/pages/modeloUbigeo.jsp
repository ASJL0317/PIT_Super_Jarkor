<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

  		<s:form id="idEnvio">
  		<label id="idLabelDepartamentoOrigen">Departamento</label>
			<s:url id="idJsonDepartamento" action="cargaUbigeo" />
			<sj:select id="idComboDepartamentoOrigen"
					   href="%{idJsonDepartamento}"
					   list="lstDepartamento"
					   listKey="departamento"
					   listValue="departamento"
					   headerKey=" "
					   name="departamento"
					   headerValue="[Seleccione]" 
					   onChangeTopics="carga1"/>
			
			<label id="idLabelProvinciaOrigen">Provincia</label>
			<s:url id="idJsonProvincia" action="cargaUbigeo" />
			<sj:select id="idComboProvinciaOrigen"
					   href="%{idJsonProvincia}"
					   list="lstProvincia"
					   listKey="provincia"
					   listValue="provincia"
					   headerKey=" "
					   headerValue="[Seleccione]" 
					   reloadTopics="carga1"
					   onChangeTopics="carga2"
					   name="provincia"/>
					   
			<label id="idLabelDistritoOrigen">Distrito</label>
			<s:url id="idJsonDistrito" action="cargaUbigeo" />
			<sj:select id="idComboDistritoOrigen"
					   href="%{idJsonDistrito}"
					   list="lstDistrito"
					   listKey="distrito"
					   listValue="distrito"
					   headerKey=" "
					   headerValue="[Seleccione]" 
					   reloadTopics="carga2"/>
			
		</s:form>
		
			<label id="idLabelVendedor">Vendedor</label>
			<s:url id="idJsonVendedor" action="cargaVendedor" />
			<sj:select id="idComboVendedor"
					   href="%{idJsonVendedor}"
					   list="lstVendedor"
					   listKey="intCodigo"
					   listValue="nombreCompleto"
					   headerKey=" "
					   headerValue="[Seleccione]"/>
  