import React, { Component } from "react";
import PaymentForm from "./components/PaymentForm/PaymentForm";
import "./App.css";
import Checkout from "./components/Checkout/Checkout";
import Login from "./components/Login/Login";

class App extends Component {
  render() {
    return (
      <div>
        {/* <PaymentForm /> */}
        <Checkout/>
        <Login/>
      </div>
    );
  }
}

export default App;
