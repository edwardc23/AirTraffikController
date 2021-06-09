import React from 'react'
import { Component } from "react"
import ControllerDataServices from "../services/ControllerDataServices";

class AirlineRegister extends Component{
    constructor(props){
        super(props)
        this.state = {
            username: '',
            password: '',
            airlinePassword:''

        }


        this.handleUsernameChange = this.handleUsernameChange.bind(this)
        this.handlePasswordChange = this.handlePasswordChange.bind(this)
        this.handleAirlinePasswordChange = this.handleAirlinePasswordChange.bind(this)
        this.testP = this.testP.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    testP(){
        if(this.state.test==='Airline Confirmed')
        {
            this.props.history.push("/Home.jsx")

        }

    }

    handleUsernameChange(event) {
        this.setState({
            username: event.target.value
        })
        //console.log(this.state.username)
    }

    handlePasswordChange(event) {
        this.setState({
            password: event.target.value
        })
        // console.log(this.state.password)
    }
    handleAirlinePasswordChange(event){
        this.setState({airlinePassword:event.target.value
        })
    }
    handleSubmit(event)
    {
        let user = {
            username: this.state.username,
            password: this.state.password,
            airlinePassword: this.state.airlinePassword
        }
        event.preventDefault()
        console.log(user)
        ControllerDataServices.addAdmin(user).then(r => console.log("Airline added"))
        ControllerDataServices.check(user)
            .then(value => {
                this.setState({test: value.data})
                //console.log(this.state.test)
                this.testP()
            })
    }
    render(){
        return(
            <form className="login" onSubmit={this.handleSubmit}>
                <p >Username:</p>
                <input type="text" className="text-input" value={this.state.username} onChange={this.handleUsernameChange}/>
                <p>Password:</p>
                <input type="text" className="text-input" value={this.state.password} onChange={this.handlePasswordChange}/>
                <p>Airline:</p>
                <input type="text" className="text-input" value={this.state.airlinePassword} onChange={this.handleAirlinePasswordChange}/>
                <br></br>
                <button className='btn btn-link'style={{fontSize:"10vh",marginLeft:"2vh",color:"white",backgroundColor:"darkred"}}>Submit</button>

            </form>

        );
    }

}
export default AirlineRegister
