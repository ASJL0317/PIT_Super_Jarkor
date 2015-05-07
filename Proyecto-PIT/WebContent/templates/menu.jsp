<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/form.css" rel="stylesheet" type="text/css" media="all">
	<link href="http://fonts.googleapis.com/css?family=Exo+2" rel="stylesheet" type="text/css">
	<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all">
	<link rel="stylesheet" href="css/fwslider.css" media="all">
	<script type="text/javascript" src="js/megamenu.js"></script>
	<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
	
</head>
<div class="header-bottom">
	    <div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>
				</div>
				<div class="menu">
	            <ul class="megamenu skyblue"><li style="display: none;" class="showhide"><span class="title">MENU</span><span class="icon1"></span><span class="icon2"></span></li>
			<li style="display: inline-block;" class="active grid"><a href="index.html">Inicio</a></li>
			<li style="display: inline-block;"><a class="color4" href="#">Dinamico</a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								<h4>Consultas Dinamicas</h4>
									<ul>
											<li>
												<a href="${pageContext.request.contextPath}/a_consulta01">
													Consulta 01
												</a>
											</li>	
											<li>
												<a href="${pageContext.request.contextPath}/a_consulta02">
													Consulta 02
												</a>
											</li>	
									</ul>
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Files</h4>
								<ul>
									<li>
										<a href="${pageContext.request.contextPath}/a_registroPersonal">
											Registro Personal(Imagen)
										</a>
									</li>	
									<li>
										<a href="${pageContext.request.contextPath}/a_listaPersonal">
											Lista Personal(Imagen)
										</a>
									</li>	
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Result Map</h4>
								<ul>
									<li>
										<a href="${pageContext.request.contextPath}/a_consultaCliente">
												Consulta Cliente (Inner joing)
										</a>
									</li>
								</ul>	
							</div>												
						</div>
					  </div>
					</div>
				</li>				
				<li style="display: inline-block;"><a class="color5" href="#">Simple</a>
				<div class="megapanel">
					<div class="col1">
							<div class="h_nav">
								<h4>Crud</h4>
								<ul>
									<li>
										<a href="${pageContext.request.contextPath}/a_mantenimientoVendedor">
											Mantenimiento Vendedor 
										</a>
									</li>	
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Ubigeo</h4>
								<ul>	
									<li>
										<a href="${pageContext.request.contextPath}/a_ejemploUbigeo">
											Ejemplo Ubigeo
										</a>
									</li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Consultas Simples</h4>
								<ul>
											<li>
												<a href="${pageContext.request.contextPath}/a_consultaSede">
													Consulta Sede 
												</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/a_consultaVendedor">
													Consulta Vendedor 
												</a>
											</li>		
											<li>
												<a href="${pageContext.request.contextPath}/a_consultaProducto">
													Consulta Producto 
												</a>
											</li>	
											<li>
												<a href="${pageContext.request.contextPath}/a_ejemploCombo">
													Ejemplo ComboBox
												</a>
											</li>	
											<li>
												<a href="${pageContext.request.contextPath}/a_ejemploFecha">
													Ejemplo Fecha
												</a>
											</li>	
								</ul>	
							</div>												
						</div>
					</div>
				</li>
				<li style="display: inline-block;"><a class="color6" href="other.html">Other</a></li>
				<li style="display: inline-block;"><a class="color7" href="other.html">Purchase</a></li>
			</ul>
			</div>
		</div>
	   <div class="header-bottom-right">
         <div class="search">	  
				<input name="s" class="textbox" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}" type="text">
				<input value="Subscribe" id="submit" name="submit" type="submit">
				<div id="response"> </div>
		 </div>
	  <div class="tag-list">
	    <ul class="icon1 sub-icon1 profile_img">
			<li><a class="active-icon c1" href="#"> </a>
				<ul class="sub-icon1 list">
					<li><h3>sed diam nonummy</h3><a href=""></a></li>
					<li><p>Lorem ipsum dolor sit amet, consectetuer  <a href="">adipiscing elit, sed diam</a></p></li>
				</ul>
			</li>
		</ul>
		<ul class="icon1 sub-icon1 profile_img">
			<li><a class="active-icon c2" href="#"> </a>
				<ul class="sub-icon1 list">
					<li><h3>No Products</h3><a href=""></a></li>
					<li><p>Lorem ipsum dolor sit amet, consectetuer  <a href="">adipiscing elit, sed diam</a></p></li>
				</ul>
			</li>
		</ul>
	    <ul class="last"><li><a href="#">Cart(0)</a></li></ul>
	  </div>
    </div>
     <div class="clear"></div>
     </div>
	</div>