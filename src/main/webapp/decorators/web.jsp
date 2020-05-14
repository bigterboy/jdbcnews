<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/template/web/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/template/web/css/shop-homepage.css"/>" rel="stylesheet"/>
</head>
<body>

<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

<div class="container">
    <dec:body/>
</div>

<!-- footer -->
<%@ include file="/common/web/footer.jsp" %>
<!-- footer -->

<script type="text/javascript" src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>

</body>
</html>
