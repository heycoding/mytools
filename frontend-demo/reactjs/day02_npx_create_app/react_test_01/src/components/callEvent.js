import React, { Component } from 'react'

export default class callEvent extends Component {
  render() {
    return (
        <div>
      <button onClick={()=> {
        console.log('Click1')
      }}>Add1</button>

      <button onClick={this.handleClick}>Add2</button>
      <button onClick={this.handleClick2()}>Add3</button>
      <button onClick={this.handleClick3}>Add4</button>
      </div>
      
    )
  }

  handleClick() {
    console.log("handleClick")
  }

  handleClick2() {
    console.log("handleClick2")
    return this.handleClick
  }

  handleClick3 = ()=> {
    console.log("handleClick3")
  }
}
