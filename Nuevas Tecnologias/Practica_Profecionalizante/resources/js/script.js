$(document).ready(function() {

    nacimiento.max = new Date().toISOString().split("T")[0];
    nacimiento.min = new Date('1899-01-01').toISOString().split("T")[0];

    $("#form").submit(function(event) {
        event.preventDefault();

        var input = $(this).find('input[name="nombre"]');

    if(!input.val()) {
        $(input).addClass('is-invalid');
        $(input).next('.invalid-feedback').show();  
    } else {
        $(input).addClass('is-valid');
    }

        var input = $(this).find('input[name="apellido"]');

    if(!input.val()) {
        $(input).addClass('is-invalid');
        $(input).next('.invalid-feedback').show();  
    } else {
        $(input).addClass('is-valid');
    }

    var input = $(this).find('input[name="nacimiento"]');

    if(!input.val()) {
        $(input).addClass('is-invalid');
        $(input).next('.invalid-feedback').show();  
    } else {
        $(input).addClass('is-valid');
    }

    var input = $(this).find('input[name="email"]');

    if(!input.val()) {
        $(input).addClass('is-invalid');
        $(input).next('.invalid-feedback').show();  
    } else {
        $(input).addClass('is-valid');
    }



    // checkeo de password
    input = $(this).find('input[name="password"]');

    if(!input.val()) {
        $(input).addClass('is-invalid');
        $(input).next('.invalid-feedback').show();
    } 

    var input2 = $(this).find('input[name="confirm_password"]');
    if(!input2.val()) {
        $(input2).addClass('is-invalid');
        $(input2).next('.invalid-feedback').show();
    } else if(input.val() != input2.val()) {

        // agrega las clases invalidas para que se vea rojo
        $(input).addClass('is-invalid');    
        $(input2).addClass('is-invalid');

        //esconde losmensajes por defecto (que estan vacios)
        $(input).next('.invalid-feedback').hide();
        $(input2).next('.invalid-feedback').hide();

        //muesra mensaje de que no coinciden
        $(input2).next('.invalid-feedback.password-match').show();
    } else {
        $(input2).addClass('is-valid');
    }

//window.alert("cuyalquiera");

       // $(".success span").text("Enviamos las instrucciones de recuperación a " + $(this).find("input[name='email']").val() + ".");
       // $(".success").show();

       // $('#form').trigger("reset");
    });

    
});