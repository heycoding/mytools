
import React, { Component } from "react";

class Navbar extends Component {
    render() {
        return <div> Navbar </div>
    }
}

function Swiper() {
    return <div> Swiper </div>
}

const Tapper = () => {
    return <div> Tapper </div>
}


export default class App extends Component {
    render() {
        return (
            <div>
                <Navbar/> 
                <Swiper/>
                <Tapper/>
            </div>
        )
    }
}
