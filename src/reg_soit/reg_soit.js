import {HttpClient} from 'aurelia-fetch-client'
import environment from '../environment'

export class reg_soit {
    addRide() {
        console.log("Method executed!")
        client.fetch(environment.serverURL + 'rides/all')
    }
}