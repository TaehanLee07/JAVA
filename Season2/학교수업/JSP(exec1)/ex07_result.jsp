<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function checkValue() {
    var tf = document.formInput;

    if (!tf.kor.value) {
        alert("국어 성적을 입력하세요");
        tf.kor.focus();
        return false;
    } else if (!tf.eng.value) {
        alert("영어 성적을 입력하세요");
        tf.eng.focus();
        return false;
    } else if (!tf.mat.value) {
        alert("수학 성적을 입력하세요");
        tf.mat.focus();
        return false;
    } else if (!tf.inf.value) {
        alert("정보 점수를 입력하세요");
        tf.inf.focus();
        return false;
    } else if (!tf.t_date.value) {
        alert("날짜를 입력하세요");
        tf.t_date.focus();
        return false;
    } else if (!tf.t_dateLocal.value) {
        alert("날짜 및 시간을 입력하세요");
        tf.t_dateLocal.focus();
        return false;
    } else if (!tf.t_range.value) {
        alert("범위를 선택하세요");
        tf.t_range.focus();
        return false;
    } else if (tf.rmk.value.length < 4 || tf.rmk.value.length > 12) {
        alert("평가는 4자 ~ 12자 내에서 입력하세요");
        tf.rmk.focus();
        return false;
    } else if (tf.rmk.value == "") {
        alert("평가 내용을 입력하세요");
        tf.rmk.focus();
        return false;
    }
}
</script>

<body>
    <form name="formInput" action="ex08_result.jsp" onsubmit="return checkValue()" method="post">
        <h2>유효성 검사 / 입력 데이타 유무</h2>
        국어 : <input type="number" name="kor" min="0" max ="100" value = "0" required> <br>
        영어 : <input type="number" name="eng" min="0" max ="100" value = "0"> <br>
        수학 : <input type="number" name="mat" min="0" max ="100" value = "0"> <br>
        정보 : <input type="number" name="inf" min="0" max ="100" value = "0"> <br>
        date : <input type="date" name="t_date"> <br>
        datetime-local : <input type="datetime-local" name="t_dateLocal"> <br>
        range : <input type="range" name="t_range" min="10" max="15"> <br>
        평가내용 : <input type="text" name="rmk"> <br>
        입력 : <input type="submit" value="확인">
              <input type="reset" value="재작성">
    </form>
</body>
</html>
