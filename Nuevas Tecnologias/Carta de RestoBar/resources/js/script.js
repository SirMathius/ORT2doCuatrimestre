$(document).ready(function() {

    $("#form").submit(function(event) {
        event.preventDefault();

window.alert("cuyalquiera");

       // $(".success span").text("Enviamos las instrucciones de recuperación a " + $(this).find("input[name='email']").val() + ".");
       // $(".success").show();

        $('#form').trigger("reset");
    });
});