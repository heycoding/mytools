import React, { Component } from 'react'
import "./css/index.css"
export default class componentStyle extends Component {
  render() {
    var myname = 'hello'
    var obj = {
        background:"yellow"
    }
    return (
        <div>
        <div style={obj}>componentStyle {myname}  {10 +1}</div>
        <div style={{ background:"red" }}>componentStyle {myname}  {10 +1}</div>
        <div className='active'>12321321</div>
        <label htmlFor='username'>UserName: </label>
        <input type='text' id='username'></input>
      </div>
    )
  }
}
