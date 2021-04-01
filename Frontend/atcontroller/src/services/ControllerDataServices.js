import axios from 'axios'

class ControllerDataServices {
    //PUT requests
    updateItem(item){
        return axios.put(`http://localhost:8080/update`,item);
    }

    //________________________________________________________________________
    
    //GET requests
    listOfCards(){
        return axios.get(`http://localhost:8080/grabAll`);
    }

    getCard(id){
        return axios.get(`http://localhost:8080/retrieveItem/${id}`);
    }

    getRandomCard(){
        return axios.get(`http://localhost:8080/randomEntry`);
    }

    getUsername()
    {
        return axios.get(`http://localhost:8080/name`)
    }
    //__________________________________________________________________________

    //POST requests
    addCard(card){
        return axios.post(`http://localhost:8080/addCard`,card);
    }

    addAdmin(admin){ //for admin component**
        return axios.post(`http://localhost:8080/addAdmin`,admin);
    }

    check(admin){ //for admin component**
        return axios.post(`http://localhost:8080/checkAdmin`,admin)
    }
    //_____________________________________________________________________________

    //DELETE requests
    deleteCard(cardID){
        return axios.delete(`http://localhost:8080/delete/${cardID}`)
    }
}
export default new ControllerDataServices()