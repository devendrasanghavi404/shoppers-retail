import React, {Component} from 'react';
import PaymentForm from './components/PaymentForm/PaymentForm';
import './App.css';

class App extends Component {
  render() {
    return (
      <div>
        {/* <Header/>
        <Login/> */}
        <PaymentForm />
      </div>
    );
  }
}

export default App;
