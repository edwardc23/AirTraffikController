import React from 'react'
import {Link} from 'react-router-dom'


function Home(){
    return(

        <div className="container">

            <div>
                <button className= "bottomleft" style={{backgroundImage:"linear-gradient(white,peru,darkred)", color: "black", textAlign: "center",height:"100px",width:"650px"}} type ="button"><Link style={{color:"white"}} to="/Study">Random Recipe</Link></button>
                <button className= "bottomright" style={{backgroundImage:"linear-gradient(white,peru,darkred)", color: "black", textAlign: "center",height:"100px",width:"650px"}} type ="button"><Link style={{color:"white"}} to="/CardManager">Manage Recipes</Link></button>
            </div>
        </div>
    )
}export default Home
