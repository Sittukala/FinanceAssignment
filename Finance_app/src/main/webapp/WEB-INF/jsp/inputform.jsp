<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<head>
          
          <link href="/css/form.css" rel="stylesheet" type="text/css">
          
    </head>
<body background="/img/image.jpg">
<h1> Please enter the Details </h1>
  		<form:form method="post" action="save">  
      	 <label for="amount">Loan Amount:</label><br>
         
          <form:input path="amount"/><br><br>
        
         <label for="period">Loan Period :</label><br>
           
          <form:input path="period"/><br><br>
          
         <label for="rate">Loan Rate of Interest :</label><br>  
           
         <form:input path="rate"/><br><br>
         
          <input type="submit" value="Submit"/> 
          
     
 
 
          
         
       </form:form>  
       
</body>