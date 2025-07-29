<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="includes/header.jsp" />


<form action='../board' method='post'>
		<table class='table'>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" class='form-control'></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" class='form-control'></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" class='form-control'></textarea></td>
			</tr>
			<tr>
				<td colspan='2' align='center'>
					<input type="submit" class='btn btn-primary'>
				</td>
			</tr>
		
		</table>
	</form>
	
	
<jsp:include page="includes/footer.jsp" />