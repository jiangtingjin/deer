<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="${pageContext.request.contextPath}/centerResourse/scriptaculous/src/effects.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/centerResourse/validation.js"></script>
<script type="text/javascript">
//<![CDATA[
<!--
// Alternative Style: Working With Alternate Style Sheets
// http://www.alistapart.com/articles/alternate/
function setActiveStyleSheet(title) {
var i, a, main;
for(i=0; (a = document.getElementsByTagName("link")[i]); i++) {
if(a.getAttribute("rel").indexOf("style") != -1 && a.getAttribute("title")) {
a.disabled = true;
if(a.getAttribute("title") == title) a.disabled = false;
}
}
}
//-->
//]]>
</script>
<link title="style1" rel="stylesheet" href="${pageContext.request.contextPath}/centerResourse/style.css" type="text/css" />
<link title="style2" rel="alternate stylesheet" href="${pageContext.request.contextPath}/centerResourse/style2.css" type="text/css" />
<link title="style3" rel="alternate stylesheet" href="${pageContext.request.contextPath}/centerResourse/style3.css" type="text/css" />
</head>
<body>
<div id="myright">
    <div class="style_changer">
    	<div class="style_changer_text">Themes:</div>
        <input type="submit" value="1" onclick="setActiveStyleSheet('style1');" />
        <input type="submit" value="2" onclick="setActiveStyleSheet('style2');" />
        <input type="submit" value="3" onclick="setActiveStyleSheet('style3');" />
    </div>

	<div class="form_content">
    <form id="test" action="#" method="get">
    <fieldset>
        <legend>PERSONAL INFORMATION</legend>
        <div class="form-row">
            <div class="field-label"><label for="field1">First Name</label>:</div>
            <div class="field-widget"><input name="field1" id="field1" class="required" title="Enter your name" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field2">Last Name</label>:</div>
            <div class="field-widget"><input name="field2" id="field2" class="required" title="Enter your name" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field3">Short Description</label>:</div>
            <div class="field-widget"><textarea class="required"></textarea></div>
        </div>
        
        
    </fieldset>
    <fieldset>
        <legend>ACCOUNT DETAILS</legend>
        
        <div class="form-row">
            <div class="field-label"><label for="field4">Username</label>:</div>
            <div class="field-widget"><input name="field4" id="field4" class="required" title="Enter your name" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field5">Email</label>:</div>
            <div class="field-widget"><input name="field5" id="field5" class="required validate-email" title="Enter your name" /></div>
        </div> 
        
        <div class="form-row">
            <div class="field-label"><label for="field6">Country</label>:</div>
            <div class="field-widget">
                <select id="field6" name="field6" class="validate-selection" title="Choose your department">
                    <option>Select one...</option>
                    <option>Accounts</option>
                    <option>Human Resources</option>
                    <option>Information Technology</option>
                    <option>Animal Management</option>
                    <option>Ultimate Frisby</option>
                </select>
            </div>
        </div>
           
        <div class="form-row">
            <div class="field-label"><label for="field7">Password</label>:</div>
            <div class="field-widget"><input type="password" name="field7" id="field7" class="required validate-password" title="Enter a password greater than 6 characters" /></div>
        </div>
          
        <div class="form-row">
            <div class="field-label"><label for="field9">Confirm Password</label>:</div>
            <div class="field-widget"><input type="password" name="field8" id="field8" class="required validate-password-confirm" title="Enter the same password for confirmation" /></div>
        </div> 
      
      
    </fieldset>  
    <fieldset>
        <legend class="optional">OPTIONAL INFORMATIONS</legend>
      
        
        <div class="form-row">
            <div class="field-label"><label for="field9">City</label>:</div>
            <div class="field-label">
                <input name="field3" id="field9" class="optional" title="Enter your employee number, please use only alphanumeric characters" />		
            </div>
        </div>

        <div class="form-row">
            <div class="field-label"><label for="field10">Phone</label>:</div>
            <div class="field-label"><input name="field10" id="field10" class="optional" title="Optional: Enter your age" /></div>
        </div>
        <div class="form-row-select">

            <fieldset>
                <legend class="optional">Ocupation</legend>
                <label class="left">
                <input type="radio" class="radio_input" name="field11" id="field11-male" value="1" />Artist <br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Businessperson<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Factory worker<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Engineer<br />    
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Journalist<br />
               
                </label>
                <label class="left">
                 <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Medical Worker<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Military person<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Political figure<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Scientist<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Undertaker
                </label>
                
                <label class="left">
                <input type="radio" class="radio_input" name="field11" id="field11-male" value="1" />Artist <br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Businessperson<br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Founder or administrator <br />
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Engineer<br />    
                <input type="radio" class="radio_input" name="field11" id="field11-female" value="2"/>Journalist<br />
               
                </label> 
                
                
                
            </fieldset> 
         
        </div>
        <div class="form-row">
            <div class="field-label"><label for="field12">Other Details</label>:</div>
            <div class="field-widget"><textarea class="optional"></textarea></div>
        </div>
        
    </fieldset>
    <input type="submit" class="submit" value="Submit" /> <input class="reset" type="button" value="Reset" onclick="valid.reset(); return false" />
    </form>
    </div>
    <script type="text/javascript">
        function formCallback(result, form) {
            window.status = "valiation callback for form '" + form.id + "': result = " + result;
        }
        
        var valid = new Validation('test', {immediate : true, onFormValidate : formCallback});
        Validation.addAllThese([
            ['validate-password', '> 6 characters', {
                minLength : 7,
                notOneOf : ['password','PASSWORD','1234567','0123456'],
                notEqualToField : 'field1'
            }],
            ['validate-password-confirm', 'please try again.', {
                equalToField : 'field8'
            }]
        ]);
    </script>
</div>
</body>
</html>