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
        fields: {
        
             
           TICKET_NO: {
                validators: {
                    notEmpty: {
                        message: 'Please enter TICKET_NO'
                    },
                    TICKET_NO: {
                        message: 'Please enter a Valid  TICKET_NO'
                    }
                }
            },
        
           
           
           
             
             TEST_Name: {
                validators: {
                    notEmpty: {
                        message: 'Please enter TEST_Name'
                    },
                    TEST_Name: {
                        message: 'Please enter a Valid  TEST_Name'
                    }
                }
            },
            
             
             test_type: {
                validators: {
                    notEmpty: {
                        message: 'Please enter test_type'
                    },
                    test_type: {
                        message: 'Please enter a Valid  test_type'
                    }
                }
            },
            
             test_result: {
                validators: {
                    notEmpty: {
                        message: 'Please enter test_result'
                    },
                    tensible_strength: {
                        message: 'Please enter a Valid  test_result'
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

        <form class="well form-horizontal" action="test " method="POST"
            id="test form" ModelAttribute="Labtesting">
            <fieldset>

                <!-- Form Name -->
                <legend>
                    <div style="text-align:center">
                        <h2>
                            <b> Lab Test </b>
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
                    <label class="col-md-4 control-label">Test Name</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="TEST_Name"
                                placeholder="TEST_Name" class="form-control" type="text">
                        </div>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-md-4 control-label">test type </label>
                    <div class="col-md-4 selectContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-list"></i></span> <select
                                name="test_type" class="form-control selectpicker">
                                <option value="">test_type</option>
                                <option>Visual</option>
                                <option>Measuring</option>
                                </select>
                        </div>
                    </div>
                </div>

<div class="form-group">
                    <label class="col-md-4 control-label">Test Result</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="test_result"
                                placeholder="test_result" class="form-control" type="text">
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