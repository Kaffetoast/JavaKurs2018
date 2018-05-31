

function fizzbuzz(a, b, c, d) {
	var start = document.getElementById(a).value;
	var end = document.getElementById(b).value;
	var fizz = document.getElementById(c).value;
	var buzz = document.getElementById(d).value;
	var text = "";

	for (var i = start; i < end; i++) {
		if  (i %  fizz === 0  && i %  buzz === 0)  
		{ 
			   console.log("FIZZBUZZ");
			   text += "FIZZBUZZ" + "<br>";
		}
		else if (i %  fizz === 0)
		{
				console.log("FIZZ");
				text += "FIZZ" + "<br>";
				
		}
		else if (i %  buzz === 0)  
		{
			   console.log("BUZZ");
			   text += "BUZZ" + "<br>";
			
		}
		else {
			  
			  console.log(i);
			  text += i.toString() + "<br>";
  
		}

	 }
	 document.getElementById("output").innerHTML = text;
  }