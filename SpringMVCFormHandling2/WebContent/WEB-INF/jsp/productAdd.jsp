<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Product Add Page</title>
</head>
<body>

	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="product.products"/></h1>
				<p>Add products</p>
			</div>		
		</div>
	</section>
	<section class="container">
		<!-- watch out modelAttribute ! -->
		<form:form modelAttribute="newProduct" class="form-horizontal" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend><spring:message code="product.add.newproduct"/></legend>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId"><spring:message code="product.id"/> </label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name"><spring:message code="product.name"/></label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitPrice"><spring:message code="product.unit.price"/></label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description"><spring:message code="product.description"/></label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="manufacturer"><spring:message code="product.manufacturer"/></label>
					<div class="col-lg-10">				
						
						<%--								
						<form:select id="manufacturer" path="manufacturer" type="text" class="form:input-large">
							<form:option value="Apple">Apple</form:option>
							<form:option value="Google">Google</form:option>
							<form:option value="Samsung">Samsung</form:option>
						</form:select>
						 --%>
						  				 
					   <form:select id="manufacturer" path="manufacturer" type="text" class="form:input-large" items="${manufacturerList}"/>			
					     			
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="category"><spring:message code="product.category"/></label>
					<div class="col-lg-10">
						
						<%--
						<form:select id="category" path="category" type="text" class="form:input-large">
							<form:option value="Laptop">Laptop</form:option>
							<form:option value="Tablet">Tablet</form:option>
							<form:option value="Smart Phone">Smart Phone</form:option>
						</form:select>
						 --%> 
						
						 <form:select id="category" path="category" type="text" class="form:input-large" items="${categoryList}"/>
						 
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock"><spring:message code="product.stock"/></label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="condition"><spring:message code="product.condition"/></label>
					<div class="col-lg-10">
						
						 <%--
						<form:radiobutton path="condition" value="New" />New 
						<form:radiobutton path="condition" value="Old" />Old 
						<form:radiobutton path="condition" value="Refurbished" />Refurbished
						 --%>
						
						 <form:radiobuttons path="condition" items="${conditionMap}"/>
						
					</div>
				</div>
				
				
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
