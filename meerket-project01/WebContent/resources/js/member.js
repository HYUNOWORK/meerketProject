// DOM이 준비되면 실행될 콜백 함수
$(function() {

	// 회원 로그인 폼이 submit 될 때 폼 유효성 검사를 위한 이벤트 처리
	$("#loginForm").submit(function() {
		var userId = $("#userId").val();
		var pass = $("#userPass").val();
		
		if(userId.length <= 0) {
			alert("아이디가 입력되지 않았습니다.\n아이디를 입력해주세요");
			$("#userId").focus();
			return false;
		}
		if(pass.length <= 0) {
			alert("비밀번호가 입력되지 않았습니다.\n비밀번호를 입력해주세요");
			$("#userPass").focus();
			return false;
		}
	});
	
	/* 회원 가입 폼*/
	
	/* 유효성검사	*/
	$("#userId").on("keyup", function() {		
	
		// 영문 대소문자, 숫자만 입력가능 
		var regExp = /[^A-Za-z0-9]/gi;	
		if(regExp.test($(this).val())) {
			alert("영문 대소문자, 숫자만 입력할 수 있습니다.");
			$(this).val($(this).val().replace(regExp, ""));
		}
	});
	
	/* 유효성 검사 2*/	
	$("#pass1").on("keyup", inputCharReplace);	
	$("#pass2").on("keyup", inputCharReplace);	
	$("#emailId").on("keyup", inputCharReplace);	
	$("#emailDomain").on("keyup", inputEmailDomainReplace);
		
	/* 아이디 중복확인 체크 새 창 */ 
	
	$("#btnOverlapId").on("click", function() {
		var userId = $("#userId").val();
		url="overlapIdCheck.mvc?userId=" + userId;
		
		if(userId.length == 0) {
			alert("아이디를 입력해주세요");
			return false;
		}
		
		if(userId.length < 5) {
			alert("아이디는 5자 이상 입력해주세요.");
			return false;
		}
		
		window.open(url, "idCheck", "toolbar=no, location=no, " 
				+  "status=no, memubar=no, width=400, height=200");
	});
	
	/* 증복확인 유효성 검사 */
	
	$("#idCheckForm").on("submit", function() {
		var userId = $("#checkId").val();	
		
		if(userId.length == 0)  {
			alert("아이디를 입력해주세요");
			return false;
		}
		
		if(userId.length < 5) {
			alert("아이디는 5자 이상 입력해주세요.");
			return false;
		}
	});
		
	/* 아이디 사용버튼*/
	
	$("#btnIdCheckClose").on("click", function() {
		var userId = $(this).attr("data-Id-value");
		opener.document.joinForm.id.value = userId;
		opener.document.joinForm.isIdCheck.value = true;
		window.close();
	});
		
	/* 다음 우편번호 API */
	$("#btnZipcode").click(findZipcode);
		
	// 이메일 입력 셀렉트 박스에서 선택된 도메인을 설정하는 함수 
	
	$("#selectDomain").on("change", function() {
		var str = $(this).val();
		
		if(str == "직접입력") {	
			$("#emailDomain").val("");
			$("#emailDomain").prop("readonly", false);
		} else if(str == "네이버"){	
			$("#emailDomain").val("naver.com");			
			$("#emailDomain").prop("readonly", true);
			
		} else if(str == "다음") {		
			$("#emailDomain").val("daum.net");
			$("#emailDomain").prop("readonly", true);
			
		} else if(str == "한메일"){	
			$("#emailDomain").val("hanmail.net");
			$("#emailDomain").prop("readonly", true);
			
		} else if(str == "구글") {		
			$("#emailDomain").val("gmail.com");
			$("#emailDomain").prop("readonly", true);
		}
	});
		
	// 회원 가입 폼이 서브밋 될 때 이벤트 처리 - 폼 유효성 검사
	
	$("#joinForm").on("submit", function() {
		
		/* joinFormChcek() 함수에서 폼 유효성 검사를 통과하지 못하면  false */
		 
		return joinFormCheck();
	});
	
	/* 회원정보 수정 폼에서 "비밀번호 확인" 버튼이 클릭될 때 Ajax 통신으로 확인 */
	
	$("#btnPassCheck").click(function() {
		var oldId = $("#userId").val();
		var oldPass = $("#oldPass").val();
		
		
		if($.trim(oldPass).length == 0) {
			alert("기존 비밀번호가 입력되지 않았습니다.\n기존 비밀번호를 입력해주세요");
			return false;
		}
		var data = "userId=" + oldId + "&pass="+oldPass;
		console.log("data : " + data);
		
		$.ajax({
			"url": "passCheck.ajax",
			"type": "method",
			"data": data,
			"dataType": "json",			
			"success": function(resData) {
				if(resData.result) {
					alert("비밀번호가 확인되었습니다.\n비밀번호를 수정해주세요");
					$("#btnPassCheck").prop("disabled", true);
					$("#pass1").focus();
					
				} else {
					alert("비밀번호가 다릅니다.\n비밀번호를 다시 확인해주세요");
					$("#oldPass").val("").focus();
				}
			},
			"error": function() {
				console.log("error");
			}
		});
		
	});	
		
	/* 정보 수정 폼에서 비밀번호 확인 후에 기존 비밀번호가 다시 수정되면 비밀번호 확인 버튼을 다시 활성화 시켜서 
	submit 될때 비밀번호 확인을 다시 하도록 한다.*/
	
		$("#oldPass").change(function() {
			$("#btnPassCheck").prop("disabled", false);
		});
				
		// 회원정보 수정 폼에서 수정하기 버튼이 클릭되면 유효성 검사를 하는 함수
		
		$("#memberUpdateForm").on("submit", function() {
			
			/* 회원정보 수정 폼에서 "비밀번호 확인" 버튼이 disabled 상태가 아니면
			 * 기존 비밀번호를 확인하지 않았기 때문에 확인하라는 메시지를 띄운다.
			 **/
			if(! $("#btnPassCheck").prop("disabled")) {
				alert("기존 비밀번호를 확인해야 비밀번호를 수정할 수 있습니다.\n"
					+ "기존 비밀번호를 입력하고 비밀번호 확인 버튼을 클릭해 주세요");
				return false;
			}
			
			/* joinFormChcek() 함수에서 폼 유효성 검사를 통과하지 못하면
			 * false가 반환되기 때문에 그대로 반환하면 폼이 서브밋 되지 않는다.
			 **/ 
			return joinFormCheck();
		});	
	});

		/* 영문, 숫자만 가능하게 표시 */
		function inputCharReplace() {
			// 아래와 같이 정규표현식을 이용해 영문 대소문자, 숫자만 입력되었는지 체크할 수 있다. 
			var regExp = /[^A-Za-z0-9]/gi;	
			if(regExp.test($(this).val())) {
				alert("영문 대소문자, 숫자만 입력할 수 있습니다.");
				$(this).val($(this).val().replace(regExp, ""));
			}
		}


		function inputEmailDomainReplace() {
			var regExp = /[^a-z0-9\.]/gi;	
			if(regExp.test($(this).val())) {
				alert("이메일 도메인은 영문 소문자, 숫자, 점(.)만 입력할 수 있습니다.");
				$(this).val($(this).val().replace(regExp, ""));
			}
		}
		
		function joinFormCheck() {
			var name = $("#name").val();
			var userId = $("#userId").val();
			var pass1 = $("#pass1").val();
			var pass2 = $("#pass2").val();
			var zipcode = $("#zipcode").val();
			var address1 = $("#address1").val();
			var emailId = $("#emailId").val();
			var emailDomain = $("#emailDomain").val();
			var phone2 = $("#phone2").val();
			var phone3 = $("#phone3").val();
			var isIdCheck = $("#isIdCheck").val();
			
			if(name.length == 0) {		
				alert("이름이 입력되지 않았습니다.\n이름을 입력해주세요");
				return false;
			}	
			if(userId.length == 0) {		
				alert("아이디가 입력되지 않았습니다.\n아이디를 입력해주세요");
				return false;
			}		
			if(isIdCheck == 'false') {		
				alert("아이디 중복 체크를 하지 않았습니다.\n아이디 중복 체크를 해주세요");
				return false;
			}	
			if(pass1.length == 0) {		
				alert("비밀번호가 입력되지 않았습니다.\n비밀번호를 입력해주세요");
				return false;
			}
			
			if(pass2.length == 0) {		
				alert("비밀번호 확인이 입력되지 않았습니다.\n비밀번호 확인을 입력해주세요");
				return false;
			}
			if(pass1 != pass2) {
				alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
				return false;
			}	
			if(zipcode.length == 0) {		
				alert("우편번호가 입력되지 않았습니다.\n우편번호를 입력해주세요");
				return false;
			}	
			if(address1.length == 0) {		
				alert("주소가 입력되지 않았습니다.\n주소를 입력해주세요");
				return false;
			}	
			if(emailId.length == 0) {		
				alert("이메일 아이디가 입력되지 않았습니다.\n이메일 아이디를 입력해주세요");
				return false;
			}	
			if(emailDomain.length == 0) {		
				alert("이메일 도메인이 입력되지 않았습니다.\n이메일 도메인을 입력해주세요");
				return false;
			}	
			if(mobile2.length == 0 || mobile3.length == 0) {		
				alert("휴대폰 번호가 입력되지 않았습니다.\n휴대폰 번호를 입력해주세요");
				return false;
			}
		}
	
	/* 우편번호 찾기 - daum 우편번소 찾기 API 이용 */
	function findZipcode() {
		new daum.Postcode({
	        oncomplete: function(data) {
            
            var addr = '';
            var extraAddr = '';


            if (data.userSelectedType === 'R') { 
                addr = data.roadAddress;

            } else {
				addr = data.roadAddress; 

            }
      
            if(data.userSelectedType === 'R'){

                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }

                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? 
											', ' + data.buildingName : data.buildingName);
                }

                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
				

                addr += extraAddr;
            }

			// 우편번호와 주소 정보를 해당 입력상자에 출력한다.
			$("#zipcode").val(data.zonecode);
			
			$("#address1").val(addr);

			$("#address2").focus();
       	}
	}).open();
	
}
