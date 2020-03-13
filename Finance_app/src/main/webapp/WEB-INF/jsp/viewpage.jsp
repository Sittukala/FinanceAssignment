<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
    <head>
          
          <link href="/css/resultstyle.css" rel="stylesheet" type="text/css">
          
    </head>
    <body>
    <h1>Loan Calculator</h1>
	
	<table border="1">
	<tr>
		<th> Payment No </th>
		<th> Payment Amount</th>
		<th> Interest Paid </th>
		<th> Principal Paid </th>
		<th> Outstanding Balance </th>
	</tr>
    <c:forEach var="loan" items="${outputList}"> 
    <tr>
   
    <td>${loan.paymentno}</td>
    <td>${loan.paymentamount}</td>
    <td>${loan.principalAmtPaid}</td>
    <td>${loan.interestAmtPaid}</td>
    <td>${loan.outstandingbal}</td>
    </tr>
    </c:forEach>
    </table>
    
     </body>