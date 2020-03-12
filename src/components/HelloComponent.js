import React from 'react';

class HelloComponent extends React.Component {
    state = {
        isLoading: false,
        response: null
      };
    
      componentDidMount() {
       fetch('/customer/all').then(response => response.text()).then(response => {
           this.setState({response}) 
           console.log(this.state);
        });
      }

    
  render() {
    const {response} = this.state;

    return (
      <div>
    <div>{response ? response : null}</div>
    <div>check</div>
    </div>
    );
  }
}

export default HelloComponent;