<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Controller.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<script>
	function show()
	{
		let username=document.getElementById("username").value;
		let password=document.getElementById("pin").value;
		if(username=="username" && password=="pin")
			{
			alert("Login Success");
			document.getElementById("MainDashboard.jsp").submit();
			}
		else
			{
			alert("Invalid Password");
			}
	}
	   function checkPassword(){
		      let str=document.getElementById("password").value;
		      let pattern=/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@$#%^&*])(.{8,})/g;
		      let result=str.match(pattern);
		      if(result!=null){
		         let span=document.getElementById("s");
		         span.innerHTML="Validpassword";
		         span.style.backgroundColor="white";
		         span.style.color="green";
		      }
		      else{
		         let span=document.getElementById("s");
		         span.innerHTML="Invalidpassword";
		         span.style.backgroundColor="white";
		         span.style.color="red";

		     }  
		   }

	</script>
</head>
<body>

	<div class="back-image">
		<div class="header-section">
			<div class="container">
				<a class="navbar-brand" href="#">HOTELNAME</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
					aria-controls="navbarNavDropdown" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<nav class="navbar navbar-expand-lg bg-body-tertiary">

					<div class="container-fluid">
						<div class="collapse navbar-collapse" id="navbarNavDropdown">
							<ul class="navbar-nav">
								<li class="nav-item"><a class="nav-link active"
									aria-current="page"
									href="Controller.jsp">Home</a></li>
								<li class="nav-item"><a class="nav-link" href="#">About</a>
								</li>
								<li class="nav-item"><a class="nav-link" href="#">Menu</a>
								</li>
								<li class="nav-item"><a class="nav-link" href="#">Book
										Table</a></li>
							<li class="nav-item"><a class="nav-link" href="#"><button type="button" class="btn" style="	color: white;font-family: 'Dancing Script', cursive;" data-bs-toggle="modal" data-bs-target="#myModal">LOGIN</button>
            <div class="modal" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Admin Login</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
