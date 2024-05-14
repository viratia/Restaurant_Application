<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sidebar With Bootstrap</title>
    <link href="https://cdn.lineicons.com/4.0/lineicons.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="CSS/Ajinkya.css">
    
</head>

<body>
    <div class="wrapper">
        <aside id="sidebar" class='expand'>
            <div class="d-flex">
                <button class="toggle-btn" type="button">
                    <i class="lni lni-grid-alt"></i>
                </button>
                <div class="sidebar-logo">
                    <a href="#">Restaurant</a>
                </div>
            </div>
            <ul class="sidebar-nav">
                <li class="sidebar-item">
                    <a href="Controller.jsp" class="sidebar-link">
                        <i class="lni lni-user"></i>
                        <span>HOME</span>
                    </a>
                </li>
              
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse"
                        data-bs-target="#auth" aria-expanded="false" aria-controls="auth">
                          <i class="lni lni-chef-hat"></i>
                        <span>HOTEL TABLE</span>
                    </a>
                    <ul id="auth" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
                        <li class="sidebar-item">
                            <a href="AddTable.jsp" class="sidebar-link">Add Table</a>
                        </li>
                        <li class="sidebar-item">
                            <a href="ViewTable.jsp" class="sidebar-link">View Table</a>
                        </li>
                    </ul>
                </li>
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse"
                        data-bs-target="#cust" aria-expanded="false" aria-controls="cust">
                         <i class="lni lni-user"></i>
                        <span>CUSTOMER DETAILS</span>
                    </a>
                    <ul id="cust" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
                        <li class="sidebar-item">
                            <a href="AddCustomer.jsp" class="sidebar-link">Add Customer</a>
                        </li>
                        <li class="sidebar-item">
                            <a href="ViewCustomer.jsp" class="sidebar-link">View Customer</a>
                        </li>
                    </ul>
                </li>
                <li class="sidebar-item">
                   <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse"
                        data-bs-target="#menu" aria-expanded="false" aria-controls="menu">
                         <i class="lni lni-chef-hat"></i>
                        <span>MENU DETAILS</span>
                    </a>
                    <ul id="menu" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
                        <li class="sidebar-item">
                            <a href="AddMenu.jsp" class="sidebar-link">Add Menu</a>
                        </li>
                        <li class="sidebar-item">
                            <a href="ViewMenu.jsp" class="sidebar-link">View Menu</a>
                        </li>
                    </ul>
                </li>
                <li class="sidebar-item">
                   <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse"
                        data-bs-target="#order" aria-expanded="false" aria-controls="order">
                         <i class="lni lni-user"></i>
                        <span>ORDER DETAILS</span>
                    </a>
                    <ul id="order" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
                        <li class="sidebar-item">
                            <a href="#" class="sidebar-link">Take Order</a>
                        </li>
                        <li class="sidebar-item">
                            <a href="#" class="sidebar-link">View Order</a>
                        </li>
                    </ul>
                </li>
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                        <i class="lni lni-rupee"></i>
                        <span>Calculate Bill</span>
                    </a>
                </li>
                 <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                       <i class="lni lni-lineicons-symbol"></i>
                        <span>View Date Wise Order-list </span>
                    </a>
                </li>
                 <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                        <i class="lni lni-eye"></i>
                        <span>View Total Collection <br> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  of the day </span>
                    </a>
                </li>
                 <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                        <i class="lni lni-eye"></i>
                        <span>View Date Wise Customer</span>
                    </a>
                </li>
            </ul>
            <div class="sidebar-footer">
                <a href="#" class="sidebar-link">
                    <i class="lni lni-exit"></i>
                    <span>Logout</span>
                </a>
            </div>
        </aside>
        
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="Ajinkya.js"></script>
</body>

</html>
