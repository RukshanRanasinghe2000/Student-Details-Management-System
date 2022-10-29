export class ApiConfig{
  static readonly API_URL="http://127.0.0.1:8080/StudentDetailsManagementSystem/server"
  static createUrl(query:String){
    return`${this.API_URL}/${query}`
  }
}
