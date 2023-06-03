import React, { useState } from 'react';
import './PaymentForm.css';
const PaymentForm = () => {
  const [paymentDetails, setPaymentDetails] = useState({
    amount: '',
    cardNumber: '',
    expirationDate: '',
    cvv: ''
  });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setPaymentDetails((prevState) => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleCheckout = () => {
    // Perform payment processing logic here
    console.log('Processing payment...', paymentDetails);
    // You can add further logic to handle the payment, e.g., make an API call to process the payment
  };

  return (
    <div className="payment-form-container">
      <label>
        Amount:
        <input
          type="text"
          name="amount"
          value={paymentDetails.amount}
          onChange={handleInputChange}
        />
      </label>
      <br />
      <label>
        Card Number:
        <input
          type="text"
          name="cardNumber"
          value={paymentDetails.cardNumber}
          onChange={handleInputChange}
        />
      </label>
      <br />
      <label>
        Expiration Date:
        <input
          type="text"
          name="expirationDate"
          value={paymentDetails.expirationDate}
          onChange={handleInputChange}
        />
      </label>
      <br />
      <label>
        CVV:
        <input
          type="text"
          name="cvv"
          value={paymentDetails.cvv}
          onChange={handleInputChange}
        />
      </label>
      <br />
      <button onClick={handleCheckout}>Checkout</button>
    </div>
  );
};

export default PaymentForm;