<!--          <form action="AdminLogin" method="post"> -->
<!--         <h1>Admin Login</h1> -->
<!--         <label for="username">Username:</label> -->
<!--         <input type="text" id="username" name="username" required><br> -->
<!--         <label for="password">Password:</label> -->
<!--         <input type="password" id="password" name="pin" required autocomplete="off"><br> -->
<!--         <input type="checkbox" id="rememberMe" name="rememberMe" required autocomplete="off" > -->
<!--         <label for="rememberMe">Remember Me</label><br> -->
<!--         <input type="submit" value="Login"> -->
<!--         <div class="manage-profile"> -->
<!--             <a href="AddNewAdmin.jsp">Manage Profile</a> -->
<!--         </div> -->
<!--     </form> -->
					<form action="AdminLogin" method="post">
                                <div class="row">
                                    <div class="col-md-4">
                                        <label class="font-weight-bold">UserName:</label>
                                        <input type="text" id="username" name="username"  class="form-control" required>
                                    </div>
                                    <div class="col-md-4">
                                        <label class="font-weight-bold">Password:</label>
                                    <input type="password" id="password" name="pin" class="form-control" onkeyup="checkPassword()" required>
                                    <span id="s"></span>
                                    </div>
                                     
                                    <div class="modal-footer">
                            <input type="submit" class="btn btn-primary" value="Login" onclick="show()">
                        </div>
                                </div>
                            </form>
                        </div>
                        
                    </div>
                </div>
            </div></a></li>
								
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>
		<div class="container">
			<div id="carouselExampleSlidesOnly" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<h1>Fast Food Restaurant</h1>
						<p>
							Doloremque, itaque aperiam facilis rerum, commodi,afuhjf ihfd<br>
							temporibus sapiente ad mollitia laborum quam quisquam esse error<br>
							unde. Tempora ex doloremque, labore, sunt repellat dolore, iste<br>
							magni quos nihil ducimus libero ipsam.
						</p>
						<button type="button" class="btn">
							<a href="#">ORDERNOW</a>
						</button>
					</div>
					<div class="carousel-item">
						<h1>Fast Food Restaurant</h1>
						<p>
							Doloremque, itaque aperiam facilis rerum, commodi,<br>
							temporibus sapiente ad mollitia laborum quam quisquam esse error<br>
							unde. Tempora ex doloremque, labore, sunt repellat dolore, iste<br>
							magni quos nihil ducimus libero ipsam.
						</p>
						<button type="button" class="btn">
							<a href="#">ORDERNOW</a>
						</button>
					</div>
					<div class="carousel-item">
						<h1>Fast Food Restaurant</h1>
						<p>
							Doloremque, itaque aperiam facilis rerum, commodi,<br>
							temporibus sapiente ad mollitia laborum quam quisquam esse error<br>
							unde. Tempora ex doloremque, labore, sunt repellat dolore, iste<br>
							magni quos nihil ducimus libero ipsam.
						</p>
						<button type="button" class="btn">
							<a href="#">ORDERNOW</a>
						</button>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row mt-5">
			<div class="col-sm-6 ">
				<div class="card  p-3">
					<div class="card-content">
						<img src="images/bur1.jpg" class="card-img-left"
							class="img-fluid" alt="...">
						<div class="card-text">
							<h5 class="card-title">Tasty Saturday</h5>
							<h2>50% off</h2>
							<p class="card-description">With supporting text below as a
								natural lead-in to additional content.</p>
							<a href="#" class="btn btn-danger">Go somewhere</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-6  ">
				<div class="card p-3">
					<div class="card-content">
						<img src="images/p3.jpg" class="card-img-left"
							class="img-fluid" alt="...">
						<div class="card-text">
							<h5 class="card-title">Pizza day</h5>
							<h2>20% off</h2>
							<p class="card-description">With supporting text below as a
								natural lead-in to additional content.</p>
							<a href="#" class="btn btn-danger">Go somewhere</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="heading_container heading_center">
			<h2>Our Menu</h2>
		</div>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="#">ALL</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">PIZZA</a></li>
					<li class="nav-item"><a class="nav-link" href="#">PASTA</a></li>
					<li class="nav-item"><a class="nav-link" href="#">BURGUR</a></li>
					<li class="nav-item"><a class="nav-link" href="#">FRIES</a></li>
					</li>
				</ul>
			</div>
		</nav>
		<div class="card-group">
			<div class="card">
				<img class="card-img-top" src="images/vadapav.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">VADAPAO</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This content is
						a little bit longer.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.20</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/samosa.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">SAMAOSA</h5>
					<p class="card-text">This card has supporting text below as a
						natural lead-in to additional content.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.15</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/pizza.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">PIZZA</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This card has
						even longer content than the first to show that equal height
						action.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.69</small>
				</div>
			</div>
		</div>
		<div class="card-group">
			<div class="card">
				<img class="card-img-top" src="images/handi.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">CHIKEN-HUNDI</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This content is
						a little bit longer.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.120</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/frychicken.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">FRY-CHIKEN</h5>
					<p class="card-text">This card has supporting text below as a
						natural lead-in to additional content.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.180</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/fryfish.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">FRY-FISH</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This card has
						even longer content than the first to show that equal height
						action.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.150</small>
				</div>
			</div>
		</div>
		<div class="card-group">
			<div class="card">
				<img class="card-img-top" src="images/special.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">SPECIAL</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This content is
						a little bit longer.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.90</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/boiledeggs.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">BOILED-EGGS</h5>
					<p class="card-text">This card has supporting text below as a
						natural lead-in to additional content.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.45</small>
				</div>
			</div>
			<div class="card">
				<img class="card-img-top" src="images/juice.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">JUICE</h5>
					<p class="card-text">This is a wider card with supporting text
						below as a natural lead-in to additional content. This card has
						even longer content than the first to show that equal height
						action.</p>
				</div>
				<div class="card-footer">
					<small class="text-muted">RS.30</small>
				</div>
			</div>
		</div>
		<div class="btn-box">
			<a href="#"> View More </a>
		</div>
	</div>
	<div class="back-img"></div>


	<div class="container">
		<h2 class="text-center mt-5 mb-4">TABLE BOOKING FORM</h2>
		<table class="table">
			<tbody>
				<tr>
					<td><label for="name">Name:</label></td>
					<td><input type="text" class="form-control" id="name"
						name="name"></td>
				</tr>
				<tr>
					<td><label for="email">Email:</label></td>
					<td><input type="email" class="form-control" id="email"
						name="email"></td>
				</tr>
				<tr>
					<td><label for="phone">Phone:</label></td>
					<td><input type="text" class="form-control" id="phone"
						name="phone"></td>
				</tr>
				<tr>
					<td><label for="date">Date:</label></td>
					<td><input type="date" class="form-control" id="date"
						name="date"></td>
				</tr>
				<tr>
					<td><label for="time">Time:</label></td>
					<td><input type="time" class="form-control" id="time"
						name="time"></td>
				</tr>

				<tr>
					<td><label for="guests">Number of Guests:</label></td>
					<td><input type="number" class="form-control" id="guests"
						name=""></td>
				</tr>

				<tr>
					<td colspan="2" class="text-center"><button
							class="btn">Submit</button></td>
				</tr>
			</tbody>
		</table>
	</div>
