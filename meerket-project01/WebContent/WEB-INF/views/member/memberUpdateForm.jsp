<%-- 회원정보 수정 폼 요청 처리 대한 결과를 출력할 View 페이지 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	새로운 5자리 우편번호로 회원 주소를 입력 받기 위해 daum.net에서
	제공하는 우편번호 찾기 API를 사용하였다.
	참고 사이트 : http://postcode.map.daum.net/guide
-->    
<script src=
"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<article>
	<div id="memberJoinForm">
	<h3 id="joinFormTitle">회원 정보 수정</h3>	
	<form action="memberUpdateResult" name="memberUpdateForm" 
		id="memberUpdateForm" method="post" >
		
		<%-- 
			회원 아이디 중복 검사를 했는지의 정보를 hidden 필드로 저장
			기존 아이디를 저장해 비밀번호 확인 버튼이 클릭되면 ajax 통신으로
			회원의 비밀번호가 맞는지를 체크하기 위해 hidden 필드로 저장
		--%>
		<input type="hidden" name="isIdCheck" value="true"/>		
		<div id="memberInputDefault">			
			<div class="memberInputText">
				<span class="memberSpan">* 이&nbsp;&nbsp;름 : </span>
				<input type="text" name="name" size="15" id="name"					
					value="${ sessionScope.member.name }" />
			</div>			
			<div class="memberInputText">
				<span class="memberSpan">* 아이디 : </span>
				<input type="text" name="userId" size="15"  id="userId" readonly					
					value="${ sessionScope.member.userId }"/>
			</div>								
			<div class="memberInputText">
				<span class="memberSpan">* 기존 비밀번호 : </span>
				<input type="password" name="oldPass" id="oldPass" size="15"/>
				<input type="button" value="비밀번호 확인" id="btnPassCheck"/>
			</div>
			<div class="memberInputText">
				<span class="memberSpan">* 새 비밀번호 : </span>
				<input type="password" name="pass1" id="pass1" size="15"/>
			</div>					
			<div class="memberInputText">
				<span class="memberSpan">* 새 비밀번호 확인 : </span>
				<input type="password" name="pass2" id="pass2" size="15"/>
			</div>
			<div class="memberInputText">
				<span class="memberSpan">* 우편번호 : </span>
				<input type="text" name="zipcode" size="6" 
					maxlength="5" readonly id="zipcode"
					value="${ sessionScope.member.zipcode }"/>&nbsp;
				<input type="button" value="우편번호 검색" id="btnZipcode"/>
			</div>
			<div class="memberInputText">
				<span class="memberSpan">* 자택주소 : </span>
				<input type="text" name="address1" size="50" readonly id="address1" 
					value="${ sessionScope.member.address1 }"/>
			</div>
			<div class="memberInputText">
				<span class="memberSpan">상세주소 : </span>
				<input type="text" name="address2" size="50" id="address2" 
					value="${ sessionScope.member.address2 }"/>
			</div>
			<div class="memberInputText">
				<span class="memberSpan">* 이 메 일 : </span>
				<input type="text" name="emailId" size="10" id="emailId"				
					value='${ sessionScope.member.email.split("@")[0] }'/> @
				<!--
				 emailId@emailDomain 
				-->
				<input type="text" name="emailDomain" size="10" id="emailDomain" 					
					value="${ sessionScope.member.email.split('@')[1] }"/>
				<select name="selectDomain" id="selectDomain">
					<option>직접입력</option>
					<option>네이버</option>
					<option>다음</option>
					<option>한메일</option>
					<option>구글</option>																
				</select>
			</div>

		</div>

			<div class="memberInputText">
				<span class="memberSpan"> 자택전화 : </span>
				<select name="phone1">
					<option ${ member.phone.split('-')[0] == 02 ? "selected" : "" }>
						02</option>
					<option ${ member.phone.split('-')[0] == 031 ? "selected" : "" }>
						031</option>
					<option ${ member.phone.split('-')[0] == 032 ? "selected" : "" }>
						032</option>
					<option ${ member.phone.split('-')[0] == 033 ? "selected" : "" }>
						033</option>
					<option ${ member.phone.split('-')[0] == 041 ? "selected" : "" }>
						041</option>
					<option ${ member.phone.split('-')[0] == 042 ? "selected" : "" }>
						042</option>
					<option ${ member.phone.split('-')[0] == 043 ? "selected" : "" }>
						043</option>
					<option ${ member.phone.split('-')[0] == 044 ? "selected" : "" }>
						044</option>
					<option ${ member.phone.split('-')[0] == 051 ? "selected" : "" }>
						051</option>
					<option ${ member.phone.split('-')[0] == 052 ? "selected" : "" }>
						052</option>
					<option ${ member.phone.split('-')[0] == 053 ? "selected" : "" }>
						053</option>
					<option ${ member.phone.split('-')[0] == 054 ? "selected" : "" }>
						054</option>
					<option ${ member.phone.split('-')[0] == 055 ? "selected" : "" }>
						055</option>
					<option ${ member.phone.split('-')[0] == 061 ? "selected" : "" }>
						061</option>
					<option ${ member.phone.split('-')[0] == 062 ? "selected" : "" }>
						062</option>
					<option ${ member.phone.split('-')[0] == 063 ? "selected" : "" }>
						063</option>
					<option ${ member.phone.split('-')[0] == 064 ? "selected" : "" }>
						064</option>
				</select>-					
				<input type="text" name="phone2" size="3" maxlength="4" 
					value="${ member.phone.split('-')[1] }"/>-
				<input type="text" name="phone3" size="3" maxlength="4"
					value="${ member.phone.split('-')[2] }"/>
			</div>
		</div>
		<div class="formButton">
			<input type="reset" value="다시쓰기"/>
			<input type="submit" value="수정하기" />
		</div>			
	</form>	
	</div>
</article>