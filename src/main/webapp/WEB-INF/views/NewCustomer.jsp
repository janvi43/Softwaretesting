<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        fields: {
ID: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Id'
                    },
                    ID: {
                        message: 'Please enter a Valid  ID'
                    }
                }
            },
           

            Name: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Name'
                    },
                    Name: {
                        message: 'Please enter a Valid  Name'
                    }
                }
            },
           
            Address: {
                validators: {
                    notEmpty: {
                        message: 'Please enter Address'
                    },
                    Address: {
                        message: 'Please enter a Valid  Address'
                    }
                }
            },
           
           
             State_ID: {
                validators: {
                    notEmpty: {
                        message: 'Please enter State_ID'
                    },
                    State_ID: {
                        message: 'Please enter a Valid  State_ID'
                    }
                }
            },
           
            State: {
                validators: {
                    notEmpty: {
                        message: 'Please enter State'
                    },
                    State: {
                        message: 'Please enter a Valid  State'
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
<body>
    <div class="container">

        <form class="well form-horizontal" action="
        new " method="POST"
            id="customer form" ModelAttribute="testings">
            <fieldset>

                <!-- Form Name -->
                <legend>
                    <div style="text-align:center">
                        <h2>
                            <b> New Customer Details </b>
                        </h2>
                    </div>
                </legend>
                <br>
<div class="form-group">
                    <label class="col-md-4 control-label">ID</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="ID"
                                placeholder="ID" class="form-control"type="text">
                        </div>
                    </div>
                </div>

<div class="form-group">
                    <label class="col-md-4 control-label">Name</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="Name"
                                placeholder="Name" class="form-control" type="text">
                        </div>
                    </div>
                </div>


<div class="form-group">
                    <label class="col-md-4 control-label">Address</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="Address"
                                placeholder="Address" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">State ID</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="StateID"
                                placeholder="StatesID" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">State</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="State"
                                placeholder="State"
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
                        <button type="submit" class="btn btn-save">
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSave <span
                                class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </button>
                    </div>
                </div>

            </fieldset>
        </form>
    </div>
</body>
    </html>
