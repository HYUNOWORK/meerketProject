<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<article>

		<form id="loginForm" action="login" method="post">

		<h2>Member Login</h2>

		<fieldset>
			<legend>Member Loin</legend>
			<div id="login">
				<p>
					<label for="userId" class="labelStyle">아이디</label> <input
						type="text" id="userId" name="userId" />
				</p>
				<p>
					<label for="userPass" class="labelStyle">비밀번호</label> <input
						type="password" id="userPass" name="pass" />
				</p>
			</div>



			<input type="submit" value="로그인" id="btnLogin" />
		
		
		
		
			<a class="p-2"
				href="https://kauth.kakao.com/oauth/authorize?client_id=67dd7b2b305c6d57ba74cbd87aff04e3&	redirect_uri=http://localhost:8080/meerket-project01/loginForm&response_type=code">
				<img
				src="http://papaspick.com/web/upload/2019_web/icon/kakao_login.jpg"
				style="height: 60px">
			</a>
		
			

<br/><br/><br/><br/><br/>
			<p id="btn2">
				<a href=joinForm><input type="button" value="회원가입" id="btnJoin" /></a>
				<input type="button" value="아이디/비밀번호 찾기" id="btnSearch" />
			</p>



		</fieldset>
		</form>
		</article>