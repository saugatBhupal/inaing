export const addToCart = (id) => {
    let cartData = JSON.parse(localStorage.getItem("cart")) || {};
    const productId = id;

    if (cartData.hasOwnProperty(productId)) {
        cartData[productId].quantity += 1;
    } else {
        const newItem = { id, quantity: 1 };
        cartData[productId] = newItem;
    }
    localStorage.setItem("cart", JSON.stringify(cartData));
};

export const getCart = async() => {
    const cartData = JSON.parse(localStorage.getItem("cart")) || {};
    return cartData;
};
