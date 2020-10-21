<html>
	
	<head>
	
		<!-- boostrap -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

		<!-- CSS -->

		<!-- font -->
		
		<!-- css -->
		
		<!-- js -->
		
	</head>
	
	<body>
	
		<div class="container-fluid">
		
			<div class="row">
			
				<div class="col-md-12 col-md-8 col-lg-9 col-xl-6">
					<form action="<%=request.getContextPath() %>/PersonaServlet" method="post">
					  
					  <div class="form-group">
					    <label for="nombre">Nombre</label>
					    <input name="nombre" type="text" class="form-control" id="nombre">
					  </div>
					  
					  <div class="form-group">
					    <label for="apellido">Apellido</label>
					    <input name="apellido" type="text" class="form-control" id="apellido">
					  </div>
					  
					  <div class="form-group">
					    <label for="domicilio">Domicilio</label>
					    <input name="domicilio" type="text" class="form-control" id="domicilio">
					  </div>
					  
					  <div class="form-group">
					    <label for="pais">Pais</label>
					    <select name="pais" class="form-control" id="pais">
					      <option value="1">Argentina</option>
					      <option value="2">Brasil</option>
					      <option value="3">Chile</option>
					    </select>
					  </div>
					  
					  <button type="submit" class="btn btn-primary">Grabar</button>
					</form>
				</div>
				
			</div>
			
		</div>
	
	</body>
	
</html>
