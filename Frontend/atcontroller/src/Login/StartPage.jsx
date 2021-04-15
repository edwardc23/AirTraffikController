import React from 'react'
import{Link} from 'react-router-dom'

function StartPage(){
    return(
        <div className="start" style={{height:"5px", width:"1100px",fontSize:"85px",color:"black"}}>

            Default Airline Interface
            <button><Link to="/Register">New User</Link></button>
            <button><Link to="/AirRegister">New Airline</Link></button>
            <button><Link to="/Login">LOGIN</Link></button>
        </div>
    )
}
export default StartPage
