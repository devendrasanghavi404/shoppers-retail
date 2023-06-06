import React from 'react'
import "./Checkout.css";

const Checkout = () => {
  return (
    <div class="container">
    <h1>Checkout</h1>
    <form>
      <label for="name">Name</label>
      <input type="text" id="name" name="name" required/>
      
      <label for="email">Email</label>
      <input type="email" id="email" name="email" required/>
      
      <label for="address">Address</label>
      <textarea id="address" name="address" required></textarea>
      
      <label for="card">Card Number</label>
      <input type="text" id="card" name="card" required/>
      
      <label for="expiry">Expiry Date</label>
      <input type="text" id="expiry" name="expiry" required/>
      
      <label for="cvv">CVV</label>
      <input type="text" id="cvv" name="cvv" required />
      
      <button type="submit">Place Order</button>
    </form>
  </div>
  )
}

export default Checkout