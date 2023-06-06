import React, {Component} from 'react';
import PaymentForm from './components/PaymentForm/PaymentForm';
import './App.css';
import Login from './components/Login/Login';

class App extends Component {
  render() {
    return (
      <div>
        {/* <Header/>
        <Login/> */}
        <PaymentForm />
        <Login/>
      </div>
    );
  }
}

export default App;
