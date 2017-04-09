import {HttpClient, json} from 'aurelia-fetch-client'
import environment from '../environment'

var userList = [];

export class vedaja {
    
    
    activate() {
        let client = new HttpClient();
        
        
        client.fetch(environment.serverURL + 'rides/all')
        .then(response => response.json())
        .then(users => this.userList = users);
        console.log("hehe");
    }
    
}