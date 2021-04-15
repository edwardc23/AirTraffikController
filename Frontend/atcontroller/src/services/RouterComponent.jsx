import React, {Component} from'react'
// import FooterComponent from './FooterComponent'

import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'
import StartPage from '../Login/StartPage';

import AirlineRegister from "../Login/AirlineRegister";
import Homepage from "../Client/Homepage";
import Home from "../Airline/Home";
import UserRegister from "../Login/UserRegister";
import Login from "../Login/Login";



class RouterComponent extends Component{
    render()
    {
        return(
            <div>
                <Router>
                   
                        <Switch>
                            <Route exact path="/"><StartPage/></Route>
                            <Route path="/Login" component={Login}/>
                            <Route path="/Register" component={UserRegister}/>
                            <Route path="/AirRegister" component={AirlineRegister}/>
                            <Route path="/Homepage"><Homepage/></Route>
                            <Route path="/Home"><Home/></Route>
                            {/*<Route path="/Study" component={Study}/>*/}
                            {/*<Route path="/Create"component={AddRecipe}/>*/}
                            {/*<Route path="/ShowCards"component={ShowCards}/>*/}
                            {/*<Route path="/Update/:id"component={UpdateCard}/>*/}
                            {/*<Route path="/CardManager"component={Manage}/>*/}
                            {/*<Route path="/Logout"component={Logout}/>*/}
                        </Switch>

                    {/*<FooterComponent />*/}
                </Router>
            </div>
        )
    }
}
export default RouterComponent;
