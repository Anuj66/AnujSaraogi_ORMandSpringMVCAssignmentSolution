<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="header.jsp"/>

<div class="container">
	<form:form action="/CustomerRelationshipManagement/processForm" modelAttribute="customer">
		<br>
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		Email: <form:input path="email" type="email"/>
		<br>
		<br>
		<input type="submit" class="btn btn-primary mx-3" value="Save" />
	</form:form>
	<br>
	<a href="/CustomerRelationshipManagement/"><button class="btn btn-secondary mx-3">Back to List</button></a>
</div>

<jsp:include page="footer.jsp" />