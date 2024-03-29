<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="styles.css" rel="stylesheet" type="text/css" />
<title>User Home Page</title>
</head>
<body>

<!--  <div class="dropdown">
		  <button onclick="myFunction()" class="dropbtn">Unassigned</button>
		  <div id="myDropdown" class="dropdown-content">
		    <a href="#unassigned">Unassigned</a>
		    <a href="#assigned">Assigned</a>
		    <a href="#resolved">Resolved</a>
		  </div>
		</div> -->
		
<div class="user-nav-bar">
  <a href="#home" class="active">My Complaints</a>
  <a href="#logout" style="float:right;">Logout</a>
  <a href="#profile" style="float:right;">Profile</a>
  
</div>

<!-- <div class="wrap">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="What are you looking for?">
      <button type="submit" class="searchButton">
        <i class="fa fa-search"></i>
     </button>
   </div>
</div>

 <div class="dropdown">
		  <button onclick="myFunction()" class="dropbtn">Unassigned</button>
		  <div id="myDropdown" class="dropdown-content">
		    <a href="#unassigned">Unassigned</a>
		    <a href="#assigned">Assigned</a>
		    <a href="#resolved">Resolved</a>
		  </div>
		</div> -->

<button class="complaint-button">+ Create a Complaint </button>
<table id="issue-list">
  <tr>
    <th>Complaint No.</th>
    <th>Subject</th>
    <th>Status</th>
    <th>Date</th>
    <th>Department</th>
  </tr>
  
  <tr>
    <td >#123456</td>
    <td >I want a refund. </td>
    <td> <p class="status-icon-unassigned"> Unassigned</p></td>
    <td >Sept 17 2019</td>
    <td >HR</td>
  </tr>
  
  <tr>
    <td >#123456</td>
    <td >I want a refund. </td>
    <td> <p class="status-icon-assigned"> Assigned</p></td>
    <td >Sept 17 2019</td>
    <td >HR</td>
  </tr>
  
  <tr>
    <td >#123456</td>
    <td >I want a refund. </td>
    <td> <p class="status-icon-unassigned"> Unassigned</p></td>
    <td >Sept 17 2019</td>
    <td >HR</td>
  </tr>
</table>

<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

</body>
</html>