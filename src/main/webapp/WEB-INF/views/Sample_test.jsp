<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>DEE Development Engineer </title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
<script
    src="https://cdn.rawgit.com/PascaleBeier/bootstrap-validate/v2.1.3/dist/bootstrap-validate.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
<style>
#success_message {
    display: none;
}
</style>
<!-- 
<script>
$(document).ready(function() {
    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        
              TICKET_NO: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Ticket NO
                    },
                    TICKET_NO: {
                        message: 'Please enter a Valid  Ticket NO'
                    }
                }
            },
           
             LINE_NO: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Line NO'
                    },
                    LINE_NO: {
                        message: 'Please enter a Valid  Sample NO'
                    }
                }
            },
            SAMPLE_NO: {
                validators: {
                    notEmpty: {
                        message: 'Please enter SAMPLE NO'
                    },
                    LINE_NO: {
                        message: 'Please enter a Valid  Sample NO'
                    }
                }
            
           
             TEST_ID: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Test NO'
                    },
                    TEST_ID: {
                        message: 'Please enter a Valid  Test ID'
                    }
                }
            },
           
            BARCODE_NO: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Barcode NO'
                    },
                    BARCODE_NO: {
                        message: 'Please enter a Valid  Barcode NO'
                    }
                }
            },
             
                }
            }
        })
        .on('success.form.bv', function(e) {
            $('#success_message').slideDown({ opacity: "show" }, "slow") // Do something ...
                $('#Sample_test form').data('bootstrapValidator').resetForm();

            // Prevent form submission
            e.preventDefault();

            // Get the form instance
            var $form = $(e.target);

            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');

            // Use Ajax to submit form data
            $.post($form.attr('action'), $form.serialize(), function(result) {
                console.log(result);
            }, 'json');
        });
});
</script>
 -->
</head>
<fieldset>


<body>
    <div class="container">

        <form class="well form-horizontal" action="barcode " method="POST"
            id="barcode  form" ModelAttribute="softtesting">
            <fieldset>

                <!-- Form Name -->
                <legend>
                    <div style="text-align:center">
                        <h2>
                            <b>Testing Sample </b>
                        </h2>
                    </div>
                </legend>
                <br>

                                <div class="form-group">
                    <label class="col-md-4 control-label">Ticket NO</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="TICKET_NO"
                                placeholder="TICKET_NO" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                

                <div class="form-group">
                    <label class="col-md-4 control-label">LINE NO</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="LINE_NO"
                                placeholder="LINE_NO" class="form-control" type="text">
                        </div>
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="col-md-4 control-label">Sample NO</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="SAMPLE_NO" 
                                placeholder="SAMPLE_NO"class="form-control" type="text">
                        </div>
                    </div>
                </div>
                

                <div class="form-group">
                    <label class="col-md-4 control-label">Test ID</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="TEST_ID"
                                placeholder="TEST_ID" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">Barcode NO</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="BARCODE_NO"
                                placeholder="BARCODE_NO"
                                type="text">
                        </div>
                    </div>
                </div>
                    </div>
                

                <!-- Text input-->

                <!-- Select Basic -->

                <!-- Success message -->
                <div class="alert alert-success" role="alert" id="success_message">
                    Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <br>
                        <button type="submit" class="btn btn-success">
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span
                                class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </button>
                    </div>
                </div>

            </fieldset>
        </form>
    </div>
</body>
    </html>
