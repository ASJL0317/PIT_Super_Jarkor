<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>

  
<div id="idDivRegistraPersonal" align="left">

	<label id="idLabelTituloPersonal">Registro de Personal</label>	
 
	<s:form action="registraPersonal" 
				enctype="multipart/form-data" 
				method="post">
	
		<label id="idLabelPerNombre">Nombre</label>
		<s:textfield   id="idPerNombre"  name="personal.strNombre"  />
		
		<label id="idLabelPerImagen">Imagen</label>
		<s:file id="idPerImagen" name="personal.filImagen" accept="text/txt" />
		
		<label id="idLabelPerCV">CV</label>
		<s:file id="idPerCV" name="personal.filCv" accept="text/txt" />
	
		<sj:submit id="idRegistrarPersonal" button="true" value="Registrar"/>
		<sj:submit id="idLimpiarPersonal" button="true"  value="Limpiar"   onclick="this.form.reset();"/>
					  
</s:form>
</div> 


