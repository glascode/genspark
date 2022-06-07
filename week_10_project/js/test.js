function showText(){
    var fname = document.getElementById('fname').value;
    var lname = document.getElementById('lname').value;
    var occ = document.getElementById('occ').value;
    var country = document.getElementById('country').value;

    document.getElementById("show").innerHTML = fname + "<br>" + lname + "<br>" + occ + "<br>" + country;
}