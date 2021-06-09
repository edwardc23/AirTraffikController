import React from 'react'
import { Component } from "react"
import ControllerDataServices from "../services/ControllerDataServices";

class Login extends Component{
    constructor(props){
        super(props)
        this.state = {
            username: '',
            password: '',
            airlinePassword:"/"
        }
        this.handleUsernameChange = this.handleUsernameChange.bind(this)
        this.handlePasswordChange = this.handlePasswordChange.bind(this)
        this.handleAirlinePasswordChange = this.handleAirlinePasswordChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
        this.checkLogin = this.checkLogin.bind(this)
        this.checkAirlineLogin = this.checkAirlineLogin.bind(this)
        this.addAirline = this.addAirline.bind(this)
    }

    checkLogin(event){
        if(event ==='Accepted')
        {
            this.props.history.push("/Homepage.jsx")
        }
    }
    checkAirlineLogin(event){
        if(event ==='Airline Confirmed')
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
    handleSubmit(event){
        let user = {
            username: this.state.username,
            password: this.state.password,
            airlinePassword: this.state.airlinePassword
        }
        event.preventDefault()
        console.log(user)
        ControllerDataServices.check(user)
        .then(value => {
            console.log(value.data)
            this.checkAirlineLogin(value.data)
            this.checkLogin(value.data)
        })
    }
    addAirline()
    {
        return(
            <div>
                <p>Airline Password:</p>
        <input type="text" className="text-input" value={this.state.airlinePassword} onChange={this.handleAirlinePasswordChange}/>)
    </div>
        )
    }
    render(){
        return(
            <form className="login" onSubmit={this.handleSubmit}>
                <p >Username:</p>
                <input type="text" className="text-input" value={this.state.username} onChange={this.handleUsernameChange}/>
                <p>Password:</p>
                <input type="text" className="text-input" value={this.state.password} onChange={this.handlePasswordChange}/>
                <button type={"button"} onClick={()=> this.addAirline()}>Airline</button>
                {this.addAirline()}
                <br></br>
                <button className='btn btn-link'style={{fontSize:"10vh",marginLeft:"2vh",color:"white",backgroundColor:"darkred"}}>Submit</button>
                
            </form>
            
        );
    }
    
}
export default Login 