<!-- Footer 2 - Bootstrap Brain Component -->
<footer class="footer">

  <!-- Widgets - Bootstrap Brain Component -->
  <section class="bg-dark py-4 py-md-5 py-xl-8 border-top border-light">
    <div class="container overflow-hidden">
      <div class="row gy-4 gy-lg-0 justify-content-xl-between">
        <div class="col-12 col-md-4 col-lg-3 col-xl-2">
          <div class="widget">
            <a href="#!">
              <img src="./assets/img/bsb-logo.svg" alt="Hotel Logo" width="175" height="57">
            </a>
          </div>
        </div>
        <div class="col-12 col-md-4 col-lg-3 col-xl-2">
          <div class="widget">
            <h4 class="widget-title mb-4">Addressse</h4>
            <address class="mb-4">NH04 satara road highway,navale bridge pune</address>
            <p class="mb-1">
              <a class="link-secondary text-decoration-none" href="#">(505) 792-2430</a>
            </p>
            <p class="mb-0">
              <a class="link-secondary text-decoration-none" href="#">shivhotel@gmail.com</a>
            </p>
          </div>
        </div>
        <div class="col-12 col-md-4 col-lg-3 col-xl-2">
          <div class="widget">
            <h4 class="widget-title mb-4">Learn More</h4>
            <ul class="list-unstyled">
              <li class="mb-2">
                <a href="#" class="link-secondary text-decoration-none">Home</a>
              </li>
              <li class="mb-2">
                <a href="#" class="link-secondary text-decoration-none">Contact</a>
              </li>
              <li class="mb-2">
                <a href="#" class="link-secondary text-decoration-none">Advertise</a>
              </li>
              <li class="mb-2">
                <a href="#" class="link-secondary text-decoration-none">Terms of Service</a>
              </li>
          
            </ul>
          </div>
        </div>
        <div class="col-12 col-lg-3 col-xl-4">
          <div class="widget">
            <h4 class="widget-title mb-4">Our Newsletter</h4>
            <p class="mb-4">Subscribe to our newsletter to get our news & discounts delivered to you.</p>
            <form action="#!">
              <div class="row gy-4">
                <div class="col-12">
                  <div class="input-group">
                    <span class="input-group-text" id="email-newsletter-addon">
                      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope" viewBox="0 0 16 16">
                        <path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z" />
                      </svg>
                    </span>
                    <input type="email" class="form-control" id="email-newsletter" value="" placeholder="Email Address" aria-label="email-newsletter" aria-describedby="email-newsletter-addon" required>
                  </div>
                </div>
                <div class="col-12">
                  <div class="d-grid">
                    <button class="btn btn-primary" type="submit">Subscribe</button>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Copyright - Bootstrap Brain Component -->
  <div class="bg-light py-4 py-md-5 py-xl-8 border-top border-light-subtle">
    <div class="container overflow-hidden">
      <div class="row gy-4 gy-md-0">
        <div class="col-xs-12 col-md-7 order-1 order-md-0">
          <div class="copyright text-center text-md-start">
            &copy; 2024. All Rights Reserved.
          </div>
          
        </div>

        <div class="col-xs-12 col-md-5 order-0 order-md-1">
          <ul class="nav justify-content-center justify-content-md-end">
            <li class="nav-item">
              <a class="nav-link link-dark" href="#!">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
                  <path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z" />
                </svg>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link link-dark" href="#!">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-youtube" viewBox="0 0 16 16">
                  <path d="M8.051 1.999h.089c.822.003 4.987.033 6.11.335a2.01 2.01 0 0 1 1.415 1.42c.101.38.172.883.22 1.402l.01.104.022.26.008.104c.065.914.073 1.77.074 1.957v.075c-.001.194-.01 1.108-.082 2.06l-.008.105-.009.104c-.05.572-.124 1.14-.235 1.558a2.007 2.007 0 0 1-1.415 1.42c-1.16.312-5.569.334-6.18.335h-.142c-.309 0-1.587-.006-2.927-.052l-.17-.006-.087-.004-.171-.007-.171-.007c-1.11-.049-2.167-.128-2.654-.26a2.007 2.007 0 0 1-1.415-1.419c-.111-.417-.185-.986-.235-1.558L.09 9.82l-.008-.104A31.4 31.4 0 0 1 0 7.68v-.123c.002-.215.01-.958.064-1.778l.007-.103.003-.052.008-.104.022-.26.01-.104c.048-.519.119-1.023.22-1.402a2.007 2.007 0 0 1 1.415-1.42c.487-.13 1.544-.21 2.654-.26l.17-.007.172-.006.086-.003.171-.007A99.788 99.788 0 0 1 7.858 2h.193zM6.4 5.209v4.818l4.157-2.408L6.4 5.209z" />
                </svg>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link link-dark" href="#">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-twitter" viewBox="0 0 16 16">
                  <path d="M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z" />
                </svg>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link link-dark" href="#">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-instagram" viewBox="0 0 16 16">
                  <path d="M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z" />
                </svg>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>

</footer>
	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
		
</body>
</html>