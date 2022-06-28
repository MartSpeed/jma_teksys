$(document).ready(function(){
    // click event of the minus button
    @(".minusButton").on("click", function(event) {
        event.preventDefault();
        aircraftProductId = $(this).attr("pid");
        quantityInput = $("#quantity" + aircraftProductId);

        newQuantity = parseInt(quantityInput.val()) - 1;
        if(newQuantity > 0) quantityInput.val(newQuantity);
    });

    // click event of the plus button
    @(".plusButton").on("click", function(event) {
            event.preventDefault();
            aircraftProductId = $(this).attr("pid");
            quantityInput = $("#quantity" + aircraftProductId);

            newQuantity = parseInt(quantityInput.val()) + 1;
            if(newQuantity < 10) quantityInput.val(newQuantity);
        });
})