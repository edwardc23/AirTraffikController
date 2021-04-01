import React, {Component} from'react'
import FooterComponent from './FooterComponent'
import WelcomePage from '../admin/WelcomePage'
import Register from '../admin/Register'
import Homepage from './Homepage'
import Study from './Study'
import Login from '../admin/Login'
import Logout from '../admin/Logout'
import UpdateCard from '../ManageCards/UpdateCard'
import AddRecipe from '../ManageCards/AddRecipe'
import ShowCards from '../ManageCards/ShowCards'
import Manage from '../ManageCards/Manager'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'

class RouterComponent extends Component{
    render()
    {
        return(
            <div>
                <Router>
                   
                        <Switch>
                            <Route exact path="/"><WelcomePage/></Route>
                            <Route path="/Login" component={Login}/>
                            <Route path="/Register" component={Register}/>
                            <Route path="/Homepage" component={Homepage}/>
                            <Route path="/Study" component={Study}/>
                            <Route path="/Create"component={AddRecipe}/>
                            <Route path="/ShowCards"component={ShowCards}/>
                            <Route path="/Update/:id"component={UpdateCard}/>
                            <Route path="/CardManager"component={Manage}/>
                            <Route path="/Logout"component={Logout}/>
                        </Switch>

                    <FooterComponent />
                </Router>
            </div>
        )
    }
}
export default RouterComponent;