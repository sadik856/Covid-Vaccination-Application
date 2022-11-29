<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddCourse</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body {
  background-image: url('https://img.freepik.com/premium-photo/technology-network-background_34629-304.jpg?w=1060');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>
<script>
    function fun(){
    	alert("Added Successfully");
    	return true;
    }
</script>
</head>
<body>
 <%@include file="headeradmin.jsp" %>
 <div class="row" style="margin-left:40% ; margin-top:80px" >
      <div class="col-sm-4">
           <form action="AddCourse" method="post" onsubmit="return fun()">
               <div align="left">
                <label class="form-label" style="color:white">Enter Hospital Name</label>
                <input type="text" class="form-control" name="course" placeholder="Enter Name.." required>
                </div>
                <br>
               <div align="left">
                 <label class="form-label" style="color:white">Enter Address</label>
                <textarea class="form-control" name="url" rows="3"></textarea>
                </div>
                <br>
               <div align="left">
                 <label class="form-label" style="color:white">Enter Doses</label>
                 <input type="text" class="form-control" name="fee" placeholder="Enter Doses.." required>
                </div>
                <br>
               <div align="right">
                 <input type="submit" value="Add" class="btn btn-primary">
               </div>
           </form>
           </div>
       </div>

</body>
</html>