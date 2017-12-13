/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function ( ) {
    
    $('#button1').on('click', function ( ) {
        $('#result').load('/AjaxQuery/callAjaxJQuery');
    });
    
    $('#button2').on('click', function () {
        $('#result').load('/AjaxQuery/callAjaxJQueryValues', {name: "Felipino", hour: "12:00"});
    });
    
    $('#button3').on('click', function () {
        $('#result').load('/AjaxQuery/callAjaxJQueryValuesForm', {valueForm: $('#idValueForm').val( ) });
    });
    
    $('#botao4').on('click', function () {
        $('#resultado').load('/AjaxQuery/callAjaxJQueryCompleteForm', $("#idForm2").serialize());
    });

});

