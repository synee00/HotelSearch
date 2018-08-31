<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Search</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/hotelStyle.css">
	</head>
	<body class="content">
        

        <div class="contentBlock1 w3-animate-left">
          <div class="stuffing">
            <h1>Hotel Search</h1>

            <p>Please select a city.</p>

            <form action="/results">
              <select name="city">

                <option name="city" value="'Ann Arbor'">Ann Arbor</option>
                <option name="city" value="'Detroit'">Detroit</option>
                <option name="city" value="Novi">Novi</option>
                <option name="city" value="Royal Oak">Royal Oak</option>		  						  	
              </select>
              <br><br>
              <input type="submit">
            </form>		
          </div>
        </div>
        <script>
          $(document).ready(function(){
            $(".contentBlock1").onload(function(){
              $("stuffing").fadeIn(1000, function(){
                alert("fadeIn() method is finished!");
              });
            });
          });
        </script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
      </body>
    </html>
</html>