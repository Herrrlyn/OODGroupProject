<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="styles.css" rel="stylesheet" type="text/css" />
<title>Admin View a Complaint</title>
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
  <button id="resolveBtn" class="header-resolve-button"> + Resolve </button>

  <div id="myModalResolve" class="modal-resolve">
	<!-- Modal content -->
	<div class="modal-content-resolve">
		<p style="padding-left:12px;">Are you sure you want to resolve this complaint?</p>
		<button id="cancel-button2" class="header-resolve-button" style="float:left;background-color:gray;margin-left:30px;width:30%;margin-top: 30px;"> Cancel </button>
		<button id="confirm-button" class="header-resolve-button" style="float:right;margin-right:30px;width:30%;margin-top: 30px;"> Confirm </button>
	</div>
	</div>
  
	  </div>
  
  <div>  
  <button id="myBtn" class="header-resolve-button" style="background-color:#00527e;"> + Assign Department </button>
  <div id="myModal" class="modal">
	
	  <!-- Modal content -->
	  <div class="modal-content">
	    	    
	    <div id="radio-group-id" style="display:none;">
		<label id="radiogroup-container" class="radio-container" style="padding-top: 15px;">Billing
		  <input type="radio" checked="checked" name="radio">
		  <span class="checkmark" style="margin-top:15px;"></span>
		</label>
		<label class="radio-container">IT
		  <input type="radio" name="radio">
		  <span class="checkmark"></span>
		</label>
		<label class="radio-container">Returns/Refunds
		  <input type="radio" name="radio">
		  <span class="checkmark"></span>
		</label>
		<label class="radio-container">Delivery
		  <input type="radio" name="radio">
		  <span class="checkmark"></span>
		</label>
		<label class="radio-container">General
		  <input type="radio" name="radio">
		  <span class="checkmark"></span>
		</label>
	<button id="cancel-button" class="header-resolve-button" style="float:left;background-color:gray;margin-left:30px;width:30%;""> Cancel </button>
	<button id="done-button" class="header-resolve-button" style="float:right;margin-right:30px;width:30%;"> Done </button>
	  </div>
	  </div>
	
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
// Get the modal
var modal = document.getElementById("myModal");

// Get the radio buttons
var radioGroup = document.getElementById("radio-group-id");
var radioGroupCon = document.getElementById("radiogroup-container");

//Get the modal for resolve
var modalR = document.getElementById("myModalResolve");

// Get the button that opens the modal for assigning a department
var btn = document.getElementById("myBtn");
var donebtn = document.getElementById("done-button");
var cancelbtn = document.getElementById("cancel-button");

// Get the button that opens the modal for resolving
var resolvebtn = document.getElementById("resolveBtn");
var confirmbtn = document.getElementById("confirm-button");
var cancelbtn2= document.getElementById("cancel-button2");

/* // Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0]; */

// When the user clicks the assign department button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
  radioGroup.style.display= "block";
  radioGroupCon.style.display = "block";
}

// When the user clicks the resolve button, open the modal 
resolvebtn.onclick = function() {
  modalR.style.display = "block";
}

//When the user clicks the done button on department, close the modal 
donebtn.onclick = function() {
	modal.style.display = "none";
	  radioGroup.style.display = "none";
		radioGroupCon.style.display = "none";
}

//When the user clicks the cancel button on department, close the modal 
cancelbtn.onclick = function() {
	modal.style.display = "none";
	  radioGroup.style.display = "none";
		radioGroupCon.style.display = "none";
}

//When the user clicks the confirm button on resolve, close the modal 
confirmbtn.onclick = function() {
	modalR.style.display = "none";
}

//When the user clicks the cancel button on resolve, close the modal 
cancelbtn2.onclick = function() {
	modalR.style.display = "none";
}

// When the user clicks anywhere outside of the department modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
    radioGroup.style.display = "none";
    radioGroupCon.style.display = "none";
  }
}

// When the user clicks anywhere outside of the resolve modal, close it
window.onclick = function(event) {
  if (event.target == modal2) {
    modal2.style.display = "none";
  }
}

</script>



</body>
</html>