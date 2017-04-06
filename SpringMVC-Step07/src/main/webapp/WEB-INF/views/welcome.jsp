<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<spring:message code="welcome.caption"/> ${name}<!--  and Password is ${password} -->
	<br/>
	Now, tou can <a href="/list-todos<%/* --1-- ?name=${name}*/%>">manage your todos</a>
</div>
<%@ include file="common/footer.jspf" %>