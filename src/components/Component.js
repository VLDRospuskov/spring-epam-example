import React from 'react';

class Component extends React.Component {
  state = {
    isLoading: false,
    response: null
  };

  componentDidMount() {
   fetch('/customer/all').then(response => response.json()).then(response => {
       this.setState({response}) 
       console.log(this.state);
    });
  }

  render() {
    const {isLoading, response} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <div className="App-intro">
            <h2>FROM BACKEND</h2>
            {response ? response.map(item => <span>{item.firstName} {item.age}<br></br></span>) : null}
      
          </div>
        </header>
      </div>
    );
  }
}

export default Component;