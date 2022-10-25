<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  
	<title>meerket</title>
	
	<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
  <link href="resources/css/template/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/template/font-awesome.min.css" rel="stylesheet">
  <link href="resources/css/template/animations.css" rel="stylesheet">
  <link href="resources/css/template/normalize.css" rel="stylesheet">
  <link href="resources/css/template/style.css" rel="stylesheet" type="text/css">
  <link href="resources/css/template/royalslider.css" rel="stylesheet" type="text/css">
  <link href="resources/css/main.css" rel="stylesheet" type="text/css">
  <link href="resources/css/service.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" type="text/css" href="resources/css/member.css" />
  <link rel="stylesheet" type="text/css" href="resources/css/board.css" />
  
</head>
<body>
		<div id="wrapper" class="win-min-height">
		
		<%@ include file="template/header.jsp" %>
		<jsp:include page="${ param.body }" />
		<%@ include file="template/footer.jsp" %>	
		
		
		</div>
		<script type="text/javascript" src="resources/js/template/jquery-min.js"></script>
		  <script src ="resources/js/member.js"></script>
		  <script src="resources/js/template/bootstrap.min.js"></script>
		  <script src="resources/js/template/responsive-slider.js"></script>
		  <script src="resources/js/template/countUp.js"></script>
		  <script src="resources/js/template/touch-slide.js"></script>
		  <script src="resources/js/template/jquery.nav.js"></script>
		  <script src="resources/js/template/classie.js"></script>
		  <script src="resources/js/template/jquery.custom-scrollbar.js"></script>
		  <script src="resources/js/template/royalslider-min.js"></script>
		  <script src="resources/js/template/custom.js"></script>
		  <script src="resources/js/service.js"></script>

		  <script type="text/javascript">
		  
		  
		    if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
		      var msViewportStyle = document.createElement('style')
		      msViewportStyle.appendChild(
		        document.createTextNode(
		          '@-ms-viewport{width:auto!important}'
		        )
		      )
		      document.querySelector('head').appendChild(msViewportStyle)
		    }
		  </script>
</body>
</html>
