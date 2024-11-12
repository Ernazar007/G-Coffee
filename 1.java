const sound = new Audio('sounds/add-to-cart.mp3');

function addToOrder(item) {
    const orderList = document.getElementById('order-list');
    const total = document.getElementById('total-price');
    const li = document.createElement('li');
    li.textContent = item + " — " + menu[item].price + " тг";
    orderList.appendChild(li);

    let totalPrice = parseInt(total.textContent);
    totalPrice += menu[item].price;
    total.textContent = totalPrice;

    showConfirmation(item);
    sound.play();
}
