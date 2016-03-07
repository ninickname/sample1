<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<jsp:include page="templates/Header.jsp" flush="true" />

<body ng-app="myApp">

	<div id="wrapper">

		<jsp:include page="templates/Sidebar.jsp" flush="true" />

		<div id="page-content-wrapper">

			<jsp:include page="templates/Filters.jsp" flush="true" />
			<jsp:include page="templates/Body.jsp" flush="true" />

		</div>
	</div>
	<jsp:include page="templates/Footer.jsp" flush="true" />

</body>
</html>