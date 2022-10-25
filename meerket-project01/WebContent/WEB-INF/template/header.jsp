<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header id="header" class="header block background01">
	<div class="container header_block">
		<div class="row">
			<div class="social-icon">				
				<ul>
					<li><a class="color02 color01-hover03" href="#"><i>채팅하기&nbsp;</i></a></li>
					
					<li>
			<!--이 애플리케이션은 여러 경로에서 로그인/로그아웃을 해야 하기 때문에 ContextRoot를 기준으로 절대경로를 지정했다.	--> 
			
			<a class="color02 color01-hover03"
						href='${pageContext.servletContext.contextPath}/
								${ sessionScope.isLogin ? "logout" : "loginForm" }'>
							<i>${ sessionScope.isLogin ? "로그아웃" : "로그인" }</i>
				</a>
					</li>
						<c:if test="${ sessionScope.isLogin }">
							<li><a class="color02 color01-hover03" href="#"><i>마이페이지&nbsp;</i></a>
							</li>

							<li class="nav-item"><a class="nav-link"
								href="memberUpdateForm">정보수정</a></li>
						</c:if>
						
						<c:if test="${ not sessionScope.isLogin }" >	
							<li class="nav-item"><a class="nav-link"
								href="joinForm">회원가입</a>
						</c:if>
						
							
						
				</ul>
			</div>
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="main"> <img
							class="img-responsive" src="resources/contentImg/logo.png" alt="">
						</a>
						<div class="menu-btn">
							<button type="button" class="navbar-toggle collapsed color02"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<strong> <span class="sr-only">Toggle navigation</span>
									<span class="icon-bar background02"></span> <span
									class="icon-bar background02"></span> <span
									class="icon-bar background02"></span>
								</strong> <strong> MENU</strong>
							</button>
						</div>
					</div>
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav color02">
							<li><a href="main">홈</a></li>
							<li><a href="#">미어켓</a></li>
							<li><a href="#">커뮤니티</a></li>
							<li><a href="serviceMainForm">고객센터</a></li>
							<li><a href="serviceWriteForm">문의하기</a></li>
							<li><a href="#">사기조회</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
</header>