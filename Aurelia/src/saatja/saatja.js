import {HttpClient, json} from 'aurelia-fetch-client'
import environment from '../environment'



export class saatja {
    userList = [];
    search = {};
    
    
    activate() {
        let client = new HttpClient();
        
        
        client.fetch(environment.serverURL + 'rides/all')
        .then(response => response.json())
        .then(users => this.userList = users);
       
    }
    searchRide() {
        let client = new HttpClient();
        
        
        client.fetch(environment.serverURL + 'items/destination/'+this.search.destination)
        .then(response => response.json())
        .then(users => this.userList = users);
    }
    
}