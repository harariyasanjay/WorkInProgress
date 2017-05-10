function validateForm() {
    var x = document.forms["logonform"]["userid"].value;
    var y = document.forms["logonform"]["password"].value;
    if (x == "") {
        alert("Userid must be filled out");
        return false;
    }
    if (y == "") {
        alert("Password must be filled out");
        return false;
    }
}