
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>

<s:form action="listaPersonal" method="post">
	<s:submit name="boton01" value="Listar" />
	<table>
		<tr class="grilla_cabecera">
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Imagen</th>
			<th>Documento</th>
		</tr>
		<s:iterator value="lstPersonal">
			<tr class="grilla_campo">
				<td><s:property value="intCodigo" /></td>
				<td><s:property value="strNombre" /></td>
				<td><img alt="Fotografia del personal"	src="verImagenPersonal?idCodigo=<s:property value="intCodigo"/>"	width="150" height="150" /></td>
				<td><a href="verDocumentoPersonal?idCodigo=<s:property value="intCodigo"/>">
						<font color="red">Documento</font>
				</a></td>
			</tr>
		</s:iterator>
	</table>
</s:form>
