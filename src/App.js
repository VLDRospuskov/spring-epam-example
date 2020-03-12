import React from 'react';
import {Router, Route, Switch} from 'react-router-dom';
import './App.css';
import Component from './components/Component';
import HelloComponent from './components/Bye';
import {createBrowserHistory} from 'history';

const history = createBrowserHistory();

class App extends React.Component {

  render() {
    return (
      <Router history={history}>
        <Switch>
          <Route path="/" component={Component} exact/>
          <Route path="/hello" component={HelloComponent}/>
        </Switch>
        </Router>
    );
  }
}

export default App;