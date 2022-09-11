<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.jsp"/>


<h1>List of Customers</h1>

<div>
	<table class="table">
	  <thead>
	    <tr class="table-active">
	      <th scope="col">First Name</th>
	      <th scope="col">Last Name</th>
	      <th scope="col">Email</th>
	      <th scope="col">Actions</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach var="index" items="${customers}">
	  		<tr>
	  			<td>${ index.firstName }</td>
	  			<td>${ index.lastName }</td>
	  			<td>${ index.email }</td>
	  			<td>TBD</td>
	  		</tr>
	  	</c:forEach>
	  </tbody>
	</table>	
</div>

<jsp:include page="footer.jsp" />