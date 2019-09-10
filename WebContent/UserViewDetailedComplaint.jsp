<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="styles.css" rel="stylesheet" type="text/css" />
<title>View Complaint Page</title>
</head>
<body>

<div class="user-nav-bar">
  <a href="#home">My Complaints</a>
  <a href="#logout" style="float:right;">Logout</a>
  <a href="#profile" style="float:right;">Profile</a>  
</div>

<div class="complaint-header" id="myHeader">

<div style="height:80px">
	<div class="header-div">  
	<img src="images.png" class="header-image" alt="User-icon">
  <b class="header-title">I want a refund.</b>
  </div>
  
  <div style="float:left;margin-bottom: 10px;"> 
  <sub class="header-date">Sept 17 2019</sub>
  </div>
  </div>
  
  <div style="margin-right:70%; width:70%;">
	  
	  <div style="float:left;"> 
	  <p class="header-complaint-no" style="float:left;color:#00527e;font-weight:bold;">Complaint Number:</p>
	  <p class="header-complaint-no" style="float:left;padding-left:3px;">123456</p>
	  </div>
	  
	  <div style="float:left;">
	  <p class="header-complaint-no" style="float:left;color:#00527e;font-weight:bold;">Status:</p>
	  <p class="header-complaint-no" style="float:left;padding-left:3px;">Unassigned</p>
	  </div>
 
	<div style="float:left;">
		  <p class="header-complaint-no" style="float:left;margin-bottom:5px;color:#00527e;font-weight:bold;">Department:</p>
		  <p class="header-complaint-no" style="float:left;padding-left:3px;padding-bottom:5px;">Unassigned</p>
	  </div>
  </div>
  	
  <div>  
  <button id="resolvebutton" class="header-resolve-button"> + Resolve </button>
  <div id="myModalResolve" class="modal-resolve">
    <div class="modal-content-resolve">
      <p style="padding-left:12px;">Are you sure you want to resolve this complaint?</p>
      <button id="cancel-button2" class="header-resolve-button" style="float:left;background-color:gray;margin-left:30px;width:30%;margin-top: 30px;"> Cancel </button>
      <button id="confirm-button" class="header-resolve-button" style="float:right;margin-right:30px;width:30%;margin-top: 30px;"> Confirm </button>
    </div>
    </div>
  </div>
 </div>
 
 <hr/>
	  
	  <div class="container">
  <img src="images.png" alt="Avatar">
  <p>Hello. How are you today?</p>
  <span class="time-right">11:00</span>
</div>

<div class="container darker">
  <img src="images.png" alt="Avatar" class="right">
  <p>Hey! I'm fine. Thanks for asking!</p>
  <span class="time-left">11:01</span>
</div>

<div class="container">
  <img src="images.png" alt="Avatar">
  <p>Sweet! So, what do you wanna do today?</p>
  <span class="time-right">11:02</span>
</div>

<div class="container darker">
  <img src="images.png" alt="Avatar" class="right">
  <p>Nah, I dunno. Play soccer.. or learn more coding perhaps?</p>
  <span class="time-left">11:05</span>
</div>

<div class="container">
  <img src="images.png" alt="Avatar">
  <p>idk!</p>
  <span class="time-right">11:03</span>
</div>

<script>
//Get the modal for resolve
var modalR = document.getElementById("myModalResolve");

// Get the button that opens the modal for resolving
var resolvebtn = document.getElementById("resolvebutton");
var confirmbtn = document.getElementById("confirm-button");
var cancelbtn2= document.getElementById("cancel-button2");

// When the user clicks the resolve button, open the modal 
resolvebtn.onclick = function() {
  modalR.style.display = "block";
}

//When the user clicks the confirm button on resolve, close the modal 
confirmbtn.onclick = function() {
	modalR.style.display = "none";
}

//When the user clicks the cancel button on resolve, close the modal 
cancelbtn2.onclick = function() {
	modalR.style.display = "none";
}

// When the user clicks anywhere outside of the resolve modal, close it
window.onclick = function(event) {
  if (event.target == modalR) {
    modalR.style.display = "none";
  }
}
</script>  
</body>
</html>