<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

    <s:form id="form" theme="xhtml">
  		<s:url id="jsonEstadoCivil" action="cargaEstadoCivil"/> 
		<sj:select label="Estado Civil"   
				href="%{jsonEstadoCivil}"  name="vendedor.strEstado" 
					 list="lstEstadoCivil" listKey="id"  listValue="formato"  emptyOption="false" headerKey=" " headerValue="[ Seleccione ]"  />

    </s:form>
