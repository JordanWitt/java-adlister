<!DOCTYPE html>
<html>
<head>
    <title>Place your Order</title>
</head>
<body>
<jsp:include page="partials/head.jsp"/>
<form action="pizza-order.jsp" method="post">
<%--    ADDRESS--%>
    <section name="address" class="delivery-address">
        <label for=street-address>Street Address</label>
        <input type="text" name="location" value="location" id="street-address" placeholder="1234 S Pacific Way"> <br>
    </section>

    <hr>
<%--BASE SIEZES--%>
    <section name="base" class="base">
        <h2>Create a Base</h2>
        <span>Size</span> <br>
        <input type="radio" name="size" id="small-size" value="small-size">
        <label for="small-size">Small</label><br>
        <input type="radio" name="size" id="medium-size" value="medium-size">
        <label for="medium-size">Medium</label><br>
        <input type="radio" name="size" id="large-size" value="large-size">
        <label for="large-size">Large</label><br>
        <input type="radio" name="size" id="extra-large-size" value="extra-large-size">
        <label for="extra-large-size">Extra Large</label><br>
        <br>
    </section>
<%--SAUCES--%>
    <section name="sauce" class="sauce">
    <span>Sauce</span> <br>
    <input type="radio" name="sauce" id="none" value="none">
    <label for="none">None</label><br>
    <input type="radio" name="sauce" id="original" value="original">
    <label for="original">Original</label><br>
    <br>
    </section>
    <hr>
<%--CHEESES--%>
    <section name ="cheese" class="cheese">
        <h2>Cheese</h2>
        <span>How much cheese</span> <br>
        <input type="radio" name="cheese" id="normal-cheese" value="normal-cheese">
        <label for="normal-cheese">Normal Cheese</label><br>
        <input type="radio" name="cheese" id="light-cheese" value="light-cheese">
        <label for="light-cheese">Light Cheese</label><br>
        <input type="radio" name="cheese" id="no-cheese" value="no-cheese">
        <label for="no-cheese">No Cheese</label><br>
        <br>

    </section> <hr>
<%----%>
    <section name="toppings" class="toppings">
        <h2>Toppings</h2>
        <span>Toppings</span> <br>
        <input type="checkbox" name="meats" id="meatball" value="meatball">
        <label for="meatball">Meatball</label><br>
        <input type="checkbox" name="meats" id="sausage" value="sausage">
        <label for="sausage">Sausage</label><br>
        <input type="checkbox" name="meats" id="beef" value="beef">
        <label for="beef">Beef</label><br>
        <input type="checkbox" name="meats" id="pepperoni" value="pepperoni">
        <label for="pepperoni">Pepperoni</label><br>
        <input type="checkbox" name="meats" id="bacon" value="bacon">
        <label for="bacon">Bacon</label><br>
        <input type="checkbox" name="veggies" id="mushrooms" value="mushrooms">
        <label for="mushrooms">Mushrooms</label><br>
        <input type="checkbox" name="veggies" id="banana-peppers" value="banana-peppers">
        <label for="banana-peppers">Banana Peppers</label><br>
    </section> <hr>

    <hr>
<%--SUBMIT--%>
    <input type="submit" value="send">
</form>
</body>
</html>