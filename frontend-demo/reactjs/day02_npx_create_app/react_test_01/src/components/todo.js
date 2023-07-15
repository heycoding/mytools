import React, { Component } from 'react'

export default class todo extends Component {
    constructor(props) {
        super(props)
        this.state = {
            list:[]
        }
    }
    todoInput = React.createRef()
   
    render() {
        return (
            <div>
                <input type='text' ref={ this.todoInput }></input>
                
                <button onClick={ ()=>this.addTodo() } type='button'>Add</button>
                <ul>
                    {
                        this.state.list.map((item, index) => 
                            <li key={index}>{item} <button onClick={ ()=>this.delTodo(index) } type='button'>Del</button></li>   
                          
                        )
                    }
                </ul>
               {this.state.list.length <=0 ? <div>无</div> : null}
               {this.state.list.length <=0 && <div>无</div>}
            </div>
        )
    }

    addTodo = () => {
        var todoInputVal = this.todoInput.current.value
        let newList = this.state.list.slice()
        newList.push(todoInputVal)
        this.setState({
            list:newList
        })
        this.todoInput.current.value = ""
      
    }

    delTodo = (index) => {
        console.log(index)
        let newList = this.state.list.slice()
        newList.splice(index,1)
        this.setState({
            list:newList
        })
       
      
    }


}
